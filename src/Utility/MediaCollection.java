package Utility;

// composite design pattern

import Medias .media;

import java.util.ArrayList;
import java.util.List;

public class MediaCollection implements media {

    public MediaCollection(List<media> mediaList) {
        this.mediaList = mediaList;
    }

    private List<media> mediaList = new ArrayList<>();
    public void play(){
        for (media media: mediaList){
            media.play();
        }

    }
    public void addMedia (media media){
        mediaList.add(media);
    }

}
