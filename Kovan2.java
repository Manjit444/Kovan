import java.util.Scanner;

public class Kovan2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int x){
        for(int i=x-1;i>=0;i--){
            for(int j=0;j<x;j++){
                if(j>=i)
                    System.out.print("* ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    
    }
}
