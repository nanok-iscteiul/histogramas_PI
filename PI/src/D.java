
public class D {
	public static void main(String[] args) {
		float value;
		float number = (float)Math.random();
		float a = 1f/9f;
		float b=-2f/9f;
		float c=(1f/9f)-number;

		float insideSquareRoot = b*b-4*a*c;
		
		float sqrt = (float)(-0.5f * (b-Math.sqrt(insideSquareRoot)));
		
		float x1 = c/sqrt;
		
		float x2 = sqrt/a;
		
		value=Math.max(x1,x2);
		System.out.println(value);
		
	}

}
