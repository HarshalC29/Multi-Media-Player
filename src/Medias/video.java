package Medias;



public class video implements media {
    private  String fileName;

    public video(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing video : "+ this.fileName);

    }


}
