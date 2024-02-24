package employ_ques;

import java.util.Scanner;

public class emmpclass 
{
	String name,monthName;
	int empid,leave,tds,month,year,ear_sal;
	float Salary,tds_amount,final_sal,leapmounth;
	private String monthName2;
	void input() 
	{
	Scanner ds=new Scanner(System.in);	
	System.out.println("Enter the name ");
	name =ds.next();
	System.out.println("Enter Your ID ");
	empid=ds.nextInt();
	System.out.println("Enter the Salary (Mounthly) ");
	Salary=ds.nextFloat();
	System.out.println("Enter leaves (Days) ");
	leave=ds.nextInt();
	System.out.println("Enter Your TBS in percent ");
	tds=ds.nextInt();
	System.out.println("Enter The Mounth");
	month=ds.nextInt();
	System.out.println("Enter Years");
	year=ds.nextInt();
	switch (month) {
    case 1:
        monthName2 = "January";
        break;
    case 2:
        monthName2 = "February";
        break;
    case 3:
        monthName2 = "March";
        break;
    case 4:
        monthName2 = "April";
        break;
    case 5:
        monthName2 = "May";
        break;
    case 6:
        monthName2 = "June";
        break;
    case 7:
        monthName2 = "July";
        break;
    case 8:
        monthName2 = "August";
        break;
    case 9:
        monthName2 = "September";
        break;
    case 10:
        monthName2 = "October";
        break;
    case 11:
        monthName2 = "November";
        break;
    case 12:
        monthName2 = "December";
        break;
    default:
        monthName2 = "Invalid month";
        break;
}
	}
	float tds_amount() 
	{
		tds_amount=(Salary*tds)/100;
		return tds_amount;
	}
	float leave_amount()
	{
		float daly_sal=Salary/30;
		float leaave_sal=daly_sal*leave;
		return leaave_sal;
	}
	float final_sal()
	{
		final_sal=Salary-leave_amount()-tds_amount();
		return final_sal;
	}
	
	
	
float ear_sal() 
{
	ear_sal=(int) (Salary*12);
			return ear_sal;
}
void show() 
{
	System.out.println("--------Employee Detail---------");
	System.out.println("Name "+name);
	System.out.println("Emp ID "+empid);
	System.out.println("Mounthly Salary "+Salary);
	
	
	
	System.out.println("CTC (Yearly Salary)"+ear_sal());
	System.out.println("Leave Amount "+leave_amount());
	System.out.println("TDS Amount "+tds_amount());
	System.out.println("Final Pay Salary "+ final_sal());
	System.out.println("Date " +monthName2 +"/"+year);
	System.out.println("--------------------------------");
}


}