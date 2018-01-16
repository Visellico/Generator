package com.visellico.sudaily.backtracking;

import java.util.Iterator;

/**
 * Created by Henry on 1/15/2018.
 */
public abstract class Config {

    public abstract boolean isGoal();

    public abstract boolean isValid();

    public abstract Iterable<Config> getSuccessors();

    public abstract void display();

}
