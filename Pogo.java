import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Pogo extends Actor
{
    Counter time = new Counter();
    SimpleTimer timex = new SimpleTimer();
    int score = 0;
    String scoreS = "";
    int x = 0;
    public Pogo()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(75,75);
    }
    public void act()
    {
        moves();
        youWin();
        time.setValue(timex.millisElapsed()/1000);
        if (Greenfoot.isKeyDown("b"))
        {
        Greenfoot.setWorld(new menu());
        }
    }
    private void moves()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setImage("pogonormal.gif");
            GreenfootImage myImage = getImage();
            myImage.scale(75,75);
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
        if (Greenfoot.isKeyDown("left"))
        {
            setImage("pogoflip.png");
            GreenfootImage myImage = getImage();
            myImage.scale(75,75);
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
        if (Greenfoot.isKeyDown("up"))
        {
            setImage("pogonormal.gif");
            GreenfootImage myImage = getImage();
            myImage.scale(75,75);
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
        if (Greenfoot.isKeyDown("down"))
        {
            setImage("pogonormal.gif");
            GreenfootImage myImage = getImage();
            myImage.scale(75,75);
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
        public void youWin()
        {
            if (isTouching(Yorkie.class))
            {
                if (x < 1)
                {
                score = time.getValue();
                String scoreS = score + "";
                getWorld().addObject(new YouWinScreen(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                getWorld().showText(scoreS,600,475);
                x = 1;
                }
            }
        }
    }
    

