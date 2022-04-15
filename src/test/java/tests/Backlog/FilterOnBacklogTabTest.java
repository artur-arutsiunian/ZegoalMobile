package tests.Backlog;

import lib.CoreTestCase;
import lib.ui.Backlog.FilterByDatePageObject;
import lib.ui.LoginPageObject;
import org.junit.Test;

public class FilterOnBacklogTabTest extends CoreTestCase {

    @Test
    public void testWorkFilterOnBacklogTab() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.processLoginOrganizationAndUser();

        FilterByDatePageObject FilterByDatePageObject = new FilterByDatePageObject(driver);
        FilterByDatePageObject.moveToBacklogFilter();
    }
}
