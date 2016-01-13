import greenfoot.*;
import java.io.*;

import java.util.ArrayList;

/**
 * Write a description of class CannonMuzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonMuzzle extends Actor
{
    private boolean setangle;
    public boolean ball;
    int angle;
    public int power;
    /**
     * Act - do whatever the CannonMuzzle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        power=Crack.returnVelocity();
        if (Greenfoot.isKeyDown("up") && power < 120)
        {
            power = power + 1;

        }
        if (Greenfoot.isKeyDown("down") && power > 2)
        {
            power = power - 1;

        }
        if (!setangle){
            setRotation(359);
            setangle=true;
        }
        if (getRotation()>270){
            if (Greenfoot.isKeyDown("left") && angle < 90){
                turn (-1);
                angle = angle + 1;
            }
        }
        if (getRotation()<359){
            if (Greenfoot.isKeyDown("right") && angle > 0){
                turn (1);
                angle = angle - 1;
            }
        }
        if (Greenfoot.isKeyDown("space") && noCannonBalls()){
            World Level1 = getWorld();
            CannonBall b = new CannonBall (angle, power);
            Level1.addObject(b, getX(), 700);
        }
        if (noBalls()==true)
        {
            ball=true;
        }
    }    
    public boolean noCannonBalls ()
    {
        World background = getWorld();
        java.util.List balls = background.getObjects(CannonBall.class);
        return balls.isEmpty();
    }
    public boolean noBalls()
    {
        World world = getWorld();
        if (world.getObjects(CannonBall.class)!=null){
            return true;
        }
        else {
            return false;
        }
    }
}
