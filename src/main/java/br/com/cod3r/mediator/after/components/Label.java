package br.com.cod3r.mediator.after.components;

import br.com.cod3r.mediator.after.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    private Mediator mediator;

    public Label(Mediator mediator) {
        super("Times Clicked: 0");
        setFont(new Font(getFont().getName(), Font.BOLD, 30));

        this.mediator = mediator;
    }

    public void refresh() {
        super.setText("Times Clicked: " + mediator.getCounterValue());
    }

}