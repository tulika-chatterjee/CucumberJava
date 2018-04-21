package Step.com;

import Base.Com.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ApplicationInitialisation extends BaseUtil {

    private BaseUtil base;

    public ApplicationInitialisation(BaseUtil base) {
        this.base = base;
    }



  /*   @Before
    public void InitialiseApplication()
    {
        System.out.print("\n The Application is open");
    }

    @After
    public void TeardownApplication()
    {
        System.out.print("\n The Application is closed");
    }*/

    @Before("@Start")
    public void InitialiseSettings()
    {
        System.out.print("\n The application is login");
        base.stepinfo = "Firefox";
    }

    @After("@End")
    public void TeardownSettings()
    {
        System.out.print("\n The application is Closed");
    }


}
