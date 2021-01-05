package Lote.Proc_and_Function;
/*
Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
Nome: André Luis
Data: 2020-02-17
*/

import javax.swing.JOptionPane;

public class Lt01_Ex31Function{
    public static void main(String[]args){
        //VARIABLE informations
        
        double res[] = new  double[140];
        res = calcQuadrado(res);
        String res_mostrar = "";
        // Transforma o array em uma String pra poder mostrar
        int indice_mostrar = 0;
        for(int i = 0; i < 10; i++){
            res_mostrar += "\n";
            for(int x = 0; x < 15; x++){
                //confere se ainda está dentro do tamanho do array
                if (indice_mostrar == res.length-1){
                    break;
                }
                //soma o valor do array na string
                res_mostrar += res[indice_mostrar] + ", ";
                indice_mostrar++;                
            }
        }
        JOptionPane.showMessageDialog(null, res_mostrar); 
             
    }//END void

    
    public static double[] calcQuadrado(double res[]){
       
        // processing
        int indice = 0;
        for (int i = 11; i < 150; i++){
            res[indice] = Math.pow(i,2);
            indice ++;            
        }
        return res;
    }   

}//END class
