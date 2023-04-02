//Add a method to Box class to return a new Box with modified offset dims & test it with TestBox.java
//
//eg : 1st Box dims 10,20,30
//User enters offsets in dims  as 3,-4,5
//2nd box should have dims 13,16,35
//Hint in TestBox :
//Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
//sop("Enter offsets in dims : wOff , dOff hOff");
//Box b2=b1.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
public class OffsetBox {
	int length;
	int height;
	int width;
	
	public OffsetBox(int length,int height,int width){
		this.length=length;
		this.height=height;
		this.width=width;
	}
	
	public String toString() {
		return "length: " + length + "width: " + width + "height: " + height;
	}
}
	
