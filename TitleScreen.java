import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Zhang
 * @version June 2
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Let's Game", 50);
    Label spaceLabel = new Label("Press <space> to Start", 25);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1); 
        
        addObject(titleLabel, getWidth()/2, 150);
        addObject(spaceLabel, getWidth()/2, 200);
        prepare();
    }
    
    /**
     * The main world act loop.
     */
    public void act()
    {
        // Start the game if user presses the space bar.
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            gameWorld.setLife(3);
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bear bear = new Bear();
        addObject(bear, 460, 110);
        
        Description description = new Description();
        addObject(description, 560, 290);
    }
}