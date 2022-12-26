import java.util.*;

class Ticket
{

    int book()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter person");
        int person=sc.nextInt();
        int age[]=new int[person];
        System.out.println("Enter Age");
        for(int i=0;i<person;i++)
        {            
            age[i]=sc.nextInt();
        }
        int price=0;
       for(int aa:age)
       {
       
        if(aa<3)
        {
           price=price+0;
        }
        else if(aa>=3 && aa<=12)
        {
            price=price+100;
        }
        else
        {
            price=price+150;
        }
       }
    
        return price;

    }
    public static void main(String[] args) {
        Ticket tc=new Ticket();
        int fees=tc.book();
        System.out.println("Your Movie Ticket Price: "+fees);

    }
}