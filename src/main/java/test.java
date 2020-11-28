import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;

public class test {
    public static void main(String[] args) {

    }

    public double sumofsquares(double[] values)
    {
        double value;
        SumOfSquares test1 = new SumOfSquares();
        if(test1.evaluate(values)>0)
            return value= test1.evaluate(values);
        else
            return 0;
    }
    public double getmean(double[] values)
    {
        double value;
        Mean test2=new Mean();
        if(test2.evaluate(values)>0)
            return value=test2.evaluate(values);
        else
            return 0;
    }
}
