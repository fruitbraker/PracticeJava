package practice1;

/**
 *
 * @author Eric
 */
public class Practice1 {
    public static void main(String[] args) {
        double celsius = 10.0;
        System.out.print("The temperature for 10 celsius in Farenheit is ");
        System.out.println(convert(celsius));
    }
    public static double convert(double c){
        double result = c + 40 * 9 / 5 - 40;
        return result;
    }
}
