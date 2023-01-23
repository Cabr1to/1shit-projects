package graficos;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{

    public static JFrame frame;
    private final int WIDHT = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 3;


    public Game(){
        this.setPreferredSize(new Dimension(WIDHT*SCALE, HEIGHT*SCALE));
        frame = new JFrame();
        frame.add(this);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    
    }

    public static void main(String args[]){
        Game game = new Game();

    }

    public void run(){

    }


    }

