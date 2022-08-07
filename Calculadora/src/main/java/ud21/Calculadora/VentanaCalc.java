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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalc extends JFrame {

	private JPanel contentPane;
	private JButton[] btnNums;
	private JLabel lblDivisaInput;
	private JLabel lblDivisaOutput;
	private JLabel lblValorConversion;
	private JComboBox cmbOutput;
	private JComboBox cmbInput;
	private JLabel lblSimboloInput;
	private JLabel lblSimboloOutput;

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

		lblDivisaInput = new JLabel("0");
		lblDivisaInput.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblDivisaInput.setBounds(31, 60, 169, 43);
		panelDivisas.add(lblDivisaInput);

		cmbInput = new JComboBox();

		cmbInput.setModel(new DefaultComboBoxModel(
				new String[] { "Estados Unidos - Dólar", "Europa - Euro", "Reino Unido - Libra", "Japón - Yeng" }));
		cmbInput.setBounds(31, 114, 169, 28);
		panelDivisas.add(cmbInput);

		lblDivisaOutput = new JLabel("0");
		lblDivisaOutput.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDivisaOutput.setBounds(31, 187, 169, 51);
		panelDivisas.add(lblDivisaOutput);

		cmbOutput = new JComboBox();

		cmbOutput.setModel(new DefaultComboBoxModel(
				new String[] { "Europa - Euro", "Estados Unidos - Dólar", "Reino Unido - Libra", "Japón - Yen" }));
		cmbOutput.setBounds(31, 249, 169, 28);
		panelDivisas.add(cmbOutput);

		lblValorConversion = new JLabel("1 $ = 1 €");
		lblValorConversion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorConversion.setBounds(31, 344, 169, 43);
		panelDivisas.add(lblValorConversion);

		lblSimboloInput = new JLabel("$");
		lblSimboloInput.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblSimboloInput.setBounds(225, 60, 72, 43);
		panelDivisas.add(lblSimboloInput);

		lblSimboloOutput = new JLabel("€");
		lblSimboloOutput.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSimboloOutput.setBounds(228, 187, 69, 44);
		panelDivisas.add(lblSimboloOutput);

		JPanel panelNums = new JPanel();
		panelNums.setBackground(colorFondo);
		contentPane.add(panelNums);
		panelNums.setLayout(new GridLayout(5, 3, 2, 2));

		BotonesPanelNums(panelNums); // rellenamos botones del panel izquierdo (panelNums)

	}

	public JLabel getLblSimboloInput() {
		return lblSimboloInput;
	}

	public void setLblSimboloInput(JLabel lblSimboloInput) {
		this.lblSimboloInput = lblSimboloInput;
	}

	public JLabel getLblSimboloOutput() {
		return lblSimboloOutput;
	}

	public void setLblSimboloOutput(JLabel lblSimboloOutput) {
		this.lblSimboloOutput = lblSimboloOutput;
	}

	public JComboBox getCmbOutput() {
		return cmbOutput;
	}

	public void setCmbOutput(JComboBox cmbOutput) {
		this.cmbOutput = cmbOutput;
	}

	public JComboBox getCmbInput() {
		return cmbInput;
	}

	public void setCmbInput(JComboBox cmbInput) {
		this.cmbInput = cmbInput;
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
			btnNums[i] = new JButton(String.valueOf(i - 2));
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

	public JButton[] getBtnNums() { // extraemos otro array solo con los botones de nums
		JButton[] numsBtn = new JButton[9];
		for (int i = 0; i < numsBtn.length; i++) {
			numsBtn[i] = this.btnNums[i + 3];
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

	public void setLblDivisaInput(String text) {
		lblDivisaInput.setText(text);
	}

	public void setLblDivisaOutput(String text) {
		lblDivisaOutput.setText(text);
	}

	public void setLblValorConversion(String text) {
		lblValorConversion.setText(text);
	}

	public void setLblSimboloInput(String text) {
		lblSimboloInput.setText(text);
	}

	public void setLblSimboloOutput(String text) {
		lblSimboloOutput.setText(text);
	}

	public String getTextLblDivisaInput() {
		return lblDivisaInput.getText();
	}

}
