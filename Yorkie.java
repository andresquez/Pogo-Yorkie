import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Yorkie extends Actor
{
    public Yorkie()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(60,60);
    }
    public void act()
    {
        moves();
    }
    private void moves()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            setImage("yorkie.png");
            GreenfootImage myImage = getImage();
            myImage.scale(60,60);
            setRotation(0);
            move(2);
            if (hitPlant())
            {
                move(-1);
            }
            if (hitRock())
            {
                move(-2);
            }
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setImage("yorkienormal.png");
            GreenfootImage myImage = getImage();
            myImage.scale(90,90);
            setRotation(0);
            move(-2); 
            if (hitPlant())
            {
                move(1);
            }
            if (hitRock())
            {
                move(2);
            }
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setImage("yorkie.png");
            GreenfootImage myImage = getImage();
            myImage.scale(60,60);
            setRotation(270);
            move(2); 
            if (hitPlant())
            {
                move(-1);
            }
            if (hitRock())
            {
                move(-2);
            }
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setImage("yorkie.png");
            GreenfootImage myImage = getImage();
            myImage.scale(60,60);
            setRotation(90);
            move(2); 
            if (hitPlant())
            {
                move(-1);
            }
            if (hitRock())
            {
                move(-2);
            }
        }
        }
        public boolean hitPlant()
        {
            if (isTouching(plant.class))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public boolean hitRock()
        {
            if (isTouching(rock.class))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
}
