import java.util.Scanner;

public class MyScanner4
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if(scanner.hasNextInt()) {
                int str = scanner.nextInt();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner4 myScanner = new MyScanner4();
        myScanner.run();
    }
}
