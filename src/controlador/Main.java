package controlador;

import java.io.File;
import modelo.Image;
import persistencia.FileImageLoader;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\uluis\\Pictures");
        FileImageLoader loader = new FileImageLoader(file);
        Image image = loader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);

    }
}
