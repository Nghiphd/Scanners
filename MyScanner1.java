import java.util.Scanner;

public class MyScanner1
{
    String input = "alpha bravo charlie delta echo";
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
        MyScanner1 myScanner = new MyScanner1();
        myScanner.run();
    }
}

