package org.bhekumuzi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class myFrame extends JFrame implements ActionListener {
    JButton easy;
    JButton medium;
    JButton hard;
    JLabel score;
    int points = 0;
     myFrame(){
         JLabel difficulty  = new JLabel( "Select Game Difficulty :");
         score = new JLabel("Select Difficulty " + points);
//         score.setHorizontalTextPosition(50);
//         score.setVerticalTextPosition(10);




         easy = new JButton();
         easy.setBounds(80,100,100,50);
         easy.setFocusable(false);
         easy.setText("easy");
         easy.addActionListener(this);

         medium = new JButton();
         medium.setBounds(200,100,100,50);
         medium.setFocusable(false);
         medium.setText("medium");
         medium.addActionListener(this);

         hard = new JButton();
         hard.setBounds(320,100,100,50);
         hard.setFocusable(false);
         hard.setText("hard");
         medium.addActionListener(this);

         this.setVisible(true); // so we can see the frame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setSize(500,500);
         this.setTitle("Number Guessing Game");
//         this.setLayout(null);


         this.add(medium);
         this.add(easy);
         this.add(hard);
         this.add(score);


     }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("HERE");
        if (e.getSource() == easy) {
            points ++;
            score.setText("Score " + points);
        } else if (e.getSource() == medium) {
            System.out.println();
        }


    }


}
