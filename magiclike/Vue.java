/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author geomod
 */
public class Vue extends JFrame{
    
    Vue(String s) {
        super(s);
        JPanel plateau = new JPanel();
        plateau.setBackground(Color.RED);
        plateau.setPreferredSize(new Dimension(100,50));
        plateau.setLayout(new GridLayout(6,5));
        for(int i=0; i<5*6; ++i)
        {
            CarteGui mCase = new CarteGui(i);
            plateau.add(mCase);
        }
        this.getContentPane().add(plateau,BorderLayout.CENTER);
        

        JPanel action = new JPanel();
        action.setBackground(Color.BLUE);
        action.setPreferredSize(new Dimension(100,50));
        this.getContentPane().add(action,BorderLayout.EAST);
        
        
        //this.pack();
    }
    
}
