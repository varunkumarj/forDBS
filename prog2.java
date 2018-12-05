import java.util.Scanner;
public class Prog2{

     public static void main(String []args){
         
        Scanner s= new Scanner(System.in);
        int count = s.nextInt();
        int temp=0;
        int pov=0;
        int number[]=new int[count];
        for (int i=0;i<count;i++)
        {
        number[i]=s.nextInt();
        }
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
            {
                if (number[i] < number[j]) 
                {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        for(int i = 0; i < count; i++) 
        {
            System.out.print(number[i]);
        }
    
}

}