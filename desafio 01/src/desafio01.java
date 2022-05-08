
public class desafio01 {
	/**
	 * Alguns n�meros inteiros positivos n possuem uma propriedade na qual a soma de
	 * n + reverso(n) resultam em n�meros �mpares. Por exemplo, 36 + 63 = 99 
	 * e 409 + 904 = 1313. Considere que n ou reverso(n) n�o podem come�ar com 0.
	 * Existem 120 n�meros revers�veis abaixo de 1000. 
	 * Construa um algoritmo que mostre na tela todos os n�meros n onde a 
	 * soma de n + reverso(n) resultem em n�meros �mpares que est�o abaixo de 1 milh�o.
	 */
	static int contador = 0;

	private static int inverte(int n) {
		int invertido = 0;
		int contador = qtdeDigitos(n);

		while (n >= 1) {
			invertido = invertido + (n % 10) * poteciacao(10, --contador);
			n = n / 10;
		}
		return invertido;
	}

	private static int qtdeDigitos(int n) {
		int cont = 0;
		while (n >= 1) {
			n = n / 10;
			cont++;
		}
		return cont;
	}

	private static int poteciacao(int base, int expoente) {
		int resultado = 1;
		while (expoente > 0) {
			resultado = resultado * base;
			expoente--;

		}
		return resultado;
	}

	public static void main(String[] args) {

		int n = 0;
		while (n < 1000000) {
			int zero = (n % 10);
			if (zero == 0) {
				n++;
				continue;
			}
			qtdeDigitos(n);
			inverte(n);
			int soma = n + inverte(n);
			int somaImpar = soma % 2;
			if (somaImpar == 0) {
				n++;
				continue;
			}
			if (n > inverte(n)) {
				n++;
				continue;
			}
			contador++;
			System.out.println("numero " + n + "  " + "n invertido " + inverte(n) + "   soma " + soma + " impar "
					+ somaImpar + " total  " + contador);
			n++;
		}
	}
}
