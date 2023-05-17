import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Kovan3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    charFrequency(s);
   }
   
   public static void charFrequency(String s){
    HashMap <String,Integer> map=new HashMap();
    for(int i=0;i<s.length();i++){
        String c=s.charAt(i)+"";
        if(map.containsKey(c)){
            int freq=map.get(c);
            map.put(c,freq+1);
        }
        else{
            map.put(c,1);
        }
    }

    printAns(map);
   }

   public static void printAns(HashMap<String ,Integer> map){
   for(String s:map.keySet()){
    System.out.println(s+" "+map.get(s));
   }
}}
