package com.visellico.backtracking;

/**
 * Created by Henry on 1/15/2018.
 */
public class Backtracker {

    public static Config solve(Config config) {

        if (config.isGoal()) {
            return config;
        }
        else {
            for (Config sub : config.getSuccessors()) {
                if (sub.isValid()) {
                    sub.display();
                    Config solution = solve(sub);
                    if (solution != null)
                        return solution;
                }
            }
            return null;
        }
    }
}
