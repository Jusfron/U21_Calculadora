package ud21.Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class VentanaCalc extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
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
		cmbInput.setBounds(31, 114, 169, 43);
		panelDivisas.add(cmbInput);
		
		JLabel lblDivisaOutput = new JLabel("0 €");
		lblDivisaOutput.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDivisaOutput.setBounds(31, 187, 87, 51);
		panelDivisas.add(lblDivisaOutput);
		
		JComboBox cmbOutput = new JComboBox();
		cmbOutput.setBounds(31, 249, 169, 43);
		panelDivisas.add(cmbOutput);
		
		JLabel lblNewLabel_3 = new JLabel("1 USD = 0.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(31, 344, 169, 43);
		panelDivisas.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 3, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
	}
}
