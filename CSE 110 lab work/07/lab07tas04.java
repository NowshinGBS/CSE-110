import java.util.Scanner;
public class lab07tas04
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int a[] = new int [10];
    int c;
    for(c=0; c<=a.length-1; c++)
    {
      System.out.println("Please enter a number");
        a[c] = fr.nextInt();
    }
    int d;
    for(d=0; d<=a.length-1; d++)
        {
      if(a[d]%2==0)
      {
        System.out.println(a[d]);
        break;
      }
    }
  }
}
