import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    arrow flecha=new arrow();
    private int opcion=0;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 390, 1); 
        prepararMundo();
        prepare();
    }

    private void prepararMundo(){
        addObject(new playB(),460,150);
        addObject(new exitB(),460,250);
        addObject(flecha,300,150);

    }

    public void act(){
        if (Greenfoot.isKeyDown("up") &&  opcion!=0) 
        {
            opcion++;
        }
        if (Greenfoot.isKeyDown("down") &&  opcion!=1) 
        {
            opcion--;
        }

        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;

        flecha.setLocation(300,150+(opcion*100));

        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:// jugar
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1:// salir
                    Greenfoot.stop();
                    break;
            }        
        }    
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}