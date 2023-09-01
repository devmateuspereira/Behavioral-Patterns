package br.com.cod3r.mediator.swing.before.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    public ResetButton(State state, Label label, AddButton button) {
        super("Reset");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.setCounter(0);
                button.setEnabled(true);
                label.refresh();
            }
        });
    }

}