import UI.ShopWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

// OJO CON ESTO INICILIZAMOS EL FRAME, lo puse en un package aparte para no tener la logica de la interfaz dentro del main

        SwingUtilities.invokeLater(() -> new ShopWindow());
    }
}
