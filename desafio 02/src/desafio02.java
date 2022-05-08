import java.util.ArrayList;
import java.util.Scanner;

public class desafio02 {
	/**
	 * Um professor de programa��o, frustrado com a falta de disciplina de seus
	 * alunos, decidi cancelar a aula se menos de x alunos estiverem presentes
	 * quando a aula for iniciada. O tempo de chegada varia entre:
	 * 
	 * Normal: tempoChegada <= 0 Atraso: tempoChegada > 0 Construa um algoritmo que
	 * dado o tempo de chegada de cada aluno e o limite x de alunos presentes,
	 * determina se a classe vai ser cancelada ou n�o ("Aula cancelada� ou �Aula
	 * normal�).
	 * 
	 * Exemplo:
	 * 
	 * Entrada de dados: x = 3 tempoChegada = [-2, -1, 0, 1, 2]
	 * 
	 * Sa�da de dados: Aula normal.
	 * 
	 * Explica��o: Os tr�s primeiros alunos chegaram no hor�rio. Os dois �ltimos
	 * estavam atrasados. O limite � de tr�s alunos, portanto a aula n�o ser�
	 * cancelada.
	 */
	static Scanner teclado = new Scanner(System.in);
	boolean teraAula;

	static int contadorPositivo = 0; // positivo quem chega atrasado
	static int contadorNegativo = 0; // negativo quem chega no hor�rio

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println(" Digite o limite de alunos para ter a aula "); // pergunta limite de alunos pontuais
		int x = teclado.nextInt(); // recebe o valor do limite de alunos
		while (true) {
			System.out.println(" Digite o tempo de chegada em negativo \n e/ou zero para adiantado e positivo\n"
					+ " para atrasado. \n" + " Digite 99 para sair"); // informativo das op��es existentes
			int tempoChegada = teclado.nextInt(); // recebe valor da op��o
			if (tempoChegada == (99)) { // checar valor de saida
				break;
			}
			lista.add(tempoChegada); // adiciona o valor na tabela lista
			lista.sort(null); // altera a lista em ordem crescente

		}
		{
			for (int i : lista) {
				if (i <= 0) { // incrementa na variavel positiva ou negativa
					contadorNegativo++;
					continue;
				}
				contadorPositivo++;
			}
		}
		if (contadorNegativo >= x) { // verifica se os valores informados s�o maiores ou iguais a quantidade de alunos pontuais
			System.out.println(" Limite m�nimo de alunos pontuais � " + x);
			System.out.println(lista);
			System.out.println("Aula normal");
		} else {
			System.out.println(" Limite m�nimo de alunos pontuais � " + x);
			System.out.println(lista);
			System.out.println("Aula cancelada");
		}
	}

}
