package tests;

import lib.CoreTestCase;
import lib.ui.LoginPageObject;
import org.junit.Test;

public class LoginTest extends CoreTestCase {

    @Test
    public void testInitializationCompanyAndUser() throws InterruptedException {
        LoginPageObject LoginPageObject  = new LoginPageObject(driver);
        LoginPageObject.processLoginOrganizationAndUser();
    }
}
