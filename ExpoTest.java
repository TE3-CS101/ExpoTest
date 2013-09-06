import java.util.Scanner;

public class ExpoTest
{
    private double fact(double num)
    {
        if (num < 0)
            throw new IllegalArgumentException("num");
        
        if (num <= 1)
            return 1;
        else
            return num * fact(num - 1);
    }
    
    private double e(double x, double limit)
    {        
        double val = Math.pow(x, limit) / fact(limit);
        
        if (limit > 0)
            val += e(x, limit - 1);
            
        return val;
    }
    
    public void run(double x, double limit)
    {
        System.out.println(e(x, limit));
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        while (true)
        {
            String[] split = reader.nextLine().split(" ");
            new ExpoTest().run(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
        }
    }
}