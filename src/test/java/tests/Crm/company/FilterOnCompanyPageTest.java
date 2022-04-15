package tests.Crm.company;

import lib.CoreTestCase;
import lib.ui.CRM.CompanyFilterPageObject;
import lib.ui.LoginPageObject;
import org.junit.Test;

public class FilterOnCompanyPageTest extends CoreTestCase {

    @Test
    public void testWorkFilterOnCrmCompanyPage() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.processLoginOrganizationAndUser();

        CompanyFilterPageObject CrmPageObject = new CompanyFilterPageObject(driver);
        CrmPageObject.moveToCompanyInCrm();
    }
}
