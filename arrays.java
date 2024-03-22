package nested;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        
    Scanner sdScanner=new Scanner(System.in);
  
    System.out.println("input array size" );
    int k=sdScanner.nextInt();
    int num[] =new int[k];
    for ( int i = 0; i < k; i++) {
        System.out.print("Enter the array value "  );
        num[i]=sdScanner.nextInt(); 

     }
     int small= num[0];
     for (int i = 0; i < k; i++) {
        if (num[i]<small) {
            small=num[i];
        }
     }

     System.out.println("small"+small);
     sdScanner.close();
    }
}