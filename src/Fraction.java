public class Fraction {
    int numerator;
    int denominator;
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction sumWithFraction(Fraction f){
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
    public Fraction minusWithFraction(Fraction f){
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
    public Fraction multiplyWithFraction(Fraction f){
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }
    public Fraction divWithFraction(Fraction f){
        return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }
    public Fraction sumWithInt(int x){
        return new Fraction(this.numerator + (x*this.denominator), this.denominator);
    }
    public Fraction minusWithInt(int x){
        return new Fraction(this.numerator - (x*this.denominator), this.denominator);
    }
    public Fraction multiplyWithInt(int x){
        return new Fraction(this.numerator * x, this.denominator);
    }
    public Fraction divWithInt(int x){
        return new Fraction(this.numerator, this.denominator * x);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
