package com.keresman.gof.proxy;

public class VideoDownloaderImpl implements VideoDownloader {

    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to the server...");
        System.out.println("Downloading video...");
        System.out.println("Retrieving video metadata ...");
        return new Video(videoName);
    }
}
