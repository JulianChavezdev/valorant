package UI;

import valorantArsenal.Weapons;
import javax.swing.*;
import java.awt.*;

public class PurchaseConfirmWindow extends JFrame {

    public PurchaseConfirmWindow(String jugador, String agente, Weapons arma, double creditosRestantes) {
        setTitle("¡Compra confirmada!");
        setSize(400, 320);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(15, 25, 35));

        JLabel title = new JLabel("✓ ¡Compra realizada!", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(new Color(100, 220, 100));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        JPanel info = new JPanel(new GridLayout(5, 1, 5, 5));
        info.setBackground(new Color(30, 40, 55));
        info.setBorder(BorderFactory.createEmptyBorder(15, 30, 15, 30));

        String[] lineas = {
                "Jugador: "  + jugador,
                "Agente: "   + agente,
                "Arma: "     + arma.getName(),
                "Precio: "   + (int) arma.getPrice() + " créditos",
                "Restante: " + (int) creditosRestantes + " créditos"
        };

        for (String linea : lineas) {
            JLabel lbl = new JLabel(linea);
            lbl.setForeground(Color.WHITE);
            lbl.setFont(new Font("Arial", Font.PLAIN, 14));
            info.add(lbl);
        }

        add(info, BorderLayout.CENTER);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBackground(new Color(255, 70, 85));
        btnCerrar.setForeground(Color.WHITE);
        btnCerrar.setFocusPainted(false);
        btnCerrar.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));
        btnCerrar.addActionListener(e -> dispose());
        add(btnCerrar, BorderLayout.SOUTH);

        setVisible(true);
    }
}