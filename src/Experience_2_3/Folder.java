package Experience_2_3;


import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<Folder> folders = new ArrayList<>();
    private List<ImageFile> imageFiles = new ArrayList<>();
    private List<TextFile> textFiles = new ArrayList<>();
    private List<VideoFile> videos = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder folder){
        folders.add(folder);
    }

    public void addImage(ImageFile imageFile){
        imageFiles.add(imageFile);
    }

    public void addText(TextFile textFile){
        textFiles.add(textFile);
    }

    public void addVideo(VideoFile videoFile){
        videos.add(videoFile);
    }

    public void killVirus(){
        System.out.println("正在对" + name + "文件夹进行扫描");
        for (Folder folder : folders){
            folder.killVirus();
        }

        for (TextFile textFile:textFiles){
            textFile.killVirus();
        }

        for (ImageFile imageFile : imageFiles){
            imageFile.killVirus();
        }

        for (VideoFile videoFile : videos){
            videoFile.killVirus();
        }

        System.out.println(name + "文件夹杀毒完成");
    }
}
