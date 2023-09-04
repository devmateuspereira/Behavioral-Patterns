package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class OffState implements HeadPhoneState {

    private static final HeadPhoneState instance = new OffState();

    public OffState() {
        super();
    }

    @Override
    public void click(HeadPhone hp) {

    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setOn(true);
        System.out.println("> Turning On");
        hp.setState(OnState.getInstance());
    }

    public static HeadPhoneState getInstance() {
        return instance;
    }

}