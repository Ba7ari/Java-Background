/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackgaround;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import javax.swing.*;
import javax.swing.JDesktopPane;

/**
 *
 * @author ASUS
 */
class DesktopPanel extends JDesktopPane {
     Image img;
    
       public DesktopPanel(){
           try{
//               clsSet.tempURL = "1.jpg";
               img = new ImageIcon(getClass().getResource(clsSet.tempURL)).getImage();
               this.repaint();
               System.out.println(clsSet.tempURL);
           }catch(Exception e){
               System.out.println("File tidak ditemukan");
           }
           
       }
        protected void paintComponent(Graphics graph){
           
            Graphics2D g2D = (Graphics2D) graph.create();
            clsSet cs = new clsSet();               
            g2D.drawImage(img, 0, 0, getWidth(), getHeight(),null);
            g2D.dispose();
   }
    
    
}
