package JICHENG;

interface B{
	int k=10;
}
public class InterfaceTest implements B{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int i;
		InterfaceTest c1=new InterfaceTest();
		i=c1.k;
		System.out.println("i="+i);
	}
}
