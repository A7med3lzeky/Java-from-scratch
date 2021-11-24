import java.util.Scanner;
public class CheckPalindromeNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    do {
    int number1 = 0, number2 = 0,temp = 0;
    System.out.println("Enter a number: ");
    number1 = temp = scan.nextInt();
    while(temp != 0){

      number2 = number2 * 10 + temp%10;
      //number2 += temp%10;
      temp /= 10;
    }
    if(number2 == number1){
      System.out.println(number1 + " is  palindrome\n");
    }
    else
      System.out.println(number1 + " is NOT palindrome\n");

    scan.close();
  
    }while (true); //do while loop just for multiple Entering numbers.
  }
}

/* output cases

Enter a number: 
2
2 is  palindrome

Enter a number: 
3
3 is  palindrome

Enter a number: 
121
121 is  palindrome

Enter a number: 
55
55 is  palindrome

Enter a number: 
828
828 is  palindrome

*/