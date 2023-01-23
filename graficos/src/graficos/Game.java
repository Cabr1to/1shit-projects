package graficos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.nio.Buffer;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import javax.management.loading.PrivateClassLoader;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{

    public static JFrame frame;
    private Thread thread;
    private boolean isRunning = true;
    private final int WIDHT = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 4;

    private BufferedImage image; 

    private Spritesheet2 sheet;
    private BufferedImage [] player;
    private int frames = 0;
    private int maxFrames = 10;
    private int curAnimation = 0, maxAnimation = 3;


    public Game(){
        sheet = new Spritesheet2("/spritesheet2.png");
        player = new BufferedImage[3];
        player[0] = sheet.getSprite(16, 2, 15, 15);
        player[1] = sheet.getSprite(16, 33 , 15, 15);
        player[2] = sheet.getSprite(16, 17 , 15, 15);
    
        setPreferredSize(new Dimension(WIDHT*SCALE, HEIGHT*SCALE));
        initFrame();
        image = new BufferedImage(WIDHT,HEIGHT, BufferedImage.TYPE_INT_RGB);
    }

    public void initFrame(){
        frame = new JFrame("Game #1");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    
    } 
    public synchronized void start(){
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public synchronized void stop(){
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String args[]){
        Game game = new Game();
        game.start();
    }

    public void tick(){
        frames++;
        if(frames > maxFrames){
            frames = 0;
            curAnimation++;
            if(curAnimation >= maxAnimation){
                curAnimation = 0;

            }
        }


    }

    public <Graphics2D> void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = image.getGraphics();
        g.setColor(new Color(0,0,255));
        g.fillRect(0, 0,WIDHT, HEIGHT);

        /*Renderizacao do jogoo */
        Graphics2D g2 = (Graphics2D) g;
        ((Graphics) g2).drawImage(player[curAnimation], 90,90,null);
     
        /***/
        g.dispose();
        g = bs.getDrawGraphics();
        g.drawImage(image,0, 0,WIDHT*SCALE,HEIGHT*SCALE,null);
        bs.show();
    }

    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int frames = 0;
        double timer = System.currentTimeMillis();
        while(isRunning){
            long now = System.nanoTime();
            delta+= (now - lastTime) / ns;
            lastTime = now;
            if(delta >= 1){
                tick();
                render();
                frames++;
                delta--;

            }
            if(System.currentTimeMillis() - timer >= 1000){
                System.out.println("FPS:"+ frames);
                frames = 0;
                timer+=1000;

            }
        }

        stop();
    }


    }

