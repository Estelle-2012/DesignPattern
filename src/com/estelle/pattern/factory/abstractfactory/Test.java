package com.estelle.pattern.factory.abstractfactory;

public class Test {
    public static void main(String[] args) {
        //只关心从哪个具体工厂，不关心实现
        CourseFactory courseFactory = new JavaCoursefFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
