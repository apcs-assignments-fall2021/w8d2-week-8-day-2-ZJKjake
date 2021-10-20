public class Rational {
    // instance variables: every Rational object will have its own copy
    // of these variables
    public int numerator;
    public int denominator;
    
    /**
     * Constructor: the special method that will actually create a new Rational
     * object
     * Constructors are always public
     * Constructors have the same name as the class
     * Constructors have no return type
     */
    public Rational(int a, int b) {
        numerator = a;
        denominator = b;
    }
    
    // This method takes two Rationals, add them up,
    // and returns a Rational equal to the sum
    // You will need to:
    // 1) Calculate the value of the new numerator
    // 2) Calculate the value of the new denominator
    // 3) Create a new Rational variable with the two above values
    // 4) Return your new Rational variable
    // (When you write the simplify method later on, you should
    // also call it in this method to return the simplified result)
    public static Rational add(Rational r, Rational s) {
        int a=r.numerator;
        int b=r.denominator;
        int c=s.numerator;
        int d=s.denominator;
        int newNum=a*d+c*b;
        int newDon=b*d;
        for (int i=100;i>1;i--){
            if (newNum%i==0 && newDon%i==0){
                newNum=newNum/i;
                newDon=newDon/i;
            }
        }
        return new Rational(newNum,newDon);
    }

    // This method takes two Rationals, subtracts thems up, 
    // and returns a Rational equal to the difference
    public static Rational subtract(Rational r, Rational s) {
        int a=r.numerator;
        int b=r.denominator;
        int c=s.numerator;
        int d=s.denominator;
        int newNum=a*d-c*b;
        int newDon=b*d;
        for (int i=100;i>1;i--){
            if (newNum%i==0 && newDon%i==0){
                newNum=newNum/i;
                newDon=newDon/i;
            }
        }
        return new Rational(newNum,newDon);
    }
    
    public static Rational multiply(Rational r, Rational s) {
        int a=r.numerator;
        int b=r.denominator;
        int c=s.numerator;
        int d=s.denominator;
        int newNum=a*c;
        int newDon=b*d;
        for (int i=100;i>1;i--){
            if (newNum%i==0 && newDon%i==0){
                newNum=newNum/i;
                newDon=newDon/i;
            }
        }
        return new Rational(newNum,newDon);
    }
    
    public static Rational divide(Rational r, Rational s) {
        int a=r.numerator;
        int b=r.denominator;
        int c=s.numerator;
        int d=s.denominator;
        int newNum=a*d;
        int newDon=b*c;
        for (int i=100;i>1;i--){
            if (newNum%i==0 && newDon%i==0){
                newNum=newNum/i;
                newDon=newDon/i;
            }
        }
        return new Rational(newNum,newDon);
    }

    // Finds the greatest common factor between a and b
    // To find the greatest common factor, find the largest number x
    // such that a and b are both multiples of x
    public static int greatestCommonFactor(int a, int b){
        int temp=1;
        for (int i=1;i<=Math.min(a,b);i++){
            if (a%i==0 && b%i==0){
                temp=i;
            }
        }
        return temp;
    }

    // This method is given a rational, and returns a simplified version
    // of the input rational
    // Use the greatestCommonFactor method here
    // e.g. simplify(2/4) => 1/2
    //      simplify(1/2) => 1/2
    public static Rational simplify(Rational r) {
        int a=r.numerator;
        int b=r.denominator;
        return new Rational(a/greatestCommonFactor(a,b),b/greatestCommonFactor(a,b));
    }

    // This following method is NOT static, we'll talk about it next class!
    // This returns a string representation of a Rational (e.g. "1/2")
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public static void main(String[] args){
        System.out.println(greatestCommonFactor(7,28));
        System.out.println(greatestCommonFactor(64,24));
        System.out.println(greatestCommonFactor(6,8));
        System.out.println(simplify(new Rational(2, 6)));
        System.out.println(simplify(new Rational(12, 628)));

    }
}













