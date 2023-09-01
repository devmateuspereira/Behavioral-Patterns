package br.com.cod3r.mediator.translate.model;

import br.com.cod3r.mediator.translate.mediator.Mediator;

public class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, mediator, Language.PORTUGUESE);
    }

}