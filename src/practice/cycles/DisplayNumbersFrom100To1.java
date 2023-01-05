package practice.cycles;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {

        //read source data
        var from = 100;
        var to = 1;
        var step = 1;

        //processing and displaying results
        for (var i = from; i >= to; i-=step)
                System.out.print(i + " ");

    }
}
