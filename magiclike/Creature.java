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
public class Creature extends Carte
{
    private int att ;
    private int def ;
    
    Creature()
    {
        super() ;
        this.att = 0 ;
        this.def = 0 ;
    }
    
    Creature(String name, int cout)
    {
        super(name, cout);
        this.att = 0 ;
        this.def = 0 ;
    }
    
    Creature(String name, int cout, int att, int def)
    {
        super(name, cout) ;
        this.att = att ;
        this.def = def ;
    }
    
    public Creature copy() 
    {
        return new Creature(this.name(), this.cout(), this.att, this.def) ;
    }
    
    public String toString()
    {
        return super.toString() + " Att:" + this.att +" Def:"+ this.def ;
    }
    
    public int att()
    {
        return this.att ;
    }
    
    public int def()
    {
        return this.def ;
    }
    
}
