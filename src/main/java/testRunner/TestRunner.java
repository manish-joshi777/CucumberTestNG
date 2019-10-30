package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
        features="/media/manish/data2/IJ/IJ_Projects/CucumberTestNG/src/main/java/feature/freeCRM.feature",
        glue={"stepDefinition"},
        format = {"pretty",
                        "html:target/cucumber-reports/cucumber-pretty",
                        "json:target/cucumber-reports/CucumberTestReport.json",
                        "rerun:target/cucumber-reports/rerun.txt"
        },
        plugin = "json:target/cucumber-reports/CucumberTestReport.json"

)
public class TestRunner  {

    private TestNGCucumberRunner testRunner;

    @BeforeClass
    public void setUP()
    {
        testRunner = new TestNGCucumberRunner(this.getClass());

    }
    @Test(description="login",dataProvider="features", groups = "cucumber")
    public void login(CucumberFeatureWrapper cFeature)
    {
        testRunner.runCucumber(cFeature.getCucumberFeature());
    }
    @DataProvider(name="features")
    public Object[][] getFeatures()
    {
        return testRunner.provideFeatures();
    }
    @AfterClass
    public void tearDown()
    {
        testRunner.finish();
    }

}
