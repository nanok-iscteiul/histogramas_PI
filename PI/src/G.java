
public class G {
	
	public static void main(String[] args) {
		float number = (float)Math.random();
		float aux = (float)Math.random();
		float value;

		if (number <= 0.00147){
			value = 30;
		}else{
			if(number <= 0.99853){
				value = (float)(45 + 5 * Math.sqrt(-2 * Math.log(number)) * Math.cos((2 * Math.PI * aux)));
			}else{
				value = 60;
			}
		}
		System.out.println(value);
	}

}
