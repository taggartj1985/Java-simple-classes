import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
        public void before(){
        bottle = new WaterBottle();
    }

    @Test
        public void getVolume(){
        assertEquals(100, bottle.volume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, bottle.takeDrink());
    }

    @Test
    public void canFill(){
        assertEquals(100, bottle.fillBottle());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, bottle.emptyBottle());
    }

}
