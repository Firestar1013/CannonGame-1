import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    public boolean ball;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 

        prepare();
    }

    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
       Castle c = new Castle();
       addObject (c, 950, 600);
       CannonMuzzle muzzle=new CannonMuzzle();
       addObject (muzzle, 100,695);
       CannonMount mount=new CannonMount();
       addObject (mount, 100, 700);    
       Army a = new Army();
       addObject(a,850,700);
    }
    

}
