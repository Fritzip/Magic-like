/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

/**
 *
 * @author maxime
 */
public class Main
{

    public static void main(String[] args)
    {
        Joueur j1 = new Joueur("Alice") ;
        Joueur j2 = new Joueur("Bob") ;
        Game game = new Game(j1, j2) ;
        game.run() ;
    }
    
}
