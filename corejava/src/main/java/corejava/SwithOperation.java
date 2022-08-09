package corejava;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class SwithOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    /* int avg=7l0;
     int grade= avg/10;
     switch(avg/10) {
     case 9:
    	 System.out.println("O");
    	 break;
     case 8:
    	 System.out.println("A");
    	 break;
     case 7:
    	 System.out.println("B");
    	 break;
     case 4:
    	 System.out.println("f");
    	 break;


 
     }*/
	/*	int day=9;
		switch(day) {
		case 1:
	    	 System.out.println("monday");
	    	 break;
		case 2:
	    	 System.out.println("tuesday");
	    	 break;
		case 3:
	    	 System.out.println("wednesday");
	    	 break;
		case 4:
	    	 System.out.println("thurday");
	    	 break;

		case 5:
	    	 System.out.println("friday");
	    	 break;

		case 6:
	    	 System.out.println("saturday");
	    	 break;

		case 7:
	    	 System.out.println("sunday");
	    	 break;
	    	 default:
		    	 System.out.println("invali");




	    	 

		}*/
		int n1,n2,n4,choice;


while(true) {
	 System.out.println("1 for addition"+1);
	 System.out.println("2 for sub"+2);
	 System.out.println("3 for mul"+3);
	 System.out.println("4 for mod"+4);
	 System.out.println("5 for div"+5);
	 System.out.println("enter ur choice:");
	 
	 choice=sc.nextInt();

switch(choice) {
case 1:
	 System.out.println("enter n1 & n2:");
	  n1=sc.nextInt();
	  
	  n2=sc.nextInt();
	  n4=n1+n2;
		 System.out.println("ans:"+n4);

      break;
case 2:
	 System.out.println("enter n1 & n2:");
	  n1=sc.nextInt();
	  n2=sc.nextInt();
	  n4=n1-n2;
		 System.out.println("ans:"+n4);

     break;

case 3:
	 System.out.println("enter n1 & n2:");
	  n1=sc.nextInt();
	  n2=sc.nextInt();
	  n4=n1*n2;
		 System.out.println("ans:"+n4);

     break;

case 4:
	 System.out.println("enter n1 & n2:");
	  n1=sc.nextInt();
	  n2=sc.nextInt();
	  if(n1==0&&n2==0) {
			 System.out.println("invalid");

	  }
	  n4=n1/n2;
		 System.out.println("ans:"+n4);

     break;
case 5:
	 System.out.println("enter n1 & n2:");
	  n1=sc.nextInt();
	  n2=sc.nextInt();
	  n4=n1%n2;
		 System.out.println("ans:"+n4);
		 break;
case 6:
	 System.out.println("enter n1 & n2:");
	  n1=sc.nextInt();
	  
	  n4=n1*n1;
		 System.out.println("ans:"+n4);
		 break;
case 7:
	 System.out.println("enter n1 & n2:");
	  n1=sc.nextInt();
	  n2=sc.nextInt();

	 double sum=(Math.pow(n1,n2));
		 System.out.println("ans:"+sum);
		 break;


default:
	 System.out.println("exit");
	 
	
     



}

	}		

	}

}

