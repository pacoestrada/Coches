package POO;

import javax.swing.JOptionPane;

public class CochePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche = new Coche();
		
		coche.ruedas = JOptionPane.showInputDialog("¿cuantas ruedas tiene?");
		int ruedasEntero = Integer.parseInt(coche.ruedas);
		
		coche.puertas = JOptionPane.showInputDialog("¿cuantas puertas tiene?");
		int puertasEntero = Integer.parseInt(coche.puertas);
		
		coche.color = JOptionPane.showInputDialog("¿De qué color es el coche?");
		String cocheColor = coche.color;
		
		String cocheDefinido = "El coche, que has definido, tiene " + ruedasEntero + " ruedas "
				+ puertasEntero + " puertas. Y es de color " + cocheColor;
		
		//System.out.println(cocheDefinido);
		JOptionPane.showInternalMessageDialog(null, cocheDefinido);
		

	}

}
