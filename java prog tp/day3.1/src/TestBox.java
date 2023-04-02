import java.util.Scanner;

//Add a method to Box class to return a new Box with modified offset dims & test it with TestBox.java
//
//eg : 1st Box dims 10,20,30
//User enters offsets in dims  as 3,-4,5
//2nd box should have dims 13,16,35
//Hint in TestBox :
//Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
//sop("Enter offsets in dims : wOff , dOff hOff");
//Box b2=b1.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
public abstract class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		System.out.println("enter dimensions");
		
		OffsetBox b1=new OffsetBox(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		System.out.println("enter offset dimensions");
		
		OffsetBox b2 = new OffsetBox(b1.length + a, b1.width + b, b1.height + c);
		System.out.println(b2);
		
		
//		OffsetBox b2=new OffsetBox(b1.le+ a,sc.nextInt()+b,sc.nextInt()+c);
//		System.out.println(b2.length);
	}

}
