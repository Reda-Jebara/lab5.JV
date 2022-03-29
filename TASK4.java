import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TASK4
{
    public static void main(String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Th first word: ");

        String Word01=reader.readLine();

        System.out.print("Enter The Second word: ");

        String Word02=reader.readLine();

        String W1W2=Word01.concat(Word02);

        System.out.print("Addin the first Word to the second: "+W1W2 );

        String W2W1=Word02.concat(Word01);

        System.out.print("\nAddin the second Word to the first : "+W2W1);

        System.out.println("\nIs the composition of  "+W1W2+" alternatin : "+W1W2.equals(W1W2));

        System.out.println("Is the composition of  "+W2W1+" alternatin : "+W2W1.equals(W1W2));
    }
}
