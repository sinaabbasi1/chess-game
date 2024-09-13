import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JButton button;
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JButton button_4;
	JButton button_5;
	JButton button_6;
	JButton button_7;
	int temp;

	// Image properties
	ImageIcon bb = new ImageIcon("src/bb.png");
	ImageIcon bn = new ImageIcon("src/bn.png");
	ImageIcon bq = new ImageIcon("src/bq.png");
	ImageIcon br = new ImageIcon("src/br.png");
	ImageIcon wb = new ImageIcon("src/wb.png");
	ImageIcon wn = new ImageIcon("src/wn.png");
	ImageIcon wq = new ImageIcon("src/wq.png");
	ImageIcon wr = new ImageIcon("src/wr.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Menu dialog = new Menu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Menu() {
		setBounds(100, 100, 289, 246);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			button = new JButton("");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 0;
					dispose();
				}
			});
			button.setBounds(10, 31, 55, 55);
			contentPanel.add(button);
			button.setIcon(bq);
		}
		{
			button_1 = new JButton("");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 1;
					dispose();
				}
			});
			button_1.setBounds(75, 31, 55, 55);
			contentPanel.add(button_1);
			button_1.setIcon(br);
		}
		{
			button_2 = new JButton("");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 2;
					dispose();
				}
			});
			button_2.setBounds(140, 31, 55, 55);
			contentPanel.add(button_2);
			button_2.setIcon(bb);
		}
		{
			button_3 = new JButton("");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 3;
					dispose();
				}
			});
			button_3.setBounds(205, 31, 55, 55);
			contentPanel.add(button_3);
			button_3.setIcon(bn);
		}
		{
			button_4 = new JButton("");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 4;
					dispose();
				}
			});
			button_4.setBounds(10, 113, 55, 55);
			contentPanel.add(button_4);
			button_4.setIcon(wq);
		}
		{
			button_5 = new JButton("");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 5;
					dispose();
				}
			});
			button_5.setBounds(75, 113, 55, 55);
			contentPanel.add(button_5);
			button_5.setIcon(wr);
		}
		{
			button_6 = new JButton("");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 6;
					dispose();
				}
			});
			button_6.setBounds(140, 113, 55, 55);
			contentPanel.add(button_6);
			button_6.setIcon(wb);
		}
		{
			button_7 = new JButton("");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = 7;
					dispose();
				}
			});
			button_7.setBounds(205, 113, 55, 55);
			contentPanel.add(button_7);
			button_7.setIcon(wn);
		}
	}

}
