
/**
 * Write a description of class Average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Average
{
    public static void main(String[] args) {
        int array [] = new int[] {82,84,80,89,88,87,86};
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double ave = sum/array.length;
        System.out.println(ave);
        
    }

}
