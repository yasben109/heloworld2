public class ProgrammeDeCalcule {

    public static void main(String[] args) {
        int a, b, add, sous, multi, dive;
        a = 10;
        b = 5;
        add = addition(a, b);
        sous = subtraction(a, b);
        multi = multiplication(a, b);
        dive  = division(a, b);

        System.out.println("subtraction = " + sous);
        System.out.println("addition = " + add);
        System.out.println("multiplication = " + multi);
        System.out.println("division = " + dive);

    }

    private static int addition (int a, int b){
        int c;
        c = a + b;
        return c;
    }

    private static int subtraction(int a, int b){
        int c;
        c = a - b;
        return c;
    }
    private static int multiplication (int a, int b){
        int c;
        c = a * b;
        return c;
    }

    //comment
    private static int division (int a, int b){
        int c;
        c = a / b;
        return c;
    }

}
