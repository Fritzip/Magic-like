/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

import java.util.ArrayList;

/**
 *
 * @author maxime
 */
class Joueur {

    private String name ;
    private int pv ;
    private int ressources ;
    private ArrayList<Carte> main ;
    private ArrayList<Carte> terrain ;
    private ArrayList<Carte> combat ;
    
    Joueur(String s)
    {
        this.name = s ;
        this.pv = 10 ;
        this.main = new ArrayList<>() ;
        this.terrain = new ArrayList<>() ;
        this.combat = new ArrayList<>() ;
    }
    
    public void give_card(Carte card)
    {
        this.main.add(card.copy()) ;
    }
    
    public int getPV() 
    {
        return this.pv ;
    }
    
    public void setPV(int new_pv)
    {
        this.pv = new_pv ;
    }
    
    public void addToPV(int inc)
    {
        this.pv += inc ;
    }

    void print_main()
    {
        for (int i = 0; i < this.main.size(); i++)
        {
            System.out.println(this.main.get(i));
        }
    }
}
