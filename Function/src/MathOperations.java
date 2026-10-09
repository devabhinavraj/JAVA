class MathOperations {
    public  int add (int a , int b){
        int add = a +b ;
        return add;
    }
    
    public int sub (int a , int b){
        int sub = a - b;
        return sub;
    }

    public int multiply (int a , int b){
        int multiply = a * b;
        return multiply;
    }

    public int divide (int a , int b){
        int divide = a / b;
        return divide;
    }

}

class MathOperationsCall{
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        MathOperations obj = new MathOperations();
        int res = obj.add(a ,b);
        System.out.println(a + " + " + b + " = " + res);
        res = obj.sub(a ,b);
        System.out.println(a + " - " + b + " = " + res);
        res = obj.multiply(a, b);
        System.out.println(a + " * " + b + " = " + res);
        res = obj.divide(a, b);
        System.out.println(a + " / " + b + " = " + res);
    }
}
