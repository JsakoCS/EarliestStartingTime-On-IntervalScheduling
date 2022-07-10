import java.util.*;
import java.io.*;

public class ESTonIntervalScheduling {
    
    // Interval class...
    static class Interval {
        int first;
        int second;
        Interval(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    // END.
    
    // Greedy algorithm...
    static void GreedyAlgorithm(int s[], int f[]) {
        // Store results in an ArrayList :
        ArrayList<Interval> result = new ArrayList<>();
        // Sort intervals in ascending order :
        PriorityQueue<Interval> pq = new PriorityQueue<>((pq1, pq2) -> pq1.first - pq2.first);
        // Add elements in priority queue :
        for (int i = 0; i < s.length; i++) {
            pq.add(new Interval(s[i], f[i]));
        }
        // Iterator :
        Interval iterate = pq.poll();
        // Start time :
        int startTime = iterate.first;
        // Finish time :
        int finishTime = iterate.second;
        // Add interval :
        while (!pq.isEmpty()) {
            Interval interval = pq.poll();
            int startNew = interval.first;
            int finishNew = interval.second;
            if (startTime == startNew) {
                if (finishNew < finishTime) {
                    finishTime = finishNew;
                }
            } else {
                if (startNew >= finishTime) {
                    result.add(new Interval(startTime, finishTime));
                    startTime = startNew;
                    finishTime = finishNew;
                }
            }
        }
        // Add last value from priority queue :
        boolean found = false;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).first == startTime && result.get(i).second == finishTime) {
                found = true;
                break;
            }
        }
        if (!found) {
            result.add(new Interval(startTime, finishTime));
        }
        // Display :
        System.out.println(String.valueOf(result.size()));
        // // Display selected intervals :
        // System.out.println("--- --- --- --- ---");
        // System.out.println("SELECTED INTERVALS");
        // System.out.println("--- --- --- --- ---");
        // for (Interval interval : result) {
        //     System.out.println(interval.first +" ~ "+ interval.second);
        // }
    }
    // END.
    
    // Driver...
    public static void main(String[] args) {
        try {
            File myFile = new File("input.txt");
            Scanner myScanner = new Scanner(myFile);
            int N = Integer.parseInt(myScanner.nextLine());
            int[] s = new int[N];
            int[] f = new int[N];
            int i = 0;
            while (myScanner.hasNextLine()) {
                String theData = myScanner.nextLine();
                String[] myInterval = theData.split(" ", 2);
                s[i] = Integer.parseInt(myInterval[0]);
                f[i] = Integer.parseInt(myInterval[1]);
                i++;
            }
            GreedyAlgorithm(s, f);
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND, PLEASE TRY AGAIN...");
            System.exit(1);
        }
    }
    // END.
    
}