import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
    // print each item of the list (3 ways)
    int[] jennys = {8,6,7,5,3,0,9};
    for (int i=0; i<jennys.length; i++)
    {
      System.out.println(jennys[i]);
    }

    for (int n: jennys)
    {
      System.out.println(n)
    }

    int i = 0;
    while (i < jennys.length)
    {
      System.out.println(jennys[i]);
      i++;
    }

    // using ArrayList
    ArrayList<Integer> foo = new ArrayList<Integer>();
    foo.add(new Integer(1));
    foo.add(new Integer(2));
    foo.add(new Integer(3));
    foo.add(new Integer(14));
    foo.add(new Integer(15));
    foo.add(new Integer(5));

    for (int i=0; i<foo.size(); i++0)
    {
      System.out.println(foo.get(i));
    }

    for (Integer N: foo)
    {
      System.out.println(N); //toString()
      System.out.println(N.intValue()); // intValue returns the value as an int
    }

    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> list = new ArrayList<String>();

    System.out.println("Please enter words to add to the list, type STOP to stop adding")
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();

      if (!input.equals("STOP"))
      {
        list.add(input);
      }
    }
    ArrayList<String> reverse = new ArrayList<String>();
    for ()
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    int highest = arr.get(0);
    for (Integer N : arr)
    {
      if (N.intvalue() > highest)
      {
        int highest = N.intvalue();
      }
    }
    return highest;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (Integer N : arr)
    {
      if (N.intValue() % 2 == 0)
      {
        ans.add(N);
      }
    }
    return ans;
  }
}
