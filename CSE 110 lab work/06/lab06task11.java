import java.util.Scanner;
public class lab06task11
{
  public static void main (String[] args)
  {
    Scanner fr = new Scanner(System.in);
    int line;
    line = fr.nextInt();
    for(int linecount=1; linecount<=line; linecount++)
    {
      int spacecount;
      for(spacecount=1; spacecount<=line-linecount; spacecount++)
      {
        System.out.print(" ");
      }
      {
        int columncount;
        for(columncount=1; columncount<=linecount;columncount++)
        {
          System.out.print(line+columncount-linecount);
        }
        System.out.println();
      }
    }
  }
}