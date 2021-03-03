package com.rafsoft;

public class TargetAdapter implements Target{
    private Adaptee adaptee;

    public TargetAdapter(Adaptee adaptee) {
        this.adaptee=adaptee;
    }

    @Override
    public void operation() {
        this.adaptee.specificOperation();
    }
}
