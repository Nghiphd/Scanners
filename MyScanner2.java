import java.util.Scanner;

public class MyScanner2
{
    String input = "4 29 8 73 10 35";
    public void run() {
        Scanner scanner = new Scanner(input);
        while (true) {
            if(scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner2 myScanner = new MyScanner2();
        myScanner.run();
    }
}