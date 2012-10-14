package practice2;

/**
 *
 * @author Eric
 */
public class BoxCarTest {
    public static void main(String args[]){
        Practice2 test = new Practice2();
        test.height = 5;
        test.width = 6;
        test.length = 3;
        System.out.print("The volume of the boxcar is ");
        System.out.println(Practice2.boxCar(test.height, test.width, test.length));
    }   
}
