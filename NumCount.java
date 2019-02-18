import java.util.Scanner;
public class NumCount {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter an Integer");
      int num = input.nextInt();

        int count = 0;

        while(num != 0)
        {

            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}
