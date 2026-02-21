function showCourses() {
    alert("These are the available courses");

    fetch("http://localhost:8080/courseRegistration/getCourses")
        .then((response) => response.json())
        .then((courses) => {
            const dataTable = document.getElementById("courseTable");

            courses.forEach((course) => {
                var row = `<tr>
            <td>${course.courseName}</td>
            <td>${course.trainerName}</td>
            <td align="center">${course.courseDuration}</td>
            </tr>`;

                dataTable.innerHTML += row;
            })
        })
}

function showStudents() {
    fetch("http://localhost:8080/courseRegistration/getEnrolledStudents")
        .then((response) => response.json())
        .then((students) => {
            const dataTable = document.getElementById("studentTable");

            students.forEach((student) => {
                var studentRow = `<tr>
            <td>${student.name}</td>
            <td>${student.courseName}</td>
            <td>${student.emailId}</td>
            </tr>`;
                dataTable.innerHTML += studentRow;
            })

        })
}
