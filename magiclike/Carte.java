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
    private int coup ;
    
    Carte()
    {
        this.name = "" ;
        this.coup = 0 ;
    }
    
    Carte(String name, int coup)
    {
        this.name = name ;
        this.coup = coup ;
    }
    
    public abstract Carte copy() ;
    
    public String name()
    {
        return this.name ;
    }
    
    public int coup()
    {
        return this.coup ;
    }
    
    @Override
    public String toString()
    {
        return "|| "+this.name+" (" +this.coup+")" ;
    }
}
