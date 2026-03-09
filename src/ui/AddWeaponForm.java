package ui;

import valorantArsenal.Weapons;
import javax.swing.*;
import java.awt.*;

public class AddWeaponForm extends JFrame {

    public AddWeaponForm(ShopWindow shop) {
        setTitle("Add weapon");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Name:"));
        JTextField txtName = new JTextField();
        add(txtName);

        add(new JLabel("Price:"));
        JTextField txtPrice = new JTextField();
        add(txtPrice);

        add(new JLabel("Magazine size:"));
        JTextField txtMag = new JTextField();
        add(txtMag);

        add(new JLabel("Automatic (true/false):"));
        JTextField txtAuto = new JTextField();
        add(txtAuto);

        add(new JLabel("Penetration (HIGH/MEDIUM/LOW):"));
        JTextField txtPen = new JTextField();
        add(txtPen);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> dispose());
        add(btnCancel);

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(e -> {
            try {
                String name  = txtName.getText().trim();
                double price = Double.parseDouble(txtPrice.getText().trim());
                int mag      = Integer.parseInt(txtMag.getText().trim());
                boolean auto = Boolean.parseBoolean(txtAuto.getText().trim());
                Weapons.Penetration pen = Weapons.Penetration.valueOf(
                        txtPen.getText().trim().toUpperCase()
                );

                if (name.isEmpty()) throw new IllegalArgumentException("Name is empty");

                shop.addWeapon(new Weapons(name, mag, price, auto, pen));
                JOptionPane.showMessageDialog(this, "Weapon added successfully!");
                dispose();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Price and magazine must be numbers");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, "Invalid data: " + ex.getMessage());
            }
        });
        add(btnAdd);

        setVisible(true);
    }
}