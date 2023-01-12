package zeldaminiclone;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player_front;
	
	public static BufferedImage tileWall;
	
	public static BufferedImage tree;

	public static Image bullet;
	
	public static BufferedImage[] inimigo_front;
	//272,254
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass() .getResource("/spritesheet.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		player_front= new BufferedImage[2];
		inimigo_front= new BufferedImage[2];
		
		player_front[0] = Spritesheet.getSprite(0, 11, 16, 16);
		player_front[1] = Spritesheet.getSprite(18, 11, 16, 16);
		
		inimigo_front[0] = Spritesheet.getSprite(272, 254, 16, 16);
		inimigo_front[1] = Spritesheet.getSprite(289, 254, 16, 16);
		
		tileWall = Spritesheet.getSprite(280,221, 16,16);
		tree = Spritesheet.getSprite(307,220, 10, 14);
		bullet = Spritesheet.getSprite(191, 185, 16, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
	
}
