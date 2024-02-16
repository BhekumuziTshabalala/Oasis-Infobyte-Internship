package org.bhekumuzi;

import javax.swing.*;

public class myFrame extends JFrame {
     myFrame(){

         JButton easy = new JButton();
         easy.setBounds(80,100,100,50);
         easy.setFocusable(false);
         easy.setText("easy");

         JButton medium = new JButton();
         medium.setBounds(200,100,100,50);
         medium.setFocusable(false);
         medium.setText("easy");

         JButton hard = new JButton();
         hard.setBounds(320,100,100,50);
         hard.setFocusable(false);
         hard.setText("easy");

         this.setVisible(true); // so we can see the frame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setSize(500,500);
         this.setTitle("Number Guessing Game");
         this.setLayout(null);

         JLabel label = new JLabel();
         label.setHorizontalTextPosition(JLabel.CENTER);
         label.setVerticalTextPosition(JLabel.TOP);
         label.setVerticalAlignment(JLabel.TOP);
         label.setText("Ready ? Choose difficult :");

         this.add(label);
         this.add(medium);
         this.add(easy);
         this.add(hard);
     }






}
