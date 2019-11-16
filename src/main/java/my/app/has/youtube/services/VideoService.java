package my.app.has.youtube.services;

import my.app.has.youtube.models.Video;

import java.util.ArrayList;
import java.util.List;

public class VideoService {

    static List<Video> videos = new ArrayList<>();

    static {
        videos.add(new Video("o8NPllzkFhE", "The mind behind Linux | Linus Torvalds"));
        videos.add(new Video("hb7Q33ysCwI", "Coding is Not Difficult - Bill Gates"));
        videos.add(new Video("knW7-x7Y7RE", "Hãy trao cho anh"));
        videos.add(new Video("kRdqTNhHulw", "Đôi Mắt | Wanbi Tuấn Anh | Official MV"));
    }

    public static List<Video> getVideos() {
        return videos;
    }

    public static void addVideo(Video video) {
        videos.add(video);
    }
}
