import greenfoot.MouseInfo;

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
        //usaFlag usaFlag = new usaFlag();
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        cartaAtras cartaAtras = new cartaAtras();
        addObject(cartaAtras,374,131);
        cartaAtras cartaAtras2 = new cartaAtras();
        addObject(cartaAtras2,506,127);
        removeObject(cartaAtras2);
        CartaAtras2 cartaAtras22 = new CartaAtras2();
        addObject(cartaAtras22,623,248);
        CartaAtras3 cartaAtras3 = new CartaAtras3();
        addObject(cartaAtras3,506,130);
        CartaAtras3V1 cartaAtras3V1 = new CartaAtras3V1();
        addObject(cartaAtras3V1,253,244);
        CartaAtras4 cartaAtras4 = new CartaAtras4();
        addObject(cartaAtras4,246,126);
        CartaAtras4 cartaAtras42 = new CartaAtras4();
        addObject(cartaAtras42,377,247);
        removeObject(cartaAtras42);
        CartaAtras4V1 cartaAtras4V1 = new CartaAtras4V1();
        addObject(cartaAtras4V1,620,122);
        CartaAtras5 cartaAtras5 = new CartaAtras5();
        addObject(cartaAtras5,376,247);
        CartaAtras5V1 cartaAtras5V1 = new CartaAtras5V1();
        addObject(cartaAtras5V1,501,248);
    }
    
 
    
}
