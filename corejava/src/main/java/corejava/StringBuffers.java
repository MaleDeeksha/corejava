package corejava;
import java.util.Scanner;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		

		StringBuffer sb=new StringBuffer();
		
		System.out.println("capacity:"+sb.capacity());

		sb.append("hello siri manju has");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		System.out.println("length:"+sb.length());
		System.out.println("charAt:"+sb.charAt(5));
		
		



		
		
		//sb.replace(1,3,"java");
		//System.out.println(sb);
		//sb.reverse();
		//System.out.println(sb);

		//sb.insert(1,"false");
		//System.out.println(sb);
		//sb.delete(0,1);
		//System.out.println("delete:"+sb);
		//sb.charAt(1);
		//System.out.println("charAt:"+sb);
		
		
		//sb.length();
		
		//System.out.println("length:"+sb);



		


	}

}
