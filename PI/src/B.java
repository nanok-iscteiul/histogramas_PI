
public class B {

	public static void main(String[] args) {
		
		int um = 0, dois = 0, tres = 0, quatro = 0;

		for (int i = 0; i < 1000000; i++) {
			float number = (float) Math.random();

			if (number < 0.5) {// b=1 (pior arma)
//				System.out.println("Calhou-me a pior arma -> Dano = 20");
				um++;
			} else {
				if (number > 0.5 && number < 0.75) {// b=2
//					System.out.println("Calhou-me a arma 2 -> Dano = 30");
					dois++;
				} else {
					if (number > 0.75 && number < 0.90) {// b=3
//						System.out.println("Calhou-me a arma 3 -> Dano = 40");
						tres++;

					} else {// b=4 (melhor arma)
//						System.out.println("Calhou-me a MELHOR ARMA -> Dano = 50!!");
						quatro++;
					}
				}
			}
		}
		System.out.println("UM:"+um);
		System.out.println("DOIS:"+dois);
		System.out.println("TRES:"+tres);
		System.out.println("QUATRO:"+quatro);
	}

}
