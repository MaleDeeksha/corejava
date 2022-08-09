package corejava;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1="java";
		String s2="java";
		String s3="python";
		
		String s4=s1+s2+s3;
		
		
		//System.out.println("startwith:"+s1.startsWith(s2));
		//System.out.println("endswith:"+s1.endsWith(s2));
		System.out.println(s4.indexOf('a'));
		System.out.println(s4.lastIndexOf('u'));
		System.out.println(s4.replace("javahj","siri"));
		System.out.println(s4.charAt(4));
		System.out.println(s1.compareTo(s2));

		System.out.println(s4.contains("siri"));
		System.out.println(s4.trim());





	    System.out.println("enter name");
        String name=scan.nextLine();
        name.startsWith("h");
        name.endsWith("d");
        

		// TODO Auto-generated method stub

	}

}
