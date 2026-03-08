package ui;

import valorantArsenal.Weapons;
import javax.swing.*;
import java.awt.*;

public class BuyWeaponForm extends JFrame {

    public BuyWeaponForm(Weapons arma) {
        setTitle("Comprar " + arma.getName());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(15, 25, 35));

        JLabel title = new JLabel("Comprar " + arma.getName(), SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setForeground(Color.WHITE);
        title.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        JPanel form = new JPanel(new GridLayout(3, 2, 10, 10));
        form.setBackground(new Color(15, 25, 35));
        form.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        JLabel lblNombre   = new JLabel("Tu nombre:");
        JLabel lblAgente   = new JLabel("Agente:");
        JLabel lblCreditos = new JLabel("Tus créditos:");

        lblNombre.setForeground(Color.WHITE);
        lblAgente.setForeground(Color.WHITE);
        lblCreditos.setForeground(Color.WHITE);

        JTextField txtNombre   = new JTextField();
        JTextField txtAgente   = new JTextField();
        JTextField txtCreditos = new JTextField();

        form.add(lblNombre);   form.add(txtNombre);
        form.add(lblAgente);   form.add(txtAgente);
        form.add(lblCreditos); form.add(txtCreditos);
        add(form, BorderLayout.CENTER);

        JButton btnConfirmar = new JButton("Confirmar compra");
        btnConfirmar.setBackground(new Color(255, 70, 85));
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.setFont(new Font("Arial", Font.BOLD, 14));
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));

        btnConfirmar.addActionListener(e -> {
            String nombre   = txtNombre.getText().trim();
            String agente   = txtAgente.getText().trim();
            String creditos = txtCreditos.getText().trim();

            if (nombre.isEmpty() || agente.isEmpty() || creditos.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Por favor rellena todos los campos",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                double creds = Double.parseDouble(creditos);
                if (creds < arma.getPrice()) {
                    JOptionPane.showMessageDialog(this,
                            "No tienes suficientes créditos.\nNecesitas: " + (int) arma.getPrice(),
                            "Créditos insuficientes", JOptionPane.WARNING_MESSAGE);
                } else {
                    dispose();
                    new PurchaseConfirmWindow(nombre, agente, arma, creds - arma.getPrice());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Los créditos deben ser un número",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(btnConfirmar, BorderLayout.SOUTH);
        setVisible(true);
    }
}