import java.util.ArrayList;
import java.util.Scanner;

public class Kovan1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        removeDuplicates(s);
        sc.close();
        }

    public static void removeDuplicates(String s){
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!ans.contains(s.charAt(i)+""))
                ans.add(s.charAt(i)+"");
        }
        printAns(ans);
    }
 
    public static void printAns(ArrayList<String> s){
        for(int i=0;i<s.size();i++){
            System.out.print(s.get(i));
        }
    }
}
