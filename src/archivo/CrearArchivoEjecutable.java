package archivo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase que una una aplicación de interfaz gráfica que
 * muestra la ubicación del archivo ejecutable en una ventana.
 */
public class CrearArchivoEjecutable {

	public static void main(String[] args) {
		
		//crea la ventana principal
		JFrame marco = new JFrame();
		
		marco.setSize(800, 100);
		marco.setTitle("Ventana ejecutable");
		marco.setLocationRelativeTo(null); //centra la ventana en la pantalla
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//crea el panel
		JPanel panel = new JPanel();
		
		//obtiene la ubicación del archivo ejecutable
		String url = CrearArchivoEjecutable.class.getProtectionDomain().getCodeSource().getLocation().getPath();
				
		//crea una etiqueta con la ubicación
		JLabel etiqueta = new JLabel("Ubicación: " + url);
		
		//agrega la etiqueta al panel
		panel.add(etiqueta);
		
		//agrega el panel al marco
		marco.add(panel);
		
		//hace visible el marco
		marco.setVisible(true);
		
	}
	
}
