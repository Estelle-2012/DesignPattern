package com.estelle.pattern.builder.v1;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVedio;
    private String courseArticle;
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVedio() {
        return courseVedio;
    }

    public void setCourseVedio(String courseVedio) {
        this.courseVedio = courseVedio;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return courseName + coursePPT + courseArticle + courseVedio + courseQA;
    }
}
