package com.company;
import java.io.IOException;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static Logger myLogger = Logger.getLogger("com.company.Main");

    /*
    * Пример:
    *6
    *-4 3 -9 0 4 1
    *
    *Output
    *0.500000
    *0.333333
    *0.166667
     */

    public static void main(String[] args) throws IOException {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(INFO);
        consoleHandler.setFormatter(new SimpleFormatter());


        try {

            myLogger.log(INFO,"MAIN THREAD : PRINT FOR USER");
            System.out.println("Enter kol-vo n:");
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "INITIALIZATION 'N' ");
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "INITIALIZATION 'ARR' ");
            int[] arr = new int[n];
            System.out.println("Enter element mass:");
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "INITIALIZATION SCANNER ");
            final String[] arrItems = scanner.nextLine().split(" ");
            System.out.println("Press Enter");
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "SCANNER SKIP ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "SCANNER CLOSE ");
            scanner.close();
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "OVVERIDE RUNNABLE ");
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    Solution solution = new Solution();
                    solution.setData(arrItems);
                    solution.answer();
                }
            };
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "INITIALIZATION THREAD ");
            Thread myThread = new Thread(task);
            myLogger.log(INFO, "MAIN THREAD : \n" +
                    "THREAD START ");
            myThread.start();

        }catch (Exception e){
            myLogger.log(WARNING,"SOMETHING WRONG",e);
        }
    }
}
