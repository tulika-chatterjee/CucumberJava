package Step.com;

import Base.Com.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


import java.util.ArrayList;
import java.util.List;

public class Login extends BaseUtil {

    private BaseUtil base;

  public Login(BaseUtil base) {
        this.base = base;
    }


    @Given("^I am on login page$")
    public void i_am_on_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.print("The browser is " + base.stepinfo);

    }

    @And("^I pass the login details as following$")
    public void iPassTheLoginDetailsAsFollowing(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       /* final List<List<String>> data = table.raw();
        System.out.print("User name is " + data.get(1).get(0)+ " and password is " + data.get(1).get(1));*/

        List<usercreadentials> users = new ArrayList<usercreadentials>();
        users = table.asList(usercreadentials.class);
        for (usercreadentials strusercred : users)
        {
            System.out.print("\n User name is " + strusercred.username+ " and password is " + strusercred.password);
        }
    }

    @When("^I hit the login button$")
    public void i_hit_the_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see the home page of platform$")
    public void i_sould_see_the_home_page_of_platform() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I pass ([^\"]*) and ([^\"]*)$")
    public void iPassUsernameAndPassword(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.print("\n The username is " + username + " and the password is "+ password);
    }

    @Then("^I sould see the home page of platform$")
    public void iSouldSeeTheHomePageOfPlatform() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


    public class usercreadentials
    {
        public String username;
        public String password;

        public usercreadentials(String susername , String spassword)
        {
            username = susername;
            password = spassword;
        }
    }
    
}
