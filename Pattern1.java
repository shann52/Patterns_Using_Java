import java.util.Scanner;

 class Pattern1 {
    public static void pattern1(int n) {
       
    for(int i =0; i<n; i++){
        for(int j=0; j<n; j++){
             System.out.print("*");
        } 

 System.out.println();
  }
    }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Input:");
    int value = sc.nextInt();
    pattern1(value);
    sc.close();
    }
}
// PATTERN 1 - Enter Your Input:   
