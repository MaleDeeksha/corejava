package corejava;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//String s1="Siri";
		//String s2="manju";
		//String s4=s1+" "+s2;
		//System.out.println("result:"+s4);	
	    //System.out.println(s1);
        //String s="hello world";
        //s.startsWith("h");
        //s.endsWith("d");
        
        //System.out.println(" equal result:"+s1.equals(s2));
        //System.out.println("double equal:"+s1==s2);
        

	    System.out.println("enter name");
        String name=scan.nextLine();
		
        name.startsWith("h");
        name.endsWith("d");

		System.out.println("length of a string:"+name.length());
		name=name.toUpperCase();
		System.out.println("uppercase:"+name);
		name=name.toLowerCase();
		System.out.println("lowercase:"+name);

		System.out.println("enter age");
		int age=scan.nextInt();
		scan.nextLine();
		System.out.println("enter city");
		String city=scan.nextLine();
		System.out.println("enter percentage");
		Double per=scan.nextDouble();
        System.out.println("name ------>"+name);
		System.out.println("age ------>"+age);
		System.out.println("city ------>"+city);
		System.out.println("percentage ------>"+per);


		
		// TODO Auto-generated method stub

	}

}
