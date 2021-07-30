import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jardin
 * 
 * @author Andres Quezada
 * @version 22-07-2021
 */
public class MyWorld extends World
{
    Counter time = new Counter();
    SimpleTimer timex = new SimpleTimer();
    public GreenfootSound backgroundMusic = new GreenfootSound("dogs.mp3");
    int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1000,800, 1);
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(30);
        
        
        addObject(time, 900,50);
        timex.mark();
        
        Pogo PogoPlayer1 = new Pogo();
        addObject(PogoPlayer1,150,500);
        
        Yorkie YorkiePlayer2 = new Yorkie();
        addObject(YorkiePlayer2, 700 , 300);
        
        rock rock1 = new rock();
        addObject(rock1, Greenfoot.getRandomNumber(100),Greenfoot.getRandomNumber(100));
        rock rock2 = new rock();
        addObject(rock2, Greenfoot.getRandomNumber(100) + 800,Greenfoot.getRandomNumber(100) + 600);        
        rock rock3 = new rock();
        addObject(rock3, Greenfoot.getRandomNumber(100) + 400,Greenfoot.getRandomNumber(100) + 400);
    
        plant plant1 = new plant();
        addObject(plant1, Greenfoot.getRandomNumber(100)+100,Greenfoot.getRandomNumber(100) + 100);
        plant plant2 = new plant();
        addObject(plant2, Greenfoot.getRandomNumber(100)+600,Greenfoot.getRandomNumber(100)+600);
        plant plant3 = new plant();
        addObject(plant3, Greenfoot.getRandomNumber(100)+200,Greenfoot.getRandomNumber(100)+200);
    }
    public void act()
    {
        time.setValue(timex.millisElapsed()/1000);
        youLost();
    }
    public void youLost()
        {
            score = time.getValue();
            if ((score > 44))
            {
            time.setValue(45);
            addObject(new YorkieWins(),getWidth()/2,getHeight()/2);

            }
        }
}
