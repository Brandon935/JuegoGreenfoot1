import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 390, 1); 

        backOfTheCard backOfTheCard = new backOfTheCard();
        backOfTheCard backOfTheCard2 = new backOfTheCard();
        addObject(backOfTheCard2,340,100);
        backOfTheCard backOfTheCard3 = new backOfTheCard();
        addObject(backOfTheCard3,466,99);
        backOfTheCard backOfTheCard4 = new backOfTheCard();
        addObject(backOfTheCard4,194,224);
        backOfTheCard backOfTheCard5 = new backOfTheCard();
        addObject(backOfTheCard5,331,224);
        backOfTheCard backOfTheCard6 = new backOfTheCard();
        addObject(backOfTheCard6,439,226);
        backOfTheCard5.setLocation(347,208);
        addObject(backOfTheCard6,465,224);
        backOfTheCard5.setLocation(351,245);
        backOfTheCard5.setLocation(341,252);
        addObject(backOfTheCard5,328,226);
        addObject(backOfTheCard5,335,229);
        backOfTheCard5.setLocation(333,220);
        backOfTheCard6.setLocation(465,233);

        prepare();
    }

    public void act()
    {
        //USA 1
        if(Greenfoot.mouseClicked(this))
        {
           int x = 733;
           int y = 97;
           addObject (new usaFlag(),x,y);
           
           
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        backOfTheCard backOfTheCard = new backOfTheCard();
        addObject(backOfTheCard,197,96);
        backOfTheCard backOfTheCard2 = new backOfTheCard();
        addObject(backOfTheCard2,733,97);
    }
    
}
