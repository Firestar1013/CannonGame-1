import greenfoot.*;

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
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
    }   
}
