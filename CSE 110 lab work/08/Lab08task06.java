import java.util.Scanner;
public class Lab08task06
{       
  public static void main(String[]args)
  {
    Scanner fr=new Scanner (System.in);
    int []a=new int[5];
    for(int c=0;c<=a.length-1;c++)
    {
      System.out.println("type");
      a[c]=fr.nextInt();
    }
    for(int d=0; d<=4; d++)
    {
      int j=0;
      for(int i=0; i<=a.length-1; i++)
      {
        if(a[i]==d)
        {
          j=j+1;
        }
        else
        {
        }
      }
      System.out.println(d+" was found " + j +" times" );
    }
  }
}
