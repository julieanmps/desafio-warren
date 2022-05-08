
import java.util.ArrayList;
import java.util.Random;

/**
 * Dado um vetor de n�meros e um n�mero n. Determine a soma com o menor n�mero
 * de elementos entre os n�meros do vetor mais pr�xima de n e tamb�m mostre os
 * elementos que comp�em a soma. Para criar a soma, utilize qualquer elemento do
 * vetor uma ou mais vezes.
 * 
 * Exemplo:
 * 
 * Entrada de dados:
 * 
 * N = 10 V = [2, 3, 4]
 * 
 * Sa�da de dados:
 * 
 * 10 [2, 4, 4] [3, 3, 4]
 * 
 * Explica��o:
 * 
 * Se N = 10 e V = [2, 3, 4] voc� pode utilizar as seguintes soma: [2, 2, 2, 2, 2],
 * [2, 2, 3, 3], [2, 4, 4] ou [3, 3, 4]. Como a quantidade de elementos em
 * [2, 4, 4] e [3, 3, 4] � igual, os dois conjuntos devem ser mostrados.
 */
public class desafio03 {
	static Random random = new Random();
	static int n = 10;
	static int v[] = { 2, 3, 4 };
	static int sorteiaIndice;
	static int valorIndiceSorteado;
	ArrayList<Integer> lista = new ArrayList<Integer>();

	private static void getValorIndeceSorteado() {
		int somatorio = 0;
		ArrayList<Integer> v1 = new ArrayList<Integer>();
		ArrayList<Integer> v2 = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			getSorteiaIndece();
			v1.add(v[sorteiaIndice]);
			somatorio = somatorio + v[sorteiaIndice];
			v1.sort(null);
			if (somatorio >= n) {
				if (somatorio == n) {
					v2.addAll(v1);
					System.out.println("vetor dois " + v2);
					v2.clear();
					v1.clear();
					continue;
				}
				somatorio = 0;
				v2.clear();
				v1.clear();
				continue;

			}
			
		}
	}

	public static int getSorteiaIndece() {
		sorteiaIndice = (int) (Math.random() * 3);
		return sorteiaIndice;
	}

	public static void main(String[] args) {
		getValorIndeceSorteado();

	}

}
