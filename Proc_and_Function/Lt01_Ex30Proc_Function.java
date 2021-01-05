package Lote.Proc_and_Function;
import javax.swing.JOptionPane;

/*
Objetivo: 30.	Receba a data de nascimento e atual em ano, m�s e dia. Calcule e mostre a idade
 em anos, meses e dias, considerando os anos bissextos.
Nome: André Luis
Data: 2020-03-12
*/

public class Lt01_Ex30Proc_Function {
	int mes;
	public static void main(String[] args) {
		int dia_nasc, mes_nasc, ano_nasc, dia_atu, mes_atu, ano_atu, dias_vida, bi = 0;
		// entrada de dados
		dia_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento:"));
		mes_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do nascimento:"));
		ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento:"));
		dia_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));
		mes_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes atual:"));
		ano_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		//contagem de anos bissextos
		for (int i= ano_nasc+1; i < ano_atu; i++) {
			if (i % 4 == 0) {
				bi ++;
			}
		}
		// calc dias de vida entre ano nascimento e ano atual + dias de ano bissextos
		dias_vida = ((ano_atu - ano_nasc - 1)*365) + bi; // -1 porque o ano atual não acabou e será somado depois
		if ((mes_nasc <= 2) && (ano_nasc % 4 == 0)) {
			dias_vida++;
		}
		if ((mes_atu > 2) && (ano_atu % 4 == 0)) {
			dias_vida++;
		}
		//acrescenta dias do ano que nasceu
		for (int i = mes_nasc; i <= 12; i++) {
			dias_vida += dias_mes(i);
		}
		//subtrai os dias não vividos do mes de nasc
		dias_vida -= dia_nasc;
		//acrescenta dias do ano atual
		for (int i = 1; i < mes_atu; i++) {
			dias_vida += dias_mes(i);
		}
		//acrescenta dias do mes atual
		dias_vida += dia_atu;
		
		JOptionPane.showMessageDialog(null, "Total de dias vividos: " + dias_vida);
		
		}//End main
	
	//quantidade de dias do mes
	static int dias_mes(int mes){
		if (mes == 2) {
			return 28;
		}
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		}
		else {
			return 30;
		}
	}//End dias mes
}//End Class
