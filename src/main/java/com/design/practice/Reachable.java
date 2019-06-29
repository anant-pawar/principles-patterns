package com.design.practice;

public class Reachable {

    public boolean checkReachable(int maze[][]) {
        int c = 4;//maze.length;
        int r = 4;//maze[0].length;

        if (maze[0][0] == -1)
            return false;

        for (int i = 0; i < r; i++) {
            if (maze[i][0] != -1)
                maze[i][0] = 1;
            else
                break;
        }

        for (int i = 1; i < c; i++) {
            if (maze[0][i] != -1)
                maze[0][i] = 1;
            else
                break;
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (maze[i][j] == -1)
                    continue;

                if (maze[i - 1][j] > 0)
                    maze[i][j] = maze[i][j] + maze[i - 1][j];

                if (maze[i][j - 1] > 0)
                    maze[i][j] = maze[i][j] + maze[i][j - 1];
            }
        }

        return maze[r - 1][c - 1] > 0 ? true : false;
    }
}
