package arrayassiment;
import java.util.Scanner;


class order {

    public static void main(String[] args) {
        int size;
        Scanner dScanner=new Scanner(System.in);
        System.out.println("\n Enter the Product List Size\n");
        size=dScanner.nextInt();
        
        String[] food =new String[size];
        for (int i=0; i<size ; i++)
        {
            System.out.println("Enter the product  "+(i+1)+"-");
            food[i]=dScanner.next();
        }

        System.out.println("\n output prise \n");
        int[] prize=new int[size];
        for( int i =0;i <size;i ++)
        {
            System.out.print("Enter "+(food[i])+" Price ");
           
            prize[i]=dScanner.nextInt();
            
           
        }
        for(int i=0;i<size;i++)
        {

            System.out.println(food[i]+" : "+prize[i]);
        }
    }
}