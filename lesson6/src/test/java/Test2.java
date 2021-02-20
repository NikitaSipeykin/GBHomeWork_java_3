import org.junit.Assert;
import ru.geekbrains.NSipeykin.lesson6.WorkWithArray;
import org.junit.Test;

public class Test2 {

    @Test
    public void testOne(){
        int[] in = new int[]{1, 1, 1, 4, 4, 1, 4, 4};
        Assert.assertTrue(WorkWithArray.checkArrayFor1And4(in));
    }

    @Test
    public void testTwo(){
        int[] in = new int[]{1, 1, 1, 1, 1, 1};
        Assert.assertFalse(WorkWithArray.checkArrayFor1And4(in));
    }

    @Test
    public void testThree(){
        int[] in = new int[]{4, 4, 4, 4};
        Assert.assertFalse(WorkWithArray.checkArrayFor1And4(in));
    }

    @Test
    public void testFour(){
        int[] in = new int[]{1, 4, 4, 1, 1, 4, 3};
        Assert.assertFalse(WorkWithArray.checkArrayFor1And4(in));
    }
}
