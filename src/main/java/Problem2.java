import java.util.Arrays;

/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?


 */
public class Problem2
{
    public static void main(String[] arg)
    {
//        int integers[] = { 1, 2, 3, 4, 5 };
//        int integers[] = { 3, 2, 1 };
//        int integers[] = { 7, 13, 17, 26, 49, 3 };
        int integers[] = { 1, -2, -3, -4};
//        int integers[] = { 0, 3, 2, 1};

        // Solution with Division doesn't work with 0 in array
        System.out.println("Solution with Division:    " + Arrays.toString(productOfOtherNums(integers)));
        System.out.println("Solution without Division: " + Arrays.toString(withoutDivision(integers)));

    }

    static int[] productOfOtherNums(int[] integers)
    {
        int [] output = new int[integers.length];
        int product = 1;

        for(int num : integers)
        {
            product *= num;
        }

        for(int i=0; i<integers.length; i++)
        {
            output[i] = product / integers[i];
        }

        return output;
    }

    static int[] withoutDivision(int[] integers)
    {
        int [] output = new int[integers.length];
        for(int i=0; i<integers.length; i++)
        {
            int product = 1;
            for(int j=0; j<integers.length; j++)
            {
                if (i==j)
                {
                    continue;
                }
                product *= integers[j];
            }
            output[i] = product;
        }
        return output;
    }
}
