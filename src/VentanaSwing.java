/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omen_Gamer
 */
import javax.swing.*;

public class VentanaSwing extends JFrame {
    public VentanaSwing() {
        setTitle("Elementos Swing");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel etiqueta = new JLabel("Etiqueta Swing");
        JTextField campoTexto = new JTextField("Texto aquí", 15);
        JButton boton = new JButton("Botón");
        JComboBox<String> combo = new JComboBox<>(new String[]{"Opción 1", "Opción 2"});
        JCheckBox casilla = new JCheckBox("Casilla de verificación");

        etiqueta.setAlignmentX(CENTER_ALIGNMENT);
        campoTexto.setAlignmentX(CENTER_ALIGNMENT);
        boton.setAlignmentX(CENTER_ALIGNMENT);
        combo.setAlignmentX(CENTER_ALIGNMENT);
        casilla.setAlignmentX(CENTER_ALIGNMENT);

        panel.add(Box.createVerticalStrut(15));
        panel.add(etiqueta);
        panel.add(Box.createVerticalStrut(10));
        panel.add(campoTexto);
        panel.add(Box.createVerticalStrut(10));
        panel.add(boton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(combo);
        panel.add(Box.createVerticalStrut(10));
        panel.add(casilla);

        add(panel);
    }
}
