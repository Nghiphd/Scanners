import java.util.Scanner;

public class MyScanner5
{
    // Romeo,Sierra,Tango,Uniform,Victor,Whiskey
    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");
        while (true) {
            if(scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner5 myScanner = new MyScanner5();
        myScanner.run();
    }
}