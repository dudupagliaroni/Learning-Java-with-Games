/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trysympoint;

import javax.swing.JFrame;

/**
 *
 * @author cxu
 */
public class TrySymPoint extends JFrame {

    public TrySymPoint() {
        setTitle("Try Symmetry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Consts.CV_WIDTH, Consts.CV_HEIGHT);
        
        Canvas cv = new Canvas();
        add(cv);
        
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TrySymPoint();
    }
    
}
