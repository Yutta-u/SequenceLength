import java.util.Scanner;

public class SequenceLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = -1;
        int a = 0;
        do {
            a = scan.nextInt();
            i++;
        } while (a != 0);
        System.out.println(i);
    }
}
