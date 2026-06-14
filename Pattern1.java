import java.util.Scanner;

public class Pattern1 {
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
  try (Scanner sc = new Scanner(System.in)) {
    Pattern1 sol = new Pattern1();
    System.out.println("Enter Your Output:");
    int value = sc.nextInt();
    sol.pattern1(value);
  }
}
}
