import java.util.*;

public class FixTujuh{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String cc_number = input.nextLine();

        // Remove all space
        cc_number=cc_number.replaceAll("\\s+", "");

        // Copy character by character into array character
        char[] ch = new char[cc_number.length()]; 
        for (int i = 0; i < cc_number.length(); i++) { 
            ch[i] = cc_number.charAt(i); 
        }
        
        // Change character to integer
        int cc_number_int[] = new int[cc_number.length()];
        for (int i = 0; i < cc_number.length(); i++) { 
            cc_number_int[i] = Integer.parseInt(String.valueOf(ch[i])); 
        }

        int temp=0;
        if (cc_number_int.length %2 ==0) {
            for (int i = (cc_number_int.length-1); i >= 0; i--) { 
                // Find the even number from the right
                if (i%2==0) {
                    // Doubling the even number
                    temp = cc_number_int[i]*2;

                    // Minus 9 if doubling the number greater than 9
                    if(temp > 9){
                        temp -=9;
                    }

                    // Replace the originial number to the new number
                    cc_number_int[i]=temp;
                }
            }
        } else {
            for (int i = (cc_number_int.length-1); i >= 0; i--) { 
                // Find the even number from the right
                if (i%2!=0) {
                    // Doubling the even number
                    temp = cc_number_int[i]*2;

                    // Minus 9 if doubling the number greater than 9
                    if(temp > 9){
                        temp -=9;
                    }

                    // Replace the originial number to the new number
                    cc_number_int[i]=temp;
                }
            }
        }
        
        temp = 0;
        // Sum all the number
        for (int i = 0; i < cc_number_int.length; i++) { 
            temp +=cc_number_int[i];
        }

        // Check if the sum divisible by 10
        if(temp%10==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}