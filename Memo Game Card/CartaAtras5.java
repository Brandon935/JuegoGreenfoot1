import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CartaAtras5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CartaAtras5 extends Actor
{
    /**
     * Act - do whatever the CartaAtras5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act()
    {
    if (Greenfoot.mouseClicked(this))
    {
        if (new GreenfootImage("New back of the card.png").equals(getImage()))
        {
            setImage("chinaFlag.png"); 
        }
        else {
            setImage("chinaFlag.png");
        }
    }
    }
}
