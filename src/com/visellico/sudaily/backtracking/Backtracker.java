package com.visellico.sudaily.backtracking;

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
                    Config solution = solve(sub);
                    if (solution != null)
                        return solution;
                }
            }
            return null;
        }
    }
}
