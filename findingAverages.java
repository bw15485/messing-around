import java.util.Arrays; 
import java.util.List; 
import java.util.ArrayList;

public class findingAverages{

    findingAverages()
    {
        int denominator = 1;
        double scaleFactor = 0.5;
    }
        
    
    public static void main(String[] args) {

        ArrayList<Integer> prices = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
         
        findingAverages firstAverage = new findingAverages();

        int normalAverage =firstAverage.normalAverage(prices);

        System.out.println("normal mean " + normalAverage);
    }

    private int normalAverage(ArrayList<Integer> numbers)
    {
        int total = 0;

        for(int num : numbers)
        {
            total += num;
        }

        return total;
    }
}