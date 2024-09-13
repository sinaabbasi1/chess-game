import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton button_24;
	private JButton button_25;
	private JButton button_26;
	private JButton button_27;
	private JButton button_28;
	private JButton button_29;
	private JButton button_30;
	private JButton button_31;
	private JButton button_32;
	private JButton button_33;
	private JButton button_34;
	private JButton button_35;
	private JButton button_36;
	private JButton button_37;
	private JButton button_38;
	private JButton button_39;
	private JButton button_40;
	private JButton button_41;
	private JButton button_42;
	private JButton button_43;
	private JButton button_44;
	private JButton button_45;
	private JButton button_46;
	private JButton button_47;
	private JButton button_48;
	private JButton button_49;
	private JButton button_50;
	private JButton button_51;
	private JButton button_52;
	private JButton button_53;
	private JButton button_54;
	private JButton button_55;
	private JButton button_56;
	private JButton button_57;
	private JButton button_58;
	private JButton button_59;
	private JButton button_60;
	private JButton button_61;
	private JButton button_62;
	private JButton button_63;
	private JButton[][] jButton = new JButton[9][9];
	private JButton quitButton;
	private JButton startButton;
	private JLabel titleLabel;
	private boolean turn = false;
	// true is black
	// false is white
	private JLabel turnLabel_0;
	private JLabel turnLabel;
	private JButton tempButton;
	private int tempButtonI;
	private int tempButtonJ;
	// private JButton tempButton2;
	private int tempButton2I;
	private int tempButton2J;
	private JButton tempRook;
	private int wkI = 8;
	private int wkJ = 5;
	private int bkI = 1;
	private int bkJ = 5;
	private int countWhiteKing = 0;
	private int countBlackKing = 0;
	private int lwrI = 8;
	private int lwrJ = 1;
	private int lwrCount = 0;
	private int rwrI = 8;
	private int rwrJ = 8;
	private int rwrCount = 0;
	private int lbrI = 1;
	private int lbrJ = 1;
	private int lbrCount = 0;
	private int rbrI = 1;
	private int rbrJ = 8;
	private int rbrCount = 0;

	// Image properties
	ImageIcon bb = new ImageIcon("src/bb.png");
	ImageIcon bk = new ImageIcon("src/bk.png");
	ImageIcon bn = new ImageIcon("src/bn.png");
	ImageIcon bp = new ImageIcon("src/bp.png");
	ImageIcon bq = new ImageIcon("src/bq.png");
	ImageIcon br = new ImageIcon("src/br.png");
	ImageIcon wb = new ImageIcon("src/wb.png");
	ImageIcon wk = new ImageIcon("src/wk.png");
	ImageIcon wn = new ImageIcon("src/wn.png");
	ImageIcon wp = new ImageIcon("src/wp.png");
	ImageIcon wq = new ImageIcon("src/wq.png");
	ImageIcon wr = new ImageIcon("src/wr.png");

	// Lost Pieces Properties
	private JButton button_64;
	private JButton button_65;
	private JButton button_66;
	private JButton button_67;
	private JButton button_68;
	private JButton button_69;
	private JButton button_70;
	private JButton button_71;
	private JButton button_72;
	private JButton button_73;
	private JButton button_74;
	private JButton button_75;
	private JButton button_76;
	private JButton button_77;
	private JButton button_78;
	private JButton button_79;
	private JButton button_80;
	private JButton button_81;
	private JButton button_82;
	private JButton button_83;
	private JButton button_84;
	private JButton button_85;
	private JButton button_86;
	private JButton button_87;
	private JButton button_88;
	private JButton button_89;
	private JButton button_90;
	private JButton button_91;
	private JButton button_92;
	private JButton button_93;
	private JButton button_94;
	private JButton button_95;
	private JLabel blackLabel;
	private JLabel whiteLabel;
	private JButton[] jButtonBlack = new JButton[17];
	private JButton[] jButtonWhite = new JButton[17];

	// Timer properties
	private static TT tt = new TT();
	private int countTimer1 = 0;
	private int countTimer2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setLocation(0, 0);
					frame.setVisible(true);
					tt.setLocation(900, 100);
					tt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Methods

	public void accessBtn() {
		jButton[1][1] = button;
		jButton[1][2] = button_1;
		jButton[1][3] = button_2;
		jButton[1][4] = button_3;
		jButton[1][5] = button_4;
		jButton[1][6] = button_5;
		jButton[1][7] = button_6;
		jButton[1][8] = button_7;
		jButton[2][1] = button_8;
		jButton[2][2] = button_9;
		jButton[2][3] = button_10;
		jButton[2][4] = button_11;
		jButton[2][5] = button_12;
		jButton[2][6] = button_13;
		jButton[2][7] = button_14;
		jButton[2][8] = button_15;
		jButton[3][1] = button_16;
		jButton[3][2] = button_17;
		jButton[3][3] = button_18;
		jButton[3][4] = button_19;
		jButton[3][5] = button_20;
		jButton[3][6] = button_21;
		jButton[3][7] = button_22;
		jButton[3][8] = button_23;
		jButton[4][1] = button_24;
		jButton[4][2] = button_25;
		jButton[4][3] = button_26;
		jButton[4][4] = button_27;
		jButton[4][5] = button_28;
		jButton[4][6] = button_29;
		jButton[4][7] = button_30;
		jButton[4][8] = button_31;
		jButton[5][1] = button_32;
		jButton[5][2] = button_33;
		jButton[5][3] = button_34;
		jButton[5][4] = button_35;
		jButton[5][5] = button_36;
		jButton[5][6] = button_37;
		jButton[5][7] = button_38;
		jButton[5][8] = button_39;
		jButton[6][1] = button_40;
		jButton[6][2] = button_41;
		jButton[6][3] = button_42;
		jButton[6][4] = button_43;
		jButton[6][5] = button_44;
		jButton[6][6] = button_45;
		jButton[6][7] = button_46;
		jButton[6][8] = button_47;
		jButton[7][1] = button_48;
		jButton[7][2] = button_49;
		jButton[7][3] = button_50;
		jButton[7][4] = button_51;
		jButton[7][5] = button_52;
		jButton[7][6] = button_53;
		jButton[7][7] = button_54;
		jButton[7][8] = button_55;
		jButton[8][1] = button_56;
		jButton[8][2] = button_57;
		jButton[8][3] = button_58;
		jButton[8][4] = button_59;
		jButton[8][5] = button_60;
		jButton[8][6] = button_61;
		jButton[8][7] = button_62;
		jButton[8][8] = button_63;
	}

	public void changeTurn() {
		turn = !turn;
	}

	public void checkTurn() {
		if (turn == true) {
			turnLabel.setForeground(Color.BLACK);
			turnLabel.setText("Black Turn");
			for (int i = 1; i <= 8; i++) {
				for (int j = 1; j <= 8; j++) {
					if (!isWhite(i, j))
						jButton[i][j].setEnabled(true);
					if (isWhite(i, j))
						jButton[i][j].setEnabled(false);
				}
			}

			// Timer
			if (countTimer1 != 0) {
				tt.stopTimer1();

			}
			tt.cnt -= 5;
			tt.timer2();
			countTimer2++;
		} else {
			turnLabel.setForeground(Color.BLUE);
			turnLabel.setText("White Turn");
			for (int i = 1; i <= 8; i++) {
				for (int j = 1; j <= 8; j++) {
					if (isBlack(i, j))
						jButton[i][j].setEnabled(false);
					if (!isBlack(i, j))
						jButton[i][j].setEnabled(true);
				}
			}

			// Timer
			if (countTimer2 != 0) {
				tt.cnt2 -= 5;
				tt.stopTimer2();

			}
			tt.timer1();
			countTimer1++;
		}
	}

	public void resetButtonsColorNotRED() {
		if (button.getBackground() != Color.RED)
			button.setBackground(Color.WHITE);
		if (button_1.getBackground() != Color.RED)
			button_1.setBackground(Color.LIGHT_GRAY);
		if (button_2.getBackground() != Color.RED)
			button_2.setBackground(Color.WHITE);
		if (button_3.getBackground() != Color.RED)
			button_3.setBackground(Color.LIGHT_GRAY);
		if (button_4.getBackground() != Color.RED)
			button_4.setBackground(Color.WHITE);
		if (button_5.getBackground() != Color.RED)
			button_5.setBackground(Color.LIGHT_GRAY);
		if (button_6.getBackground() != Color.RED)
			button_6.setBackground(Color.WHITE);
		if (button_7.getBackground() != Color.RED)
			button_7.setBackground(Color.LIGHT_GRAY);
		if (button_8.getBackground() != Color.RED)
			button_8.setBackground(Color.LIGHT_GRAY);
		if (button_9.getBackground() != Color.RED)
			button_9.setBackground(Color.WHITE);
		if (button_10.getBackground() != Color.RED)
			button_10.setBackground(Color.LIGHT_GRAY);
		if (button_11.getBackground() != Color.RED)
			button_11.setBackground(Color.WHITE);
		if (button_12.getBackground() != Color.RED)
			button_12.setBackground(Color.LIGHT_GRAY);
		if (button_13.getBackground() != Color.RED)
			button_13.setBackground(Color.WHITE);
		if (button_14.getBackground() != Color.RED)
			button_14.setBackground(Color.LIGHT_GRAY);
		if (button_15.getBackground() != Color.RED)
			button_15.setBackground(Color.WHITE);
		if (button_16.getBackground() != Color.RED)
			button_16.setBackground(Color.WHITE);
		if (button_17.getBackground() != Color.RED)
			button_17.setBackground(Color.LIGHT_GRAY);
		if (button_18.getBackground() != Color.RED)
			button_18.setBackground(Color.WHITE);
		if (button_19.getBackground() != Color.RED)
			button_19.setBackground(Color.LIGHT_GRAY);
		if (button_20.getBackground() != Color.RED)
			button_20.setBackground(Color.WHITE);
		if (button_21.getBackground() != Color.RED)
			button_21.setBackground(Color.LIGHT_GRAY);
		if (button_22.getBackground() != Color.RED)
			button_22.setBackground(Color.WHITE);
		if (button_23.getBackground() != Color.RED)
			button_23.setBackground(Color.LIGHT_GRAY);
		if (button_24.getBackground() != Color.RED)
			button_24.setBackground(Color.LIGHT_GRAY);
		if (button_25.getBackground() != Color.RED)
			button_25.setBackground(Color.WHITE);
		if (button_26.getBackground() != Color.RED)
			button_26.setBackground(Color.LIGHT_GRAY);
		if (button_27.getBackground() != Color.RED)
			button_27.setBackground(Color.WHITE);
		if (button_28.getBackground() != Color.RED)
			button_28.setBackground(Color.LIGHT_GRAY);
		if (button_29.getBackground() != Color.RED)
			button_29.setBackground(Color.WHITE);
		if (button_30.getBackground() != Color.RED)
			button_30.setBackground(Color.LIGHT_GRAY);
		if (button_31.getBackground() != Color.RED)
			button_31.setBackground(Color.WHITE);
		if (button_32.getBackground() != Color.RED)
			button_32.setBackground(Color.WHITE);
		if (button_33.getBackground() != Color.RED)
			button_33.setBackground(Color.LIGHT_GRAY);
		if (button_34.getBackground() != Color.RED)
			button_34.setBackground(Color.WHITE);
		if (button_35.getBackground() != Color.RED)
			button_35.setBackground(Color.LIGHT_GRAY);
		if (button_36.getBackground() != Color.RED)
			button_36.setBackground(Color.WHITE);
		if (button_37.getBackground() != Color.RED)
			button_37.setBackground(Color.LIGHT_GRAY);
		if (button_38.getBackground() != Color.RED)
			button_38.setBackground(Color.WHITE);
		if (button_39.getBackground() != Color.RED)
			button_39.setBackground(Color.LIGHT_GRAY);
		if (button_40.getBackground() != Color.RED)
			button_40.setBackground(Color.LIGHT_GRAY);
		if (button_41.getBackground() != Color.RED)
			button_41.setBackground(Color.WHITE);
		if (button_42.getBackground() != Color.RED)
			button_42.setBackground(Color.LIGHT_GRAY);
		if (button_43.getBackground() != Color.RED)
			button_43.setBackground(Color.WHITE);
		if (button_44.getBackground() != Color.RED)
			button_44.setBackground(Color.LIGHT_GRAY);
		if (button_45.getBackground() != Color.RED)
			button_45.setBackground(Color.WHITE);
		if (button_46.getBackground() != Color.RED)
			button_46.setBackground(Color.LIGHT_GRAY);
		if (button_47.getBackground() != Color.RED)
			button_47.setBackground(Color.WHITE);
		if (button_48.getBackground() != Color.RED)
			button_48.setBackground(Color.WHITE);
		if (button_49.getBackground() != Color.RED)
			button_49.setBackground(Color.LIGHT_GRAY);
		if (button_50.getBackground() != Color.RED)
			button_50.setBackground(Color.WHITE);
		if (button_51.getBackground() != Color.RED)
			button_51.setBackground(Color.LIGHT_GRAY);
		if (button_52.getBackground() != Color.RED)
			button_52.setBackground(Color.WHITE);
		if (button_53.getBackground() != Color.RED)
			button_53.setBackground(Color.LIGHT_GRAY);
		if (button_54.getBackground() != Color.RED)
			button_54.setBackground(Color.WHITE);
		if (button_55.getBackground() != Color.RED)
			button_55.setBackground(Color.LIGHT_GRAY);
		if (button_56.getBackground() != Color.RED)
			button_56.setBackground(Color.LIGHT_GRAY);
		if (button_57.getBackground() != Color.RED)
			button_57.setBackground(Color.WHITE);
		if (button_58.getBackground() != Color.RED)
			button_58.setBackground(Color.LIGHT_GRAY);
		if (button_59.getBackground() != Color.RED)
			button_59.setBackground(Color.WHITE);
		if (button_60.getBackground() != Color.RED)
			button_60.setBackground(Color.LIGHT_GRAY);
		if (button_61.getBackground() != Color.RED)
			button_61.setBackground(Color.WHITE);
		if (button_62.getBackground() != Color.RED)
			button_62.setBackground(Color.LIGHT_GRAY);
		if (button_63.getBackground() != Color.RED)
			button_63.setBackground(Color.WHITE);
	}

	public void resetButtonsColor_0() {
		button.setBackground(Color.WHITE);
		button_1.setBackground(Color.LIGHT_GRAY);
		button_2.setBackground(Color.WHITE);
		button_3.setBackground(Color.LIGHT_GRAY);
		button_4.setBackground(Color.WHITE);
		button_5.setBackground(Color.LIGHT_GRAY);
		button_6.setBackground(Color.WHITE);
		button_7.setBackground(Color.LIGHT_GRAY);
		button_8.setBackground(Color.LIGHT_GRAY);
		button_9.setBackground(Color.WHITE);
		button_10.setBackground(Color.LIGHT_GRAY);
		button_11.setBackground(Color.WHITE);
		button_12.setBackground(Color.LIGHT_GRAY);
		button_13.setBackground(Color.WHITE);
		button_14.setBackground(Color.LIGHT_GRAY);
		button_15.setBackground(Color.WHITE);
		button_16.setBackground(Color.WHITE);
		button_17.setBackground(Color.LIGHT_GRAY);
		button_18.setBackground(Color.WHITE);
		button_19.setBackground(Color.LIGHT_GRAY);
		button_20.setBackground(Color.WHITE);
		button_21.setBackground(Color.LIGHT_GRAY);
		button_22.setBackground(Color.WHITE);
		button_23.setBackground(Color.LIGHT_GRAY);
		button_24.setBackground(Color.LIGHT_GRAY);
		button_25.setBackground(Color.WHITE);
		button_26.setBackground(Color.LIGHT_GRAY);
		button_27.setBackground(Color.WHITE);
		button_28.setBackground(Color.LIGHT_GRAY);
		button_29.setBackground(Color.WHITE);
		button_30.setBackground(Color.LIGHT_GRAY);
		button_31.setBackground(Color.WHITE);
		button_32.setBackground(Color.WHITE);
		button_33.setBackground(Color.LIGHT_GRAY);
		button_34.setBackground(Color.WHITE);
		button_35.setBackground(Color.LIGHT_GRAY);
		button_36.setBackground(Color.WHITE);
		button_37.setBackground(Color.LIGHT_GRAY);
		button_38.setBackground(Color.WHITE);
		button_39.setBackground(Color.LIGHT_GRAY);
		button_40.setBackground(Color.LIGHT_GRAY);
		button_41.setBackground(Color.WHITE);
		button_42.setBackground(Color.LIGHT_GRAY);
		button_43.setBackground(Color.WHITE);
		button_44.setBackground(Color.LIGHT_GRAY);
		button_45.setBackground(Color.WHITE);
		button_46.setBackground(Color.LIGHT_GRAY);
		button_47.setBackground(Color.WHITE);
		button_48.setBackground(Color.WHITE);
		button_49.setBackground(Color.LIGHT_GRAY);
		button_50.setBackground(Color.WHITE);
		button_51.setBackground(Color.LIGHT_GRAY);
		button_52.setBackground(Color.WHITE);
		button_53.setBackground(Color.LIGHT_GRAY);
		button_54.setBackground(Color.WHITE);
		button_55.setBackground(Color.LIGHT_GRAY);
		button_56.setBackground(Color.LIGHT_GRAY);
		button_57.setBackground(Color.WHITE);
		button_58.setBackground(Color.LIGHT_GRAY);
		button_59.setBackground(Color.WHITE);
		button_60.setBackground(Color.LIGHT_GRAY);
		button_61.setBackground(Color.WHITE);
		button_62.setBackground(Color.LIGHT_GRAY);
		button_63.setBackground(Color.WHITE);
	}

	public void resetButtonsColor() {
		resetButtonsColor_0();
		changeTurn();
		checkTurn();
	}

	public void everyButton(JButton btn, int i, int j) {
		tempButton = jButton[i][j];
		tempButtonI = i;
		tempButtonJ = j;
		if (jButton[i][j].getIcon() != null)
			jButton[i][j].setBackground(Color.ORANGE);
		eraseOrange(i, j);
		int m;
		int n;

		// Pawns

		if (jButton[i][j].getIcon() == wp) {
			if (i == 7) {
				if (jButton[i - 1][j].getIcon() == null) {
					jButton[i - 1][j].setBackground(Color.CYAN);
					if (jButton[i - 2][j].getIcon() == null)
						jButton[i - 2][j].setBackground(Color.CYAN);
				}
				if (j == 1 && isBlack(6, 2))
					jButton[6][2].setBackground(Color.CYAN);
				if (j >= 2 && j <= 7) {
					if (isBlack(i - 1, j - 1))
						jButton[i - 1][j - 1].setBackground(Color.CYAN);
					if (isBlack(i - 1, j + 1))
						jButton[i - 1][j + 1].setBackground(Color.CYAN);
				}
				if (j == 8 && isBlack(6, 7))
					jButton[6][7].setBackground(Color.CYAN);
			}
			if (i <= 6 && i >= 2) {
				if (jButton[i - 1][j].getIcon() == null)
					jButton[i - 1][j].setBackground(Color.CYAN);
				if (j == 1 && isBlack(i - 1, j + 1))
					jButton[i - 1][j + 1].setBackground(Color.CYAN);
				if (j >= 2 && j <= 7) {
					if (isBlack(i - 1, j - 1))
						jButton[i - 1][j - 1].setBackground(Color.CYAN);
					if (isBlack(i - 1, j + 1))
						jButton[i - 1][j + 1].setBackground(Color.CYAN);
				}
				if (j == 8 && isBlack(i - 1, j - 1))
					jButton[i - 1][j - 1].setBackground(Color.CYAN);
			}
		}
		if (jButton[i][j].getIcon() == bp) {
			if (i == 2) {
				if (jButton[i + 1][j].getIcon() == null) {
					jButton[i + 1][j].setBackground(Color.CYAN);
					if (jButton[i + 2][j].getIcon() == null)
						jButton[i + 2][j].setBackground(Color.CYAN);
				}
				if (j == 1 && isWhite(3, 2))
					jButton[3][2].setBackground(Color.CYAN);
				if (j >= 2 && j <= 7) {
					if (isWhite(i + 1, j - 1))
						jButton[i + 1][j - 1].setBackground(Color.CYAN);
					if (isWhite(i + 1, j + 1))
						jButton[i + 1][j + 1].setBackground(Color.CYAN);
				}
				if (j == 8 && isWhite(3, 7))
					jButton[3][7].setBackground(Color.CYAN);
			}
			if (i <= 7 && i >= 3) {
				if (jButton[i + 1][j].getIcon() == null)
					jButton[i + 1][j].setBackground(Color.CYAN);
				if (j == 1 && isWhite(i + 1, j + 1))
					jButton[i + 1][j + 1].setBackground(Color.CYAN);
				if (j >= 2 && j <= 7) {
					if (isWhite(i + 1, j - 1))
						jButton[i + 1][j - 1].setBackground(Color.CYAN);
					if (isWhite(i + 1, j + 1))
						jButton[i + 1][j + 1].setBackground(Color.CYAN);
				}
				if (j == 8 && isWhite(i + 1, j - 1))
					jButton[i + 1][j - 1].setBackground(Color.CYAN);
			}
		}

		// Rooks

		if (jButton[i][j].getIcon() == wr) {
			m = i;
			while (m <= 7) {
				m++;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isBlack(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, j))
					break;
			}
			m = i;
			while (m >= 2) {
				m--;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isBlack(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, j))
					break;
			}
			m = j;
			while (m <= 7) {
				m++;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isBlack(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(i, m))
					break;
			}
			m = j;
			while (m >= 2) {
				m--;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isBlack(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(i, m))
					break;
			}
		}
		if (jButton[i][j].getIcon() == br) {
			m = i;
			while (m <= 7) {
				m++;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isWhite(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, j))
					break;
			}
			m = i;
			while (m >= 2) {
				m--;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isWhite(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, j))
					break;
			}
			m = j;
			while (m <= 7) {
				m++;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isWhite(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(i, m))
					break;
			}
			m = j;
			while (m >= 2) {
				m--;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isWhite(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(i, m))
					break;
			}
		}

		// Queen

		if (jButton[i][j].getIcon() == wq) {
			m = i;
			while (m <= 7) {
				m++;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isBlack(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, j))
					break;
			}
			m = i;
			while (m >= 2) {
				m--;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isBlack(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, j))
					break;
			}
			m = j;
			while (m <= 7) {
				m++;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isBlack(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(i, m))
					break;
			}
			m = j;
			while (m >= 2) {
				m--;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isBlack(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(i, m))
					break;
			}

			// Orib

			m = i;
			n = j;
			while (m <= 7 && n <= 7) {
				m++;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n <= 7) {
				m--;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n >= 2) {
				m--;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
			m = i;
			n = j;
			while (m <= 7 && n >= 2) {
				m++;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
		}
		if (jButton[i][j].getIcon() == bq) {
			m = i;
			while (m <= 7) {
				m++;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isWhite(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, j))
					break;
			}
			m = i;
			while (m >= 2) {
				m--;
				if (jButton[m][j].getIcon() == null)
					jButton[m][j].setBackground(Color.CYAN);
				if (isWhite(m, j)) {
					jButton[m][j].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, j))
					break;
			}
			m = j;
			while (m <= 7) {
				m++;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isWhite(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(i, m))
					break;
			}
			m = j;
			while (m >= 2) {
				m--;
				if (jButton[i][m].getIcon() == null)
					jButton[i][m].setBackground(Color.CYAN);
				if (isWhite(i, m)) {
					jButton[i][m].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(i, m))
					break;
			}

			// Orib

			m = i;
			n = j;
			while (m <= 7 && n <= 7) {
				m++;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n <= 7) {
				m--;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n >= 2) {
				m--;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
			m = i;
			n = j;
			while (m <= 7 && n >= 2) {
				m++;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
		}

		// Bishops

		if (jButton[i][j].getIcon() == wb) {
			m = i;
			n = j;
			while (m <= 7 && n <= 7) {
				m++;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n <= 7) {
				m--;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n >= 2) {
				m--;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
			m = i;
			n = j;
			while (m <= 7 && n >= 2) {
				m++;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isBlack(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isWhite(m, n))
					break;
			}
		}
		if (jButton[i][j].getIcon() == bb) {
			m = i;
			n = j;
			while (m <= 7 && n <= 7) {
				m++;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n <= 7) {
				m--;
				n++;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
			m = i;
			n = j;
			while (m >= 2 && n >= 2) {
				m--;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
			m = i;
			n = j;
			while (m <= 7 && n >= 2) {
				m++;
				n--;
				if (jButton[m][n].getIcon() == null)
					jButton[m][n].setBackground(Color.CYAN);
				if (isWhite(m, n)) {
					jButton[m][n].setBackground(Color.CYAN);
					break;
				}
				if (isBlack(m, n))
					break;
			}
		}

		// Knights

		if (jButton[i][j].getIcon() == wn) {
			if (i >= 3 && j >= 2)
				if (!isWhite(i - 2, j - 1))
					jButton[i - 2][j - 1].setBackground(Color.CYAN);
			if (i >= 3 && j <= 7)
				if (!isWhite(i - 2, j + 1))
					jButton[i - 2][j + 1].setBackground(Color.CYAN);
			if (i >= 2 && j >= 3)
				if (!isWhite(i - 1, j - 2))
					jButton[i - 1][j - 2].setBackground(Color.CYAN);
			if (i >= 2 && j <= 6)
				if (!isWhite(i - 1, j + 2))
					jButton[i - 1][j + 2].setBackground(Color.CYAN);
			if (i <= 7 && j >= 3)
				if (!isWhite(i + 1, j - 2))
					jButton[i + 1][j - 2].setBackground(Color.CYAN);
			if (i <= 7 && j <= 6)
				if (!isWhite(i + 1, j + 2))
					jButton[i + 1][j + 2].setBackground(Color.CYAN);
			if (i <= 6 && j >= 2)
				if (!isWhite(i + 2, j - 1))
					jButton[i + 2][j - 1].setBackground(Color.CYAN);
			if (i <= 6 && j <= 7)
				if (!isWhite(i + 2, j + 1))
					jButton[i + 2][j + 1].setBackground(Color.CYAN);
		}
		if (jButton[i][j].getIcon() == bn) {
			if (i >= 3 && j >= 2)
				if (!isBlack(i - 2, j - 1))
					jButton[i - 2][j - 1].setBackground(Color.CYAN);
			if (i >= 3 && j <= 7)
				if (!isBlack(i - 2, j + 1))
					jButton[i - 2][j + 1].setBackground(Color.CYAN);
			if (i >= 2 && j >= 3)
				if (!isBlack(i - 1, j - 2))
					jButton[i - 1][j - 2].setBackground(Color.CYAN);
			if (i >= 2 && j <= 6)
				if (!isBlack(i - 1, j + 2))
					jButton[i - 1][j + 2].setBackground(Color.CYAN);
			if (i <= 7 && j >= 3)
				if (!isBlack(i + 1, j - 2))
					jButton[i + 1][j - 2].setBackground(Color.CYAN);
			if (i <= 7 && j <= 6)
				if (!isBlack(i + 1, j + 2))
					jButton[i + 1][j + 2].setBackground(Color.CYAN);
			if (i <= 6 && j >= 2)
				if (!isBlack(i + 2, j - 1))
					jButton[i + 2][j - 1].setBackground(Color.CYAN);
			if (i <= 6 && j <= 7)
				if (!isBlack(i + 2, j + 1))
					jButton[i + 2][j + 1].setBackground(Color.CYAN);
		}

		// King

		if (jButton[i][j].getIcon() == wk) {
			if (i >= 2)
				if (!isWhite(i - 1, j) && jButton[i - 1][j].getBackground() != Color.RED)
					jButton[i - 1][j].setBackground(Color.CYAN);
			if (i >= 2 && j <= 7)
				if (!isWhite(i - 1, j + 1) && jButton[i - 1][j + 1].getBackground() != Color.RED)
					jButton[i - 1][j + 1].setBackground(Color.CYAN);
			if (j <= 7)
				if (!isWhite(i, j + 1) && jButton[i][j + 1].getBackground() != Color.RED)
					jButton[i][j + 1].setBackground(Color.CYAN);
			if (i <= 7 && j <= 7)
				if (!isWhite(i + 1, j + 1) && jButton[i + 1][j + 1].getBackground() != Color.RED)
					jButton[i + 1][j + 1].setBackground(Color.CYAN);
			if (i <= 7)
				if (!isWhite(i + 1, j) && jButton[i + 1][j].getBackground() != Color.RED)
					jButton[i + 1][j].setBackground(Color.CYAN);
			if (i <= 7 && j >= 2)
				if (!isWhite(i + 1, j - 1) && jButton[i + 1][j - 1].getBackground() != Color.RED)
					jButton[i + 1][j - 1].setBackground(Color.CYAN);
			if (j >= 2)
				if (!isWhite(i, j - 1) && jButton[i][j - 1].getBackground() != Color.RED)
					jButton[i][j - 1].setBackground(Color.CYAN);
			if (i >= 2 && j >= 2)
				if (!isWhite(i - 1, j - 1) && jButton[i - 1][j - 1].getBackground() != Color.RED)
					jButton[i - 1][j - 1].setBackground(Color.CYAN);
			if (wkI == 8 && wkJ == 5)
				if (countWhiteKing == 0)
					if (lwrI == 8 && lwrJ == 1)
						if (lwrCount == 0)
							if (jButton[8][2].getIcon() == null && jButton[8][3].getIcon() == null
									&& jButton[8][4].getIcon() == null) {
								jButton[8][1].setBackground(Color.ORANGE);
								jButton[8][3].setBackground(Color.CYAN);
							}
			if (wkI == 8 && wkJ == 5)
				if (countWhiteKing == 0)
					if (rwrI == 8 && rwrJ == 8)
						if (rwrCount == 0)
							if (jButton[8][6].getIcon() == null && jButton[8][7].getIcon() == null) {
								jButton[8][8].setBackground(Color.ORANGE);
								jButton[8][7].setBackground(Color.CYAN);
							}
		}
		if (jButton[i][j].getIcon() == bk) {
			if (i >= 2)
				if (!isBlack(i - 1, j) && jButton[i - 1][j].getBackground() != Color.RED)
					jButton[i - 1][j].setBackground(Color.CYAN);
			if (i >= 2 && j <= 7)
				if (!isBlack(i - 1, j + 1) && jButton[i - 1][j + 1].getBackground() != Color.RED)
					jButton[i - 1][j + 1].setBackground(Color.CYAN);
			if (j <= 7)
				if (!isBlack(i, j + 1) && jButton[i][j + 1].getBackground() != Color.RED)
					jButton[i][j + 1].setBackground(Color.CYAN);
			if (i <= 7 && j <= 7)
				if (!isBlack(i + 1, j + 1) && jButton[i + 1][j + 1].getBackground() != Color.RED)
					jButton[i + 1][j + 1].setBackground(Color.CYAN);
			if (i <= 7)
				if (!isBlack(i + 1, j) && jButton[i + 1][j].getBackground() != Color.RED)
					jButton[i + 1][j].setBackground(Color.CYAN);
			if (i <= 7 && j >= 2)
				if (!isBlack(i + 1, j - 1) && jButton[i + 1][j - 1].getBackground() != Color.RED)
					jButton[i + 1][j - 1].setBackground(Color.CYAN);
			if (j >= 2)
				if (!isBlack(i, j - 1) && jButton[i][j - 1].getBackground() != Color.RED)
					jButton[i][j - 1].setBackground(Color.CYAN);
			if (i >= 2 && j >= 2)
				if (!isBlack(i - 1, j - 1) && jButton[i - 1][j - 1].getBackground() != Color.RED)
					jButton[i - 1][j - 1].setBackground(Color.CYAN);
			if (bkI == 1 && bkJ == 5)
				if (countBlackKing == 0)
					if (lbrI == 1 && lbrJ == 1)
						if (lbrCount == 0)
							if (jButton[1][2].getIcon() == null && jButton[1][3].getIcon() == null
									&& jButton[1][4].getIcon() == null) {
								jButton[1][1].setBackground(Color.ORANGE);
								jButton[1][3].setBackground(Color.CYAN);
							}
			if (bkI == 1 && bkJ == 5)
				if (countBlackKing == 0)
					if (rbrI == 1 && rbrJ == 8)
						if (rbrCount == 0)
							if (jButton[1][6].getIcon() == null && jButton[1][7].getIcon() == null) {
								jButton[1][8].setBackground(Color.ORANGE);
								jButton[1][7].setBackground(Color.CYAN);
							}
		}
		enableCYAN();
	}

	public void everyButton2(JButton btn, int i, int j) {
		tempButton2I = i;
		tempButton2J = j;
		if (tempButton.getIcon() == wk) {
			wkI = i;
			wkJ = j;
			countWhiteKing++;
		}
		if (tempButton.getIcon() == bk) {
			bkI = i;
			bkJ = j;
			countBlackKing++;
		}
		if (tempButton.getIcon() == wr && tempButtonI == 8 && tempButtonJ == 1) {
			lwrI = i;
			lwrJ = j;
			lwrCount++;
		}
		if (tempButton.getIcon() == wr && tempButtonI == 8 && tempButtonJ == 8) {
			rwrI = i;
			rwrJ = j;
			rwrCount++;
		}
		if (tempButton.getIcon() == br && tempButtonI == 1 && tempButtonJ == 1) {
			lbrI = i;
			lbrJ = j;
			lbrCount++;
		}
		if (tempButton.getIcon() == br && tempButtonI == 1 && tempButtonJ == 8) {
			rbrI = i;
			rbrJ = j;
			rbrCount++;
		}
		if (jButton[i][j].getBackground() == Color.CYAN) { // go to possible blocks
			if (jButton[i][j].getIcon() != null) { // for showing loses pieces
				if (isBlack(i, j)) {
					for (int n = 1; n <= 16; n++)
						if (jButtonBlack[n].getIcon() == null) {
							jButtonBlack[n].setIcon(jButton[i][j].getIcon());
							break;
						}
				} else {
					for (int n = 1; n <= 16; n++)
						if (jButtonWhite[n].getIcon() == null) {
							jButtonWhite[n].setIcon(jButton[i][j].getIcon());
							break;
						}
				}
				if (jButton[i][j].getIcon() == bk) {
					dispose();
					tt.dispose();
					JOptionPane.showMessageDialog(null, "The White Wins   :) ", "Congratulations!  ",
							JOptionPane.INFORMATION_MESSAGE);
				}
				if (jButton[i][j].getIcon() == wk) {
					dispose();
					tt.dispose();
					JOptionPane.showMessageDialog(null, "The Black Wins   :) ", "Congratulations!  ",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			if (tempButton.getIcon() == wp && i == 1) {
				Menu menu = new Menu();
				menu.button.setEnabled(false);
				menu.button_1.setEnabled(false);
				menu.button_2.setEnabled(false);
				menu.button_3.setEnabled(false);
				menu.setModal(true);
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);

				if (menu.temp == 4)
					jButton[i][j].setIcon(wq);
				if (menu.temp == 5)
					jButton[i][j].setIcon(wr);
				if (menu.temp == 6)
					jButton[i][j].setIcon(wb);
				if (menu.temp == 7)
					jButton[i][j].setIcon(wn);
				tempButton.setIcon(null);
			} else if (tempButton.getIcon() == bp && i == 8) {
				Menu menu = new Menu();
				menu.button_4.setEnabled(false);
				menu.button_5.setEnabled(false);
				menu.button_6.setEnabled(false);
				menu.button_7.setEnabled(false);
				menu.setModal(true);
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);

				if (menu.temp == 0)
					jButton[i][j].setIcon(bq);
				if (menu.temp == 1)
					jButton[i][j].setIcon(br);
				if (menu.temp == 2)
					jButton[i][j].setIcon(bb);
				if (menu.temp == 3)
					jButton[i][j].setIcon(bn);
				tempButton.setIcon(null);
			} else {
				jButton[i][j].setIcon(tempButton.getIcon());
				tempButton.setIcon(null);
			}
			// baraye halat rokh alaye bar jabejayi khode mohre entekhabi, rook ham jabeja
			// beshe
			if (countWhiteKing == 1 && i == 8 && j == 3) {
				jButton[8][4].setIcon(wr);
				jButton[8][1].setIcon(null);
			}
			if (countWhiteKing == 1 && i == 8 && j == 7) {
				jButton[8][6].setIcon(wr);
				jButton[8][8].setIcon(null);
			}
			if (countBlackKing == 1 && i == 1 && j == 3) {
				jButton[1][4].setIcon(br);
				jButton[1][1].setIcon(null);
			}
			if (countBlackKing == 1 && i == 1 && j == 7) {
				jButton[1][6].setIcon(br);
				jButton[1][8].setIcon(null);
			}
			resetButtonsColor();
			isKingInDanger();
			disablePiecesInKingDanger();
		}
	}

	public void disablePiecesInKingDanger() {
		int i, j;
		int m;
		int n;

		if (isAnyRED())
			for (int a = 1; a <= 8; a++)
				for (int b = 1; b <= 8; b++) {
					if (jButton[a][b].getIcon() != wk && jButton[a][b].getIcon() != bk)
						jButton[a][b].setEnabled(false);
				}
		if (isAnyRED() && turn == false) {// dar mogheyiat kish va nobat sefid
			for (i = 1; i <= 8; i++)
				for (j = 1; j <= 8; j++)
					if (isWhite(i, j)) {

						// Pawns

						if (jButton[i][j].getIcon() == wp) {
							if (i == 7) {
								if (jButton[i - 1][j].getIcon() == null
										&& jButton[i - 1][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									if (jButton[i - 2][j].getIcon() == null
											&& jButton[i - 2][j].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
								}
								if (j == 1 && isBlack(6, 2) && jButton[6][2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (j >= 2 && j <= 7) {
									if (isBlack(i - 1, j - 1) && jButton[i - 1][j - 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
									if (isBlack(i - 1, j + 1) && jButton[i - 1][j + 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
								}
								if (j == 8 && isBlack(6, 7) && jButton[6][7].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							}
							if (i <= 6 && i >= 2) {
								if (jButton[i - 1][j].getIcon() == null
										&& jButton[i - 1][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (j == 1 && isBlack(i - 1, j + 1)
										&& jButton[i - 1][j + 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (j >= 2 && j <= 7) {
									if (isBlack(i - 1, j - 1) && jButton[i - 1][j - 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
									if (isBlack(i - 1, j + 1) && jButton[i - 1][j + 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
								}
								if (j == 8 && isBlack(i - 1, j - 1)
										&& jButton[i - 1][j - 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							}
						}

						// Rooks

						if (jButton[i][j].getIcon() == wr) {
							m = i;
							while (m <= 7) {
								m++;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, j))
									break;
							}
							m = i;
							while (m >= 2) {
								m--;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, j))
									break;
							}
							m = j;
							while (m <= 7) {
								m++;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(i, m))
									break;
							}
							m = j;
							while (m >= 2) {
								m--;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(i, m))
									break;
							}
						}

						// Queen

						if (jButton[i][j].getIcon() == wq) {
							m = i;
							while (m <= 7) {
								m++;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, j))
									break;
							}
							m = i;
							while (m >= 2) {
								m--;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, j))
									break;
							}
							m = j;
							while (m <= 7) {
								m++;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(i, m))
									break;
							}
							m = j;
							while (m >= 2) {
								m--;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(i, m))
									break;
							}

							// Orib

							m = i;
							n = j;
							while (m <= 7 && n <= 7) {
								m++;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n <= 7) {
								m--;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n >= 2) {
								m--;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
							m = i;
							n = j;
							while (m <= 7 && n >= 2) {
								m++;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
						}

						// Bishops

						if (jButton[i][j].getIcon() == wb) {
							m = i;
							n = j;
							while (m <= 7 && n <= 7) {
								m++;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n <= 7) {
								m--;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n >= 2) {
								m--;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
							m = i;
							n = j;
							while (m <= 7 && n >= 2) {
								m++;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isBlack(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isWhite(m, n))
									break;
							}
						}

						// Knights

						if (jButton[i][j].getIcon() == wn) {
							if (i >= 3 && j >= 2)
								if (!isWhite(i - 2, j - 1) && jButton[i - 2][j - 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i >= 3 && j <= 7)
								if (!isWhite(i - 2, j + 1) && jButton[i - 2][j + 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i >= 2 && j >= 3)
								if (!isWhite(i - 1, j - 2) && jButton[i - 1][j - 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i >= 2 && j <= 6)
								if (!isWhite(i - 1, j + 2) && jButton[i - 1][j + 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 7 && j >= 3)
								if (!isWhite(i + 1, j - 2) && jButton[i + 1][j - 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 7 && j <= 6)
								if (!isWhite(i + 1, j + 2) && jButton[i + 1][j + 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 6 && j >= 2)
								if (!isWhite(i + 2, j - 1) && jButton[i + 2][j - 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 6 && j <= 7)
								if (!isWhite(i + 2, j + 1) && jButton[i + 2][j + 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
						}
					}
		}
		if (isAnyRED() && turn == true) {// dar mogheyiat kish va nobat siah(meshki)
			for (i = 1; i <= 8; i++)
				for (j = 1; j <= 8; j++)
					if (isBlack(i, j)) {

						// Pawns

						if (jButton[i][j].getIcon() == bp) {
							if (i == 2) {
								if (jButton[i + 1][j].getIcon() == null
										&& jButton[i + 1][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									if (jButton[i + 2][j].getIcon() == null
											&& jButton[i + 2][j].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
								}
								if (j == 1 && isWhite(3, 2) && jButton[3][2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (j >= 2 && j <= 7) {
									if (isWhite(i + 1, j - 1) && jButton[i + 1][j - 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
									if (isWhite(i + 1, j + 1) && jButton[i + 1][j + 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
								}
								if (j == 8 && isWhite(3, 7) && jButton[3][7].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							}
							if (i <= 7 && i >= 3) {
								if (jButton[i + 1][j].getIcon() == null
										&& jButton[i + 1][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (j == 1 && isWhite(i + 1, j + 1)
										&& jButton[i + 1][j + 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (j >= 2 && j <= 7) {
									if (isWhite(i + 1, j - 1) && jButton[i + 1][j - 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
									if (isWhite(i + 1, j + 1) && jButton[i + 1][j + 1].getBackground() == Color.RED)
										jButton[i][j].setEnabled(true);
								}
								if (j == 8 && isWhite(i + 1, j - 1)
										&& jButton[i + 1][j - 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							}
						}

						// Rooks

						if (jButton[i][j].getIcon() == br) {
							m = i;
							while (m <= 7) {
								m++;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, j))
									break;
							}
							m = i;
							while (m >= 2) {
								m--;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, j))
									break;
							}
							m = j;
							while (m <= 7) {
								m++;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(i, m))
									break;
							}
							m = j;
							while (m >= 2) {
								m--;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(i, m))
									break;
							}
						}

						// Queen

						if (jButton[i][j].getIcon() == bq) {
							m = i;
							while (m <= 7) {
								m++;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, j))
									break;
							}
							m = i;
							while (m >= 2) {
								m--;
								if (jButton[m][j].getIcon() == null && jButton[m][j].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, j) && jButton[m][j].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, j))
									break;
							}
							m = j;
							while (m <= 7) {
								m++;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(i, m))
									break;
							}
							m = j;
							while (m >= 2) {
								m--;
								if (jButton[i][m].getIcon() == null && jButton[i][m].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(i, m) && jButton[i][m].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(i, m))
									break;
							}

							// Orib

							m = i;
							n = j;
							while (m <= 7 && n <= 7) {
								m++;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n <= 7) {
								m--;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n >= 2) {
								m--;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
							m = i;
							n = j;
							while (m <= 7 && n >= 2) {
								m++;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
						}

						// Bishops

						if (jButton[i][j].getIcon() == bb) {
							m = i;
							n = j;
							while (m <= 7 && n <= 7) {
								m++;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n <= 7) {
								m--;
								n++;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
							m = i;
							n = j;
							while (m >= 2 && n >= 2) {
								m--;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
							m = i;
							n = j;
							while (m <= 7 && n >= 2) {
								m++;
								n--;
								if (jButton[m][n].getIcon() == null && jButton[m][n].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
								if (isWhite(m, n) && jButton[m][n].getBackground() == Color.RED) {
									jButton[i][j].setEnabled(true);
									break;
								}
								if (isBlack(m, n))
									break;
							}
						}

						// Knights

						if (jButton[i][j].getIcon() == bn) {
							if (i >= 3 && j >= 2)
								if (!isBlack(i - 2, j - 1) && jButton[i - 2][j - 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i >= 3 && j <= 7)
								if (!isBlack(i - 2, j + 1) && jButton[i - 2][j + 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i >= 2 && j >= 3)
								if (!isBlack(i - 1, j - 2) && jButton[i - 1][j - 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i >= 2 && j <= 6)
								if (!isBlack(i - 1, j + 2) && jButton[i - 1][j + 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 7 && j >= 3)
								if (!isBlack(i + 1, j - 2) && jButton[i + 1][j - 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 7 && j <= 6)
								if (!isBlack(i + 1, j + 2) && jButton[i + 1][j + 2].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 6 && j >= 2)
								if (!isBlack(i + 2, j - 1) && jButton[i + 2][j - 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
							if (i <= 6 && j <= 7)
								if (!isBlack(i + 2, j + 1) && jButton[i + 2][j + 1].getBackground() == Color.RED)
									jButton[i][j].setEnabled(true);
						}
					}
		}
	}

	public boolean isBlack(int i, int j) {
		if (jButton[i][j].getIcon() == bk || jButton[i][j].getIcon() == bq || jButton[i][j].getIcon() == br
				|| jButton[i][j].getIcon() == bn || jButton[i][j].getIcon() == bp || jButton[i][j].getIcon() == bb)
			return true;
		return false;
	}

	public boolean isWhite(int i, int j) {
		if (jButton[i][j].getIcon() == wk || jButton[i][j].getIcon() == wq || jButton[i][j].getIcon() == wr
				|| jButton[i][j].getIcon() == wn || jButton[i][j].getIcon() == wp || jButton[i][j].getIcon() == wb)
			return true;
		return false;
	}

	public void disableNonCYAN() {
		for (int i = 1; i <= 8; i++)
			for (int j = 1; j <= 8; j++)
				if (jButton[i][j].getBackground() != Color.CYAN)
					jButton[i][j].setEnabled(false);
	}

	public boolean isAnyCYAN() {
		for (int i = 1; i <= 8; i++)
			for (int j = 1; j <= 8; j++)
				if (jButton[i][j].getBackground() == Color.CYAN)
					return true;
		return false;
	}

	public void mixEveryButton(JButton btn, int i, int j) {
		if (isAnyCYAN()) {
			everyButton2(btn, i, j);
		} else {
			everyButton(btn, i, j);
		}
	}

	public void enableCYAN() {
		for (int i = 1; i <= 8; i++)
			for (int j = 1; j <= 8; j++)
				if (jButton[i][j].getBackground() == Color.CYAN)
					jButton[i][j].setEnabled(true);
	}

	public void eraseOrange(int i, int j) {
		resetButtonsColorNotRED();
		jButton[i][j].setBackground(Color.ORANGE);
	}

	public void accessBtnBlack() {
		jButtonBlack[1] = button_64;
		jButtonBlack[2] = button_65;
		jButtonBlack[3] = button_66;
		jButtonBlack[4] = button_67;
		jButtonBlack[5] = button_68;
		jButtonBlack[6] = button_69;
		jButtonBlack[7] = button_70;
		jButtonBlack[8] = button_71;
		jButtonBlack[9] = button_72;
		jButtonBlack[10] = button_73;
		jButtonBlack[11] = button_74;
		jButtonBlack[12] = button_75;
		jButtonBlack[13] = button_76;
		jButtonBlack[14] = button_77;
		jButtonBlack[15] = button_78;
		jButtonBlack[16] = button_79;
	}

	public void accessBtnWhite() {
		jButtonWhite[1] = button_80;
		jButtonWhite[2] = button_81;
		jButtonWhite[3] = button_82;
		jButtonWhite[4] = button_83;
		jButtonWhite[5] = button_84;
		jButtonWhite[6] = button_85;
		jButtonWhite[7] = button_86;
		jButtonWhite[8] = button_87;
		jButtonWhite[9] = button_88;
		jButtonWhite[10] = button_89;
		jButtonWhite[11] = button_90;
		jButtonWhite[12] = button_91;
		jButtonWhite[13] = button_92;
		jButtonWhite[14] = button_93;
		jButtonWhite[15] = button_94;
		jButtonWhite[16] = button_95;
	}

	public void isKingInDanger() {
		if (turn == false) { // White turn
			int m;
			int n;

			// Pawns

			if (jButton[tempButton2I][tempButton2J].getIcon() == bp) {
				if (tempButton2I == 2) {
					if (jButton[tempButton2I + 1][tempButton2J].getIcon() == null) {
						jButton[tempButton2I + 1][tempButton2J].setBackground(Color.CYAN);
						if (jButton[tempButton2I + 2][tempButton2J].getIcon() == null)
							jButton[tempButton2I + 2][tempButton2J].setBackground(Color.CYAN);
					}
					if (tempButton2J == 1 && isWhite(3, 2))
						jButton[3][2].setBackground(Color.CYAN);
					if (tempButton2J >= 2 && tempButton2J <= 7) {
						if (isWhite(tempButton2I + 1, tempButton2J - 1))
							jButton[tempButton2I + 1][tempButton2J - 1].setBackground(Color.CYAN);
						if (isWhite(tempButton2I + 1, tempButton2J + 1))
							jButton[tempButton2I + 1][tempButton2J + 1].setBackground(Color.CYAN);
					}
					if (tempButton2J == 8 && isWhite(3, 7))
						jButton[3][7].setBackground(Color.CYAN);
					disableNonCYAN();
				}
				if (tempButton2I <= 7 && tempButton2I >= 3) {
					if (jButton[tempButton2I + 1][tempButton2J].getIcon() == null)
						jButton[tempButton2I + 1][tempButton2J].setBackground(Color.CYAN);
					if (tempButton2J == 1 && isWhite(tempButton2I + 1, tempButton2J + 1))
						jButton[tempButton2I + 1][tempButton2J + 1].setBackground(Color.CYAN);
					if (tempButton2J >= 2 && tempButton2J <= 7) {
						if (isWhite(tempButton2I + 1, tempButton2J - 1))
							jButton[tempButton2I + 1][tempButton2J - 1].setBackground(Color.CYAN);
						if (isWhite(tempButton2I + 1, tempButton2J + 1))
							jButton[tempButton2I + 1][tempButton2J + 1].setBackground(Color.CYAN);
					}
					if (tempButton2J == 8 && isWhite(tempButton2I + 1, tempButton2J - 1))
						jButton[tempButton2I + 1][tempButton2J - 1].setBackground(Color.CYAN);
				}
			}

			// Rooks

			if (jButton[tempButton2I][tempButton2J].getIcon() == br) {
				m = tempButton2I;
				while (m <= 7) {
					m++;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isWhite(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, tempButton2J))
						break;
				}
				m = tempButton2I;
				while (m >= 2) {
					m--;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isWhite(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, tempButton2J))
						break;
				}
				m = tempButton2J;
				while (m <= 7) {
					m++;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isWhite(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(tempButton2I, m))
						break;
				}
				m = tempButton2J;
				while (m >= 2) {
					m--;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isWhite(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(tempButton2I, m))
						break;
				}
			}

			// Queen

			if (jButton[tempButton2I][tempButton2J].getIcon() == bq) {
				m = tempButton2I;
				while (m <= 7) {
					m++;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isWhite(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, tempButton2J))
						break;
				}
				m = tempButton2I;
				while (m >= 2) {
					m--;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isWhite(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, tempButton2J))
						break;
				}
				m = tempButton2J;
				while (m <= 7) {
					m++;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isWhite(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(tempButton2I, m))
						break;
				}
				m = tempButton2J;
				while (m >= 2) {
					m--;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isWhite(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(tempButton2I, m))
						break;
				}

				// Orib

				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n <= 7) {
					m++;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n <= 7) {
					m--;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n >= 2) {
					m--;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n >= 2) {
					m++;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
			}

			// Bishops

			if (jButton[tempButton2I][tempButton2J].getIcon() == bb) {
				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n <= 7) {
					m++;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n <= 7) {
					m--;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n >= 2) {
					m--;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n >= 2) {
					m++;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isWhite(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isBlack(m, n))
						break;
				}
			}

			// Knights

			if (jButton[tempButton2I][tempButton2J].getIcon() == bn) {
				if (tempButton2I >= 3 && tempButton2J >= 2)
					if (!isBlack(tempButton2I - 2, tempButton2J - 1))
						jButton[tempButton2I - 2][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2I >= 3 && tempButton2J <= 7)
					if (!isBlack(tempButton2I - 2, tempButton2J + 1))
						jButton[tempButton2I - 2][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J >= 3)
					if (!isBlack(tempButton2I - 1, tempButton2J - 2))
						jButton[tempButton2I - 1][tempButton2J - 2].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J <= 6)
					if (!isBlack(tempButton2I - 1, tempButton2J + 2))
						jButton[tempButton2I - 1][tempButton2J + 2].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J >= 3)
					if (!isBlack(tempButton2I + 1, tempButton2J - 2))
						jButton[tempButton2I + 1][tempButton2J - 2].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J <= 6)
					if (!isBlack(tempButton2I + 1, tempButton2J + 2))
						jButton[tempButton2I + 1][tempButton2J + 2].setBackground(Color.CYAN);
				if (tempButton2I <= 6 && tempButton2J >= 2)
					if (!isBlack(tempButton2I + 2, tempButton2J - 1))
						jButton[tempButton2I + 2][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2I <= 6 && tempButton2J <= 7)
					if (!isBlack(tempButton2I + 2, tempButton2J + 1))
						jButton[tempButton2I + 2][tempButton2J + 1].setBackground(Color.CYAN);
			}

			// King

			if (jButton[tempButton2I][tempButton2J].getIcon() == bk) {
				if (tempButton2I >= 2)
					if (!isBlack(tempButton2I - 1, tempButton2J))
						jButton[tempButton2I - 1][tempButton2J].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J <= 7)
					if (!isBlack(tempButton2I - 1, tempButton2J + 1))
						jButton[tempButton2I - 1][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2J <= 7)
					if (!isBlack(tempButton2I, tempButton2J + 1))
						jButton[tempButton2I][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J <= 7)
					if (!isBlack(tempButton2I + 1, tempButton2J + 1))
						jButton[tempButton2I + 1][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2I <= 7)
					if (!isBlack(tempButton2I + 1, tempButton2J))
						jButton[tempButton2I + 1][tempButton2J].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J >= 2)
					if (!isBlack(tempButton2I + 1, tempButton2J - 1))
						jButton[tempButton2I + 1][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2J >= 2)
					if (!isBlack(tempButton2I, tempButton2J - 1))
						jButton[tempButton2I][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J >= 2)
					if (!isBlack(tempButton2I - 1, tempButton2J - 1))
						jButton[tempButton2I - 1][tempButton2J - 1].setBackground(Color.CYAN);
			}
			enableCYAN();
			int counter = 0;
			int i, j, a, b;
			outer: for (a = 1; a <= 8; a++)
				for (b = 1; b <= 8; b++)
					if (jButton[a][b].getBackground() == Color.CYAN)
						if (jButton[a][b].getIcon() == wk) {
							counter++;
							resetButtonsColor_0();
							jButton[a][b].setBackground(Color.RED);
							jButton[tempButton2I][tempButton2J].setBackground(Color.RED);
							if (a == tempButton2I) {
								if (b < tempButton2J)
									for (i = b; i < tempButton2J; i++)
										jButton[a][i].setBackground(Color.RED);
								if (b > tempButton2J)
									for (i = tempButton2J; i < b; i++)
										jButton[a][i].setBackground(Color.RED);
							} else if (b == tempButton2J) {
								if (a < tempButton2I)
									for (i = a; i < tempButton2I; i++)
										jButton[i][b].setBackground(Color.RED);
								if (a > tempButton2I)
									for (i = tempButton2I; i < a; i++)
										jButton[i][b].setBackground(Color.RED);
							} else {
								if (a > tempButton2I && b < tempButton2J) {
									for (i = a; i > tempButton2I; i--)
										for (j = b; j < tempButton2J; j++)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
								if (a < tempButton2I && b < tempButton2J) {
									for (i = a; i < tempButton2I; i++)
										for (j = b; j < tempButton2J; j++)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
								if (a < tempButton2I && b > tempButton2J) {
									for (i = a; i < tempButton2I; i++)
										for (j = b; j > tempButton2J; j--)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
								if (a > tempButton2I && b > tempButton2J) {
									for (i = a; i > tempButton2I; i--)
										for (j = b; j > tempButton2J; j--)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
							}
							break outer;
						}
			if (counter == 0)
				resetButtonsColor_0();
			if (isAnyRED()) {

			}
		}
		if (turn == true) { // Black turn
			int m;
			int n;

			// Pawns

			if (jButton[tempButton2I][tempButton2J].getIcon() == wp) {
				if (tempButton2I == 7) {
					if (jButton[tempButton2I - 1][tempButton2J].getIcon() == null) {
						jButton[tempButton2I - 1][tempButton2J].setBackground(Color.CYAN);
						if (jButton[tempButton2I - 2][tempButton2J].getIcon() == null)
							jButton[tempButton2I - 2][tempButton2J].setBackground(Color.CYAN);
					}
					if (tempButton2J == 1 && isBlack(6, 2))
						jButton[6][2].setBackground(Color.CYAN);
					if (tempButton2J >= 2 && tempButton2J <= 7) {
						if (isBlack(tempButton2I - 1, tempButton2J - 1))
							jButton[tempButton2I - 1][tempButton2J - 1].setBackground(Color.CYAN);
						if (isBlack(tempButton2I - 1, tempButton2J + 1))
							jButton[tempButton2I - 1][tempButton2J + 1].setBackground(Color.CYAN);
					}
					if (tempButton2J == 8 && isBlack(6, 7))
						jButton[6][7].setBackground(Color.CYAN);
					disableNonCYAN();
				}
				if (tempButton2I <= 6 && tempButton2I >= 2) {
					if (jButton[tempButton2I - 1][tempButton2J].getIcon() == null)
						jButton[tempButton2I - 1][tempButton2J].setBackground(Color.CYAN);
					if (tempButton2J == 1 && isBlack(tempButton2I - 1, tempButton2J + 1))
						jButton[tempButton2I - 1][tempButton2J + 1].setBackground(Color.CYAN);
					if (tempButton2J >= 2 && tempButton2J <= 7) {
						if (isBlack(tempButton2I - 1, tempButton2J - 1))
							jButton[tempButton2I - 1][tempButton2J - 1].setBackground(Color.CYAN);
						if (isBlack(tempButton2I - 1, tempButton2J + 1))
							jButton[tempButton2I - 1][tempButton2J + 1].setBackground(Color.CYAN);
					}
					if (tempButton2J == 8 && isBlack(tempButton2I - 1, tempButton2J - 1))
						jButton[tempButton2I - 1][tempButton2J - 1].setBackground(Color.CYAN);
				}
			}

			// Rooks

			if (jButton[tempButton2I][tempButton2J].getIcon() == wr) {
				m = tempButton2I;
				while (m <= 7) {
					m++;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isBlack(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, tempButton2J))
						break;
				}
				m = tempButton2I;
				while (m >= 2) {
					m--;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isBlack(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, tempButton2J))
						break;
				}
				m = tempButton2J;
				while (m <= 7) {
					m++;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isBlack(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(tempButton2I, m))
						break;
				}
				m = tempButton2J;
				while (m >= 2) {
					m--;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isBlack(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(tempButton2I, m))
						break;
				}
			}

			// Queen

			if (jButton[tempButton2I][tempButton2J].getIcon() == wq) {
				m = tempButton2I;
				while (m <= 7) {
					m++;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isBlack(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, tempButton2J))
						break;
				}
				m = tempButton2I;
				while (m >= 2) {
					m--;
					if (jButton[m][tempButton2J].getIcon() == null)
						jButton[m][tempButton2J].setBackground(Color.CYAN);
					if (isBlack(m, tempButton2J)) {
						jButton[m][tempButton2J].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, tempButton2J))
						break;
				}
				m = tempButton2J;
				while (m <= 7) {
					m++;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isBlack(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(tempButton2I, m))
						break;
				}
				m = tempButton2J;
				while (m >= 2) {
					m--;
					if (jButton[tempButton2I][m].getIcon() == null)
						jButton[tempButton2I][m].setBackground(Color.CYAN);
					if (isBlack(tempButton2I, m)) {
						jButton[tempButton2I][m].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(tempButton2I, m))
						break;
				}

				// Orib

				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n <= 7) {
					m++;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n <= 7) {
					m--;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n >= 2) {
					m--;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n >= 2) {
					m++;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
			}

			// Bishops

			if (jButton[tempButton2I][tempButton2J].getIcon() == wb) {
				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n <= 7) {
					m++;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n <= 7) {
					m--;
					n++;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m >= 2 && n >= 2) {
					m--;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
				m = tempButton2I;
				n = tempButton2J;
				while (m <= 7 && n >= 2) {
					m++;
					n--;
					if (jButton[m][n].getIcon() == null)
						jButton[m][n].setBackground(Color.CYAN);
					if (isBlack(m, n)) {
						jButton[m][n].setBackground(Color.CYAN);
						break;
					}
					if (isWhite(m, n))
						break;
				}
			}

			// Knights

			if (jButton[tempButton2I][tempButton2J].getIcon() == wn) {
				if (tempButton2I >= 3 && tempButton2J >= 2)
					if (!isWhite(tempButton2I - 2, tempButton2J - 1))
						jButton[tempButton2I - 2][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2I >= 3 && tempButton2J <= 7)
					if (!isWhite(tempButton2I - 2, tempButton2J + 1))
						jButton[tempButton2I - 2][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J >= 3)
					if (!isWhite(tempButton2I - 1, tempButton2J - 2))
						jButton[tempButton2I - 1][tempButton2J - 2].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J <= 6)
					if (!isWhite(tempButton2I - 1, tempButton2J + 2))
						jButton[tempButton2I - 1][tempButton2J + 2].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J >= 3)
					if (!isWhite(tempButton2I + 1, tempButton2J - 2))
						jButton[tempButton2I + 1][tempButton2J - 2].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J <= 6)
					if (!isWhite(tempButton2I + 1, tempButton2J + 2))
						jButton[tempButton2I + 1][tempButton2J + 2].setBackground(Color.CYAN);
				if (tempButton2I <= 6 && tempButton2J >= 2)
					if (!isWhite(tempButton2I + 2, tempButton2J - 1))
						jButton[tempButton2I + 2][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2I <= 6 && tempButton2J <= 7)
					if (!isWhite(tempButton2I + 2, tempButton2J + 1))
						jButton[tempButton2I + 2][tempButton2J + 1].setBackground(Color.CYAN);
			}

			// King

			if (jButton[tempButton2I][tempButton2J].getIcon() == wk) {
				if (tempButton2I >= 2)
					if (!isWhite(tempButton2I - 1, tempButton2J))
						jButton[tempButton2I - 1][tempButton2J].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J <= 7)
					if (!isWhite(tempButton2I - 1, tempButton2J + 1))
						jButton[tempButton2I - 1][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2J <= 7)
					if (!isWhite(tempButton2I, tempButton2J + 1))
						jButton[tempButton2I][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J <= 7)
					if (!isWhite(tempButton2I + 1, tempButton2J + 1))
						jButton[tempButton2I + 1][tempButton2J + 1].setBackground(Color.CYAN);
				if (tempButton2I <= 7)
					if (!isWhite(tempButton2I + 1, tempButton2J))
						jButton[tempButton2I + 1][tempButton2J].setBackground(Color.CYAN);
				if (tempButton2I <= 7 && tempButton2J >= 2)
					if (!isWhite(tempButton2I + 1, tempButton2J - 1))
						jButton[tempButton2I + 1][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2J >= 2)
					if (!isWhite(tempButton2I, tempButton2J - 1))
						jButton[tempButton2I][tempButton2J - 1].setBackground(Color.CYAN);
				if (tempButton2I >= 2 && tempButton2J >= 2)
					if (!isWhite(tempButton2I - 1, tempButton2J - 1))
						jButton[tempButton2I - 1][tempButton2J - 1].setBackground(Color.CYAN);
			}
			enableCYAN();
			int counter2 = 0;
			int i, j, a, b;
			outer: for (a = 1; a <= 8; a++)
				for (b = 1; b <= 8; b++)
					if (jButton[a][b].getBackground() == Color.CYAN)
						if (jButton[a][b].getIcon() == bk) {
							counter2++;
							resetButtonsColor_0();
							jButton[a][b].setBackground(Color.RED);
							jButton[tempButton2I][tempButton2J].setBackground(Color.RED);
							if (a == tempButton2I) {
								if (b < tempButton2J)
									for (i = b; i < tempButton2J; i++)
										jButton[a][i].setBackground(Color.RED);
								if (b > tempButton2J)
									for (i = tempButton2J; i < b; i++)
										jButton[a][i].setBackground(Color.RED);
							} else if (b == tempButton2J) {
								if (a < tempButton2I)
									for (i = a; i < tempButton2I; i++)
										jButton[i][b].setBackground(Color.RED);
								if (a > tempButton2I)
									for (i = tempButton2I; i < a; i++)
										jButton[i][b].setBackground(Color.RED);
							} else {
								if (a > tempButton2I && b < tempButton2J) {
									for (i = a; i > tempButton2I; i--)
										for (j = b; j < tempButton2J; j++)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
								if (a < tempButton2I && b < tempButton2J) {
									for (i = a; i < tempButton2I; i++)
										for (j = b; j < tempButton2J; j++)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
								if (a < tempButton2I && b > tempButton2J) {
									for (i = a; i < tempButton2I; i++)
										for (j = b; j > tempButton2J; j--)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
								if (a > tempButton2I && b > tempButton2J) {
									for (i = a; i > tempButton2I; i--)
										for (j = b; j > tempButton2J; j--)
											if (Math.abs(a - i) == Math.abs(b - j))
												jButton[i][j].setBackground(Color.RED);
								}
							}
							break outer;
						}
			if (counter2 == 0)
				resetButtonsColor_0();
		}
	}

	public boolean isAnyRED() {
		for (int i = 1; i <= 8; i++)
			for (int j = 1; j <= 8; j++)
				if (jButton[i][j].getBackground() == Color.RED)
					return true;
		return false;
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 908, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button, 1, 1);
			}
		});
		button.setBounds(53, 50, 55, 55);
		contentPane.add(button);
		button.setBackground(Color.WHITE);

		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_1, 1, 2);
			}
		});
		button_1.setBounds(106, 50, 55, 55);
		contentPane.add(button_1);
		button_1.setBackground(Color.LIGHT_GRAY);

		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_2, 1, 3);
			}
		});
		button_2.setBounds(159, 50, 55, 55);
		contentPane.add(button_2);
		button_2.setBackground(Color.WHITE);

		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_3, 1, 4);
			}
		});
		button_3.setBounds(212, 50, 55, 55);
		contentPane.add(button_3);
		button_3.setBackground(Color.LIGHT_GRAY);

		button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_4, 1, 5);
			}
		});
		button_4.setBounds(265, 50, 55, 55);
		contentPane.add(button_4);
		button_4.setBackground(Color.WHITE);

		button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_5, 1, 6);
			}
		});
		button_5.setBounds(317, 50, 55, 55);
		contentPane.add(button_5);
		button_5.setBackground(Color.LIGHT_GRAY);

		button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_6, 1, 7);
			}
		});
		button_6.setBounds(370, 50, 55, 55);
		contentPane.add(button_6);
		button_6.setBackground(Color.WHITE);

		button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_7, 1, 8);
			}
		});
		button_7.setBounds(422, 50, 55, 55);
		contentPane.add(button_7);
		button_7.setBackground(Color.LIGHT_GRAY);

		button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_8, 2, 1);
			}
		});
		button_8.setBounds(53, 103, 55, 55);
		contentPane.add(button_8);
		button_8.setBackground(Color.LIGHT_GRAY);

		button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_9, 2, 2);
			}
		});
		button_9.setBounds(106, 103, 55, 55);
		contentPane.add(button_9);
		button_9.setBackground(Color.WHITE);

		button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_10, 2, 3);
			}
		});
		button_10.setBounds(159, 103, 55, 55);
		contentPane.add(button_10);
		button_10.setBackground(Color.LIGHT_GRAY);

		button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_11, 2, 4);
			}
		});
		button_11.setBounds(212, 103, 55, 55);
		contentPane.add(button_11);
		button_11.setBackground(Color.WHITE);

		button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_12, 2, 5);
			}
		});
		button_12.setBounds(265, 103, 55, 55);
		contentPane.add(button_12);
		button_12.setBackground(Color.LIGHT_GRAY);

		button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_13, 2, 6);
			}
		});
		button_13.setBounds(317, 103, 55, 55);
		contentPane.add(button_13);
		button_13.setBackground(Color.WHITE);

		button_14 = new JButton("");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_14, 2, 7);
			}
		});
		button_14.setBounds(370, 103, 55, 55);
		contentPane.add(button_14);
		button_14.setBackground(Color.LIGHT_GRAY);

		button_15 = new JButton("");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_15, 2, 8);
			}
		});
		button_15.setBounds(422, 103, 55, 55);
		contentPane.add(button_15);
		button_15.setBackground(Color.WHITE);

		button_16 = new JButton("");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_16, 3, 1);
			}
		});
		button_16.setBounds(53, 156, 55, 55);
		contentPane.add(button_16);
		button_16.setBackground(Color.WHITE);

		button_17 = new JButton("");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_17, 3, 2);
			}
		});
		button_17.setBounds(106, 156, 55, 55);
		contentPane.add(button_17);
		button_17.setBackground(Color.LIGHT_GRAY);

		button_18 = new JButton("");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_18, 3, 3);
			}
		});
		button_18.setBounds(159, 156, 55, 55);
		contentPane.add(button_18);
		button_18.setBackground(Color.WHITE);

		button_19 = new JButton("");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_19, 3, 4);
			}
		});
		button_19.setBounds(212, 156, 55, 55);
		contentPane.add(button_19);
		button_19.setBackground(Color.LIGHT_GRAY);

		button_20 = new JButton("");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_20, 3, 5);
			}
		});
		button_20.setBounds(265, 156, 55, 55);
		contentPane.add(button_20);
		button_20.setBackground(Color.WHITE);

		button_21 = new JButton("");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_21, 3, 6);
			}
		});
		button_21.setBounds(317, 156, 55, 55);
		contentPane.add(button_21);
		button_21.setBackground(Color.LIGHT_GRAY);

		button_22 = new JButton("");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_22, 3, 7);
			}
		});
		button_22.setBounds(370, 156, 55, 55);
		contentPane.add(button_22);
		button_22.setBackground(Color.WHITE);

		button_23 = new JButton("");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_23, 3, 8);
			}
		});
		button_23.setBounds(422, 156, 55, 55);
		contentPane.add(button_23);
		button_23.setBackground(Color.LIGHT_GRAY);

		button_24 = new JButton("");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_24, 4, 1);
			}
		});
		button_24.setBounds(53, 209, 55, 55);
		contentPane.add(button_24);
		button_24.setBackground(Color.LIGHT_GRAY);

		button_25 = new JButton("");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_25, 4, 2);
			}
		});
		button_25.setBounds(106, 209, 55, 55);
		contentPane.add(button_25);
		button_25.setBackground(Color.WHITE);

		button_26 = new JButton("");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_26, 4, 3);
			}
		});
		button_26.setBounds(159, 209, 55, 55);
		contentPane.add(button_26);
		button_26.setBackground(Color.LIGHT_GRAY);

		button_27 = new JButton("");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_27, 4, 4);
			}
		});
		button_27.setBounds(212, 209, 55, 55);
		contentPane.add(button_27);
		button_27.setBackground(Color.WHITE);

		button_28 = new JButton("");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_28, 4, 5);
			}
		});
		button_28.setBounds(265, 209, 55, 55);
		contentPane.add(button_28);
		button_28.setBackground(Color.LIGHT_GRAY);

		button_29 = new JButton("");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_29, 4, 6);
			}
		});
		button_29.setBounds(317, 209, 55, 55);
		contentPane.add(button_29);
		button_29.setBackground(Color.WHITE);

		button_30 = new JButton("");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_30, 4, 7);
			}
		});
		button_30.setBounds(370, 209, 55, 55);
		contentPane.add(button_30);
		button_30.setBackground(Color.LIGHT_GRAY);

		button_31 = new JButton("");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_31, 4, 8);
			}
		});
		button_31.setBounds(422, 209, 55, 55);
		contentPane.add(button_31);
		button_31.setBackground(Color.WHITE);

		button_32 = new JButton("");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_32, 5, 1);
			}
		});
		button_32.setBounds(53, 262, 55, 55);
		contentPane.add(button_32);
		button_32.setBackground(Color.WHITE);

		button_33 = new JButton("");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_33, 5, 2);
			}
		});
		button_33.setBounds(106, 262, 55, 55);
		contentPane.add(button_33);
		button_33.setBackground(Color.LIGHT_GRAY);

		button_34 = new JButton("");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_34, 5, 3);
			}
		});
		button_34.setBounds(159, 262, 55, 55);
		contentPane.add(button_34);
		button_34.setBackground(Color.WHITE);

		button_35 = new JButton("");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_35, 5, 4);
			}
		});
		button_35.setBounds(212, 262, 55, 55);
		contentPane.add(button_35);
		button_35.setBackground(Color.LIGHT_GRAY);

		button_36 = new JButton("");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_36, 5, 5);
			}
		});
		button_36.setBounds(265, 262, 55, 55);
		contentPane.add(button_36);
		button_36.setBackground(Color.WHITE);

		button_37 = new JButton("");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_37, 5, 6);
			}
		});
		button_37.setBounds(317, 262, 55, 55);
		contentPane.add(button_37);
		button_37.setBackground(Color.LIGHT_GRAY);

		button_38 = new JButton("");
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_38, 5, 7);
			}
		});
		button_38.setBounds(370, 262, 55, 55);
		contentPane.add(button_38);
		button_38.setBackground(Color.WHITE);

		button_39 = new JButton("");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_39, 5, 8);
			}
		});
		button_39.setBounds(422, 262, 55, 55);
		contentPane.add(button_39);
		button_39.setBackground(Color.LIGHT_GRAY);

		button_40 = new JButton("");
		button_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_40, 6, 1);
			}
		});
		button_40.setBounds(53, 315, 55, 55);
		contentPane.add(button_40);
		button_40.setBackground(Color.LIGHT_GRAY);

		button_41 = new JButton("");
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_41, 6, 2);
			}
		});
		button_41.setBounds(106, 315, 55, 55);
		contentPane.add(button_41);
		button_41.setBackground(Color.WHITE);

		button_42 = new JButton("");
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_42, 6, 3);
			}
		});
		button_42.setBounds(159, 315, 55, 55);
		contentPane.add(button_42);
		button_42.setBackground(Color.LIGHT_GRAY);

		button_43 = new JButton("");
		button_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_43, 6, 4);
			}
		});
		button_43.setBounds(212, 315, 55, 55);
		contentPane.add(button_43);
		button_43.setBackground(Color.WHITE);

		button_44 = new JButton("");
		button_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_44, 6, 5);
			}
		});
		button_44.setBounds(265, 315, 55, 55);
		contentPane.add(button_44);
		button_44.setBackground(Color.LIGHT_GRAY);

		button_45 = new JButton("");
		button_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_45, 6, 6);
			}
		});
		button_45.setBounds(317, 315, 55, 55);
		contentPane.add(button_45);
		button_45.setBackground(Color.WHITE);

		button_46 = new JButton("");
		button_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_46, 6, 7);
			}
		});
		button_46.setBounds(370, 315, 55, 55);
		contentPane.add(button_46);
		button_46.setBackground(Color.LIGHT_GRAY);

		button_47 = new JButton("");
		button_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_47, 6, 8);
			}
		});
		button_47.setBounds(422, 315, 55, 55);
		contentPane.add(button_47);
		button_47.setBackground(Color.WHITE);

		button_48 = new JButton("");
		button_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_48, 7, 1);
			}
		});
		button_48.setBounds(53, 368, 55, 55);
		contentPane.add(button_48);
		button_48.setBackground(Color.WHITE);

		button_49 = new JButton("");
		button_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_49, 7, 2);
			}
		});
		button_49.setBounds(106, 368, 55, 55);
		contentPane.add(button_49);
		button_49.setBackground(Color.LIGHT_GRAY);

		button_50 = new JButton("");
		button_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_50, 7, 3);
			}
		});
		button_50.setBounds(159, 368, 55, 55);
		contentPane.add(button_50);
		button_50.setBackground(Color.WHITE);

		button_51 = new JButton("");
		button_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_51, 7, 4);
			}
		});
		button_51.setBounds(212, 368, 55, 55);
		contentPane.add(button_51);
		button_51.setBackground(Color.LIGHT_GRAY);

		button_52 = new JButton("");
		button_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_52, 7, 5);
			}
		});
		button_52.setBounds(265, 368, 55, 55);
		contentPane.add(button_52);
		button_52.setBackground(Color.WHITE);

		button_53 = new JButton("");
		button_53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_53, 7, 6);
			}
		});
		button_53.setBounds(317, 368, 55, 55);
		contentPane.add(button_53);
		button_53.setBackground(Color.LIGHT_GRAY);

		button_54 = new JButton("");
		button_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_54, 7, 7);
			}
		});
		button_54.setBounds(370, 368, 55, 55);
		contentPane.add(button_54);
		button_54.setBackground(Color.WHITE);

		button_55 = new JButton("");
		button_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_55, 7, 8);
			}
		});
		button_55.setBounds(422, 368, 55, 55);
		contentPane.add(button_55);
		button_55.setBackground(Color.LIGHT_GRAY);

		button_56 = new JButton("");
		button_56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_56, 8, 1);
			}
		});
		button_56.setBounds(53, 421, 55, 55);
		contentPane.add(button_56);
		button_56.setBackground(Color.LIGHT_GRAY);

		button_57 = new JButton("");
		button_57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_57, 8, 2);
			}
		});
		button_57.setBounds(106, 421, 55, 55);
		contentPane.add(button_57);
		button_57.setBackground(Color.WHITE);

		button_58 = new JButton("");
		button_58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_58, 8, 3);
			}
		});
		button_58.setBounds(159, 421, 55, 55);
		contentPane.add(button_58);
		button_58.setBackground(Color.LIGHT_GRAY);

		button_59 = new JButton("");
		button_59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_59, 8, 4);
			}
		});
		button_59.setBounds(212, 421, 55, 55);
		contentPane.add(button_59);
		button_59.setBackground(Color.WHITE);

		button_60 = new JButton("");
		button_60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_60, 8, 5);
			}
		});
		button_60.setBounds(265, 421, 55, 55);
		contentPane.add(button_60);
		button_60.setBackground(Color.LIGHT_GRAY);

		button_61 = new JButton("");
		button_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_61, 8, 6);
			}
		});
		button_61.setBounds(317, 421, 55, 55);
		contentPane.add(button_61);
		button_61.setBackground(Color.WHITE);

		button_62 = new JButton("");
		button_62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_62, 8, 7);
			}
		});
		button_62.setBounds(370, 421, 55, 55);
		contentPane.add(button_62);
		button_62.setBackground(Color.LIGHT_GRAY);

		button_63 = new JButton("");
		button_63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mixEveryButton(button_63, 8, 8);
			}
		});
		button_63.setBounds(422, 421, 55, 55);
		contentPane.add(button_63);
		button_63.setBackground(Color.WHITE);

		startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accessBtn();
				accessBtnBlack();
				accessBtnWhite();
				for (int i = 1; i <= 8; i++) {
					jButton[2][i].setIcon(bp);
				}
				for (int i = 1; i <= 8; i++) {
					jButton[7][i].setIcon(wp);
				}
				jButton[1][1].setIcon(br);
				jButton[1][8].setIcon(br);
				jButton[8][1].setIcon(wr);
				jButton[8][8].setIcon(wr);
				jButton[1][2].setIcon(bn);
				jButton[1][7].setIcon(bn);
				jButton[8][2].setIcon(wn);
				jButton[8][7].setIcon(wn);
				jButton[1][3].setIcon(bb);
				jButton[1][6].setIcon(bb);
				jButton[8][3].setIcon(wb);
				jButton[8][6].setIcon(wb);
				jButton[1][4].setIcon(bq);
				jButton[1][5].setIcon(bk);
				jButton[8][4].setIcon(wq);
				jButton[8][5].setIcon(wk);
				checkTurn();

			}
		});
		startButton.setFont(new Font("Gadugi", Font.BOLD, 16));
		startButton.setForeground(new Color(0, 128, 0));
		startButton.setBounds(185, 518, 152, 35);
		contentPane.add(startButton);

		quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		quitButton.setForeground(Color.RED);
		quitButton.setFont(new Font("Gadugi", Font.BOLD, 16));
		quitButton.setBounds(185, 555, 152, 35);
		contentPane.add(quitButton);

		titleLabel = new JLabel("Chess");
		titleLabel.setFont(new Font("Gadugi", Font.BOLD, 34));
		titleLabel.setBounds(629, 28, 94, 35);
		contentPane.add(titleLabel);

		turnLabel_0 = new JLabel("Turn:");
		turnLabel_0.setFont(new Font("Gadugi", Font.BOLD, 18));
		turnLabel_0.setBounds(595, 92, 55, 25);
		contentPane.add(turnLabel_0);

		turnLabel = new JLabel("Turn");
		turnLabel.setFont(new Font("Gadugi", Font.BOLD, 18));
		turnLabel.setBounds(650, 84, 104, 40);
		contentPane.add(turnLabel);

		button_64 = new JButton("");
		button_64.setBackground(Color.WHITE);
		button_64.setBounds(522, 209, 55, 55);
		contentPane.add(button_64);

		button_65 = new JButton("");
		button_65.setBackground(Color.LIGHT_GRAY);
		button_65.setBounds(576, 209, 55, 55);
		contentPane.add(button_65);

		button_66 = new JButton("");
		button_66.setBackground(Color.WHITE);
		button_66.setBounds(629, 209, 55, 55);
		contentPane.add(button_66);

		button_67 = new JButton("");
		button_67.setBackground(Color.LIGHT_GRAY);
		button_67.setBounds(682, 209, 55, 55);
		contentPane.add(button_67);

		button_68 = new JButton("");
		button_68.setBackground(Color.WHITE);
		button_68.setBounds(736, 209, 55, 55);
		contentPane.add(button_68);

		button_69 = new JButton("");
		button_69.setBackground(Color.LIGHT_GRAY);
		button_69.setBounds(788, 209, 55, 55);
		contentPane.add(button_69);

		button_70 = new JButton("");
		button_70.setBackground(Color.LIGHT_GRAY);
		button_70.setBounds(522, 262, 55, 55);
		contentPane.add(button_70);

		button_71 = new JButton("");
		button_71.setBackground(Color.WHITE);
		button_71.setBounds(576, 262, 55, 55);
		contentPane.add(button_71);

		button_72 = new JButton("");
		button_72.setBackground(Color.LIGHT_GRAY);
		button_72.setBounds(629, 262, 55, 55);
		contentPane.add(button_72);

		button_73 = new JButton("");
		button_73.setBackground(Color.WHITE);
		button_73.setBounds(682, 262, 55, 55);
		contentPane.add(button_73);

		button_74 = new JButton("");
		button_74.setBackground(Color.LIGHT_GRAY);
		button_74.setBounds(736, 262, 55, 55);
		contentPane.add(button_74);

		button_75 = new JButton("");
		button_75.setBackground(Color.WHITE);
		button_75.setBounds(788, 262, 55, 55);
		contentPane.add(button_75);

		button_76 = new JButton("");
		button_76.setBackground(Color.LIGHT_GRAY);
		button_76.setBounds(576, 315, 55, 55);
		contentPane.add(button_76);

		button_77 = new JButton("");
		button_77.setBackground(Color.WHITE);
		button_77.setBounds(629, 315, 55, 55);
		contentPane.add(button_77);

		button_78 = new JButton("");
		button_78.setBackground(Color.LIGHT_GRAY);
		button_78.setBounds(682, 315, 55, 55);
		contentPane.add(button_78);

		button_79 = new JButton("");
		button_79.setBackground(Color.WHITE);
		button_79.setBounds(736, 315, 55, 55);
		contentPane.add(button_79);

		blackLabel = new JLabel("Black Lost Pieces");
		blackLabel.setFont(new Font("Gadugi", Font.BOLD, 16));
		blackLabel.setBounds(617, 169, 137, 29);
		contentPane.add(blackLabel);

		whiteLabel = new JLabel("White Lost Pieces");
		whiteLabel.setForeground(Color.BLUE);
		whiteLabel.setFont(new Font("Gadugi", Font.BOLD, 16));
		whiteLabel.setBounds(617, 407, 137, 29);
		contentPane.add(whiteLabel);

		button_80 = new JButton("");
		button_80.setBackground(Color.WHITE);
		button_80.setBounds(522, 447, 55, 55);
		contentPane.add(button_80);

		button_81 = new JButton("");
		button_81.setBackground(Color.LIGHT_GRAY);
		button_81.setBounds(576, 447, 55, 55);
		contentPane.add(button_81);

		button_82 = new JButton("");
		button_82.setBackground(Color.WHITE);
		button_82.setBounds(629, 447, 55, 55);
		contentPane.add(button_82);

		button_83 = new JButton("");
		button_83.setBackground(Color.LIGHT_GRAY);
		button_83.setBounds(682, 447, 55, 55);
		contentPane.add(button_83);

		button_84 = new JButton("");
		button_84.setBackground(Color.WHITE);
		button_84.setBounds(736, 447, 55, 55);
		contentPane.add(button_84);

		button_85 = new JButton("");
		button_85.setBackground(Color.LIGHT_GRAY);
		button_85.setBounds(788, 447, 55, 55);
		contentPane.add(button_85);

		button_86 = new JButton("");
		button_86.setBackground(Color.LIGHT_GRAY);
		button_86.setBounds(522, 498, 55, 55);
		contentPane.add(button_86);

		button_87 = new JButton("");
		button_87.setBackground(Color.WHITE);
		button_87.setBounds(576, 498, 55, 55);
		contentPane.add(button_87);

		button_88 = new JButton("");
		button_88.setBackground(Color.LIGHT_GRAY);
		button_88.setBounds(629, 498, 55, 55);
		contentPane.add(button_88);

		button_89 = new JButton("");
		button_89.setBackground(Color.WHITE);
		button_89.setBounds(682, 498, 55, 55);
		contentPane.add(button_89);

		button_90 = new JButton("");
		button_90.setBackground(Color.LIGHT_GRAY);
		button_90.setBounds(736, 498, 55, 55);
		contentPane.add(button_90);

		button_91 = new JButton("");
		button_91.setBackground(Color.WHITE);
		button_91.setBounds(788, 498, 55, 55);
		contentPane.add(button_91);

		button_92 = new JButton("");
		button_92.setBackground(Color.LIGHT_GRAY);
		button_92.setBounds(576, 551, 55, 55);
		contentPane.add(button_92);

		button_93 = new JButton("");
		button_93.setBackground(Color.WHITE);
		button_93.setBounds(629, 551, 55, 55);
		contentPane.add(button_93);

		button_94 = new JButton("");
		button_94.setBackground(Color.LIGHT_GRAY);
		button_94.setBounds(682, 551, 55, 55);
		contentPane.add(button_94);

		button_95 = new JButton("");
		button_95.setBackground(Color.WHITE);
		button_95.setBounds(736, 551, 55, 55);
		contentPane.add(button_95);

	}
}
