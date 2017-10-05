import java.util.Random;

//This class generates A random number from 5 to 95
public class RandomnessChange {


    public static void main(String[] args)
    {
        output("Generate 10 random integers between 0 and 6");
        Random rnd= new Random ();

        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = 5 + rnd.nextInt(91);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
