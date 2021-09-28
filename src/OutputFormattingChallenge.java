import java.util.Scanner;

public class OutputFormattingChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a string");
        String s1=input.next();
        System.out.println("insert 3 integer");
        int x=input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        System.out.printf("%-15s%03d\n",s1,x);
        System.out.printf("%-15s%03d\n",s1,y);
        System.out.printf("%-15s%03d\n",s1,z);

    }
}
