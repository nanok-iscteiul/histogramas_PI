
public class A {

	public static void main(String[] args) {

		int value;
		int um=0;
		int dois=0;
		
		for(int i=0;i<1000000;i++) {
			float number = (float)Math.random();
			if (number < 0.5) {
				value=1;
				um++;
			} else {
				value=2;
				dois++;
			}
		}
		
		System.out.println("Uns:"+um);
		System.out.println("Dois:"+ dois);
		

	}

}
