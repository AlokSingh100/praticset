package arrayassiment;

import java.util.Scanner;

public class aeeaa  {
    public static void main(String[] args) {
        
    
    Scanner dScanner= new Scanner(System.in);
    int size,sum=0,total,geting;
    String inp,yes="Y",no="N";
    System.out.println("Enter Product List Size"); 
    size=dScanner.nextInt();
    String[] product=new String[size];
    for(int i=0;i<size;i++){
        System.out.println("Enter product "+(i+1));
        product[i]=dScanner.next();
        }
    int[] price =new int[size];
    for (int i=0;i<size; i++) {
        System.out.println("Enter "+product[i] +" Price");
        price[i]=dScanner.nextInt();
        sum=sum+price[i];
        
    }
    System.out.println("total "+sum);
   total= sum*18/100;
geting=total+sum;
System.out.println("Do You Want to add GST [Y/N]");
    inp=dScanner.next();

if(inp.equals(yes)){
    System.out.print("total: " +geting);
}
else if(inp.equals(no))
System.out.println(sum);
else System.out.println("invalid input");


   
   
    }
}