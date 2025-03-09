class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new MyException("Age must be 18 or above.");
            } else {
                System.out.println("Eligible to vote.");
            }
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}