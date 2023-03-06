public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Complex real = new Complex(5,2);
        Complex imaginary = new Complex(3,4);

        System.out.println(real.sum(real,imaginary));

        System.out.println(real.subtraction(real,imaginary));

        System.out.println(real.multiplication(real,imaginary));

        System.out.println(real.division(real,imaginary));

    }
}