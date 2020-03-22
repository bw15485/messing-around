public class addingNumbers{
    public static void main(String[] args) {
        addingNumbers twoNum = new addingNumbers();
        int sumNumbers = twoNum.addNumbers(2,5);
        int productNumbers = twoNum.multiplyNumbers(2,5);
        
        System.out.println("sum of two numbers is " + sumNumbers);
        System.out.println("product of two numbers is " + productNumbers);
    }

    private int addNumbers(int num1, int num2)
    {
        return num1+ num2;
    }

    private int multiplyNumbers(int num1, int num2)
    {
        return num1*num2;
    }
}