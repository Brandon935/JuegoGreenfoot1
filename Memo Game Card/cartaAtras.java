import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cartaAtras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cartaAtras extends Actor
{
    /**
     * Act - do whatever the cartaAtras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void changeCardImage()
    {
        //Useless
    }
    public void act()
    {
    if (Greenfoot.mouseClicked(this))
    {
        if (new GreenfootImage("New back of the card.png").equals(getImage()))
        {
            setImage("New USA flag.png"); // adjust name of file as needed
        }
        else {
            setImage("New USA flag.png");
        }
    }
    }
}
