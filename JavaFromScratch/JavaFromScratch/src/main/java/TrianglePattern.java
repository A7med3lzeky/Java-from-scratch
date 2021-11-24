import java.util.Scanner; // Import the Scanner class
public class TrianglePattern {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    do {
      System.out.println("\nEnter the base size of the triangle: ");
      int base = scan.nextInt();
      System.out.println("\nChoose the pattern a or b: ");
      char pattern = scan.next().charAt(0);

        switch (pattern) {
            case 'a':
                for (int i = 1; i <= base; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println("");
                }       break;
            case 'b':
                for (int i = base; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println("");
                }       break;
            default:
                System.out.println("invalid entering");
                break;
        }
      
    } while (true); //do while loop just for multiple Entering.

  }
}
/* output cases
#case 1
Enter the base size of the triangle: 
5
Choose the pattern a or b: 
a
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

#case 2
Enter the base size of the triangle: 
6
Choose the pattern a or b: 
b
1 2 3 4 5 6 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

#case 3
Enter the base size of the triangle: 
9
Choose the pattern a or b: 
v
invalid entering

*/