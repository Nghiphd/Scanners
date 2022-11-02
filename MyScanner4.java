import java.util.Scanner;

public class MyScanner4
{
    String input = "Romeo,Sierra,Tango,Uniform,Victor,Whiskey";
    public void run() {
        Scanner scanner = new Scanner(input).useDelimiter("\\s*,\\s*");
        while (true) {
            if(scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner4 myScanner = new MyScanner4();
        myScanner.run();
    }
}