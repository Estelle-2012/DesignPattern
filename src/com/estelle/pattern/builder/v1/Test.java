package com.estelle.pattern.builder.v1;

public class Test {
    public static void main(String[] args) {
        CourseBulider courseBulider = new CourseActualBulider();
        Coach coach = new Coach();
        coach.setCourseBulider(courseBulider);

        Course course = coach.mackCourse("课程名称", "PPT", "Vodeo", "Article", "QA");
        course.toString();
    }


}
