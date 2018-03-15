/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Comp;

/**
 *
 * @author burds
 */
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author KoZaK
 */
public class Main {

    public static void Main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String word;
        String display;

        String[] dataTypes = {"int", "char", "boolean", "float", "String"};
        String[] dt = new String[1000];
        String[] variable = new String[1000];
        double[] value = new double[1000];

        boolean trigger = false;
        int state = 0, d = 0;
        System.out.println("Enter a line: ");
        word = input.nextLine();

        StreamTokenizer st = new StreamTokenizer(new StringReader(word));
        st.parseNumbers();

        boolean error = false;

        System.out.println("Display: ");
        display = input.nextLine();
        StreamTokenizer ts = new StreamTokenizer(new StringReader(display));
        ts.parseNumbers();
        System.out.println("Data Type\tVariable\tValue\tScope");
        System.out.println("**********************************************");
        
        //peform the categorization
        int count = 0;
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            switch (state) {
                case 0:
                    int flag = 1;
                    if (st.ttype == StreamTokenizer.TT_WORD) {
                        for (int i = 0; i < 4; i++) {
                            if (dataTypes[i].equals(st.sval)) {
                                state = 1;
                                dt[count] = st.sval;
                                flag = 0;
                                break;
                            }
                        }
                        if (flag == 1) {
                            state = 4;
                            break;
                        }
                    }
                    break;
                case 1:
                    flag = 1;
                    if (st.ttype == StreamTokenizer.TT_WORD) {
                        for (int i = 0; i < 4; i++) {
                            if (st.sval != dataTypes[i]) {
                                flag = 0;
                            }
                        }
                        if (flag == 0) {
                            variable[count] = st.sval;
                            state = 2;
                            break;
                        }
                    }
                    break;

                case 2:
                    if (st.ttype == ',') {
                        count++;
                        dt[count] = dt[count - 1];
                        state = 1;

                        break;
                    }
                    if (st.ttype == '=') {
                        state = 3;
                        break;
                    }
                    if (st.ttype == ';') {
                        count++;
                        state = 0;
                        break;
                    } else {
                    }
                    break;
                case 3:
                    flag = 1;
                    if (st.ttype == StreamTokenizer.TT_NUMBER) {
                        value[count] = st.nval;
                        state = 2;
                    }
                    if (st.ttype == StreamTokenizer.TT_WORD) {
                        for (int i = 0; i < 4; i++) {
                            if (st.sval != dataTypes[i]) {
                                flag = 0;
                            }
                        }
                        if (flag == 0) {
                            state = 2;
                        }
                    }
                    if (st.ttype == ',') {
                        state = 1;
                    }
                    break;

                case 4:
                    if (st.ttype == '=') {
                        state = 5;
                    }
                    break;

                case 5:
                    flag = 1;
                    if (st.ttype == StreamTokenizer.TT_NUMBER) {
                        state = 6;
                    }
                    if (st.ttype == StreamTokenizer.TT_WORD) {
                        for (int i = 0; i < 4; i++) {
                            if (st.sval != dataTypes[i]) {
                                flag = 0;
                            }
                        }
                        if (flag == 0) {
                            state = 6;
                        }
                    }
                    break;

                case 6:
                    if (st.ttype == ';') {
                        state = 0;
                        break;
                    } else {
                        break;
                    }

                case 7:
                    state = 7;

                    break;

                default:
                    System.out.println("");
                    break;

            }

        }
        int k = 0;
        for (int i = 0; i < count; i++) {
            System.out.print(dt[i] + "\t\t   ");
            System.out.print(variable[i] + "\t\t");
            System.out.print(value[i] + "\t");
            System.out.println("main\n");
            k++;
        }
        while (ts.nextToken() != StreamTokenizer.TT_EOF) {
            int flag = 1;
            for (int i = 0; i < k; i++) {
                if (ts.sval.equals(variable[i])) {
                    System.out.print(value[i] + " ");
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.print(ts.sval + " ");
            }
        }
    }
}