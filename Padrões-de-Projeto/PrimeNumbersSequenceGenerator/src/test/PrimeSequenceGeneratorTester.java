package test;

import java.util.Arrays;
import java.util.List;

import SequenceGenerator.SequenceGenerator;
import generator.erastostenes.ErastostenesSievePrimeSequenceGenerator;

public class PrimeSequenceGeneratorTester extends SequenceGeneratorTest {

	@Override
	public void test() {
		List<Integer> primeSequence;
		primeSequence = generator.generateSequence(-1);
		int[] expectedResult = {};

//		 primeSequence = generator.primeSequenceUntil(0);
//		 int[] expectedResult = {};

//		primeSequence = generator.primeSequenceUntil(10);
//		int[] expectedResult = { 2, 3, 5, 7 };

//		primeSequence = generator.generateSequence(100);
//		int[] expectedResult = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
//				89, 97 };

		verificaQuantidadeElementos(primeSequence);
		comparaExpectativaComResultado(primeSequence, expectedResult);

	}

	private static void verificaQuantidadeElementos(List<Integer> sequence) {
		if (sequence.size() == 0) {
			System.out.println("Lista vazia. " + sequence.size() + " elementos.");
			return;
		}
	}

	private static void comparaExpectativaComResultado(List<Integer> sequence, int[] expectedResult) {
		if (expectedResult.length != sequence.size()) {
			System.out.println("\nErro - Tamanho da lista gerada não corresponde ao esperado.");
			mostrarSequencias(sequence, expectedResult);
			return;
		} else {
			verificaResultado(sequence, expectedResult);
		}

	}

	private static void verificaResultado(List<Integer> sequence, int[] expectedResult) {
		for (int i = 0; i < expectedResult.length; i++) {
			if (expectedResult[i] != sequence.get(i)) {
				System.out.println("\nErro - Valores não coincidem com os resultados esperados.");
				mostrarSequencias(sequence, expectedResult);
				return;
			}
		}
		System.out.println("\nSucesso - Algoritmo alcançou os resultados esperados.");
		mostrarSequencias(sequence, expectedResult);
		return;
	}

	private static void mostrarSequencias(List<Integer> sequence, int[] expectedResult) {
		System.out.println("Sequencia gerada: " + sequence.toString());
		System.out.println("Sequencia esperada: " + Arrays.toString(expectedResult));
	}

}
