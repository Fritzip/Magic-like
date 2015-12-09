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
abstract class Carte
{
    private String name ;
    private int cout ;
    
    Carte()
    {
        this.name = "" ;
        this.cout = 0 ;
    }
    
    Carte(String name, int cout)
    {
        this.name = name ;
        this.cout = cout ;
    }
    
    public abstract Carte copy() ;
    
    public String name()
    {
        return this.name ;
    }
    
    public int cout()
    {
        return this.cout ;
    }
    
    @Override
    public String toString()
    {
        return "|| "+this.name+" (" +this.cout+")" ;
    }
}
