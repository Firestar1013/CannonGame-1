import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonBall extends Actor
{

    private double h0 = 1;
    private double h = h0;
    private double tStart;
    private double xStart;
    private double yStart;
    private double g = 30;
    private double SCALE = 7;
    
    double v0y;
    double v0x;
    private boolean first  = true;
    private boolean checkTop = false;
   
    public CannonBall(int angle, int power)
    {
        v0y = (power) * Math.sin(Math.toRadians(angle)); // power get the trajectorie in y
        v0x = (power) * Math.cos(Math.toRadians(angle)); // power get the trajectorie in x
    }
    public boolean checkTop()
    {
        if(getY()== getWorld().getHeight() -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void act() 
    {
        if(first)
        {
            first = !first;
            tStart = System.currentTimeMillis();
            xStart = getX();
            yStart = getY();
        } else {
            double t = (System.currentTimeMillis() -tStart) / 300;
            h = h0 +(v0y*t) - ( (g*t*t) / 2);
            setLocation((int)(xStart + SCALE * (v0x*t)),(int)(yStart - SCALE *h));
        }
        if (getX() == getWorld().getWidth() - 1) getWorld().removeObject(this);
        else if (getY() == getWorld().getHeight() - 1) getWorld().removeObject(this);
    }    
}


