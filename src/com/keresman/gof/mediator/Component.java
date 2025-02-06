package com.keresman.gof.mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
