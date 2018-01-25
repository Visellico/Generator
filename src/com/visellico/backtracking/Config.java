package com.visellico.backtracking;

import com.visellico.viewer.Observable;

/**
 * Created by Henry on 1/15/2018.
 */
public abstract class Config extends Observable {

    public abstract boolean isGoal();

    public abstract boolean isValid();

    public abstract Iterable<Config> getSuccessors();

    public abstract void display();

}
