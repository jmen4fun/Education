package homeTask7;

public class FractNumb {
    private double numer;
    private double denum;

    public FractNumb(double numerator, double denominator){
        this.numer = numerator;
        this.denum = denominator;
    }

    public double sumFractionNumbers(FractNumb fractionNumber){
        return (this.numer * fractionNumber.denum + fractionNumber.numer * this.denum) / (this.denum * fractionNumber.denum);
    }

    public double minusFractionNumbers(FractNumb fractionNumber){
        return (this.numer * fractionNumber.denum - fractionNumber.numer * this.denum) / (this.denum * fractionNumber.denum);
    }

    public double multiplyFractionNumbers(FractNumb fractionNumber){
        return (this.numer * fractionNumber.numer) / (this.denum * fractionNumber.denum);
    }

    public double devideFractionNumbers(FractNumb fractionNumber){
        return (this.numer * fractionNumber.denum) / (this.denum * fractionNumber.numer);
    }

    @Override
    public String toString() {
        return "FractionNumbers{" +
                "numerator=" + numer +
                ", denominator=" + denum +
                '}';
    }
}
