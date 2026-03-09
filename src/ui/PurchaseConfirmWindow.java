package ui;

import valorantArsenal.Weapons;
import javax.swing.*;
import java.awt.*;

public class PurchaseConfirmWindow extends JFrame {

    public PurchaseConfirmWindow(String player, String agent, Weapons weapon, double remainingCredits) {
        setTitle("Purchase confirmed!");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9, 1, 5, 5));

        // Guardar en JSON
        Purchase purchase = new Purchase(
                player, agent,
                weapon.getName(),
                weapon.getClass().getSimpleName(),
                weapon.getPrice(),
                remainingCredits
        );
        PurchaseManager.savePurchase(purchase);

        add(new JLabel("✓ Purchase completed!", SwingConstants.CENTER));
        add(new JLabel("Player: "    + player,                            SwingConstants.CENTER));
        add(new JLabel("Agent: "     + agent,                             SwingConstants.CENTER));
        add(new JLabel("Weapon: "    + weapon.getName(),                  SwingConstants.CENTER));
        add(new JLabel("Type: "      + weapon.getClass().getSimpleName(), SwingConstants.CENTER));
        add(new JLabel("Price: "     + (int) weapon.getPrice() + " credits", SwingConstants.CENTER));
        add(new JLabel("Remaining: " + (int) remainingCredits + " credits",  SwingConstants.CENTER));

        JButton btnInventory = new JButton("View Inventory");
        btnInventory.setBackground(new Color(255, 70, 85));
        btnInventory.setForeground(Color.WHITE);
        btnInventory.addActionListener(e -> new InventoryWindow());
        add(btnInventory);

        JButton btnClose = new JButton("Close");
        btnClose.addActionListener(e -> dispose());
        add(btnClose);

        setVisible(true);
    }
}