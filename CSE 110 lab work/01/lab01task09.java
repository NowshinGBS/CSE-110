// ekhane loop use kora hoyeche.
import java.util.Scanner;
public class lab01task09
{
  public static void main (String [] args)
  {
    Scanner fr= new Scanner(System.in);
    System.out.println("Please Enter A Number");
    int num = fr.nextInt();
    
    int c;
    for(c=1; c<=num; c++)
    {
      System.out.println(c);
    }
  }
}