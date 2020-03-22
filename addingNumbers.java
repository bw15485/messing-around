public class addingNumbers{
    public static void main(String[] args) {
        addingNumbers twoNum = new addingNumbers();
        int sumNumbers = twoNum.addNumbers(2,5);
        System.out.println("sum of two numbers is " + sumNumbers);
    }

    private int addNumbers(int num1, int num2)
    {
        return num1+ num2;
    }
}