import java.util.Scanner;

class Solution {
    public void pattern1(int n) {
        int i,j;
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
             System.out.print("*");
        } 

 System.out.println();
  }
    }
public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  Solution sol = new Solution();
  System.out.println("Enter Your Output:");
  int value = sc.nextInt();
  sol.pattern1(value);
    
}}
