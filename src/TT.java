import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TT extends JFrame {

	private JPanel contentPane;
	int cnt;
	int cnt2;
	JLabel whiteTimeLabel;
	JLabel blackTimeLabel;
	Timer timer1;
	Timer timer2;
	int a;
	int b;
	private JLabel lblNewLabel_1;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TT frame = new TT();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void aPlus() {
		a += 5;
	}
	
	
	
	public void timer1() {
		ActionListener actListner = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				cnt += 1;
				a = 120 - cnt;
				if (a == 0) {
					dispose();
					JOptionPane.showMessageDialog(null, "The Black Wins   :) ", "Congratulations!  ",
							JOptionPane.INFORMATION_MESSAGE);
				}
					
				whiteTimeLabel.setText(Integer.toString(a));
				// System.out.println("Counter = " + cnt);
			}
		};
		timer1 = new Timer(1000, actListner);
		timer1.start();
	}

	public void stopTimer1() {
		timer1.stop();
	}

	public void timer2() {
		ActionListener actListner = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				cnt2 += 1;
				b = 120 - cnt2;
				if (b == 0) {
					dispose();
					JOptionPane.showMessageDialog(null, "The White Wins   :) ", "Congratulations!  ",
							JOptionPane.INFORMATION_MESSAGE);
				}
				
				blackTimeLabel.setText(Integer.toString(b));
				// System.out.println("Counter = " + cnt);
			}
		};
		timer2 = new Timer(1000, actListner);
		timer2.start();
	}

	public void stopTimer2() {
		timer2.stop();
	}

	/**
	 * Create the frame.
	 */
	public TT() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 200, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		whiteTimeLabel = new JLabel("00");
		whiteTimeLabel.setForeground(Color.BLUE);
		whiteTimeLabel.setFont(new Font("Gadugi", Font.BOLD, 35));
		whiteTimeLabel.setBounds(72, 201, 64, 32);
		contentPane.add(whiteTimeLabel);

		blackTimeLabel = new JLabel("00");
		blackTimeLabel.setFont(new Font("Gadugi", Font.BOLD, 35));
		blackTimeLabel.setBounds(72, 83, 77, 32);
		contentPane.add(blackTimeLabel);
		
		lblNewLabel_1 = new JLabel("Black Timer");
		lblNewLabel_1.setFont(new Font("Gadugi", Font.BOLD, 16));
		lblNewLabel_1.setBounds(49, 31, 89, 32);
		contentPane.add(lblNewLabel_1);
		
		label_1 = new JLabel("White Timer");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Gadugi", Font.BOLD, 16));
		label_1.setBounds(49, 145, 100, 32);
		contentPane.add(label_1);
	}
}
