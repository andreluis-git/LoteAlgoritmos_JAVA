package Lote.Vetores_Matrizes;
import javax.swing.JOptionPane;
import java.util.Random;

/*
Objetivo:2.	Criar e coletar um vetor [100] inteiro e exibir:
a.	O maior e o menor valor;
b.	A média dos valores.

Nome: André Luis
Data: 2020-02-17
*/

public class Lt01_Ex02_Vetores {
	public static void main(String[] args) {
		int array[] = new int[100];
		int maior, menor, i;
		float media = 0;
		Random random = new Random();
		for (i = 0; i < 100; i++) {
			array[i] = random.nextInt(1000);
//			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		}
		maior = array[0];
		menor = array[0];
		for (i = 0; i < 100; i++) {
			media += array[i];
			if (maior < array[i]) {
				maior = array[i];
			}
			else if (menor > array[i]) {
				menor = array[i];
			}
		}
		media /= 100;
		JOptionPane.showMessageDialog(null, "Maior valor: " + maior + "\nMenor valor: " + menor + "\nMédia: " + media);
	}
}
