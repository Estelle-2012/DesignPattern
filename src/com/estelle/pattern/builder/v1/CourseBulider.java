package com.estelle.pattern.builder.v1;

public abstract class CourseBulider {
//    String courseName;
//    String coursePPT;
//    String courseVedio;
//    String courseArticle;
//    String courseQA;

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    abstract Course makeCourse();

}
