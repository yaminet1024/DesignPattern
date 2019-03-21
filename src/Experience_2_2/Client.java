package Experience_2_2;

/**
 * 桥接模式实例之跨平台视频播放器
 * 如果需要开发一个跨平台视频播放器，可以在不同操作系统平台（如 Windows、Linux、Unix等）上播放多种格式的视频文件，如
 * MPEG、RMVB、AVI、WMV等常见视频格式。现使用桥接模式设计该播放器。
 */
public class Client {
    public static void main(String[] args) {
        Video video = new RMVB();
        OperationSystem system = new LinuxOperation();
        system.setVideo(video);
        system.play();
    }
}
