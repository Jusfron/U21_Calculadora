package ud21.Calculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaCalc extends JFrame {

	private JPanel contentPane;
	private JButton[] btnNums;

	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public VentanaCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		Color colorFondo = new Color(200, 200, 200);
		contentPane.setBackground(colorFondo);
		
		JPanel panelDivisas = new JPanel();
		panelDivisas.setBackground(colorFondo);
		contentPane.add(panelDivisas);
		panelDivisas.setLayout(null);
		
		JLabel lblTipoCalc = new JLabel("Moneda");
		lblTipoCalc.setBounds(10, 11, 65, 21);
		panelDivisas.add(lblTipoCalc);
		
		JLabel lblDivisaInput = new JLabel("0 $ ");
		lblDivisaInput.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblDivisaInput.setBounds(31, 60, 119, 43);
		panelDivisas.add(lblDivisaInput);
		
		JComboBox cmbInput = new JComboBox();
		cmbInput.setModel(new DefaultComboBoxModel(new String[] {"Estados Unidos - Dólar", "Europa - Euro", "Reino Unido - Libra", "Japón - Yeng"}));
		cmbInput.setBounds(31, 114, 169, 28);
		panelDivisas.add(cmbInput);
		
		JLabel lblDivisaOutput = new JLabel("0 €");
		lblDivisaOutput.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDivisaOutput.setBounds(31, 187, 87, 51);
		panelDivisas.add(lblDivisaOutput);
		
		JComboBox cmbOutput = new JComboBox();
		cmbOutput.setModel(new DefaultComboBoxModel(new String[] {"Europa - Euro", "Estados Unidos - Dólar", "Reino Unido - Libra", "Japón - Yeng"}));
		cmbOutput.setBounds(31, 249, 169, 28);
		panelDivisas.add(cmbOutput);
		
		JLabel lblNewLabel_3 = new JLabel("1 USD = 0.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(31, 344, 169, 43);
		panelDivisas.add(lblNewLabel_3);
		
		JPanel panelNums = new JPanel();
		panelNums.setBackground(colorFondo);
		contentPane.add(panelNums);
		panelNums.setLayout(new GridLayout(5, 3, 2, 2));		
		
		BotonesPanelNums(panelNums); //rellenamos botones del panel izquierdo (panelNums)		
		
	}
	
	
	private void BotonesPanelNums(JPanel panelNums) {
		btnNums = new JButton[15];
		Font fontFunciones = new Font("Tahoma", Font.PLAIN, 20);
		Font fontNumeros = new Font("Tahoma", Font.PLAIN, 33);
		Color gris = new Color(220, 220, 220);
		Color blanco = new Color(245, 245, 245);
				
		btnNums[0] = new JButton("invisible");
		btnNums[0].setVisible(false);
		btnNums[1] = new JButton("CE");
		btnNums[1].setBackground(gris);
		btnNums[1].setFont(fontFunciones);
		btnNums[1].setBorderPainted(false);
		btnNums[2] = new JButton("Borrar");	
		btnNums[2].setBackground(gris);
		btnNums[2].setFont(fontFunciones);
		btnNums[2].setBorderPainted(false);
		
		panelNums.add(btnNums[0]);
		panelNums.add(btnNums[1]);
		panelNums.add(btnNums[2]);		
		
		for (int i = 3; i < 12; i++) {
			btnNums[i] = new JButton(String.valueOf(i-2));
			btnNums[i].setFont(fontNumeros);
			btnNums[i].setBackground(blanco);
			btnNums[i].setBorderPainted(false);
			panelNums.add(btnNums[i]);
		}
		
		btnNums[12] = new JButton("invisible");
		btnNums[12].setVisible(false);
		
		btnNums[13] = new JButton("0");
		btnNums[13].setFont(fontNumeros);
		btnNums[13].setBackground(blanco);
		btnNums[13].setBorderPainted(false);
		
		btnNums[14] = new JButton(",");		
		btnNums[14].setFont(fontNumeros);
		btnNums[14].setBackground(blanco);
		btnNums[14].setBorderPainted(false);
		
		panelNums.add(btnNums[12]);
		panelNums.add(btnNums[13]);
		panelNums.add(btnNums[14]);
		
	}


	public JButton[] getBtnNums() {  //extraemos otro array solo con los botones de nums
		JButton[] numsBtn = new JButton[9];
		for(int i=0;i<numsBtn.length;i++) {
			numsBtn[i] = this.btnNums[i+3];
		}
	
		return numsBtn;
	}
	
	public JButton getBtnBorrar() {
		return btnNums[2];
	}
	
	public JButton getBtnCE() {
		return btnNums[1];
	}
	
	public JButton getBtnCero() {
		return btnNums[13];
	}
	
	public JButton getBtnComa() {
		return btnNums[14];
	}
	
	
}
