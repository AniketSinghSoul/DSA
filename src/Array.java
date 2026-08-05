import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner((System.in));
        int n = 5;
        // marks => 50,99,98,60,40
        // int marks[]={50,99,98,60,40}
        int marks[] = new int[n];
      /*  marks[0] = 50;
        marks[1] = 99;
        marks[2] = 98;
        marks[3] = 60;
        marks[4] = 40;
       */
         for(int i=0;i<n;i++)
         {
             marks[i]=obj.nextInt();
         }
         for(int i =0;i<n;i++)
         {
             System.out.println(marks[i]+"");
         }
         int max=marks[0];
         int min= marks[0];
         for(int i=1;i<n;i++)
         {
             if(marks[i] > max)
             {
                 max= marks[i];
             }
             else
             {
                 min=marks[i];
             }
         }
        System.out.println("Highest marks :"+ max);
        System.out.println("lowest marks : "+ min);
       // System.out.println(Arrays.toString(marks));
    }
}



