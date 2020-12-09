
package hashing;

import java.util.Scanner;

public class Hashing 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
    
        String str= new String();
    
        System.out.println("Please, Enter your statement");
    
        str = sc.nextLine();
    
        Chaining chain =new Chaining(1000);
    
        for(int i=0;i<str.length();i++)
        {
            char x = str.charAt(i);
            int ascii=(int) x;
            chain.add(ascii);
    
        }
        chain.printTimes(); 
    }
    
}
