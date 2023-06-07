import javax.swing.JOptionPane;

class Flecha {
	int longitud;
	String direccion;
	String Color;

	public void ingresarDatos() {
		longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha:"));
		direccion = JOptionPane.showInputDialog("Ingrese la dirección de la flecha:");
		Color = JOptionPane.showInputDialog("Ingrese el color:");
	}

	public void dibujarFlecha() {
		String flechaString = "";
		if (direccion.equalsIgnoreCase("izquierda")) {
			flechaString += "<";
		} 

		for (int i = 1; i <= longitud; i++) {
			flechaString += "-";
		}
		
		if (direccion.equalsIgnoreCase("derecha")) {
			flechaString += ">";
		}
		if (Color.equalsIgnoreCase("Rojo")) {
			System.err.println(flechaString);
		} else {
			System.out.println(flechaString);			
		}
	}
}