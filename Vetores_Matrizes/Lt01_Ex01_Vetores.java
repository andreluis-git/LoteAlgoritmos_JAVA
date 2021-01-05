package Lote.Vetores_Matrizes;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

/*
Objetivo:1.	1.	Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a.	A m�dia dos valores entre 10 e 200;
b.	A soma dos n�meros �mpares.

Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex01_Vetores {
	public static void main(String[] args) {
		int i, array[] = new int[50];
		Random random = new Random();
		for (i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
//			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		}
		int soma = 0, aux = 0;
		double media = 0;
		for (i = 0; i < array.length; i++) {
			// verifica se est� entre 10 e 200
			if (array[i] > 10 && array[i] < 200) {
				media += array[i];
				aux += 1;
			}
			// verifica se � impar
			if(array[i] % 2 != 0) {
				soma += array[i];
			}
		}
		media = media / aux;
		JOptionPane.showMessageDialog(null, "A m�dia dos valores entre 10 e 200 �: " + media + " e a soma"
				+ " dos n�meros impares �: " + soma);
		// mostra o vetor
		JOptionPane.showMessageDialog(null, "O vetor �: " + Arrays.toString(array));
		}
}
