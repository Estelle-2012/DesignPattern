package com.estelle.test.dip;

public class Geely {
    ICourse course;

    public void studyCourse(ICourse course) {
        course.studyCourse();
    }

    public void studyCourse() {
        course.studyCourse();
    }

}
