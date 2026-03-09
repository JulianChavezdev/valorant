package ui;

import valorantArsenal.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ShopWindow extends JFrame {

    private ArrayList<Weapons> arsenal;
    private JPanel weaponsPanel;

    private static final HashMap<String, String> IMAGES = new HashMap<>() {{
        put("Vandal",   "src/Img/vandal.png");
        put("Phantom",  "src/Img/phantom.png");
        put("Operator", "src/Img/operator.png");
        put("Marshal",  "src/Img/marshal.png");
        put("Sheriff",  "src/Img/sheriff.png");
        put("Ghost",    "src/Img/ghost.png");
        put("Judge",    "src/Img/judge.png");
        put("Classic",  "src/Img/classic.png");
    }};

    public ShopWindow() {
        setTitle("Valorant Shop");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        loadWeapons();

        JLabel title = new JLabel("VALORANT SHOP", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));

        weaponsPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        for (Weapons w : arsenal) {
            weaponsPanel.add(createCard(w));
        }

        JButton btnAdd = new JButton("Add weapon");
        btnAdd.addActionListener(e -> new AddWeaponForm(this));

        setLayout(new BorderLayout(10, 10));
        add(title, BorderLayout.NORTH);
        add(new JScrollPane(weaponsPanel), BorderLayout.CENTER);
        add(btnAdd, BorderLayout.SOUTH);
        Color valorantRed = new Color(255, 70, 85);
        Color darkBg      = new Color(15, 25, 35);
        getContentPane().setBackground(darkBg);
        title.setBackground(valorantRed);
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        weaponsPanel.setBackground(darkBg);
        btnAdd.setBackground(valorantRed);
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFocusPainted(false);


        setVisible(true);
    }

    private void loadWeapons() {
        arsenal = new ArrayList<>();
        arsenal.add(new Fusil("Vandal",  25, 2900.0, true,  Weapons.Penetration.HIGH,   160, 39, 33, false));
        arsenal.add(new Fusil("Phantom", 30, 2900.0, true,  Weapons.Penetration.MEDIUM, 156, 38, 32, false));
        arsenal.add(new Sniper("Operator", 5, 4700.0, false, Weapons.Penetration.HIGH,   255, 150, Sniper.Scope.OPERATORMAX, 127));
        arsenal.add(new Sniper("Marshal",  5,  950.0, false, Weapons.Penetration.MEDIUM, 202, 101, Sniper.Scope.MARSHAL, 85));
        arsenal.add(new Pistol("Sheriff",  6,  800.0, false, Weapons.Penetration.HIGH,   160, 55, 46, false));
        arsenal.add(new Pistol("Ghost",   15,  500.0, false, Weapons.Penetration.MEDIUM, 105, 30, 25, true));
        arsenal.add(new Shotgun("Judge",   7, 1850.0, true,  Weapons.Penetration.LOW,    34, 17, 14, 51, Shotgun.ShotgunName.JUDGE));
        arsenal.add(new Classic("Classic", 12,   0.0, false, Weapons.Penetration.LOW,    78, 26, 22, true));
    }

    private JLabel loadImage(String weaponName) {
        JLabel imgLabel = new JLabel("No image", SwingConstants.CENTER);
        imgLabel.setPreferredSize(new Dimension(300, 150));
        imgLabel.setBackground(new Color(30, 30, 30));
        imgLabel.setOpaque(true);

        String path = IMAGES.get(weaponName);
        if (path == null) return imgLabel;

        try {
            ImageIcon icon = new ImageIcon(path);
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            double ratio = Math.min(300.0 / w, 150.0 / h);
            int newW = (int)(w * ratio);
            int newH = (int)(h * ratio);
            Image scaled = icon.getImage().getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
            imgLabel.setIcon(new ImageIcon(scaled));
            imgLabel.setText("");
        } catch (Exception e) {
            imgLabel.setText("No image");
        }

        return imgLabel;
    }

    private JPanel createCard(Weapons w) {
        JPanel card = new JPanel(new BorderLayout(5, 5));
        card.setBackground(new Color(30, 40, 55));                              // fondo oscuro
        card.setBorder(BorderFactory.createLineBorder(new Color(255, 70, 85))); // borde rojo

        JLabel imgLabel = loadImage(w.getName());

        JPanel info = new JPanel(new GridLayout(4, 1));
        info.setBackground(new Color(30, 40, 55));                              // fondo oscuro

        JLabel lblName = new JLabel("Name: "        + w.getName());
        JLabel lblType = new JLabel("Type: "        + w.getClass().getSimpleName());
        JLabel lblPen  = new JLabel("Penetration: " + w.getCategory());
        JLabel lblAuto = new JLabel("Automatic: "   + w.isItsAutomatic());

        // Texto blanco
        for (JLabel lbl : new JLabel[]{lblName, lblType, lblPen, lblAuto}) {
            lbl.setForeground(Color.WHITE);
            info.add(lbl);
        }

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottom.setBackground(new Color(30, 40, 55));                            // fondo oscuro

        JLabel lblPrice = new JLabel(w.getPrice() == 0 ? "FREE" : (int) w.getPrice() + " credits");
        lblPrice.setForeground(new Color(255, 200, 0));                         // precio amarillo
        lblPrice.setFont(new Font("Arial", Font.BOLD, 13));

        JButton btnBuy = new JButton("Buy");
        btnBuy.setBackground(new Color(255, 70, 85));
        btnBuy.setForeground(Color.WHITE);
        btnBuy.setFocusPainted(false);
        btnBuy.addActionListener(e -> new BuyWeaponForm(w));

        bottom.add(lblPrice);
        bottom.add(btnBuy);

        card.add(imgLabel, BorderLayout.NORTH);
        card.add(info,     BorderLayout.CENTER);
        card.add(bottom,   BorderLayout.SOUTH);

        return card;
    }
    public void addWeapon(Weapons w) {
        arsenal.add(w);
        weaponsPanel.add(createCard(w));
        weaponsPanel.revalidate();
        weaponsPanel.repaint();
    }
}