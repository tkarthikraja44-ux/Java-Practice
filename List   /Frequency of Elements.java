import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      ArrayList<Integer> num = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<5;i++)
      {
          num.add(sc.nextInt());
      }
      boolean res = false;
      for(int i=0;i<5;i++)
      {
          int count =1;
          if(num.get(i)==0)
          {
              continue;
          }
          for(int j=i+1;j<5;j++)
          {
              
              if(num.get(i).equals(num.get(j)))
              {
                  count++;
                  num.set(j,0);
              }
          }
          System.out.println(num.get(i)+" "+count+" ");
      }
  }
}
