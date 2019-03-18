//java code to turn lights on and off
//by Sarah Littlejohn


//import a scanner to allow user input
import java.util.Scanner;
//import calender and date formats to display the time
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lights{
// listing properties of lights
String colour;
String state;


// constructor method to define lights
public Lights(String lightColour, String lightState){
    colour = lightColour;
    state = lightState;
}

// main method
public static void main(String[] args) throws InterruptedException{

    //using the date format to acheive the time in the "hh:mm:ss" format
    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");

    //define colours and state here, makes it easy to change colours
    Lights light1 = new Lights("Red", "on");
    Lights light2 = new Lights("Red", "off");
    Lights light3 = new Lights("Green", "on");
    Lights light4 = new Lights("Green", "off");
    Lights light5 = new Lights("White", "on");
    Lights light6 = new Lights("White", "off");

    //creating input from user for the number of lights
    Scanner userInput = new Scanner(System.in);
    int numLights;
    System.out.print("Enter the number of lights");
    numLights = userInput.nextInt();
        //if the input is zero, the default of 20 lights is used
        if (numLights == 0){
            numLights = 20;
        }

    //define the starting position of lights
    int position = 0;

    //While loop ensures that the program keeps going until all the lights have been turned off and on
    while (position <= numLights){
        //add 1 to position 
        position++;
        //if function checks if the light in this position has been turned on and off yet
        if (position <= numLights){
        //get current time
        Calendar calendar1 = Calendar.getInstance();
        //print the time, position, light colour, turn on
        System.out.println(dateFormat.format(calendar1.getTime()) + " " + position + " " + light1.colour + " Light " + light1.state);
        //delay for 1 second
        Thread.sleep(1000);
        //get current time
        Calendar calendar2 = Calendar.getInstance();
        //print the time, position, light colour, turn off
        System.out.println(dateFormat.format(calendar2.getTime()) + " " + position + " " + light2.colour + " Light " + light2.state);
        //go to next position
        position++;
        //delay for 1 second
        Thread.sleep(1000);
            //if function checks if the light in this position has been turned on and off yet
            //code will contiue as above until the position is greater than the number of lights
            if (position <= numLights){
            Calendar calendar3 = Calendar.getInstance();
            System.out.println(dateFormat.format(calendar3.getTime()) + " " + position + " " + light3.colour + " Light " + light3.state); 
            Thread.sleep(1000);
            Calendar calendar4 = Calendar.getInstance();
            System.out.println(dateFormat.format(calendar4.getTime()) + " " + position + " " + light4.colour + " Light " + light4.state);
            position++;
            Thread.sleep(1000);
                if(position <= numLights){
                Calendar calendar5 = Calendar.getInstance();
                System.out.println(dateFormat.format(calendar5.getTime()) + " " + position + " " + light5.colour + " Light " + light5.state) ;  
                Thread.sleep(1000);
                Calendar calendar6 = Calendar.getInstance();
                System.out.println(dateFormat.format(calendar6.getTime()) + " " + position + " " + light6.colour + " Light " + light6.state);
                Thread.sleep(1000);
                //don't go to next position, this will happen at the start of the loop 
                    }
                } 
            }
        }       
    }  
}
