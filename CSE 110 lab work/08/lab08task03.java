import java.util.Scanner;
public class lab08task03
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int a [] = new int [10];
    int c;
    for(c=0; c<=a.length-1; c++)
    {
      System.out.println("Please enter a number");
      a[c] = fr.nextInt();
    }
    int d;
    for(d=a.length-1; d>=0; d--)
    {
      System.out.println(a[d]);
    }
  }
}