import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.AbstractButton;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.Color;

public class Factory {

    public static JSpinner Generate_GradeSpinner(JPanel contentPane, int x, int y) {
        JSpinner spinner = new JSpinner();
        spinner.setModel(new SpinnerNumberModel(0, 0, 15, 1));
        spinner.setFont(new Font("Arial Black", Font.PLAIN, 11));
        spinner.setBounds(x, y, 50, 40);
        contentPane.add(spinner);
        return spinner;
    }

    public static JTextPane Generate_TextPaneDoppelt(JPanel contentPane, int y) {
        JTextPane textPane = new JTextPane();
        textPane.setFont(new Font("Arial Black", Font.BOLD, 13));
        textPane.setBackground(Color.DARK_GRAY);
        textPane.setText("2x");
        textPane.setForeground(Color.lightGray);
        textPane.setVisible(false);
        textPane.setBounds(430, y, 28, 20);
        contentPane.add(textPane);
        return textPane;
    }

    public static JTextField Generate_TextField(
            JPanel contentPane, String toolTip, int fontSize, Color color,
            int x, int y, int w, int h) {
        JTextField textField = new JTextField();
        textField.setToolTipText(toolTip);
        textField.setBackground(color);
        textField.setFont(new Font("Arial Black", Font.BOLD, fontSize));
        textField.setEditable(false);
        textField.setBounds(x, y, w, h);
        contentPane.add(textField);
        textField.setColumns(10);
        return textField;
    }

    public static JCheckBox Generate_CheckBox(
            JPanel contentPane, String text, String toolTip,
            int x, int y, int w, int h) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setFont(new Font("Tahoma", Font.BOLD, 11));
        checkBox.setForeground(Color.LIGHT_GRAY);
        checkBox.setBackground(Color.DARK_GRAY);
        checkBox.setBounds(x, y, w, h);
        checkBox.setVisible(false);
        checkBox.setFocusPainted(false);
        checkBox.setToolTipText(toolTip);
        contentPane.add(checkBox);
        return checkBox;
    }

    public static JComboBox<String> Generate_ComboBoxSubject(JPanel contentPane, String subject, int y) {
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setForeground(UIManager.getColor("textText"));
        comboBox.setBackground(Color.GRAY);
        comboBox.setFont(new Font("Arial Black", Font.BOLD, 14));
        comboBox.setModel(new DefaultComboBoxModel<String>(Factory.Generate_Subjects(subject)));
        comboBox.setBounds(10, y, 170, 40);
        contentPane.add(comboBox);
        return comboBox;
    }

    public static String[] Generate_Subjects(String subject) {
        String skip = subject.length() == 3 ? "           " : "     ";
        return new String[] {
                skip + subject,
                "Deutsch",
                "Englisch",
                "Franz\u00F6sisch",
                "Spanisch",
                "Latein",
                "Mathe",
                "Biologie",
                "Physik",
                "Chemie",
                "Informatik",
                "Geschichte",
                "Sozialkunde",
                "Erkunde",
                "Sozi./Erdk.",
                "Religion",
                "Ethik",
                "Philosophie",
                "Musik",
                "Kunst",
                "Darstell. Spiel" };
    }

}
