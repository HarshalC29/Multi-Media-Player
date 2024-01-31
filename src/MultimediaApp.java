import Decorators.HighQulityMediaDecorator;
import Decorators.MediaDecorator;
import Medias.*;
import Utility.MediaCollection;

import java.util.ArrayList;

public class MultimediaApp {
    public static void main(String[] args) {
        media video = new video( "Movie .mp4");
        media Audio = new Audio("song.mp3");

        Image Img = new Image("picture.jpg");

        media Image = new ImageAdaptor(Img);

        media HighQualityAudio = new HighQulityMediaDecorator(Audio);

        MediaCollection allmedia = new MediaCollection(new ArrayList<>());

        allmedia.addMedia(video);
        allmedia.addMedia(HighQualityAudio);
        allmedia.addMedia(Image);

        allmedia.play();

    }


}
