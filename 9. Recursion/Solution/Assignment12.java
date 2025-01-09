public class Assignment12 {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.sumDigit(512);
    }
}

class Recursion {
    int sum = 0;
    int fact = 1;

    void sumNnumber(int n) {
        if (n <= 0) {
            System.out.println("Total sum: " + sum);
            return;
        }
        sum = sum += n;
        sumNnumber(n - 1);
    }

    void sumEvenNumber(int n) {
        if (n <= 0) {
            System.out.println("Total sum: " + sum);
            return;
        }
        if (n % 2 == 0) {
            sum += n;
        }
        sumEvenNumber(n - 1);
    }

    void sumOddNumber(int n) {
        if (n <= 0) {
            System.out.println("Total sum: " + sum);
            return;
        }
        if (n % 2 == 1) {
            sum += n;
        }
        sumOddNumber(n - 1);
    }

    void factorial(int n) {
        if (n == 0 || n == 1) {
            System.out.println("Factorial: " + fact);
            return;
        }
        fact = fact * n;
        factorial(n - 1);
    }

    void sumDigit(int n) {
        if (n == 0) { 
            System.out.println("Sum of digits: " + sum);
            return;
        }
        sum += n % 10; 
        sumDigit(n / 10); 
    }
}
