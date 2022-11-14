import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Average each row of ten test scores
 */
public class CopyOfScannerReadCSVFile
{
    public void run() throws FileNotFoundException {
        // Mr. Jaffe's code to read data from a file
        // Instantiate a File object
        File dataFile = new File("TestScoresByClass.csv");

        // Instantiate a Scanner object that uses the file
        Scanner scanner = new Scanner(dataFile);

        // Set the delimiter as a new-line character so we can read the
        // data one line at a time
        scanner.useDelimiter("\n");

        // Continue while there's still data in the file to be read
        while (scanner.hasNext()) {
            // Read the next line of the file
            String line = scanner.nextLine();
            String a = line.substring(0,4);
            String b = line.substring(5);
            Scanner sc = new Scanner(b).useDelimiter(",");
            while(sc.hasNextInt()) {
                int sum = 0;
                for(int i = 0; i < 10; i++) {
                    sum = sum + sc.nextInt();
                }
                int average = sum/10;
                System.out.println(a + ":" + average); 
            }
        }
        scanner.close();
    }

    public static void main (String[] args) {
        try {
            CopyOfScannerReadCSVFile srCsv = new CopyOfScannerReadCSVFile();
            srCsv.run();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("There's an error someplace. Try using the debugger to find it!");

        }
    }
}
