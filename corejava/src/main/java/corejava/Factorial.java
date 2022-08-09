package corejava;

public class Factorial {

	public static void main(String[] args) {
		int n=10;
		
		int f1=0,f2=1,f4;
		for(int i=1;i<=n;i++) {
			
			System.out.println(" "+f1);
			f4=f1+f2;

			f1=f2;
			f2=f4;
			
		}
		/*for( i=1;i<=num;i++) {
			fact=fact*i;
			
		
		System.out.println("\n factorial:" +num+ "is:" +fact);*/	// TODO Auto-generated method stub
		
	}

}
