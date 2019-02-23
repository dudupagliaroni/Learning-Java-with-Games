/*
 * TestDrag1.java - The main class of the game Agnes
 */
package testdrag;

import javax.swing.JFrame;

/**
 *
 * @author cxu
 */
public class TestDrag1 extends JFrame {

    public TestDrag1() {
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
        new TestDrag1();
    }
}
