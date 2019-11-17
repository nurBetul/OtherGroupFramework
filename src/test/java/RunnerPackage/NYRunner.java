package RunnerPackage;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src\\test\\java\\_NYFacultyFeature",
        glue="StepDefinitionFiles.NYFaculty",
        tags = {"@NY"}
)

public class NYRunner {



}