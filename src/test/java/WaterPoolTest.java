import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WaterPoolTest {
    @Test
    public void testHeightBounds() {
        int[] input = {1, 32001, 3};
        assertThrows(IllegalArgumentException.class, () -> WaterPool.calculateWaterAmount(input));
    }

    @Test
    public void testNegativeHeight() {
        int[] input = {-1, 5, 3};
        assertThrows(IllegalArgumentException.class, () -> WaterPool.calculateWaterAmount(input));
    }

    @Test
    public void testPositionBounds() {
        int[] input = new int[32001];
        assertThrows(IllegalArgumentException.class, () -> WaterPool.calculateWaterAmount(input));
    }

    @Test
    public void testZeroBounds() {
        int[] input = new int[0];
        assertThrows(IllegalArgumentException.class, () -> WaterPool.calculateWaterAmount(input));
    }

    @Test
    public void testWaterAmount() {
        int[] input =  {5,2,3,4,5,4,0,3,1};
        assertEquals(9, WaterPool.calculateWaterAmount(input));
    }

    @Test
    public void testWaterAmount2() {
        int[] input =  {5,0,6};
        assertEquals(5, WaterPool.calculateWaterAmount(input));
    }

    @Test
    public void testWaterAmount3() {
        int[] input =  {0,5,0,5,0};
        assertEquals(5, WaterPool.calculateWaterAmount(input));
    }

    @Test
    public void testWaterAmount4() {
        int[] input =  {0,5,5,0};
        assertEquals(0, WaterPool.calculateWaterAmount(input));
    }
}