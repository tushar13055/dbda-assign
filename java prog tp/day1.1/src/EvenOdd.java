
//8.Accept range of numbers (begin value & end value) from user , using scanner.
//Print all even nos from the range
//Try writing the functionality of checking for even number in a method n call it from main
public class EvenOdd {
	public static void main(String[] args) {
		int i=5;
		int y=50;
		int x ;
		while(i<y) {
			if(i%2==0) {
				System.out.println("even "+i);
			i++;
			}
				else {
					System.out.println("odd "+i);
					i++;
				}
			}
		}
	}

