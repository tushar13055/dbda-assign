
public class NewBox{
	private int off1;
	private int off2;
	private int off3;
	public NewBox(int off1, int off2, int off3) {
		super();
		this.off1 = off1;
		this.off2 = off2;
		this.off3 = off3;
	}
	public OffsetBox NewBox(int length,int height,int width) {
		length+=off1;
		height+=off2;
		width+=off3;
		OffsetBox b2=new OffsetBox(length,height,width);
		return b2;
	}
	
}