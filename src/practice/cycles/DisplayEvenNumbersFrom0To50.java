package practice.cycles;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {

        //read source data
        var from = 0;
        var to = 50;

        //processing and displaying results
        for (var i = from; i <= to; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
