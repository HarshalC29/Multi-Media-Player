package Medias;

public class ImageAdaptor implements media{

    private Image image;

    public ImageAdaptor(Image image) {
        this.image = image;
    }

    @Override
    public void play() {
        this.image.disply();

    }
}
