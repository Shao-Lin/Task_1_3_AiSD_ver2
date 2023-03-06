public class Complex {
    private double num1;
    private double num2;

    public Complex(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String toString() {
        if(num2 < 0)
            return num1 + "" + num2 + "i";
        if(num1 == 0)
            return num2 + "i";
        if(num2 == 0)
            return num1 + "";
        return num1 + "+" + num2 + "i";
    }
    public Complex sum(Complex real, Complex imaginary){
        return new Complex(real.num1 + real.num2, imaginary.num1 + imaginary.num2);
    }
    public Complex subtraction(Complex real, Complex imaginary){
        return new Complex(real.num1 - real.num2, imaginary.num1 - imaginary.num2);
    }
    public Complex multiplication(Complex real, Complex imaginary){
        return new Complex(real.num1 * real.num2 - imaginary.num1 * imaginary.num2 , imaginary.num1 * real.num2 + real.num1 * imaginary.num2);
    }
    public Complex division(Complex real, Complex imaginary){
        double ac = real.num1 * real.num2;
        double bd = imaginary.num1 * imaginary.num2;
        double bc = imaginary.num1 * real.num2;
        double ad = real.num1 * imaginary.num2;
        double reNum = (ac + bd)/ (Math.pow(real.num2,2) + Math.pow(imaginary.num2, 2));
        double imNum = (bc - ad)/ (Math.pow(real.num2,2) + Math.pow(imaginary.num2, 2));
        return new Complex(reNum, imNum);
    }
}