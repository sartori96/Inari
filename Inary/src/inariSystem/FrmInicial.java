package inariSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.sql.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FrmInicial extends JFrame {

	private JPanel contentPane;
	private JTextField txtFerro;
	private JTextField txtMagnesio;
	private JTextField txtNitrogenio;
	private JTextField txtEnxofre;
	private JTextField txtPentoxidodeFosforo;
	private JTextField txtK2O;
	private JTextField txtCalcio;
	private JTextField txtBoro;
	private JTextField txtCloro;
	private JTextField txtMolibdenio;
	private JTextField txtCobre;
	private JTextField txtManganes;
	private JTextField txtZinco;
	private JTextField txtAluminio;
	private JTextField txtPotassio;
	private JTextField txtFosforo;

	/**
	 * Launch the application.
	 * 
	 * @throws Exception
	 * @throws SQLException
	 */

	public static void main(String[] args) {
		ConexaoDB c = new ConexaoDB();
		c.conexao();
		c.retornoDB();
		try {
			while (c.rs.next()) {
				System.out.println(
						c.rs.getObject("Name_Plant") + " " + c.rs.getObject("Ferro") + " " + c.rs.getObject("Boro"));
			}
		} catch (Exception e) {
		}

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					FrmInicial frame = new FrmInicial();
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
	public FrmInicial() {
		setResizable(false);
		setName("frmHome");
		setTitle("InarySystem");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Daniel\\eclipse-workspace\\InarySystem-master\\fox.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblTitulo = new JLabel("Insira o resultado da analise do solo");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblFerro = new JLabel("Ferro:");

		txtFerro = new JTextField();
		txtFerro.setColumns(10);

		JLabel lblMagnesio = new JLabel("Magnesio:");

		txtMagnesio = new JTextField();
		txtMagnesio.setColumns(10);

		JLabel lblNitrogenio = new JLabel("Nitrogenio:");

		txtNitrogenio = new JTextField();
		txtNitrogenio.setColumns(10);

		JLabel lblEnxofre = new JLabel("Enxofre:");

		txtEnxofre = new JTextField();
		txtEnxofre.setColumns(10);

		JLabel lblPentoxidodeFosforo = new JLabel("Pentoxido de fosforo:");

		txtPentoxidodeFosforo = new JTextField();
		txtPentoxidodeFosforo.setColumns(10);

		JLabel lblK2O = new JLabel("K2O:");

		txtK2O = new JTextField();
		txtK2O.setColumns(10);

		JLabel lblCalcio = new JLabel("Calcio:");

		txtCalcio = new JTextField();
		txtCalcio.setColumns(10);

		JLabel lblBoro = new JLabel("Boro:");

		txtBoro = new JTextField();
		txtBoro.setColumns(10);

		JLabel lblCloro = new JLabel("Cloro:");

		txtCloro = new JTextField();
		txtCloro.setColumns(10);

		JLabel lblMolibdenio = new JLabel("Molibdenio:");

		txtMolibdenio = new JTextField();
		txtMolibdenio.setColumns(10);

		JLabel lblCobre = new JLabel("Cobre:");

		txtCobre = new JTextField();
		txtCobre.setColumns(10);

		JLabel lblManganes = new JLabel("Manganes:");

		txtManganes = new JTextField();
		txtManganes.setColumns(10);

		JLabel lblZinco = new JLabel("Zinco:");

		txtZinco = new JTextField();
		txtZinco.setColumns(10);

		JLabel lblAluminio = new JLabel("Aluminio:");

		txtAluminio = new JTextField();
		txtAluminio.setColumns(10);

		JLabel lblPotassio = new JLabel("Potassio:");

		txtPotassio = new JTextField();
		txtPotassio.setColumns(10);

		JLabel lblFosforo = new JLabel("Fosforo:");

		txtFosforo = new JTextField();
		txtFosforo.setColumns(10);

		JButton btnConfirmarEntrada = new JButton("CONFIRMAR ENTRADA");

		JComboBox<String> cmbCultura = new JComboBox<String>();
		cmbCultura.setModel(new DefaultComboBoxModel<String>(new String[] { "ARROZ", "BATATA", "MILHO", "SOJA" }));
		cmbCultura.setName("");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 808, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConfirmarEntrada, GroupLayout.Alignment.CENTER)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(34)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblFerro)
										.addComponent(lblMagnesio).addComponent(lblNitrogenio)
										.addComponent(lblMolibdenio).addComponent(lblZinco))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtZinco, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(lblAluminio))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtMolibdenio, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(lblCobre))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtNitrogenio, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(lblK2O))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtMagnesio, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(lblPentoxidodeFosforo))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtFerro, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(116).addComponent(lblEnxofre))
										.addComponent(lblFosforo, Alignment.TRAILING))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
										.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(txtAluminio, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblPotassio))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(txtCobre, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblManganes))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(txtK2O, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblCloro))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(txtPentoxidodeFosforo, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblBoro))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(txtEnxofre, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(111).addComponent(lblCalcio)))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(txtPotassio, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtManganes, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtCloro, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtBoro, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtCalcio, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(cmbCultura, 0, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(txtFosforo))))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(331).addComponent(btnConfirmarEntrada)))
				.addContainerGap(16, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(lblTitulo).addGap(
						36)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtFerro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFerro).addComponent(lblEnxofre)
						.addComponent(txtEnxofre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCalcio).addComponent(txtCalcio, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMagnesio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMagnesio).addComponent(lblPentoxidodeFosforo)
						.addComponent(txtPentoxidodeFosforo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBoro).addComponent(txtBoro, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(
						ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNitrogenio)
						.addComponent(txtNitrogenio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblK2O)
						.addComponent(txtK2O, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCloro).addComponent(txtCloro, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(
						ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblMolibdenio)
						.addComponent(txtMolibdenio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCobre)
						.addComponent(txtCobre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblManganes).addComponent(txtManganes, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblZinco)
						.addComponent(txtZinco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAluminio)
						.addComponent(txtAluminio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPotassio).addComponent(txtPotassio, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblFosforo).addComponent(
						txtFosforo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addComponent(cmbCultura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 138, Short.MAX_VALUE).addComponent(btnConfirmarEntrada)
				.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	public void setTxtFerro(JTextField txtFerro) {
		this.txtFerro = txtFerro;
	}

	public void setTxtMagnesio(JTextField txtMagnesio) {
		this.txtMagnesio = txtMagnesio;
	}

	public void setTxtNitrogenio(JTextField txtNitrogenio) {
		this.txtNitrogenio = txtNitrogenio;
	}

	public void setTxtEnxofre(JTextField txtEnxofre) {
		this.txtEnxofre = txtEnxofre;
	}

	public void setTxtPentoxidodeFosforo(JTextField txtPentoxidodeFosforo) {
		this.txtPentoxidodeFosforo = txtPentoxidodeFosforo;
	}

	public void setTxtK2O(JTextField txtK2O) {
		this.txtK2O = txtK2O;
	}

	public void setTxtCalcio(JTextField txtCalcio) {
		this.txtCalcio = txtCalcio;
	}

	public void setTxtBoro(JTextField txtBoro) {
		this.txtBoro = txtBoro;
	}

	public void setTxtCloro(JTextField txtCloro) {
		this.txtCloro = txtCloro;
	}

	public void setTxtMolibdenio(JTextField txtMolibdenio) {
		this.txtMolibdenio = txtMolibdenio;
	}

	public void setTxtCobre(JTextField txtCobre) {
		this.txtCobre = txtCobre;
	}

	public void setTxtManganes(JTextField txtManganes) {
		this.txtManganes = txtManganes;
	}

	public void setTxtZinco(JTextField txtZinco) {
		this.txtZinco = txtZinco;
	}

	public void setTxtAluminio(JTextField txtAluminio) {
		this.txtAluminio = txtAluminio;
	}

	public void setTxtPotassio(JTextField txtPotassio) {
		this.txtPotassio = txtPotassio;
	}

	public void setTxtFosforo(JTextField txtFosforo) {
		this.txtFosforo = txtFosforo;
	}

	public JTextField getTxtFerro() {
		return txtFerro;
	}

	public JTextField getTxtMagnesio() {
		return txtMagnesio;
	}

	public JTextField getTxtNitrogenio() {
		return txtNitrogenio;
	}

	public JTextField getTxtEnxofre() {
		return txtEnxofre;
	}

	public JTextField getTxtPentoxidodeFosforo() {
		return txtPentoxidodeFosforo;
	}

	public JTextField getTxtK2O() {
		return txtK2O;
	}

	public JTextField getTxtCalcio() {
		return txtCalcio;
	}

	public JTextField getTxtBoro() {
		return txtBoro;
	}

	public JTextField getTxtCloro() {
		return txtCloro;
	}

	public JTextField getTxtMolibdenio() {
		return txtMolibdenio;
	}

	public JTextField getTxtCobre() {
		return txtCobre;
	}

	public JTextField getTxtManganes() {
		return txtManganes;
	}

	public JTextField getTxtZinco() {
		return txtZinco;
	}

	public JTextField getTxtAluminio() {
		return txtAluminio;
	}

	public JTextField getTxtPotassio() {
		return txtPotassio;
	}

	public JTextField getTxtFosforo() {
		return txtFosforo;
	}

}
