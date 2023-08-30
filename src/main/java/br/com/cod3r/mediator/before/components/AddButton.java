package br.com.cod3r.mediator.before.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {

    public AddButton(State state, Label label) {
        super("Click me!");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.addCount();
                label.refresh();
                if (state.getCounter() == 10) {
                    setEnabled(false);
                }
            }
        });
    }

}