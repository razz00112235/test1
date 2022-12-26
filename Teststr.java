import java.util.*;

class Teststr
{
    String data(String str)
    {
      String name=str;      
      int count=0;      
      char ch[]=new char[name.length()];
     for(int i=0;i<name.length();i++)
      {
        ch[i]=name.charAt(i); 
        if(name.charAt(i)==' ')  
        {
            count++;
        }  
      }
      char strdata[]=new char[name.length()-count];
      int j=0;
     for(char t:ch)
     {
        if(t==' ')
        {
            t='\0';
            
        }
        else
        {
           for(int k=j;k<name.length()-count;)
           {
            strdata[k]=t;
            j++;
            break;
           }
           
           
        }      
        
     }
   
          String str2 = String.valueOf(strdata);     
          System.out.println("New output: "+str2);
          

      return name;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        Teststr obj=new Teststr();
        obj.data(str);
    }
}