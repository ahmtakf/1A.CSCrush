package cscrash;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren Ayture
 */
public class Cs342 extends BookCandy {
    public Cs342(){
        super();
        if(getTypeBar().equals("normal"))
            setImage("img\\cs342.jpeg");
        else if (getTypeBar().equals("vertical"))
            setImage("img\\cs342Vertical.jpeg");
        else
            setImage("img\\cs342Horizontal.jpeg");
    }
    
    @Override
    public void setTypeBarDirectly(){
        int chance = (int)(Math.random() *2  + 1);
        switch ( chance ) {
            case 1:
                typeBar = "vertical";
                break;
            case 2:
                typeBar = "horizontal";
                break;
        }
        if(typeBar == "vertical")
            setImage("img\\cs342Vertical.jpg");
        if(typeBar == "vertical")
            setImage("img\\cs342Horizontal.jpg");
    }
}
