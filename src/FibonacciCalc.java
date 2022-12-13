public class FibonacciCalc {
    public static void main(String[] args) {
     // create method called Fibonacci()
    Fibonacci(30);
    Fibonacci(100);
    Fibonacci(1000);
    }
    public static void Fibonacci (int bound) {
       //bound means boundary so it will work till that number
       int num1 = 0;
       int num2 = 1;

       int nextNum = num1 + num2;
        System.out.print(num1 + " " + num2);
       while (nextNum < bound) {
           System.out.print(" " + nextNum);
           num1 = num2;
           num2 = nextNum;
           nextNum = num1 + num2;

            }
        System.out.println();
       }
    }
