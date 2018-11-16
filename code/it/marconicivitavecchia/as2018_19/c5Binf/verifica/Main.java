
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(500,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb=new StringBuilder("<html>");
		
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1 style=text-align:left><b>FORMULA 1 PASSION</b></h1>");
		sb.append("<div style='dysplay:table'>");
		sb.append("<div style='dysplay:table-row'>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("pilota");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("punteggio");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-row'>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("HAMILTON L.");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("358");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-row'>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("VETTEL S.");
		sb.append("</div>");
		sb.append("<div style='dysplay:table-cell'>");
		sb.append("294");
		sb.append("</div>");
		sb.append("</div>");
		// TODO Convertire lo StringBuilder in String
		String html=sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

