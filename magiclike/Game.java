/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

import java.util.*;

class Game extends Observable{

    private Joueur[] joueurs ;
    private ArrayList<Carte> deck ;
    private int num_tour ;
    
    Game(Joueur j1, Joueur j2)
    {
        this.num_tour = 1 ;
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
    }

    public void distribution_cartes(int nb_cartes)
    {
        if (nb_cartes <= this.deck.size()/2)
        {
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < nb_cartes; j++)
                {
                    this.joueurs[i].give_card(this.deck.get(0)) ;
                    this.deck.remove(0) ;
                }
            }
        }
        else
        {
            System.out.println("I can not distribute as many cards");
//            System.exit(1) ;
        }

        this.setChanged();
        this.notifyObservers();
    }
    
    public void run()
    {
        distribution_cartes(4) ;
        int joueur_actif = (int) Math.random()*2 ;
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        boolean in_game = true ;
        while (in_game)
        {
            this.joueurs[joueur_actif].print_main() ;
            this.joueurs[joueur_actif].set_ressources(this.num_tour);
            int idx ;
            do {                
                System.out.print("Enter idx of card to invoke : ");
                idx = reader.nextInt();    
            } while (this.joueurs[joueur_actif].invocation(idx));
            
        }
        
    }
    
}
