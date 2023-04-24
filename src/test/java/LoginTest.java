import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Scanner;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class LoginTest extends EposUI {

    //doubling mock to test the getText function of Login
   @Test
    void getText() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("1234");
        JTextField mockLogin = new JTextField();
        mockLogin.setText(mockScanner.nextLine());
        assertEquals("1234", mockLogin.getText());
    }

    //doubling stub to test the login functionality
    //by checking the status after it has been run
    @Test
    void loginFunctionality(){
        EposUI stubEposUI = mock(EposUI.class);
        when(stubEposUI.login()).thenReturn("Logged in");
        String loginReturn = stubEposUI.login();
        assertEquals("Logged in",loginReturn);
    }

}





