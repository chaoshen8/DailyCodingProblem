import java.util.Arrays;
import java.util.List;

/*
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */
public class Problem1
{
    public static void main(String[] arg)
    {
        List<Integer> numbers = Arrays.asList(10, 15, 3, 7);

        System.out.println(isSumOfTwoNumsEqualK(numbers, 220));
    }

    private static boolean isSumOfTwoNumsEqualK(List<Integer> numbers, Integer k)
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            for(int j = i+1; j < numbers.size(); j++)
            {
                System.out.println("Processing " + numbers.get(i) + " + " + numbers.get(j));
                if(numbers.get(i) + numbers.get(j) == k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
