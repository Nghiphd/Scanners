import java.util.Scanner;

public class MyScanner
{
    public void run() {
        String input = "123,123,123,123";
        Scanner scanner = new Scanner(input).skip("(\\d+)");
        scanner.useDelimiter(",");
        while (true) {
            if(scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}
