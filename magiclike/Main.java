/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

import javax.swing.JFrame;

/**
 *
 * @author maxime
 */
public class Main
{
    public static void main(String[] args)
    {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Joueur j1 = new Joueur("Alice") ;
                Joueur j2 = new Joueur("Bob") ;
        
                Game game = new Game(j1, j2) ;
                game.run() ;
          
                Vue vue = new Vue("Magic Like");
                vue.g = game;
                vue.setVisible(true);
                vue.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
                game.addObserver(vue);
                
                game.run() ;
            }
        });
        
        
        
    }
    
}
