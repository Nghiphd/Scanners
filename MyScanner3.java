import java.util.Scanner;

public class MyScanner3
{
    public void run() {
        // 4 29 8 73 10 35
        Scanner scanner = new Scanner(System.in); 
        while (true) {
            if (scanner.hasNextInt()) {
                int str = scanner.nextInt()*3;
                System.out.println(str);
            }
        }
    }
    public static void main(String[] args) {
        MyScanner3 myScanner = new MyScanner3();
        myScanner.run();
    }
}
