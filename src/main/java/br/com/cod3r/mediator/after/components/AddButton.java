package br.com.cod3r.mediator.after.components;

import br.com.cod3r.mediator.after.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {

    public AddButton(Mediator mediator) {
        super("Click me!");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.buttonClicked();
            }
        });
    }

}