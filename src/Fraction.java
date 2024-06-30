public class Fraction {
    final int numerator;
    final int denominator;
    public Fraction(int numerator, int denominator){
        if(denominator <= 0) throw new IllegalArgumentException("denominator must be positive and not zero");
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction sum(Fraction f){
        int nom1 = this.numerator;
        int denom1 = this.denominator;
        int nom2 = f.numerator;
        int denom2 = f.denominator;
        if(denom1 != denom2){
            nom1 *= denom2;
            denom1 *= denom2;
            nom2 *= this.denominator;
            denom2 *= this.denominator;
        }
        if(denom1 == denom2) nom1 += nom2;
        return new Fraction(nom1, denom1);
    }
    public Fraction minus(Fraction f){
        int nom1 = this.numerator;
        int denom1 = this.denominator;
        int nom2 = f.numerator;
        int denom2 = f.denominator;
        if(denom1 != denom2){
            nom1 *= denom2;
            denom1 *= denom2;
            nom2 *= this.denominator;
            denom2 *= this.denominator;
        }
        if(denom1 == denom2) nom1 -= nom2;
        return new Fraction(nom1, denom1);
    }
    public Fraction multiply(Fraction f){
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }
    public Fraction div(Fraction f){
        return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }
    public Fraction sum(int x){
        return new Fraction(this.numerator + (x*this.denominator), this.denominator);
    }
    public Fraction minus(int x){
        return new Fraction(this.numerator - (x*this.denominator), this.denominator);
    }
    public Fraction multiply(int x){
        return new Fraction(this.numerator * x, this.denominator);
    }
    public Fraction div(int x){
        return new Fraction(this.numerator, this.denominator * x);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
