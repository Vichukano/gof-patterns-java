package ru.vichukano.gof;

public class SaveButton implements Button {
    private Mediator mediator;

    @Override
    public void press() {
       mediator.saveText();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
