# EarliestStartingTime-On-IntervalScheduling

**~** **CS482 (Algorithm Design) Project** **~**

**P R O J E C T _ O V E R V I E W :**

Recall the IntervalScheduling problem: you are given a set of intervals and asked to find the
largest cardinality subset that has no overlapping intervals. We found that the EarliestStartingTime
algorithm was not optimal by finding an instance where it did not get the best possible solution. Occassionally,  you will want to test an algorithm on a problem to find an instance where it does not get the optimal
solution.

**P R O J E C T _ D E T A I L S :**

The input will come from a file called input.txt which will be placed in the same directory as
your java file. The first line of the file will have a single integer value N which will be the number of
intervals. The next N lines will be the intervals represented by s<sub>i</sub> and f<sub>i</sub> seperated by whitespace. Your
program should output a single integer which is the number of non-overlapping intervals found by the
EarliestFinishingTime algorithm. It is likely that the number of intervals found will not be the optimal
solution. See below for examples.

**S A M P L E _ E X E C U T I O N S :**

( 1 ) If input.txt contains:
```
8
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
```
The output should be:
```
1
```

( 2 ) If input.txt contains:
```
5
1 10
2 3
4 5
6 7
8 9
```
The output should be:
```
1
```

( 3 ) If input.txt contains:
```
8
1 6
2 3
4 5
7 12
8 9
10 11
13 18
14 15
```
The output should be:
```
3
```
