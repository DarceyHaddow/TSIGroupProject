import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CurrentOrderTest {

    @Test
    public void testGetCurrentOrder() {
        CurrentOrder order = new CurrentOrder();
        order.currentOrderValue = 9.0;
        double result = order.getCurrentOrder();
        assertEquals(9.0, result);
    }

    @Test
    public void testCurrentOrderValueMock(){

        CurrentOrder mockCurrentOrder = mock(CurrentOrder.class);
        double productPrice = mockCurrentOrder.initaliseCurrentOrder();
        when(mockCurrentOrder.currentOrderValue(productPrice)).thenReturn(2.15);
        double currentOrderValue = mockCurrentOrder.currentOrderValue(productPrice);
        assertEquals(2.15, currentOrderValue);

    }
    @Test
    public void testOutputCurrentOrderMock(){

        CurrentOrder mockCurrentOrder = mock(CurrentOrder.class);
        double currentOrderValue = mockCurrentOrder.initaliseCurrentOrder();
        when(mockCurrentOrder.outputCurrentOrder()).thenReturn("1.35");
        String output = mockCurrentOrder.outputCurrentOrder();
        assertEquals("1.35", output);

    }
    @Test
    public void testInitaliseCurrentOrder() {
        CurrentOrder order = new CurrentOrder();
        order.currentOrderValue(7.30);
        order.initaliseCurrentOrder();
        double result = order.getCurrentOrder();
        assertEquals(0.0, result);
    }


}
