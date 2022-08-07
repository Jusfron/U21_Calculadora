package ud21.Calculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
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
		
		JPanel panelDivisas = new JPanel();
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
		contentPane.add(panelNums);
		panelNums.setLayout(new GridLayout(5, 3, 0, 0));		
		
		BotonesPanelNums(panelNums); //rellenamos botones del panel izquierdo (panelNums)		
		
	}
	
	
	private void BotonesPanelNums(JPanel panelNums) {
		btnNums = new JButton[15];
				
		btnNums[0] = new JButton("invisible");
		btnNums[0].setVisible(false);
		btnNums[1] = new JButton("CE");
		btnNums[2] = new JButton("Borrar");	
		
		panelNums.add(btnNums[0]);
		panelNums.add(btnNums[1]);
		panelNums.add(btnNums[2]);		
		
		for (int i = 3; i < 12; i++) {
			btnNums[i] = new JButton(String.valueOf(i-2));
			panelNums.add(btnNums[i]);
		}
		
		btnNums[12] = new JButton("invisible");
		btnNums[12].setVisible(false);
		
		btnNums[13] = new JButton("0");
		
		btnNums[14] = new JButton(",");		
		
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
