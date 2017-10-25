package AppiumMavenK;


import org.junit.After;
import org.junit.Before;


/**
 * Created by Thomas on 2016-06-15.
 */
public class BaseTestClass1 extends AppiumBaseClass{
    protected ContactSearchPage searchPage;
    protected ContactDetailPage detailPage;

    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            
            case IOS:
                searchPage = new ContactSearchPageIOS(driver());
                detailPage = new ContactDetailPageIOS(driver());
                break;
        }
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}