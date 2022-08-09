package corejava;

public class Armstrong {

	public static void main(String[] args) {
		int n=3;
		int temp=n;
		int r,sum=0;
		while(n!=0) {
			r=n%10;
			sum+=r*r*r*r;
			n/=10;
		}
		if(temp==sum) {
			System.out.println("its armstrong");
			
		}
		else {
			System.out.println("its not armstrong");

		}
		
		// TODO Auto-generated method stub

	}

}
