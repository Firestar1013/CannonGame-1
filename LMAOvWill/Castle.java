import greenfoot.*;

/**
 * Write a description of class Castle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Castle extends Actor
{
    public boolean hit;
    public boolean crk;
    /**
     * Act - do whatever the Castle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(crk==false){
            spawn();
            crk=true;
        }
        if ( hit==true){
            getWorld().removeObject(this);
            
            hit=false;                        
        }
    }    
    
    private void spawn()
    {
        Crack c = new Crack();
        getWorld().addObject (c, getX()-100, getY());
    }

}
