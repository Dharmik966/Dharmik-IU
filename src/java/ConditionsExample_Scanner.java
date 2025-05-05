import java.util. Scanner;

public class ConditionsExample_Scanner 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter your age:");
        int age = scanner.nextInt();

        if (age > 18) 
        {
            System.out.println("You are an adult.");
            }
            else if (age >= 13) 
            {
            System.out.println("You are a teenager.");
            }
            // make scanner to show you are not born if entry is less than 0
            else if (age < 0) 
            {
                System.out.println("You are not born yet.");
            }
            // make scanner to show you are not born if entry is less than 0
            else if (age > 120) 
            {
                System.out.println("You are too old.");
            }
            // make scanner to show you are not born if entry is less than 0
            else if (age == 0) 
            {
                System.out.println("You are just born.");
            }
            else
            {
            System.out.println("You are a child.");
            }
}
}