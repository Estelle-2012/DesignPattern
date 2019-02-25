package com.estelle.pattern.builder.v1;

public class Coach {
    private CourseBulider courseBulider;

    public void setCourseBulider(CourseBulider courseBulider) {
        this.courseBulider = courseBulider;
    }

    public Course mackCourse(String courseName, String coursePPT, String courseVedio, String courseArticle, String courseQA) {
        courseBulider.buildCourseName(courseName);
        courseBulider.buildCoursePPT(coursePPT);
        courseBulider.buildCourseVideo(courseVedio);
        courseBulider.buildCourseArticle(courseArticle);
        courseBulider.buildCourseQA(courseQA);
        return courseBulider.makeCourse();

    }
}
