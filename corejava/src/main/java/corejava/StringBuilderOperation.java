package corejava;

public class StringBuilderOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("hello world");
		System.out.println("length:"+sb.length());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("insert:"+sb.insert(1,"siri"));
		System.out.println("replace:"+sb.replace(1,3,"siri"));
		System.out.println("delete:"+sb.delete(1,3));
		System.out.println("reverse:"+sb.reverse());
		System.out.println("append:"+sb.append(" manju"));
		sb.ensureCapacity(10);
		System.out.println("ensureCapacity:"+sb.capacity());
		sb.ensureCapacity(30);
		System.out.println("ensureCapacity:"+sb.capacity());








	}

}
