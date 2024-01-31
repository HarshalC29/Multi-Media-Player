package Medias;

public class Image {

     private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }

    public void disply(){
        System.out.println("Display Image " + this .fileName);
    }

}
