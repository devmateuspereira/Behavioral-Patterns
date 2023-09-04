package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class OnState implements HeadPhoneState {

    private static final HeadPhoneState instance = new OnState();

    private OnState() {
        super();
    }

    @Override
    public void click(HeadPhone hp) {
        hp.setPlaying(true);
        System.out.println("> Resume Player");
        hp.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setOn(false);
        System.out.println("> Turning Off");
        hp.setState(OffState.getInstance());
    }

    public static HeadPhoneState getInstance() {
        return instance;
    }

}