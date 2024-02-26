package com.encore.algorithm.practice.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 상하좌우
 */
public class Implementation1 {

    static class Coordinates {
        int row;
        int column;
        int mapSize;

        Coordinates(int N) {
            row = 1;
            column = 1;
            mapSize = N;
        }

        void left() {
            if (!(column <= 1))
                column -= 1;
        }

        void right() {
            if (!(column >= mapSize))
                column += 1;
        }

        void up() {
            if (!(row <= 1))
                row -= 1;
        }

        void down() {
            if (!(row >= mapSize))
                row += 1;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Coordinates coordinates = new Coordinates(N);

        StringTokenizer st = new StringTokenizer(br.readLine());
        String command;
        while (st.hasMoreTokens()) {
            command = st.nextToken();
            switch (command) {
                case "L":
                    coordinates.left();
                    break;
                case "R":
                    coordinates.right();
                    break;
                case "U":
                    coordinates.up();
                    break;
                case "D":
                    coordinates.down();
                    break;
            }
        }

        System.out.println(coordinates.row + " " + coordinates.column);
    }

}
