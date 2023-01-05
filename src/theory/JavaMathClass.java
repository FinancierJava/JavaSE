package theory;

public class JavaMathClass {
    public static void main(String[] args) {
        //Returns the absolute value of an int value
        System.out.println(Math.abs(-1));      // 1
        System.out.println(Math.abs(-21.8d));  // 21.8
        System.out.println(Math.abs(4532L));   // 4532
        System.out.println(Math.abs(5.341f));  // 5.341

        //Returns the value of the first argument raised to the power of the second argument
        System.out.println(Math.pow(3,2)); // 9.0
        System.out.println(Math.pow(4,2)); // 16.0
        System.out.println(Math.pow(5,2)); // 25.0
        System.out.println(Math.pow(5,3)); // 125.0

        //Returns the correctly rounded positive square root of a double value
        System.out.println(Math.sqrt(9));   // 3.0
        System.out.println(Math.sqrt(16));  // 4.0
        System.out.println(Math.cbrt(8));   // 2.0
        System.out.println(Math.cbrt(27));  // 3.0

        //Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        for (int i = 0; i < 5; i++)
            System.out.println(Math.random());

        //Returns the closest long to the argument, with ties rounding to positive infinity
        System.out.println(Math.round(1.3)); // 1
        System.out.println(Math.round(1.4)); // 1
        System.out.println(Math.round(1.5)); // 2
        System.out.println(Math.round(1.6)); // 2

        //The Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println(Math.max(5, 10)); //10

        //The Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.min(5, 10)); //5

    }
}
