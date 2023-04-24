

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CurrentOrderTest {

    @Test
    public void testCurrentOrderValueMock(){


        CurrentOrder mockCurrentOrder = mock(CurrentOrder.class);
        double productPrice = mockCurrentOrder.initaliseCurrentOrder();
        when(mockCurrentOrder.currentOrderValue(productPrice)).thenReturn(0.0);
        double currentOrderValue = mockCurrentOrder.currentOrderValue(productPrice);
        assertEquals(0.0, currentOrderValue);

    }

}
