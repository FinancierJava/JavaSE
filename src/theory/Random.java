package theory;
public class Random {
    public static void main(String[] args) {
        {
            //random number:
            System.out.println("First random number: " + Math.random());
            System.out.println("Second random number: " + Math.random());
            System.out.println("Third random number: " + Math.random());
        }

        {
            //random number in the range from a to b:
            int a = 0; // The initial value of the range - "from".
            int b = 10; // The final value of the range - "to"

            int random_number1 = a + (int) (Math.random() * b); // Generation of the 1st number
            System.out.println("1-ое случайное число: " + random_number1);

            int random_number2 = a + (int) (Math.random() * b); // Generation of the 2nd number
            System.out.println("2-ое случайное число: " + random_number2);

            int random_number3 = a + (int) (Math.random() * b); // Generation of the 3rd number
            System.out.println("3-е случайное число: " + random_number3);
        }

        {
            //a real number in the interval [20; 60)
            int from = 20, to = 60;

            double result = 20 + (Math.random() * (from - to));
            System.out.println(result);

            //A real number in the interval[ -100; +100)
        }

        {
            int from = -100, to = 100;

            double result = from + (Math.random() * (to - from));
            System.out.println(result);
        }
    }
}
