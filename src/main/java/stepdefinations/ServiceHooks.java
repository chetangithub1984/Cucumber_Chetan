package stepdefinations;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

/**
 * 
 * @author Bhanu Pratap Singh
 * https://www.udemy.com/seleniumbybhanu/
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 *
 */
public class ServiceHooks {


	@Before
	public void initializeTest() {
		System.out.println("Before Method invoked");
	}

	@After
	public void endTest(Scenario scenario) {

		System.out.println("After Method invoked" + scenario.getName());
	}
}
