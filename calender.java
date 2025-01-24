import java.util.*;
public class calender {
    public static void main(String args[]){
        System.out.println("enter no of years or century");
        Scanner i= new Scanner(System.in);
        int num=i.nextInt();
        int count=0;
        for(int j=num;j>=100;j=j-100){
            if(j%400!=0){
            count++;
            }
        }
            int k=num/4;
            System.out.println("the no of leap years are = " + (k-count));

        i.close();

    }
    
}
