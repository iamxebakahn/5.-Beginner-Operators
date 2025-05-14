/*Problem Description

Given an integer A, find the volume of a cube with side (A+1).

Note : Try to use shorthand increments for learning purposes.


Problem Constraints

1 <= A <= 100


Input Format

The value of A


Output Format

Print the volume of the new cube.


Example Input

5


Example Output

216


Example Explanation

A = 5
New Cube’s side = 6
New Cube’s volume = 6 * 6 * 6 = 216 */
import java.lang.*;
import java.util.*;

public class Q2AP_Beginner_Operators{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        A+=1;
        System.out.print(A*A*A);

    }
}
