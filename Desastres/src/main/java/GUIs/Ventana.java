package GUIs;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JTextArea listadesaparecidos;
    private JTextArea detalledesastre;
    private JScrollPane scroll;

    public Ventana() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();

    }

    public void iniciarComponentes() {
        this.setLayout((LayoutManager)null);
        this.etiqueta1 = new JLabel("Lista desaparecidos:");
        this.etiqueta1.setBounds(10, 10, 500, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Detalles desastre: ");
        this.etiqueta2.setBounds(10, 240, 500, 30);
        this.add(this.etiqueta2);
        this.listadesaparecidos = new JTextArea("");
        this.listadesaparecidos.setEditable(false);
        this.detalledesastre = new JTextArea("");
        this.detalledesastre.setEditable(false);
        this.scroll = new JScrollPane(this.listadesaparecidos);
        this.scroll.setBounds(10, 40, 365, 200);
        this.scroll.setFont(new Font("Tahoma", 0, 14));
        this.add(this.scroll);
        this.scroll = new JScrollPane(this.detalledesastre);
        this.scroll.setBounds(10, 270, 365, 200);
        this.scroll.setFont(new Font("Tahoma", 0, 14));
        this.add(this.scroll);
    }
}
