import greenfoot.*;

/**
 * Write a description of class Crack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crack extends Actor
{
    public boolean hit;
    /**
     * Act - do whatever the Crack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        remove();
    }    
    public void remove()
    {
        CannonBall b = (CannonBall) getOneIntersectingObject (CannonBall.class);
        Castle c = new Castle();
        if (b !=null)
        {
            hit=true;
            getWorld().removeObject (b);
            getWorld().removeObject (this);
        }
    }
}
