package com.keresman.gof.proxy;

public class Main {

    public static void main(String[] args) {
        exampleInternetProxy();
        exampleVideoProxy();
    }

    private static void exampleVideoProxy() {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("video-1");
        videoDownloader.getVideo("video-1");

        videoDownloader.getVideo("video-2");
        videoDownloader.getVideo("video-1");
        videoDownloader.getVideo("video-3");
    }

    private static void exampleInternetProxy() {
        Internet internet = new ProxyInternet();
        internet.connect("https://www.google-banned1.com");
        internet.connect("https://www.google.com");
    }

}
