package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class InventoryWindow extends JFrame {

    public InventoryWindow() {
        setTitle("My Inventory");
        setSize(650, 400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(15, 25, 35));


        JLabel title = new JLabel("MY INVENTORY", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setForeground(Color.WHITE);
        title.setBackground(new Color(255, 70, 85));
        title.setOpaque(true);

        // Tabla
        String[] columns = {"Player", "Agent", "Weapon", "Type", "Price", "Remaining"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        List<Purchase> purchases = PurchaseManager.loadAll();

        if (purchases.isEmpty()) {
            JLabel empty = new JLabel("No purchases yet.", SwingConstants.CENTER);
            empty.setForeground(Color.LIGHT_GRAY);
            add(title, BorderLayout.NORTH);
            add(empty, BorderLayout.CENTER);
        } else {
            for (Purchase p : purchases) {
                model.addRow(new Object[]{
                        p.getPlayerName(),
                        p.getAgentName(),
                        p.getWeaponName(),
                        p.getWeaponType(),
                        (int) p.getPrice() + " cr",
                        (int) p.getRemainingCredits() + " cr"
                });
            }

            JTable table = new JTable(model);
            table.setBackground(new Color(30, 40, 55));
            table.setForeground(Color.WHITE);
            table.setGridColor(new Color(255, 70, 85));
            table.getTableHeader().setBackground(new Color(255, 70, 85));
            table.getTableHeader().setForeground(Color.WHITE);
            table.setRowHeight(28);
            table.setEnabled(false);

            setLayout(new BorderLayout(10, 10));
            add(title, BorderLayout.NORTH);
            add(new JScrollPane(table), BorderLayout.CENTER);
        }


        JButton btnClose = new JButton("Close");
        btnClose.setBackground(new Color(255, 70, 85));
        btnClose.setForeground(Color.WHITE);
        btnClose.addActionListener(e -> dispose());
        add(btnClose, BorderLayout.SOUTH);

        setVisible(true);
    }
}