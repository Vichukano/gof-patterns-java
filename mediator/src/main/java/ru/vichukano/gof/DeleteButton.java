package ru.vichukano.gof;

public class DeleteButton implements Button{
    private  Mediator mediator;

    @Override
    public void press() {
        mediator.deleteText();
    }

    @Override
    public void setMediator(Mediator mediator) {
       this.mediator = mediator;
    }
}
