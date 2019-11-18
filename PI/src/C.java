
public class C {

	public static void main(String[] args) {
		int tres = 0, quatro = 0, cinco = 0, seis= 0,sete=0,oito=0;
		for (int i = 0; i < 1000000; i++) {
			float number = (float)Math.random();
			if (number < 0.10) {
				tres++;
			} else {
				if (number >= 0.10 && number < 0.25) {
					quatro++;
				} else {
					if (number >= 0.25 && number < 0.5) {
						cinco++;
					} else {
						if (number >= 0.5 && number < 0.75) {
							seis++;
						} else {
							if (number >= 0.75 && number < 0.9) {
								sete++;
							} else {
								oito++;
							}
						}
					}
				}
			}
		}
		System.out.println("tres:"+tres);
		System.out.println("quatro:"+quatro);
		System.out.println("cinco:"+cinco);
		System.out.println("seis:"+seis);
		System.out.println("sete:"+sete);
		System.out.println("oito:"+oito);
	}
}
