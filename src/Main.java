import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import java.awt.Font;

import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;

import java.util.*;
import java.util.stream.*;

public class Main extends JFrame {

	private static final long serialVersionUID = -6430646048324848364L;
	private static String save;
	// private static Window window;
	private JPanel contentPane;
	private JTextPane text_00;
	private JTextField textField_0;
	private JSpinner spinner_00;
	private JSpinner spinner_01;
	private JSpinner spinner_02;
	private JSpinner spinner_03;
	private JSpinner spinner_04;
	private JSpinner spinner_05;
	private JSpinner spinner_06;
	private JSpinner spinner_07;
	private JSpinner spinner_08;
	private JSpinner spinner_09;
	private JSpinner spinner_10;
	private JSpinner spinner_11;
	private JSpinner spinner_12;
	private JSpinner spinner_13;
	private JSpinner spinner_14;
	private JSpinner spinner_15;
	private JSpinner spinner_16;
	private JSpinner spinner_17;
	private JSpinner spinner_18;
	private JSpinner spinner_19;
	private JSpinner spinner_20;
	private JSpinner spinner_21;
	private JSpinner spinner_22;
	private JSpinner spinner_23;
	private JSpinner spinner_24;
	private JSpinner spinner_25;
	private JSpinner spinner_26;
	private JSpinner spinner_27;
	private JSpinner spinner_28;
	private JSpinner spinner_29;
	private JSpinner spinner_30;
	private JSpinner spinner_31;
	private JSpinner spinner_32;
	private JSpinner spinner_33;
	private JSpinner spinner_34;
	private JSpinner spinner_35;
	private JSpinner spinner_36;
	private JSpinner spinner_37;
	private JSpinner spinner_38;
	private JSpinner spinner_39;
	private JSpinner spinner_40;
	private JSpinner spinner_41;
	private JSpinner spinner_42;
	private JSpinner spinner_43;
	private JSpinner spinner_44;
	private JSpinner spinner_45;
	private JSpinner spinner_46;
	private JSpinner spinner_47;
	private JSpinner spinner_48;
	private JSpinner spinner_49;
	private JTextPane doppelt_0;
	private JTextPane doppelt_1;
	private JTextPane doppelt_2;
	private JToggleButton switch_00;
	private JToggleButton switch_01;
	private JCheckBox checkBox_00;
	private JCheckBox checkBox_01;
	private JCheckBox checkBox_02;
	private JCheckBox checkBox_03;
	private JCheckBox checkBox_05;
	private JCheckBox checkBox_06;
	private JCheckBox checkBox_07;

	private JComboBox<String> fach_00;
	private JComboBox<String> fach_01;
	private JComboBox<String> fach_02;
	private JComboBox<String> fach_03;
	private JComboBox<String> fach_04;
	private JComboBox<String> fach_05;
	private JComboBox<String> fach_06;
	private JComboBox<String> fach_07;
	private JComboBox<String> fach_08;
	private JComboBox<String> fach_09;
	private JComboBox<String> fach_10;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		save = readFile();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		text_00 = new JTextPane();
		text_00.setEditable(false);
		text_00.setForeground(Color.LIGHT_GRAY);
		text_00.setFont(new Font("Arial Black", Font.BOLD, 15));
		text_00.setBackground(Color.DARK_GRAY);
		text_00.setText("ABI Rechner MSS");
		text_00.setBounds(10, 11, 170, 28);
		contentPane.add(text_00);

		doppelt_0 = Factory.Generate_TextPaneDoppelt(contentPane, 60);
		doppelt_1 = Factory.Generate_TextPaneDoppelt(contentPane, 111);
		doppelt_2 = Factory.Generate_TextPaneDoppelt(contentPane, 162);

		// LK1
		spinner_00 = Factory.Generate_GradeSpinner(contentPane, 190, 50);
		spinner_01 = Factory.Generate_GradeSpinner(contentPane, 250, 50);
		spinner_02 = Factory.Generate_GradeSpinner(contentPane, 310, 50);
		spinner_03 = Factory.Generate_GradeSpinner(contentPane, 370, 50);

		// LK2
		spinner_04 = Factory.Generate_GradeSpinner(contentPane, 190, 101);
		spinner_05 = Factory.Generate_GradeSpinner(contentPane, 250, 101);
		spinner_06 = Factory.Generate_GradeSpinner(contentPane, 310, 101);
		spinner_07 = Factory.Generate_GradeSpinner(contentPane, 370, 101);

		// LK3
		spinner_08 = Factory.Generate_GradeSpinner(contentPane, 190, 152);
		spinner_09 = Factory.Generate_GradeSpinner(contentPane, 250, 152);
		spinner_10 = Factory.Generate_GradeSpinner(contentPane, 310, 152);
		spinner_11 = Factory.Generate_GradeSpinner(contentPane, 370, 152);

