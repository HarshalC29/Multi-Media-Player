package Decorators;

import Medias.media;



public abstract class MediaDecorator implements media{
    protected media decoratedMedia;
    public MediaDecorator(media decoratedMedia) {
        this.decoratedMedia = decoratedMedia;
    }

    @Override
    public void play() {
        this.decoratedMedia.play();

    }
}

