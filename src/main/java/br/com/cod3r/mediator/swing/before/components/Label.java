package br.com.cod3r.mediator.swing.before.components;

import javax.swing.*;

public class Label extends JLabel {

    private State state;

    public Label(State state) {
        super("Times Clicked: 0");
        this.state = state;
    }

    public void refresh() {
        super.setText("Times Clicked: " + state.getCounter());
    }

}