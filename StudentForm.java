import javax.swing.*;
import java.awt.*;

public class StudentForm {
    public static void main(String[] args) {

        // 1. Top-level window
        JFrame f = new JFrame("Student Form");
        f.setSize(450, 450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Main panel: 2 columns (label | input), any number of rows
        JPanel p = new JPanel(new GridLayout(0, 2, 8, 8));
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 3. Name (JLabel + JTextField)
        JTextField nameField = new JTextField();

        // 4. Password (JPasswordField)
        JPasswordField passField = new JPasswordField();

        // 5. Checkboxes grouped in their own panel
        JCheckBox java = new JCheckBox("Java");
        JCheckBox python = new JCheckBox("Python");
        JPanel langPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        langPanel.add(java);
        langPanel.add(python);

        // 6. Radio buttons + ButtonGroup (only one can be selected)
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male);
        genderPanel.add(female);

        // 7. Dropdown
        JComboBox<String> city =
                new JComboBox<>(new String[]{"Delhi", "Lucknow", "Agra"});

        // 8. List (multiple selection allowed)
        JList<String> skills =
                new JList<>(new String[]{"C", "Java", "Python", "SQL"});
        skills.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // 9. Button
        JButton submit = new JButton("Submit");

        // 10. Add everything to the panel in order
        p.add(new JLabel("Name:"));       p.add(nameField);
        p.add(new JLabel("Password:"));   p.add(passField);
        p.add(new JLabel("Languages:"));  p.add(langPanel);
        p.add(new JLabel("Gender:"));     p.add(genderPanel);
        p.add(new JLabel("City:"));       p.add(city);
        p.add(new JLabel("Skills:"));     p.add(new JScrollPane(skills));
        p.add(new JLabel(""));            p.add(submit);

        // 11. Event handling: runs when Submit is clicked
        submit.addActionListener(e -> {
            String name = nameField.getText();
            String pass = new String(passField.getPassword());
            String cityName = (String) city.getSelectedItem();

            String langs = "";
            if (java.isSelected())   langs += "Java ";
            if (python.isSelected()) langs += "Python ";

            String gen = male.isSelected() ? "Male"
                       : female.isSelected() ? "Female" : "Not selected";

            String sk = String.join(", ", skills.getSelectedValuesList());

            JOptionPane.showMessageDialog(f,
                    "Name: " + name +
                    "\nPassword length: " + pass.length() +
                    "\nLanguages: " + langs +
                    "\nGender: " + gen +
                    "\nCity: " + cityName +
                    "\nSkills: " + sk);
        });

        f.add(p);
        f.setVisible(true);
    }
}