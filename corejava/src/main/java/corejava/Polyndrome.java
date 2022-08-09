package corejava;

public class Polyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="manju";
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		String data=sb.toString();
		System.out.println("reverse:"+data);

		//StringBuilder sb1=new StringBuilder("madam");

		if(s1.equals(data)) {
	    System.out.println("given string is polyndrome");
      }
        else {
	    System.out.println("given string is not polydrome");

}
	}

}
