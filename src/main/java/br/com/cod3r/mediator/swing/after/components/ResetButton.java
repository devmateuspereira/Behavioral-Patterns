package br.com.cod3r.mediator.swing.after.components;

import br.com.cod3r.mediator.swing.after.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    public ResetButton(Mediator mediator) {
        super("Reset");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.reset();
            }
        });
    }

}