public class FallingBodies
{
    public static void main(String[] args)
    {
        double g = 9.8;
        int t = 10;
        
        double h = .5 * g * t * t;
        
        System.out.print("Height = ");
        System.out.print(h);
        System.out.println(" m.");
        
        double v = g * t;
        
        System.out.print("Velocity = ");
        System.out.print(v);
        System.out.print(" m/s.");
    }
}

//h = .5 * g * t2

//v = g * t

//Use g as a final variable to solve the following problems in Java.

//You’re standing at the edge of a cliff and drop a ball. 
//It takes 10 sec to hit the ground. How high up are you? 
//In other words, what’s the height of the cliff?
//What is the velocity of the ball when it hits the ground?
