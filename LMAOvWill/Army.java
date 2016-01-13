import greenfoot.*;
/**
 * Write a description of class Army here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Army extends Actor
{
    public int time;
    public boolean timeout;
    public boolean win;
    /**
     * Act - do whatever the Army wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
       if (Crack.stopArmy()!=true){
       if (timeout==false){
           if (time<1){
               time++;
            }
           if (time==1){
               setLocation(getX()-1,getY());
               time=0;
           }
        }
       CannonMuzzle muzzle=new CannonMuzzle();
       if (getX()<100){
           getWorld().removeObject(muzzle);
       }
       CollideWithCannon();
    }    
}
    
    private void CollideWithCannon() 
    {
        CannonMuzzle muzzle = (CannonMuzzle) getOneIntersectingObject(CannonMuzzle.class);
        Actor mount;
        mount= getOneObjectAtOffset(-100,0,CannonMount.class);
        if (muzzle != null) {
            getWorld().removeObject(muzzle);
            getWorld().removeObject(mount);
            timeout=true;
            GameOver g = new GameOver();
            getWorld().addObject(g,500,400);
            Greenfoot.stop();
        }

    }
        
    
}