		// gk1
		spinner_12 = Factory.Generate_GradeSpinner(contentPane, 190, 226);
		spinner_13 = Factory.Generate_GradeSpinner(contentPane, 250, 226);
		spinner_14 = Factory.Generate_GradeSpinner(contentPane, 310, 226);
		spinner_15 = Factory.Generate_GradeSpinner(contentPane, 370, 226);

		// gk2
		spinner_16 = Factory.Generate_GradeSpinner(contentPane, 190, 277);
		spinner_17 = Factory.Generate_GradeSpinner(contentPane, 250, 277);
		spinner_18 = Factory.Generate_GradeSpinner(contentPane, 310, 277);
		spinner_19 = Factory.Generate_GradeSpinner(contentPane, 370, 277);

		// gk3
		spinner_20 = Factory.Generate_GradeSpinner(contentPane, 190, 328);
		spinner_21 = Factory.Generate_GradeSpinner(contentPane, 250, 328);
		spinner_22 = Factory.Generate_GradeSpinner(contentPane, 310, 328);
		spinner_23 = Factory.Generate_GradeSpinner(contentPane, 370, 328);

		// gk4
		spinner_24 = Factory.Generate_GradeSpinner(contentPane, 190, 379);
		spinner_25 = Factory.Generate_GradeSpinner(contentPane, 250, 379);
		spinner_26 = Factory.Generate_GradeSpinner(contentPane, 310, 379);
		spinner_27 = Factory.Generate_GradeSpinner(contentPane, 370, 379);

		// gk5
		spinner_28 = Factory.Generate_GradeSpinner(contentPane, 190, 430);
		spinner_29 = Factory.Generate_GradeSpinner(contentPane, 250, 430);
		spinner_30 = Factory.Generate_GradeSpinner(contentPane, 310, 430);
		spinner_31 = Factory.Generate_GradeSpinner(contentPane, 370, 430);

		// gk6
		spinner_32 = Factory.Generate_GradeSpinner(contentPane, 190, 481);
		spinner_33 = Factory.Generate_GradeSpinner(contentPane, 250, 481);
		spinner_34 = Factory.Generate_GradeSpinner(contentPane, 310, 481);
		spinner_35 = Factory.Generate_GradeSpinner(contentPane, 370, 481);

		// gk7
		spinner_36 = Factory.Generate_GradeSpinner(contentPane, 190, 532);
		spinner_37 = Factory.Generate_GradeSpinner(contentPane, 250, 532);
		spinner_38 = Factory.Generate_GradeSpinner(contentPane, 310, 532);
		spinner_39 = Factory.Generate_GradeSpinner(contentPane, 370, 532);

		// ABI-Arbeiten
		spinner_40 = Factory.Generate_GradeSpinner(contentPane, 523, 50);
		spinner_41 = Factory.Generate_GradeSpinner(contentPane, 523, 101);
		spinner_42 = Factory.Generate_GradeSpinner(contentPane, 523, 152);
		spinner_43 = Factory.Generate_GradeSpinner(contentPane, 523, 226);
		spinner_44 = Factory.Generate_GradeSpinner(contentPane, 523, 277);

		// Facharbeit
		spinner_45 = Factory.Generate_GradeSpinner(contentPane, 654, 101);

