//changed


package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		super.setSize(250,300);
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("<html>");
		sb.append("<h1>Live the Company</h1>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<th>Evento</th");
		sb.append("<th>Data</th>");
		sb.append("<th>Vado?<th>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td>Cocktail Party</td>");
		sb.append("<td>7 Dic</td>");
		sb.append("<td>Si</td>");
		sb.append("<tr>");
		sb.append("<tr>");
		sb.append("<td>Colazione Sociale</td>");
		sb.append("<td>12 Dic</td>");
		sb.append("<td>Si</td>");
		sb.append("<tr>");
		sb.append("<tr>");
		sb.append("<td>Saluti di Natale</td>");
		sb.append("<td>23 Dic</td>");
		sb.append("<td>No</td>");
		sb.append("<tr>");
		sb.append("</table>");
		sb.append("</html>");
		
		
		String htmlText = sb.toString();
		
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

