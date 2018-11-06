public class Main {
    public static void main(String[] args) {
        Summator calculator=new Summator();
        int result;
        calculator.setFirstNumber(2);
        calculator.setSecondNumber(2);

            result = calculator.sum();
            System.out.println(result);

        calculator.setFirstNumber(6);
        calculator.setSecondNumber(-4);

        result = calculator.sum();
        System.out.println(result);

        calculator.setFirstNumber(64);
        calculator.setSecondNumber(36);
        result = calculator.sum();
        System.out.println(result);

        calculator.setFirstNumber(2000000000);
        calculator.setSecondNumber(2000000000);
        result = calculator.sum();
        System.out.println(result);
    }


}
