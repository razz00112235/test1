import java.util.*;

import javax.sound.midi.Soundbank;
class Test{
  
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        //Test obj=new Test();
        Digit obj=new Digit();
        obj.digit(num);
    }
}