package Java8.Lambdas.Custom;

public class PruebaCalculate {
    public static void main(String[] args) {

        //TODO: Creación con clase anonima
        Calculate calculate = new Calculate() {
            @Override
            public double avg(double... numbers) {
                double sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                }
                return sum/numbers.length;
            }
        };
        //System.out.println(calculate.avg(10,20,30));

        Calculate calculate1= (numbers) -> {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum/numbers.length;
        };

        System.out.println(calculate1.avg(10,20,30));

    }
}
