package Lote.Linear;
/*
Objetivo: Coletar o valor do lado de um quadrado, calcular sua �rea e apresentar o
resultado.
Nome: Andr� Luis
Data: 06/02/20
*/

import javax.swing.JOptionPane;

public class Lt01_Ex01 {
    public static void main (String args[])
    {
        //declarar variaveis
        int Lado, Area;
        //mensagem ao usuario e entrada de dados
        Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor do lado:"));
        //processamento de resultados
        Area = Lado * Lado;
        //sa�da de resultado
        JOptionPane.showMessageDialog(null, "O valor da Area do quadrado �: " + Area);
//        System.out.println("O valor da Area do quadrado �: " + Area);
    }
}