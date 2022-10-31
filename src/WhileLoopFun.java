public class WhileLoopFun
{
    public WhileLoopFun() { }

    public double factorial(int number)
    {
        int count = 1;
        double product = number;
        while (count < number)
        {
            product = product * count;
            count++;
        }
        return product;
    }

    public void printDigits(int number)
    {
        String num = Integer.toString(number);
        int index = num.length();
        while (index > 0)
        {
            System.out.println(num.substring(index - 1, index));
            index--;
        }
    }

    public int sumOfDigits(int number)
    {
        String num = Integer.toString(number);
        int index = num.length();
        int sum = 0;
        int add = 0;
        while (index > 0)
        {
            add = Integer.parseInt(num.substring(index - 1, index));
            sum = sum + add;
            index--;
        }
        return sum;
    }

    public boolean isPrime(int number)
    {
        int count = 1;
        int divisors = 0;
        while (count < number)
        {
            if (number % count == 0)
            {
                divisors++;
            }
            count++;
        }
        if (divisors == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int maxDoubles(int number, int threshold)
    {
        int count = 0;
        int doubled = number;
        while (doubled < threshold)
        {
            doubled = doubled * 2;
            if (doubled <= threshold)
            {
                count++;
            }
        }
        return count;
    }
}
