import org.junit.Assert;
import ru.geekbrains.NSipeykin.lesson6.WorkWithArray;
import org.junit.Test;

public class Test1 {

    @Test
    public void testOne(){
        int[] in  = new int[]{ 1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] out = new int[]{1,7};
        Assert.assertArrayEquals(out, WorkWithArray.getPartOfArray(in));
    }

    @Test
    public void testTwo(){
        int[] in  = new int[]{4, 6, 8, 4, 9, 6, 8, 1, 3, 8, 4, 6};
        int[] out = new int[]{6};
        Assert.assertArrayEquals(out, WorkWithArray.getPartOfArray(in));
    }

    @Test
    public void testThree(){
        int[] in  = new int[]{8, 7, 4, 9, 5, 1, 9, 6, 9, 8, 4, 9, 8, 4, 3, 5, 4};
        int[] out = new int[]{};
        Assert.assertArrayEquals(out, WorkWithArray.getPartOfArray(in));
    }

    @Test(expected = RuntimeException.class)
    public void testFour(){
        int[] in  = new int[]{6, 8, 7, 9, 8, 5, 1, 9, 8, 7, 6, 5 };
        int[] out = new int[]{};
        Assert.assertArrayEquals(out, WorkWithArray.getPartOfArray(in));
    }

    @Test(expected = NullPointerException.class)
    public void testFive(){
        int[] in  = new int[]{};
        int[] out = new int[]{};
        Assert.assertArrayEquals(out, WorkWithArray.getPartOfArray(in));
    }
}
