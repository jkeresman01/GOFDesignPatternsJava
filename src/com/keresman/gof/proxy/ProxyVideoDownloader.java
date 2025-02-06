package com.keresman.gof.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{

    private final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader downloader = new VideoDownloaderImpl();

    @Override
    public Video getVideo(String videoName) {
        boolean isVideoCached = videoCache.containsKey(videoName);

        if(!isVideoCached) {
            videoCache.put(videoName, downloader.getVideo(videoName));
        }

        System.out.println("Retrieving video from cache ...");
        return videoCache.get(videoName);
    }
}