		// gk8
		spinner_46 = Factory.Generate_GradeSpinner(contentPane, 190, 583);
		spinner_47 = Factory.Generate_GradeSpinner(contentPane, 250, 583);
		spinner_48 = Factory.Generate_GradeSpinner(contentPane, 310, 583);
		spinner_49 = Factory.Generate_GradeSpinner(contentPane, 370, 583);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(Color.GRAY);
		btnCalculate.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
				calc();
			}
		});
		btnCalculate.setBounds(653, 464, 175, 108);
		btnCalculate.setFocusPainted(false);
		contentPane.add(btnCalculate);

		// 47 //Switch
		switch_00 = new JToggleButton("2.M\u00FCndliches");
		switch_00.setBackground(Color.LIGHT_GRAY);
		switch_00.setFont(new Font("Arial Black", Font.PLAIN, 14));
		switch_00.setSelected(true);
		switch_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkboxChange();
				if (!switch_00.isSelected()) {
					fach_04.setModel(new DefaultComboBoxModel<String>(Factory.Generate_Subjects("gk2")));
				} else {
					fach_04.setModel(new DefaultComboBoxModel<String>(Factory.Generate_Subjects("M\u00FCndlich-2")));
				}
			}
		});
		switch_00.setBounds(583, 277, 150, 40);
		switch_00.setFocusPainted(false);
		switch_00.setToolTipText("Aktivieren wenn ein zweites Pr�fungsfach ben�tigt wird");
		contentPane.add(switch_00);

		switch_01 = new JToggleButton("BLL");
		switch_01.setBackground(Color.LIGHT_GRAY);
		switch_01.setSelected(true);
		switch_01.setFont(new Font("Arial Black", Font.PLAIN, 14));
		switch_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkboxChange();
			}
		});
		switch_01.setBounds(743, 277, 85, 40);
		switch_01.setFocusPainted(false);
		switch_01.setToolTipText("Aktivieren wenn eine Besondere-Lern-Leistung erarbeitet wurde");
		contentPane.add(switch_01);

		// Facharbeit
		checkBox_00 = new JCheckBox("Facharbeit");
		checkBox_00.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox_00.setForeground(Color.LIGHT_GRAY);
		checkBox_00.setBackground(Color.DARK_GRAY);
		checkBox_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxChange();
			}
		});
		checkBox_00.setBounds(710, 110, 100, 23);
		checkBox_00.setFocusPainted(false);
		checkBox_00.setToolTipText("H�ckchen wenn eine Facharbeit mit mindestens 5 Punkten erarbeitet wurde");
		contentPane.add(checkBox_00);

		// Checkboxen
		checkBox_01 = new JCheckBox("Voll");
		checkBox_01.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox_01.setForeground(Color.LIGHT_GRAY);
		checkBox_01.setBackground(Color.DARK_GRAY);
		checkBox_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxChange();
			}
		});
		checkBox_01.setBounds(426, 286, 50, 23);
		checkBox_01.setVisible(false);
		checkBox_01.setFocusPainted(false);
		checkBox_01.setToolTipText("H�ckchen wenn dieser Kurs vollst�ndig eingebracht werden muss");
		contentPane.add(checkBox_01);

		checkBox_02 = new JCheckBox("Voll");
		checkBox_02.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox_02.setForeground(Color.LIGHT_GRAY);
		checkBox_02.setBackground(Color.DARK_GRAY);
		checkBox_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxChange();
			}
		});
		checkBox_02.setBounds(426, 337, 75, 23);
		checkBox_02.setFocusPainted(false);
		checkBox_02.setToolTipText("H�ckchen wenn dieser Kurs vollst�ndig eingebracht werden muss");
		contentPane.add(checkBox_02);

		checkBox_03 = new JCheckBox("Voll");
		checkBox_03.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox_03.setForeground(Color.LIGHT_GRAY);
		checkBox_03.setBackground(Color.DARK_GRAY);
		checkBox_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxChange();
			}
		});
		checkBox_03.setBounds(426, 388, 75, 23);
		checkBox_03.setFocusPainted(false);
		checkBox_03.setToolTipText("H�ckchen wenn dieser Kurs vollst�ndig eingebracht werden muss");
		contentPane.add(checkBox_03);

		// 3/4
		checkBox_05 = new JCheckBox("Sport");
		checkBox_05.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox_05.setForeground(Color.LIGHT_GRAY);
		checkBox_05.setBackground(Color.DARK_GRAY);
		checkBox_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxChange();
			}
		});
		checkBox_05.setBounds(426, 490, 85, 23);
		checkBox_05.setFocusPainted(false);
		checkBox_05.setToolTipText("H�ckchen wenn an einem Grundkurs Sport teilgenommen wurde (gk6=Sport)");
		contentPane.add(checkBox_05);

		// Halb
		checkBox_06 = new JCheckBox("K\u00FCnst.Fach");
		checkBox_06.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox_06.setForeground(Color.LIGHT_GRAY);
		checkBox_06.setBackground(Color.DARK_GRAY);
		checkBox_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxChange();
			}
		});
		checkBox_06.setBounds(426, 541, 89, 23);
		checkBox_06.setFocusPainted(false);
		checkBox_06.setToolTipText(
				"H�ckchen wenn an einem Grundkurs Kunst, Musik oder darstellendes Spiel teilgenommen wurde (gk7=k�nstl. Fach)");
		contentPane.add(checkBox_06);

		checkBox_07 = new JCheckBox("nur in 12");
		checkBox_07.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox_07.setForeground(Color.LIGHT_GRAY);
		checkBox_07.setBackground(Color.DARK_GRAY);
		checkBox_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxChange();
			}
		});
		checkBox_07.setBounds(426, 592, 75, 23);
		checkBox_07.setFocusPainted(false);
		checkBox_07.setToolTipText("H�ckchen wenn nur in der 12 ein k�nstl. Fach besucht wurde");
		contentPane.add(checkBox_07);

		textField_0 = Factory.Generate_TextField(contentPane, "", 14, Color.LIGHT_GRAY, 653, 396, 175, 58);
		textField_1 = Factory.Generate_TextField(contentPane, "Ben\u00F6tigte Punkte zum Verbessern des Schnitts", 12,
				Color.GRAY, 613, 396, 40, 29);
		textField_2 = Factory.Generate_TextField(contentPane, "\u00DCbersch\u00FCssige Punkte zum halten des Schnitts",
				12, Color.GRAY, 613, 425, 40, 29);

		JButton btnSave = new JButton("Save");
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		btnSave.setBounds(696, 583, 90, 23);
		btnSave.setFocusPainted(false);
		btnSave.setToolTipText("Speichert Noten und F�cher");
		contentPane.add(btnSave);

		fach_00 = Factory.Generate_ComboBoxSubject(contentPane, "LK1", 50);
		fach_01 = Factory.Generate_ComboBoxSubject(contentPane, "LK2", 101);
		fach_02 = Factory.Generate_ComboBoxSubject(contentPane, "LK3", 152);
		fach_03 = Factory.Generate_ComboBoxSubject(contentPane, "M\u00FCndlich-1", 226);
		fach_04 = Factory.Generate_ComboBoxSubject(contentPane, "gk2", 277);
		fach_05 = Factory.Generate_ComboBoxSubject(contentPane, "gk3", 328);
		fach_06 = Factory.Generate_ComboBoxSubject(contentPane, "gk4", 379);
		fach_07 = Factory.Generate_ComboBoxSubject(contentPane, "gk5", 430);
		fach_08 = Factory.Generate_ComboBoxSubject(contentPane, "gk6", 481);
		fach_09 = Factory.Generate_ComboBoxSubject(contentPane, "gk7", 532);
		fach_10 = Factory.Generate_ComboBoxSubject(contentPane, "gk8", 583);

		if (!new File("save.txt").exists()) {
			try {
				String text = "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;5;0;0;0;0;/000000000/0;0;0;0;0;0;0;0;0;0;0;/";
				BufferedWriter writer = new BufferedWriter(new FileWriter("save.txt"));
				writer.write(text);
				writer.close();
			} catch (IOException e) {
				e.getStackTrace();
			}
		}

		load();
		colorReset();
		checkboxChange();
	}

	public void checkboxChange() {
		colorReset();
		// 2 M�ndliches | BLL
		if (switch_00.isSelected() || switch_01.isSelected()) {
			if (switch_00.isSelected()) {
				checkBox_01.setVisible(false);
			} else {
				checkBox_01.setVisible(true);
			}
			spinner_44.setVisible(true);
		} else {
			checkBox_01.setVisible(true);
			spinner_44.setVisible(false);
		}

		if (checkBox_06.isSelected()) {
			checkBox_07.setVisible(true);
		} else {
			spinner_36.setVisible(true);
			spinner_39.setVisible(true);
			// gk 8
			fach_10.setVisible(false);
			// nurIn12
			checkBox_07.setSelected(false);
			checkBox_07.setVisible(false);
		}

		if (checkBox_06.isSelected() && checkBox_07.isSelected()) {
			// Kunst 11|13 weg
			spinner_36.setVisible(false);
			spinner_39.setVisible(false);

			// gk8
			fach_10.setVisible(true);
			spinner_46.setVisible(true);
			spinner_47.setVisible(true);
			spinner_48.setVisible(true);
			spinner_49.setVisible(true);

		} else {
			// Kunst 11|13 weg
			spinner_36.setVisible(true);
			spinner_39.setVisible(true);
			// gk8
			fach_10.setVisible(false);
			spinner_46.setVisible(false);
			spinner_47.setVisible(false);
			spinner_48.setVisible(false);
			spinner_49.setVisible(false);
		}
	}

	public void calc() {

		// Alle m�glichen Kombinationen von Kursen die nicht Eingebracht werden
		ArrayList<Data> data = new ArrayList<Data>();

		data.add(kommbinationBerechnen("null"));
		data.add(kommbinationBerechnen("gk3"));
		data.add(kommbinationBerechnen("gk4"));
		data.add(kommbinationBerechnen("gk5"));
		data.add(kommbinationBerechnen("gk6"));
		data.add(kommbinationBerechnen("gk8"));

		System.out.println(data.get(0).getPunkte() + " null");
		System.out.println(data.get(1).getPunkte() + " gk3");
		System.out.println(data.get(2).getPunkte() + " gk4");
		System.out.println(data.get(3).getPunkte() + " gk5");
		System.out.println(data.get(4).getPunkte() + " gk6");

		// Beste Kombination ermitteln
		Collections.sort(data, new Comparator<Data>() {
			public int compare(Data d1, Data d2) {
				return Integer.valueOf((Integer) d2.getPunkte()).compareTo((Integer) d1.getPunkte());
			}
		});

		Data fin = data.get(0);
		ArrayList<JSpinner> kurse = fin.getKurse();
		int punkteBlock1 = fin.getBlock1();
		int punkteBlock2 = fin.getBlock2();
		int punkte = fin.getPunkte();
		String nEK = fin.getNEK();
		System.out.println("Nicht Einbringen Kurs: " + nEK);
		String schnitt = schnitt(punkte, punkteBlock1, punkteBlock2);

		changeColor(fin, kurse, schnitt);

		// Ausgabe Konsole | Window
		System.out.println("Block1=" + punkteBlock1);
		System.out.println("Block2=" + punkteBlock2);
		System.out.println("Erreichte Punkte=" + punkte);
		System.out.println("ABI-Schnitt=" + schnitt);

		if (punkte == 1) {
			textField_0.setText(" " + punkte + " Punkt | �" + schnitt);
		}
		if (schnitt.charAt(0) == 'F') {
			textField_0.setText(" " + punkte + " Punkte | " + schnitt);
		} else {
			textField_0.setText(" " + punkte + " Punkte | �" + schnitt);
		}

		System.out.println("---------------------------");
	}

	public boolean isABIPruefung(JSpinner s) {
		boolean isABIPruefung = false;
		if (s.equals(spinner_40) || s.equals(spinner_41) || s.equals(spinner_42) || s.equals(spinner_43)
				|| s.equals(spinner_44)) {
			isABIPruefung = true;
		}
		return isABIPruefung;
	}

	public class Data {
		private ArrayList<JSpinner> kurse;
		private int punkte;
		private int block1;
		private int block2;
		private String nEK;

		public Data(ArrayList<JSpinner> k, int p, int b1, int b2, String nEK) {
			this.kurse = k;
			this.punkte = p;
			this.block1 = b1;
			this.block2 = b2;
			this.nEK = nEK;
		}

		public ArrayList<JSpinner> getKurse() {
			return kurse;
		}

		public int getPunkte() {
			return punkte;
		}

		public int getBlock1() {
			return block1;
		}

		public int getBlock2() {
			return block2;
		}

		public String getNEK() {
			return nEK;
		}
	}

	public Data kommbinationBerechnen(String nE) {
		// nE=gk3 | nE=gk4 | nE=gk5 | nE=gk6 | nE=gk8
		// Block1
		ArrayList<JSpinner> kurse = new ArrayList<JSpinner>();
		ArrayList<JSpinner> restKurse = new ArrayList<JSpinner>();
		int anzahlKurse = 35;

		// Leistungskurse
		kurse.add(spinner_00);
		kurse.add(spinner_01);
		kurse.add(spinner_02);
		kurse.add(spinner_03);
		kurse.add(spinner_04);
		kurse.add(spinner_05);
		kurse.add(spinner_06);
		kurse.add(spinner_07);
		kurse.add(spinner_08);
		kurse.add(spinner_09);
		kurse.add(spinner_10);
		kurse.add(spinner_11);
		anzahlKurse = anzahlKurse - 12;

		// M�ndlich_1 | gk1
		kurse.add(spinner_12);
		kurse.add(spinner_13);
		kurse.add(spinner_14);
		kurse.add(spinner_15);
		anzahlKurse = anzahlKurse - 4;

		// M�ndlich_2 | gk2
		if (switch_00.isSelected() || checkBox_01.isSelected()) {
			kurse.add(spinner_16);
			kurse.add(spinner_17);
			kurse.add(spinner_18);
			kurse.add(spinner_19);
			anzahlKurse = anzahlKurse - 4;
		} else {
			restKurse.add(spinner_16);
			restKurse.add(spinner_17);
			restKurse.add(spinner_18);

			kurse.add(spinner_19);
			anzahlKurse--;
		}

		// gk3
		if (checkBox_02.isSelected()) {
			kurse.add(spinner_20);
			kurse.add(spinner_21);
			kurse.add(spinner_22);
			kurse.add(spinner_23);
			anzahlKurse = anzahlKurse - 4;
		} else {
			if (nE != "gk3") {
				restKurse.add(spinner_20);
				restKurse.add(spinner_21);
				restKurse.add(spinner_22);

				kurse.add(spinner_23);
				anzahlKurse--;
			}

		}

		// gk4
		if (checkBox_03.isSelected()) {
			kurse.add(spinner_24);
			kurse.add(spinner_25);
			kurse.add(spinner_26);
			kurse.add(spinner_27);
			anzahlKurse = anzahlKurse - 4;
		} else {
			if (nE != "gk4") {
				restKurse.add(spinner_24);
				restKurse.add(spinner_25);
				restKurse.add(spinner_26);

				kurse.add(spinner_27);
				anzahlKurse--;
			}
		}

		// gk5
		if (nE != "gk5") {
			restKurse.add(spinner_28);
			restKurse.add(spinner_29);
			restKurse.add(spinner_30);

			kurse.add(spinner_31);
			anzahlKurse--;
		}

		// gk6 | Sport
		if (checkBox_05.isSelected() && nE != "gk6") {
			ArrayList<JSpinner> help = new ArrayList<JSpinner>();
			help.add((JSpinner) spinner_32);
			help.add((JSpinner) spinner_33);
			help.add((JSpinner) spinner_34);

			kurse.add(spinner_35);
			anzahlKurse--;

			Collections.sort(help, (a, b) -> (Integer) a.getValue() < (Integer) b.getValue() ? -1
					: a.getValue() == b.getValue() ? 0 : 1);

			restKurse.add(help.get(1));
			restKurse.add(help.get(2));
		}
		if (!checkBox_05.isSelected() && nE != "gk6") {
			restKurse.add(spinner_32);
			restKurse.add(spinner_33);
			restKurse.add(spinner_34);

			kurse.add(spinner_35);
			anzahlKurse--;
		}

		// gk7 | Kunst
		if (!checkBox_06.isSelected() && !checkBox_07.isSelected()) {
			restKurse.add(spinner_36);
			restKurse.add(spinner_37);
			restKurse.add(spinner_38);

			kurse.add(spinner_39);
			anzahlKurse--;
		}
		if (checkBox_06.isSelected() && !checkBox_07.isSelected()) {
			ArrayList<JSpinner> help = new ArrayList<JSpinner>();
			help.add(spinner_36);
			help.add(spinner_37);
			help.add(spinner_38);
			kurse.add(spinner_39);
			anzahlKurse--;

			Collections.sort(help, new Comparator<JSpinner>() {
				public int compare(JSpinner s1, JSpinner s2) {
					return Integer.valueOf((Integer) s2.getValue()).compareTo((Integer) s1.getValue());
				}
			});

			kurse.add(help.get(0));
			anzahlKurse--;

			restKurse.add(help.get(1));
			restKurse.add(help.get(2));

		}
		if (checkBox_06.isSelected() && checkBox_07.isSelected()) {
			// Kunst in 12(1/2)
			kurse.add(spinner_37);
			kurse.add(spinner_38);
			anzahlKurse = anzahlKurse - 2;

			// gk8 | Nur wenn Kunst eingeschoben wurde
			if (nE != "gk8") {
				restKurse.add(spinner_46);
				restKurse.add(spinner_47);
				restKurse.add(spinner_48);

				kurse.add(spinner_49);
				anzahlKurse--;
			}
		}

		// restKurse werden ausgewertet
		restKurse = restKurseBerechnen(restKurse, anzahlKurse);
		for (JSpinner s : restKurse) {
			kurse.add(s);
		}

		// Berechnung
		// BLOCK_1
		// LKs
		int lk1 = 0;
		int lk2 = 0;
		int lk3 = 0;

		lk1 += (Integer) kurse.get(0).getValue();
		lk1 += (Integer) kurse.get(1).getValue();
		lk1 += (Integer) kurse.get(2).getValue();
		lk1 += (Integer) kurse.get(3).getValue();

		lk2 += (Integer) kurse.get(4).getValue();
		lk2 += (Integer) kurse.get(5).getValue();
		lk2 += (Integer) kurse.get(6).getValue();
		lk2 += (Integer) kurse.get(7).getValue();

		lk3 += (Integer) kurse.get(8).getValue();
		lk3 += (Integer) kurse.get(9).getValue();
		lk3 += (Integer) kurse.get(10).getValue();
		lk3 += (Integer) kurse.get(11).getValue();

		ArrayList<JSpinner> helpLK = new ArrayList<JSpinner>();
		for (int i = 0; i < 12; i++) {
			helpLK.add(kurse.get(0));
			kurse.remove(0);
		}

		ArrayList<Integer> lk = new ArrayList<Integer>();
		lk.add(lk1);
		lk.add(lk2);
		lk.add(lk3);
		Collections.sort(lk, Collections.reverseOrder());

		// "2x" anzeigen
		doppelt_0.setVisible(false);
		doppelt_1.setVisible(false);
		doppelt_2.setVisible(false);
		if (lk1 > lk2 || lk1 > lk3) {
			doppelt_0.setVisible(true);
		}
		if (lk2 > lk1 || lk2 > lk3) {
			doppelt_1.setVisible(true);
		}
		if (lk3 > lk1 || lk3 > lk2) {
			doppelt_2.setVisible(true);
		}
		if (lk1 == lk2) {
			doppelt_0.setVisible(true);
		}
		if (lk2 == lk3) {
			doppelt_1.setVisible(true);
		}
		if (lk1 == lk3) {
			doppelt_0.setVisible(true);
		}

		int punkteLKs = ((lk.get(0) + lk.get(1)) * 2) + lk.get(2);

		// GKs
		int punkteGKs = 0;
		for (JSpinner sp : kurse) {
			punkteGKs += (Integer) sp.getValue();
		}
		int punkteBlock1 = 0;
		if (checkBox_00.isSelected()) {
			punkteBlock1 = punkteLKs + punkteGKs + (Integer) spinner_45.getValue();
		} else {
			punkteBlock1 = punkteLKs + punkteGKs;
		}
		double d = punkteBlock1;
		d = d * 40 / 44;
		punkteBlock1 = (int) Math.round(d);

		// BLOCK_2
		int punkteBlock2 = 0;
		if (switch_00.isSelected() || switch_01.isSelected()) {
			punkteBlock2 += (Integer) spinner_40.getValue();
			punkteBlock2 += (Integer) spinner_41.getValue();
			punkteBlock2 += (Integer) spinner_42.getValue();
			punkteBlock2 += (Integer) spinner_43.getValue();
			punkteBlock2 += (Integer) spinner_44.getValue();
			punkteBlock2 = punkteBlock2 * 4;
		} else {
			punkteBlock2 += (Integer) spinner_40.getValue();
			punkteBlock2 += (Integer) spinner_41.getValue();
			punkteBlock2 += (Integer) spinner_42.getValue();
			punkteBlock2 += (Integer) spinner_43.getValue();
			punkteBlock2 = punkteBlock2 * 5;
		}
		Collections.reverse(helpLK);
		for (JSpinner sp : helpLK) {
			kurse.add(0, sp);
		}

		int punkte = punkteBlock1 + punkteBlock2;
		return new Data(kurse, punkte, punkteBlock1, punkteBlock2, nE);
	}

	public ArrayList<JSpinner> restKurseBerechnen(ArrayList<JSpinner> restKurse, int fehlendeKurse) {
		ArrayList<JSpinner> kurse = restKurse;
		Collections.sort(kurse, new Comparator<JSpinner>() {
			public int compare(JSpinner s1, JSpinner s2) {
				return Integer.valueOf((Integer) s2.getValue()).compareTo((Integer) s1.getValue());
			}
		});

		for (int i = kurse.size(); i > fehlendeKurse; i--) {
			kurse.remove(kurse.size() - 1);
		}
		return kurse;
	}

	public String schnitt(int p, int b1, int b2) {
		String out = "";
		double count = 0.0;
		int zahl = 300;
		int help = 18;
		int pUnten = help - 1;
		int pOben = 1;
		if (b1 >= 200 && b2 >= 100) {
			if (p == 400) {
				out = "4.0";
			} else {
				while (zahl < p) {
					if (help == 18) {
						help = 0;
						count++;
					}
					help++;
					zahl++;
				}
				pUnten = help - 1;
				pOben = 1;

				while (help != 18) {
					pOben++;
					help++;
				}
				textField_1.setText(" " + Character.toString((char) 0x2191) + pOben);
				textField_2.setText(" " + Character.toString((char) 0x2193) + pUnten);
				count = count * 0.1;
				count = 4.0 - count;
				count = count * 100;
				count = Math.round(count);
				count = count / 100;
				out = Double.toString(count);
			}
		} else {
			out = "FAIL";
		}

		return new String(out);
	}

	public void changeColor(Data dat, ArrayList<JSpinner> kurse, String schnitt) {
		colorReset();
		// Farbliche Markierung der Kurse
		for (Component c : contentPane.getComponents()) {
			if (c instanceof JSpinner && ((kurse.contains(((JSpinner) c))) || isABIPruefung((JSpinner) c))) {
				((JSpinner) c).getEditor().getComponent(0).setBackground(Color.decode("#339900"));
			} else {
				// Wenn nicht ABIPr�fung -> rot
				if (c instanceof JSpinner && !isABIPruefung((JSpinner) c)) {
					((JSpinner) c).getEditor().getComponent(0).setBackground(Color.decode("#9b111e"));
					((JSpinner) c).getEditor().getComponent(0).setForeground(Color.LIGHT_GRAY);
				}
			}
		}
		if (checkBox_00.isSelected()) {
			spinner_45.getEditor().getComponent(0).setBackground(Color.decode("#339900"));
			spinner_45.getEditor().getComponent(0).setForeground(UIManager.getColor("textText"));
		} else {
			spinner_45.getEditor().getComponent(0).setBackground(Color.decode("#9b111e"));
			spinner_45.getEditor().getComponent(0).setForeground(Color.LIGHT_GRAY);
		}
		if (schnitt.charAt(0) == 'F') {
			textField_0.setBackground(Color.decode("#000000"));
			textField_0.setForeground(Color.LIGHT_GRAY);
		}
		if (schnitt.charAt(0) == '4') {
			textField_0.setBackground(Color.decode("#9b111e"));
			textField_0.setForeground(Color.LIGHT_GRAY);
		}
		if (schnitt.charAt(0) == '3') {
			textField_0.setBackground(Color.decode("#FFBF00"));
			textField_0.setForeground(UIManager.getColor("textText"));
		}
		if (schnitt.charAt(0) == '2') {
			textField_0.setBackground(Color.decode("#339900"));
			textField_0.setForeground(UIManager.getColor("textText"));
		}
		if (schnitt.charAt(0) == '1' || schnitt.charAt(0) == '0') {
			textField_0.setBackground(Color.decode("#00BFFF"));
			textField_0.setForeground(UIManager.getColor("textText"));
		}
	}

	public void colorReset() {
		// Reset der Spinner Hintergrund-Farben
		for (Component c : contentPane.getComponents()) {
			if (c instanceof JSpinner) {
				((JSpinner) c).getEditor().getComponent(0).setBackground(Color.gray);
				((JSpinner) c).getEditor().getComponent(0).setForeground(UIManager.getColor("textText"));
			}
		}
	}

	private void load() {
		ArrayList<Integer> spinner = new ArrayList<Integer>();
		ArrayList<Integer> check = new ArrayList<Integer>();
		ArrayList<Integer> faecher = new ArrayList<Integer>();

		// Werte der Spinner werden erfasst
		while (save.charAt(0) != '/') {
			String zahl = "";
			while (save.charAt(0) != ';') {
				zahl = zahl + save.charAt(0);
				save = save.substring(1);
			}
			spinner.add(Integer.parseInt(zahl));
			save = save.substring(1);
		}
		save = save.substring(1);

		// Werte der Switch/Checkboxen werden erfasst
		while (save.charAt(0) != '/') {
			if (save.charAt(0) == '0') {
				check.add(0);
			} else {
				check.add(1);
			}
			save = save.substring(1);
		}
		save = save.substring(1);

		// Namen der F�cher werden erfasst
		while (save.charAt(0) != '/') {
			String fach = "";
			while (save.charAt(0) != ';') {
				fach += save.charAt(0);
				save = save.substring(1);
			}
			faecher.add(Integer.parseInt(fach));
			save = save.substring(1);
		}

		// Werte der Datei werden f�r Componets gesetzt
		int tb = 0;
		for (Component c : contentPane.getComponents()) {

			// Spinner werden gesetzt
			if (c instanceof JSpinner) {
				((JSpinner) c).setValue(spinner.get(0));
				spinner.remove(0);
			}

			// Switch wird gesetzt
			if (c instanceof JToggleButton && tb < 2) {
				if (check.get(0) == 1 && !((JToggleButton) c).isSelected()) {
					((JToggleButton) c).doClick();
				}
				if (check.get(0) == 0 && ((JToggleButton) c).isSelected()) {
					((JToggleButton) c).doClick();
				}
				check.remove(0);
				tb++;
			}

			// Check Boxen werden gesetzt
			if (c instanceof JCheckBox) {
				if (check.get(0) == 1) {
					((JCheckBox) c).setSelected(true);
				} else {
					((JCheckBox) c).setSelected(false);
				}
				check.remove(0);
			}

			// ComboBoxen Fach werden gesetzt
			if (c instanceof JComboBox) {
				((JComboBox<?>) c).setSelectedIndex(faecher.get(0));
				faecher.remove(0);
			}
		}
	}

	private void save() {
		String spinner = "";
		String check = "";
		String fach = "";
		for (Component c : contentPane.getComponents()) {
			boolean set = false;

			// Spinner
			if (c instanceof JSpinner) {
				spinner += ((JSpinner) c).getValue() + ";";
				set = true;
			}
			// ToggleButton
			if (c instanceof JToggleButton && set == false) {

				if (((JToggleButton) c).isSelected()) {
					check += "1";
				} else {
					check += "0";
				}
				set = true;
			}
			// Checkboxen
			if (c instanceof JCheckBox && set == false) {
				if (((JCheckBox) c).isSelected()) {
					check += "1";
				} else {
					check += "0";
				}
				set = true;
			}
			// F�cher
			if (c instanceof JComboBox && set == false) {
				fach += ((JComboBox<?>) c).getSelectedIndex() + ";";
			}
		}
		String text = spinner + "/" + check + "/" + fach + "/";
		System.out.println(text);
		System.out.println("-------------------------------------------");
		try {
			Files.delete(Paths.get("save.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("save.txt"));
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	private static String readFile() {
		StringBuilder contentBuilder = new StringBuilder();
		try (Stream<String> stream = Files.lines(Paths.get("save.txt"), StandardCharsets.UTF_8)) {
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contentBuilder.toString();
	}
}