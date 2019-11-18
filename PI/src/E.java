
public class E {
	public static void main(String[] args) {
		float value;
		float number = (float)Math.random();
		if(number<(2f/3f)){
			value = (number+(4f/3f))*(3f/4f);
		}else{
			value = (number+(1f/3f))*(3f/2f);
		}
		
		System.out.println(value);
	}

}
