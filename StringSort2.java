package stringsort2;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Juan Carlos Romero
 * date: 8/9/2022
 * purpose: Week 9  - exercise 1 b)
 * Version 1.0
 */
public class StringSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String[] strarray = new String[20];
      int i, len = strarray.length;
      for(i = 0; i < len; i++) {
         System.out.println("Enter a string: ");
         strarray[i] = sc.nextLine();
      }
      Arrays.sort(strarray);
      for(i = 0; i < len; i++) {
         System.out.println(strarray[i]);
      }
    }
    
}
