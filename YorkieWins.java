import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class YorkieWins extends Actor
{
    public void act()
    {
        ((MyWorld)getWorld()).backgroundMusic.stop();
        if (Greenfoot.isKeyDown("b"))
        {
            Greenfoot.setWorld(new menu());
        }
    }
}
