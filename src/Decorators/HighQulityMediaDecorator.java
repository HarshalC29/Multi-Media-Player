package Decorators;

import Medias.media;

public class HighQulityMediaDecorator extends MediaDecorator {
    public HighQulityMediaDecorator(media decoratedMedia) {
        super(decoratedMedia);
    }
    public void play(){
        super.play();
        System.out.println("Enhance Quality ");
    }
}
