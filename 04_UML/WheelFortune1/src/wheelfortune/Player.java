/*
 * Player.java - A class defines a player.
 */
package wheelfortune;

import javax.swing.JOptionPane;

/**
 *
 * @author cxu
 */
public class Player {

    private String name;
    private String sex;
    private int score;

    public Player() {
    }

    public char inputGuess() {
        char guessChar = ' ';
        boolean hasChar = false;

        while (!hasChar) {
            String guessStr = JOptionPane.showInputDialog(
                    "Please enter a char for guessing");
            try {
                guessChar = guessStr.charAt(0);
                hasChar = true;
            } catch (StringIndexOutOfBoundsException siex) {
                showMsg("You did not input any char. Input again.");
            } catch (NullPointerException npex) {
                showMsg("You clicked Cancel. The program is aborted.");
                System.exit(0);
            }
        }
        return guessChar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void showMsg(String msg) {
        System.out.println(msg);
    }
}
