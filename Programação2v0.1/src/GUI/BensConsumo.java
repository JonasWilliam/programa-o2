package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BensConsumo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblSetorDeLocao;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblQuantidade;
	private JTextField textField_4;
	private JLabel lblDataDeValidade;
	private JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BensConsumo frame = new BensConsumo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BensConsumo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroBensDe = new JLabel("Cadastro Bens de Consumo");
		lblCadastroBensDe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroBensDe.setBounds(90, 11, 304, 25);
		contentPane.add(lblCadastroBensDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(39, 92, 69, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(162, 91, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCdigo.setBounds(39, 124, 69, 14);
		contentPane.add(lblCdigo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 122, 178, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblSetorDeLocao = new JLabel("Setor de loca\u00E7\u00E3o:");
		lblSetorDeLocao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSetorDeLocao.setBounds(39, 153, 113, 14);
		contentPane.add(lblSetorDeLocao);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 153, 178, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(162, 184, 178, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidade.setBounds(39, 183, 86, 14);
		contentPane.add(lblQuantidade);
		
		textField_4 = new JTextField();
		textField_4.setBounds(162, 214, 178, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblDataDeValidade = new JLabel("Data de Validade:");
		lblDataDeValidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeValidade.setBounds(39, 217, 110, 17);
		contentPane.add(lblDataDeValidade);
		
		btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrar.setBounds(162, 269, 125, 23);
		contentPane.add(btnCadastrar);
	}

}
