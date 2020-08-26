import processing.core.*;

public class App extends PApplet{

    // If you run processing from java you need to declare the settings method for 
    // the size of the sketch

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {
        background(0);
        fill(255);
        circle(width / 2, height / 2, 50);     
    }

    @Override
    public void draw() {
        
    }
    
    public static void main(String[] passedArgs) {

        // Relate this class to the processing sketch  [PApplet]

        // Note: if the name of your class is different 
        // you must replace the following line of code YourClassName.getName()

        String[] appletArgs = new String[] { App.class.getName() };
        if (passedArgs != null) {
            PApplet.main(concat(appletArgs, passedArgs));
        } else {
            PApplet.main(appletArgs);
        }
    }
}
