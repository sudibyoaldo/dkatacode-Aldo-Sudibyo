import java.util.*;

public class FixSembilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp=0,result=1;
        for(int i=num;i>0;i--){
            temp=i;
            result*=temp;
            temp-=1;
        }
        System.out.println(result);
    }
    
}