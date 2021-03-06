package cscrush;
/*
 * @author Eren Ayture
 * @description: child class of an BookCandy object with overrided setTypeBarDirectly() 
 * @date: 5.05.2018
 */
public class Cs476 extends BookCandy {
    /*
    @see: super() takes parent class properties
    Constructor 
    */
    public Cs476(){
        super();
    }
    /*
    @return: void
    with %60 possibility set objec as special book vertical else horizontal
    */
    @Override
    public void setTypeBarDirectly(){
        int chance = (int)(Math.random() *100  + 1);
        if(chance <= 60)
            typeBar = "vertical";
        else
            typeBar = "horizontal";
    }
}
