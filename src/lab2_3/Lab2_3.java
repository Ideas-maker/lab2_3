package lab2_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        ArrayList<ArrayList> matrix = new ArrayList<ArrayList>();
        try {
            Scanner scan = new Scanner(new File("array.txt"));
            while (scan.hasNextLine()) {
                Scanner scanLine = new Scanner(scan.nextLine());
                ArrayList<Integer> line = new ArrayList<Integer>();
                while (scanLine.hasNext()) {
                    line.add(Integer.parseInt(scanLine.next()));
                }
                matrix.add(line);
            }
            int width = matrix.size();
            int length = matrix.get(0).size();
            int[][] result = new int[width][length];
            int[][] array = new int[width][length];
            for (int i = 0; i < matrix.size(); i++) {
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    array[i][j] = (int) matrix.get(i).get(j);
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

}
