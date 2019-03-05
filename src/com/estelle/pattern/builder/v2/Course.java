package com.estelle.pattern.builder.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    private Course(CouseBuilder couseBuilder) {
        this.courseName = couseBuilder.courseName;
        this.coursePPT = couseBuilder.coursePPT;
        this.courseVideo = couseBuilder.courseVideo;
        this.courseArticle = couseBuilder.courseArticle;
        this.courseQA = couseBuilder.courseQA;
    }

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

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
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
        return courseName + coursePPT + courseArticle + courseVideo + courseQA;
    }

    //静态内部类(链式调用)
    public static class CouseBuilder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CouseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CouseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CouseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CouseBuilder buildCourseArticl(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CouseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }

    }

}
