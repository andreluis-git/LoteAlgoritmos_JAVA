/*
Objetivo: 7.	A partir do exercício 6 (vetor classificado) 
solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).

Nome: André Luis
Data: 2020-03-28
*/
package Lote.Vetores_Matrizes;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lt01_Ex07_Vetores {
	public static void main(String[] args) {
		int array[] = new int[20], i, j;
		Random random = new Random();
		for(i = 0; i < 20; i++) {
			array[i] = random.nextInt(100);
		}
		for(i = 0; i < 20; i++) {
			for (j = i+1; j < 20; j++) {
				if(array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}		
		int search = Integer.parseInt(JOptionPane.showInputDialog(Arrays.toString(array) + "\nDigite um valor a ser procurado no vetor:")); 
		String result = binarySearch(array, search, 0, array.length);
		JOptionPane.showMessageDialog(null, result);
	}
	
	static String binarySearch(int[] Array, int key, int low, int high) {
			    int valor = key + 1;
			     
			    while (low <= high) {
			        int mid = (low + high) / 2;
			        if (Array[mid] < key) {
			            low = mid + 1;
			        } 
			        else if (Array[mid] > key) {
			            high = mid - 1;
			        } 
			        else if (Array[mid] == key) {
			            valor = key;
			            break;
			        }			        
			    }
			    if(valor == key) {
			    	return "Valor encontrado.";
			    }
			    else {
			    	return "Valor não encontrado.";
			    }
			    
			}
}
