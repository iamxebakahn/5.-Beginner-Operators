/* Problem Description

You are given a variable X, modify it using the following steps.
Make X five times greater than the original value.
Increment the value of X by 10.
Divide the value of X by 2.

Note : Do modification in X step by step without using any extra variable. The value of X must be modified at the end of all steps. Do not use any extra variable other than X.


Problem Constraints

1 <= X <= 1000


Input Format

The value of variable X.


Output Format

Print the modified value of variable X.


Example Input

10


Example Output

30


Example Explanation

X = 10
Value of X after making it 5 times greater, X = 50
Value of X after incrementing it by 10, X = 60
Value of X after dividing it by 2, X = 30 */
import java.lang.*;
import java.util.*;

public class Q1AP_Beginner_Operators{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        X*=5;
        X+=10;
        X/=2;
        System.out.print(X);
    }
}
