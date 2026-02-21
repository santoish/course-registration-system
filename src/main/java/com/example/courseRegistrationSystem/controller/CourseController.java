package com.example.courseRegistrationSystem.controller;

import com.example.courseRegistrationSystem.model.Course;
import com.example.courseRegistrationSystem.model.CourseRegistry;
import com.example.courseRegistrationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseRegistration")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/getCourses")
    public List<Course> availableCourse(){
        return courseService.availableCourses();
    }


    @GetMapping("/getEnrolledStudents")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.getEnrolledStudents();
    }

    @PostMapping("/enrollCourse")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId")String emailId,
                               @RequestParam("courseName")String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulations! "+name+" Enrollment Successfull for "+courseName;
    }
}
