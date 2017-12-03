

/**
 * Integration class to do numerical integration.
 * 
 * @author yaw 
 * @version 03 Oct 2014
 */
public class Integration
{
    public static double numericallyIntegrate(double lb, double ub, double numRec)
    {
        double area = 0.0;
        double base = (ub - lb) / numRec;

        for (double midpoint = base / 2 + lb; midpoint < ub; midpoint += base)
        {
            double recArea = base * function(midpoint);
            area += recArea;
        }
       
        return area;
    }
    
    private static double function(double x)
    {
        return x * x;
    }
}