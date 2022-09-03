package generator.erastostenes;

import java.util.ArrayList;
import java.util.List;

public class ErastostenesSievePrimeSequenceGenerator extends generator.AbstractSequenceGenerator {

	List<Integer> resultPrimeSequence;

	@Override
	public List<Integer> generateSequence(final int MAX) {

		resultPrimeSequence = new ArrayList<>(MAX);
		obterSequeciaPrimos(MAX);
		return resultPrimeSequence;
	}

	private void obterSequeciaPrimos(final int MAX) {
		boolean[] primos = new boolean[MAX + 1];

		for (int i = 2; i <= MAX; i++) {
			primos[i] = true;
		}

		crivoErastostenes(MAX, primos);

		for(int i= 0 ; i< MAX; i++) {
			if(primos[i]) {
				resultPrimeSequence.add(i);
			}
		}

	}

	private void crivoErastostenes(final int MAX, boolean[] primos) {
		for (int i = 2; i <= MAX; i++) {
			if (primos[i]) {
				for (int j = i; i * j <= MAX; j++) {
					primos[i * j] = false;
				}
			}
		}
	}

}
