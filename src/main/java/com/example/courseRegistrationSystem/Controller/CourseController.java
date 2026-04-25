package com.example.courseRegistrationSystem.Controller;

import com.example.courseRegistrationSystem.Entity.Course;
import com.example.courseRegistrationSystem.Entity.User;
import com.example.courseRegistrationSystem.Service.CourseService;
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
    public List<User> enrolledStudents(){
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
