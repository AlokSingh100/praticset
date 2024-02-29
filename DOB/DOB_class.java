package DOB;

import java.util.Scanner;

public class DOB_class 
{
    float year,day,month,cyear,cday,cmonth,year_cal;
    int days,months,years;
    void input()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("-----Date of Birth------");
        System.out.print(" Enter Birth Year : " +year);
        year=as.nextFloat();
        System.out.print("Enter Birth Month : " +month);
        month=as.nextFloat();
        System.out.println("Enter Birth Day :"+day);
        day=as.nextFloat();
        System.out.println(" ");
        System.out.println("-----Current Date------");

        System.out.print(" Enter Birth Year : "+cyear);
        cyear=as.nextFloat();
        System.out.print("Enter Birth Month : "+cmonth);
        cmonth=as.nextFloat();
        System.out.print("Enter Birth Month : "+cday);
        cday=as.nextFloat();
    }
void calcualtion(){
    int leap=366, no_leap=365;
    while(year>=1);{
    if(year%400==0){
        year
    }
    }
}

    void output(){
        System.out.println("Age :");
        
    }
}
