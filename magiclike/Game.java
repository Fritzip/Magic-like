/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

import java.util.*;

class Game {

    private Joueur[] joueurs ;
    private ArrayList<Carte> deck ;
    
    Game(Joueur j1, Joueur j2)
    {
        this.joueurs = new Joueur[2] ;
        this.joueurs[0] = j1 ;
        this.joueurs[1] = j2 ;
        
        this.deck = new ArrayList<Carte>() ;
        this.deck.add( new Creature("C1", 2, 3, 1) ) ;
        this.deck.add( new Creature("C2", 4, 3, 3) ) ;
        this.deck.add( new Creature("C3", 5, 2, 5) ) ;
        this.deck.add( new Creature("C4", 8, 7, 7) ) ;
        this.deck.add( new Creature("C5", 1, 1, 2) ) ;
        this.deck.add( new Creature("C6", 2, 1, 3) ) ;
        this.deck.add( new Creature("C7", 3, 0, 5) ) ;
        this.deck.add( new Creature("C8", 6, 5, 5) ) ;
        Collections.shuffle(this.deck) ;
        System.out.println(this.deck.get(0).name());
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
