import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       
      ArrayList <Integer> nums1 = new ArrayList<>();

      for(int i=0;i<5;i++)
      {
          nums1.add(sc.nextInt());
      }
      
     ArrayList <Integer> nums2 = new ArrayList<>();
      for(int i=0;i<5;i++)
      {
          nums2.add(sc.nextInt());
      }
      
      ArrayList <Integer> res = new ArrayList<>();
      
      for(int i=0;i<5;i++)
      {
          for(int j=0;j<5;j++)
          {
              if(nums2.get(i).equals(nums1.get(j)))
              {
                  res.add(nums1.get(j));
              }
          }
      }
      System.out.print(res);
      
  }
}
