package com.estelle.pattern.factory.simplefactory;

public class VideoFactory {
    /**
     *V1
     */
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type))
//            return new JavaVideo();
//        else if ("python".equalsIgnoreCase(type))
//            return new PythonVideo();
//        else
//            return null;
//    }

    /**
     * V2
     */

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }


}

