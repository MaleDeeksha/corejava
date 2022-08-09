package corejava;
import java.util.Scanner;
public class Salaryshift {
	int savings;
	
	int Calsalary(int salary, int shifts) {
		if(salary<0) {
			System.out.println("salary too small");
		}
		else if(salary>8000) {
			System.out.println("salary too large");

		}
		else if(shifts<0) {
			System.out.println("shifts too small");

		}
		else {
			savings=(int)(salary*(0.2+0.3)+(salary*shifts*0.02));
		}
		return savings;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter salary:");
		int salary=s.nextInt();
		int shifts=s.nextInt();
		//Calsalary(salary,shifts);
		

/*int salary=s.nextInt();

double sal=salary/2;
//System.out.println(sal);
System.out.println("enter no of shifts:");

int shift=s.nextInt();

double savings=sal+salary*shift*0.02;
System.out.println(savings);
if(savings>8000) {
	System.out.println("salary too large");

}
else if(shift<5&&savings<8000) {
	System.out.println("shifts too small");

}

else if(savings<8000) {
	System.out.println("salary too small");

}
else {
		System.out.println("do hardwork for getting more salary");

}*/
		

	}

}
