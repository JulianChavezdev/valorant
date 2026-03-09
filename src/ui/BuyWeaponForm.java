package ui;


import valorantArsenal.Weapons;
import javax.swing.*;
import java.awt.*;

public class BuyWeaponForm extends JFrame {

    public BuyWeaponForm(Weapons weapon) {
        setTitle("Buy " + weapon.getName());
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Your name:"));
        JTextField txtName = new JTextField();
        add(txtName);

        add(new JLabel("Agent:"));
        JTextField txtAgent = new JTextField();
        add(txtAgent);

        add(new JLabel("Your credits:"));
        JTextField txtCredits = new JTextField();
        add(txtCredits);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());
        add(btnCancel);

        JButton btnConfirm = new JButton("Confirm");
        btnConfirm.addActionListener(e -> {
            String name    = txtName.getText().trim();
            String agent   = txtAgent.getText().trim();
            String credits = txtCredits.getText().trim();

            if (name.isEmpty() || agent.isEmpty() || credits.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields");
                return;
            }

            try {
                double creds = Double.parseDouble(credits);
                if (creds < weapon.getPrice()) {
                    JOptionPane.showMessageDialog(this,
                            "Not enough credits. You need: " + (int) weapon.getPrice());
                } else {
                    dispose();
                    new ui.PurchaseConfirmWindow(name, agent, weapon, creds - weapon.getPrice());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Credits must be a number");
            }
        });
        add(btnConfirm);

        setVisible(true);
    }
}