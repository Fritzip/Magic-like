/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiclike;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author geomod
 */
public class CarteGui extends JButton {
    int num;
    
    public CarteGui(int _num) {
        super();
        this.num = _num; 
        setBackground(Color.white);  
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent arg0) {
                super.mouseClicked(arg0);
                setBackground(Color.orange);
                System.out.println("click sur " + CarteGui.this.num );
            }
        });
    }
}
