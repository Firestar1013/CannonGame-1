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
    /**
     * Act - do whatever the Castle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spawn();
        if ( hit==true){
            if (checkCrack()==true){
            getWorld().removeObject(this);
            hit=false;
        }
        }
    }    
    private void spawn()
    {
        Crack c = new Crack();
        getWorld().addObject (c, getX()-100, getY());
    }
    public boolean checkCrack()
    {
        if (this.getWorld()!=null){
            Actor crack = getOneObjectAtOffset(-100,0,Crack.class);
            if (crack !=null){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
        
    }
}
