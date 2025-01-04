public class Assignment11 {
    public static void main(String[] args){
        Recursion r = new Recursion();
        r.oddNaturalNumberReverse(10);
    }
}
class Recursion{

    //N number
    void nNumber(int n){
        if(n>0){
            nNumber(n-1);
            System.out.println(n);
        }
    }

    //Reverse number
    void nReverseNumber(int n){
        if(n>0){
            System.out.println(n);
            nReverseNumber(n-1);
        }
    }

    //even natural number number
    void evenNaturalNumber(int n){
        if(n>0){
            evenNaturalNumber(n-1);
            if(n%2==0){
                System.out.println(n);
            }
        }
    }

    //even natural number in reverse
    void evenNaturalNumberReverse(int n){
        if(n>0){
            if(n%2==0){
                System.out.println(n);
            }
            evenNaturalNumber(n-1);
        }
    }

    //odd natural number number
    void oddNaturalNumber(int n){
        if(n>0){
            oddNaturalNumber(n-1);
            if(n%2==1){
                System.out.println(n);
            }
        }
    }

    //odd natural number in reverse
    void oddNaturalNumberReverse(int n){
        if(n>0){
            if(n%2==1){
                System.out.println(n);
            }
            oddNaturalNumberReverse(n-1);
        }
    }
}
