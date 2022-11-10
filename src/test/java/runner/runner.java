package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Ger",
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "steps"
)

public class runner {
}
