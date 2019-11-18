
public class F {
	
	public static void main(String[] args) {
		float directionTimer;
		
		float number = (float)Math.random();

		if(number < (2f/7f)){
			directionTimer=7*number+3;
		}else{
			if(number >= (2f/7f) && number < (1f/2f)){
				float a=1f/14f;
				float b=-8f/14f;
				float c=(19f/14f)-number;

				float insideSquareRoot = b*b-4*a*c;
				float sqrt = (float)(-0.5f * (b-Math.sqrt(insideSquareRoot)));
	
				float x1 = c/sqrt;
				float x2 = sqrt/a;
	
				directionTimer=Math.max(x1,x2);
			}else{
				if(number >= (1f/2f) && number < (5f/7f)){
					float a=-1f/14f;
					float b=16f/14f;
					float c=(-53f/14f)-number;
					float insideSquareRoot = b*b-4*a*c;

					float sqrt = (float)(-0.5f * (b+Math.sqrt(insideSquareRoot)));
					
					float x1 = c/sqrt;
					float x2 = sqrt/a;
					
					directionTimer=Math.min(x1,x2);
				}else{
					directionTimer=7*number+2;
				}
			}
		}
		System.out.println("CHANGE DIRECTION TIMER:"+ directionTimer);
		
		
	}

}
