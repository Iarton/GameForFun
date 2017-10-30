/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjjogowar;

import javax.swing.JButton;
import prjjogowar.frmJogo;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.Console;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import static javax.print.DocFlavor.URL.GIF;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Glaucia
 */
public class Result {

    int hpu;
    int min = 0;
    int max = 100;
    Random rand = new Random();
    int rNum = rand.nextInt((max - min) + min);

    public int getrNum() {
        return rNum;
    }

    public void setrNum(int rNum) {
        this.rNum = rNum;
    }

    public void sethpu() {
        this.hpu = hpu;

    }
}
