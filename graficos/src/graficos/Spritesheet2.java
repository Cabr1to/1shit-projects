package graficos;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet2 {

    private BufferedImage spritesheet;

    public Spritesheet2(String path){
        try {
            spritesheet = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public BufferedImage getSprite(int x, int y,int widht, int height){
        return spritesheet.getSubimage( x, y, widht, height);
        


    }
}
