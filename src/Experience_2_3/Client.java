package Experience_2_3;

/**
 * 组合模式实例之杀毒软件
 * 使用组合模式设计一个杀毒软件（AntiVirus）的框架，该软件既可以对某个文件夹（Folder）杀毒，也可以对某个指定的文件
 * （File）进行杀毒，文件种类包括文本包括TextFile、图片文件ImageFile、视频文件VideoFile。绘制类图并编程模拟实现。
 */

public class Client {

    public static void main(String[] args) {
        Folder folder1,folder2,folder3;
        TextFile textFile1,textFile2,textFile3;
        ImageFile imageFile1,imageFile2,imageFile3;
        VideoFile videoFile1,videoFile2,videoFile3;

        folder1 = new Folder("a");
        folder2 = new Folder("b");
        folder3 = new Folder("c");

        textFile1 = new TextFile("1");
        textFile2 = new TextFile("2");
        textFile3 = new TextFile("3");

        folder1.addText(textFile1);
        folder1.addText(textFile2);
        folder1.addText(textFile3);

        imageFile1 = new ImageFile("IMG1");
        imageFile2 = new ImageFile("IMG2");
        imageFile3 = new ImageFile("IMG3");

        folder2.addImage(imageFile1);
        folder2.addImage(imageFile2);
        folder2.addImage(imageFile3);

        videoFile1 = new VideoFile("V1");
        videoFile2 = new VideoFile("V2");
        videoFile3 = new VideoFile("V3");

        folder3.addVideo(videoFile1);
        folder3.addVideo(videoFile2);
        folder3.addVideo(videoFile3);

        folder1.killVirus();
        folder2.killVirus();
        folder3.killVirus();




    }

}
