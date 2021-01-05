package Lote.Linear;
import javax.swing.JOptionPane;

/*
Objetivo:25.	Receba a hora de in�cio e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, 
sabendo que o tempo m�ximo � menor que 24 horas e pode come�ar num dia e terminar noutro.
Nome: Andr� Luis
Data: 2020-02-17
*/

public class Lt01_Ex25 {
	public static void main(String[] args) {
		int horaIni, horaFim, minIni, minFim, durTotal, durHora, durMin;
		horaIni = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do inicio da partida; "));
		minIni = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto do inicio da partida; "));
		horaFim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do fim da partida; "));
		minFim = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto do fim da partida; "));
		if (horaIni > 23 || horaFim > 23 || horaIni < 0 || horaFim < 0 || minIni > 59 || minFim > 59 || minIni < 0 
				|| minFim < 0 || horaFim + horaIni + minIni + minFim == 0) {
			JOptionPane.showMessageDialog(null, "O hor�rio digitado n�o existe");
		}
		else {
			if (horaFim > horaIni) {
				durTotal = (horaFim * 60 + minFim) - (horaIni * 60 + minIni);
			}
			else if (horaFim == horaIni && minFim > minIni){
				durTotal = minFim - minIni;
			}
			else {
				durTotal = 1440 - (horaIni * 60 + minIni) + (horaFim * 60 + minFim);
			}
			durHora = durTotal/60;
			durMin = durTotal - (durHora*60);
			JOptionPane.showMessageDialog(null, "A partida durou " + durHora + ":" + durMin);
		}
	}
}
