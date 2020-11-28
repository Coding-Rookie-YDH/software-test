import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class testTest {

    @Test
    public void test1()  {
        double[] a = new double[]{0.33, 1.33, 0.27333, 0.3, 0.501,
                0.444, 0.44, 0.34496, 0.33, 0.3, 0.292, 0.667};
        test test1=new test();
        double c=0.00001;
        assertEquals(3.5322966905000004,test1.sumofsquares(a),c);
    }
    @Test
    public void test2()  {
        double[] a = new double[]{0.33, 1.33, 0.27333, 0.3, 0.501,
                0.444, 0.44, 0.34496, 0.33, 0.3, 0.292, 0.667};
        test test2=new test();
        double c=0.00001;
        assertEquals( 0.46269083333333333,test2.getmean(a),c);
    }
    @Test
    public void test3()  {
        double[] a = new double[]{0,1,2,3,4,5,6,7,8,9,10};
        test test3=new test();
        double c=0.00001;
        assertEquals(5,test3.getmean(a),c);
    }
    @Test
    public void test4()  {
        double[] a = new double[]{0.33, 1.33, 0.27333, 0.3, 0.501,
                0.444, 0.44, 0.34496, 0.33, 0.3, 0.292, 0.667};
        test test4= Mockito.mock(test.class);
        Mockito.when(test4.getmean(a)).thenReturn(0.46269083333333333);
        Mockito.when(test4.sumofsquares(a)).thenReturn(3.5322966905000004);
        double c=0.00001;
        assertEquals(0.46269083333333333,test4.getmean(a),c);
        assertEquals(3.5322966905000004,test4.sumofsquares(a),c);
    }
}