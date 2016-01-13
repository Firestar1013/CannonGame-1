import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * Write a description of class Crack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crack extends Actor
{
    public static boolean hit=false;
    public boolean input;
    public static int inputV; 
    /**
     * Act - do whatever the Crack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (this.getWorld()!=null){
            remove();
        }
        if (input!=true){
            String s1= JOptionPane.showInputDialog("Enter a velocity:");
            inputV= Integer.parseInt(s1);
            input=true;
        }
    }
     
    public void remove()
    {
        if (this.getWorld()!=null){
        Actor b = getOneIntersectingObject (CannonBall.class);
        Actor c = getOneIntersectingObject (Castle.class);
        if (b !=null)
        {
            hit=true;
            getWorld().removeObject (b);
            getWorld().removeObject (c);
            getWorld().removeObject (this);


        }
    }
    }
    
    public static boolean stopArmy()
    {
        return hit;
    }
    
    public static int returnVelocity()
    {
       return inputV;
    }
}
