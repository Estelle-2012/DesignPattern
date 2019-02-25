package com.estelle.pattern.factory.simplefactory;

public class Test {
//    Calendar使用简单工厂
    public static void main(String[] args) {
        /**
         * V1
         */
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        /**
         * V2 (相对遵守开闭原则)
         */
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) return;
        video.produce();

    }
}
