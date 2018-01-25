package com.visellico.viewer;

public class Observable {

    public Observer observer;

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public void notifyObserver(Object o) {
        this.observer.update(o);
    }

}
