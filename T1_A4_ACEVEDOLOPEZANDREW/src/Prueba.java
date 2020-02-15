import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;


class VentanaInicio extends JFrame{

	JMenuBar menuBar;
	JMenu menuInicio, menuConversores;
	JMenuItem menuItemCalcSencilla, menuItemCalcCientifica, menuItemCalcProgramador;
	
	JInternalFrame IF_CalcSencilla, IF_CalcCientifica, IF_CalcProgramador;
	
	public VentanaInicio() {
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("InternalFrames");
		setSize(800, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		
		menuBar = new JMenuBar();
			menuInicio = new JMenu("Calculadoras");
				menuItemCalcSencilla = new JMenuItem("Sencilla");
					menuItemCalcSencilla.setMnemonic(KeyEvent.VK_S);
					menuItemCalcSencilla.setAccelerator(
					KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
					//menuItemCalcSencilla.setIcon(new Image());
					menuItemCalcSencilla.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							/*JFrame ventanaPrueba = new JFrame();
							ventanaPrueba.setSize(200, 200);
							ventanaPrueba.setLocationRelativeTo(null);
							ventanaPrueba.setVisible(true);*/
							IF_CalcSencilla.setVisible(true);
						}
					});
				menuInicio.add(menuItemCalcSencilla);
				menuItemCalcCientifica = new JMenuItem("Cientifica");
				menuInicio.add(menuItemCalcCientifica);
				menuItemCalcProgramador = new JMenuItem("Programador");
				menuInicio.add(menuItemCalcProgramador);
			menuBar.add(menuInicio);
			menuConversores = new JMenu("Conversores");
			menuBar.add(menuConversores);
		setJMenuBar(menuBar);
		// ----------------------   MENU ----------------------------
		
		//---------------- INTERNALFRAMES ----------------------
		JDesktopPane desktopPane = new JDesktopPane();
		
		IF_CalcSencilla = new JInternalFrame();
			IF_CalcSencilla.getContentPane().setLayout(null);
			IF_CalcSencilla.setDefaultCloseOperation(HIDE_ON_CLOSE);
			IF_CalcSencilla.setTitle("InternalFrames");
			IF_CalcSencilla.setSize(300, 300);
			
			IF_CalcSencilla.setMaximizable(true);
			IF_CalcSencilla.setIconifiable(true);
			IF_CalcSencilla.setClosable(true);
			IF_CalcSencilla.setResizable(true);

			//IF_CalcSencilla.setVisible(true);
		
			JPanel panelCalculadora = new JPanel();
				panelCalculadora.add(new JLabel("Calculadora SENCILLA"));
				JTextField cajaMantisa = new JTextField(10);
				panelCalculadora.add(cajaMantisa);
				panelCalculadora.setBounds(0,0, 100, 100);
			IF_CalcSencilla.add(panelCalculadora);
			
		desktopPane.add(IF_CalcSencilla); // agregar InternalFrame al DesktopPane
		
		add(desktopPane, BorderLayout.CENTER); //agreagr desktopPane al JFrame principal
		
	}//constructor
	
	
}//classe VentanaInicio
public class Prueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}
}







