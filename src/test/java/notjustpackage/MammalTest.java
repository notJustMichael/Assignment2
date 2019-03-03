package notjustpackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MammalTest {

    private Mammal cow;

    @Before
    public void setUp() throws Exception {
        new Human(0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void breathe() throws Exception {
        int result = cow.Breathe();
        Assert.assertEquals(1,result);
    }

}