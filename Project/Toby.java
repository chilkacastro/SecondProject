     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Toby here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Toby extends Actor {
    
        private GreenfootImage image1 = null;
        private GreenfootImage image3 = null;
        private GreenfootImage image4 = null;
        private GreenfootImage image6 = null;
        private GreenfootImage image7 = null;
        private GreenfootImage image9 = null;
        private GreenfootImage image10 = null;
        private GreenfootImage image12 = null;
        private int counter= 0;
    
    
        /**
         * To create objects.
         */  
        public Toby()
        {
            image1 = new GreenfootImage("Right1.png");
            image3 = new GreenfootImage("Right3.png");
            image4 = new GreenfootImage("Left1.png");
            image6 = new GreenfootImage("Left3.png");
            image7 = new GreenfootImage("Back1.png");
            image9 = new GreenfootImage("Back3.png");
            image10 = new GreenfootImage("Front1.png");
            image12 = new GreenfootImage("Front3.png");
            setImage(image7);
        
        }
        
        
        /**
         * Act - do whatever the Toby wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
        {
            checkKeyPressed();
            slowDown();
        } 
        
        
        /**
         * checkKeyPressed - to move or control Toby whenever a key is pressed.
         */
         public void checkKeyPressed() {
        
            // Helps Toby to move forward
            if (Greenfoot.isKeyDown("up")) {
                setLocation(getX(), getY() - 4);
                // Animates Toby when going up
                if (getImage() == image7) {
                    setImage(image9);
                }
                else {
                    setImage(image7);
                }
                    
            }
                
            // Helps Toby to move downwards
            if (Greenfoot.isKeyDown("down")) {
                setLocation(getX(), getY() + 4);
                // Animates Toby when going down
                if (getImage() == image10) {
                      setImage(image12);
                }
                else {
                    setImage(image10);
                }
            }
            // Helps Toby to move to the right side.
            if (Greenfoot.isKeyDown("right")) {
                setLocation(getX() + 4, getY());
                // Animates Toby when going to the right
                if (getImage() == image1) {
                    setImage(image3);
                }
                else {
                    setImage(image1);
                      
                }
            }
            // Helps Toby to move to the left side
            if (Greenfoot.isKeyDown("left")) {
                setLocation(getX() - 4, getY());
                // Animates Toby when going to the left
                if (getImage() == image4) {
                    setImage(image6);
                }
                else {
                    setImage(image4);
                }
            }
        }
    
        
        /**
         * slowDown - to slow down Toby's movement.
         */
         public void slowDown(){
            // Helps slow down Toby's movement.
            if (counter == 50){
                checkKeyPressed();
                counter = 0;
            }
            else {
                counter += 1;
            }
        }
         public void removeToby() {
             if(isTouching(Hole1.class)) {
                getWorld().removeObject(this);
                // put sound here -> dog cry
                getWorld().showText("You lose a life!",360, 370);
                Greenfoot.stop();
            }   
            if(isTouching(Hole2.class)) {
                getWorld().removeObject(this);
                // put sound here -> dog cry
                getWorld().showText("You lose a life!",360, 370);
                Greenfoot.stop();
            }
             if(isTouching(Car.class)) {
                getWorld().removeObject(this);
                // put sound here -> dog cry
                getWorld().showText("You lose a life!",360, 370);
                Greenfoot.stop();
            }   
            
        } 
   
}