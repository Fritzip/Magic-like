/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

import java.util.*;
/**
 *
 * @author maxime
 */
class Game {

    private Joueur[] joueurs ;
    private ArrayList<? extends Carte> deck ;
    
    Game(Joueur j1, Joueur j2)
    {
        this.joueurs = new Joueur[2] ;
        this.joueurs[0] = j1 ;
        this.joueurs[1] = j2 ;
        
        //this.deck = new ArrayList<? extends Carte>() ;
        //this.deck.add( new Creature() ) ;
        
    }

    public void distribution_cartes()
    {
        
    }
    
    public void run()
    {
        distribution_cartes() ;
        int joueur_actif = (int) Math.random()*2 ;
        
    }
    
}
