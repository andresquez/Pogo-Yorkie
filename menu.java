import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menu
 * Andres Quezada
 */
public class menu extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("dogs.mp3");
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        super(950, 530, 1); 
        backgroundMusic.play();
        backgroundMusic.setVolume(30);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("p"))
        {
            Greenfoot.setWorld(new MyWorld());
            backgroundMusic.stop();
        }
        if (Greenfoot.isKeyDown("e"))
        {
            Greenfoot.stop();
        }
        if (Greenfoot.isKeyDown("h"))
        {
            instructions instructions1 = new instructions();
            addObject(instructions1,475,265);;
        }
        if (Greenfoot.isKeyDown("b"))
        {
            Greenfoot.setWorld(new menu());
        }
    }
   
}

