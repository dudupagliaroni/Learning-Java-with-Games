/*
 * Agnes2.java - The main class of the game Agnes
 */
package agnes;

import javax.swing.JFrame;

/**
 *
 * @author cxu
 */
public class Agnes2 extends JFrame {

    public Agnes2() {
        setTitle("Game Agnes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Consts.CV_WIDTH, Consts.CV_HEIGHT);
        
        GameCanvas gameCv = new GameCanvas();
        add(gameCv);
        
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Agnes2();
    }
}
