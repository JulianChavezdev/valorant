package UI;

import UI.AddWeaponForm;
import UI.BuyWeaponForm;
import valorantArsenal.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShopWindow extends JFrame {

    private ArrayList<Weapons> arsenal;
    private JPanel weaponsPanel;

    public ShopWindow() {
        setTitle("Valorant Shop");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("TIENDA DE ARMAS", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        title.setBackground(new Color(255, 70, 85));
        title.setOpaque(true);
        title.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        add(title, BorderLayout.NORTH);

        weaponsPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        weaponsPanel.setBackground(new Color(15, 25, 35));
        weaponsPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        cargarArmas();
        mostrarArmas();

        JScrollPane scroll = new JScrollPane(weaponsPanel);
        scroll.getViewport().setBackground(new Color(15, 25, 35));
        add(scroll, BorderLayout.CENTER);

        JButton btnAnadir = new JButton("+ Añadir arma a la tienda");
        btnAnadir.setBackground(new Color(255, 70, 85));
        btnAnadir.setForeground(Color.WHITE);
        btnAnadir.setFont(new Font("Arial", Font.BOLD, 14));
        btnAnadir.setFocusPainted(false);
        btnAnadir.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));
        btnAnadir.addActionListener(e -> new AddWeaponForm(this));
        add(btnAnadir, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void cargarArmas() {
        arsenal = new ArrayList<>();
        arsenal.add(new Fusil("Vandal",  25, 2900.0, true,  Weapons.Penetration.HIGH,   160, 39, 33, false));
        arsenal.add(new Fusil("Phantom", 30, 2900.0, true,  Weapons.Penetration.MEDIUM, 156, 38, 32, false));
        arsenal.add(new Sniper("Operator", 5, 4700.0, false, Weapons.Penetration.HIGH,   255, 150, Sniper.Scope.OPERATORMAX, 127));
        arsenal.add(new Sniper("Marshal",  5,  950.0, false, Weapons.Penetration.MEDIUM, 202, 101, Sniper.Scope.MARSHAL, 85));
        arsenal.add(new Pistol("Sheriff",  6,  800.0, false, Weapons.Penetration.HIGH,   160, 55, 46, false));
        arsenal.add(new Pistol("Ghost",   15,  500.0, false, Weapons.Penetration.MEDIUM, 105, 30, 25, true));
        arsenal.add(new Shotgun("Judge",   7, 1850.0, true,  Weapons.Penetration.LOW, 34, 17, 14, 51, Shotgun.ShotgunName.JUDGE));
        arsenal.add(new Classic("Classic",12,    0.0, false, Weapons.Penetration.LOW, 78, 26, 22, true));
    }

    private void mostrarArmas() {
        weaponsPanel.removeAll();
        for (Weapons w : arsenal) {
            weaponsPanel.add(crearTarjeta(w));
        }
        weaponsPanel.revalidate();
        weaponsPanel.repaint();
    }

    private JPanel crearTarjeta(Weapons w) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(new Color(30, 40, 55));
        card.setBorder(BorderFactory.createLineBorder(new Color(255, 70, 85), 1));

        JPanel info = new JPanel(new GridLayout(4, 1));
        info.setBackground(new Color(30, 40, 55));
        info.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        JLabel nombre = new JLabel(w.getName());
        nombre.setFont(new Font("Arial", Font.BOLD, 16));
        nombre.setForeground(Color.WHITE);

        JLabel tipo = new JLabel("Tipo: " + w.getClass().getSimpleName());
        tipo.setForeground(new Color(180, 180, 180));

        JLabel penetracion = new JLabel("Penetración: " + w.getCategory());
        penetracion.setForeground(new Color(180, 180, 180));

        JLabel automatica = new JLabel("Automática: " + (w.isItsAutomatic() ? "Sí" : "No"));
        automatica.setForeground(new Color(180, 180, 180));

        info.add(nombre);
        info.add(tipo);
        info.add(penetracion);
        info.add(automatica);

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottom.setBackground(new Color(30, 40, 55));

        JLabel precio = new JLabel(w.getPrice() == 0 ? "GRATIS" : (int) w.getPrice() + " créditos");
        precio.setFont(new Font("Arial", Font.BOLD, 14));
        precio.setForeground(new Color(255, 200, 0));

        JButton btnComprar = new JButton("Comprar");
        btnComprar.setBackground(new Color(255, 70, 85));
        btnComprar.setForeground(Color.WHITE);
        btnComprar.setFocusPainted(false);
        btnComprar.addActionListener(e -> new BuyWeaponForm(w));

        bottom.add(precio);
        bottom.add(btnComprar);

        card.add(info, BorderLayout.CENTER);
        card.add(bottom, BorderLayout.SOUTH);

        return card;
    }

    public void agregarArma(Weapons w) {
        arsenal.add(w);
        mostrarArmas();
    }
}