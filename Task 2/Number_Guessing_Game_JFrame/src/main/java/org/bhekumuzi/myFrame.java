package org.bhekumuzi;

import javax.swing.*;

public class myFrame extends JFrame {
     myFrame(){

         JButton button = new JButton();

         this.setVisible(true); // so we can see the frame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setSize(500,500);
         this.setTitle("Number Guessing Game");

         JLabel label = new JLabel();
         label.setHorizontalTextPosition(JLabel.CENTER);
         label.setVerticalTextPosition(JLabel.TOP);
         label.setVerticalAlignment(JLabel.TOP);
         label.setText("Ready ? Choose difficult :");

         this.add(label);
     }






}
