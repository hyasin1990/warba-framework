package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.extern.log4j.Log4j2;

//To run multiple tags :
// tags = {"@CreateHassala"
//   +" or @RemoveSaveAs"

<<<<<<< HEAD
=======
// Testing fetch ...
>>>>>>> 9b9227fcf266de4294b2628ecf2e95a2f4df8a52
@CucumberOptions(
        features = "src/test/java/features",
        tags = {
                "@AddKharda"
//                + " or @Topup"
//                + " or @ManageHassala"
//               + " or @Withdraw"
//                + " or @AddKharda"
//                + " or @AddSaveAs"
//                + " or @AddAutomated"
//                + " or @AddSweep"
//                + " or @RemoveKharda"
//                + " or @RemoveSaveAs"
//                + " or @RemoveAutomated"
//                + " or @RemoveSweep"
//                + " or @ViewAll"
//                + " or @BreakZeroHassala"
        },
        glue = {"steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/html-reports",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt", "json:target/cucumber.json", "html:target/site/cucumber-pretty",
        },
        dryRun = false,
        monochrome = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@Log4j2
public class TestRunner extends AbstractTestNGCucumberTests {

}
//
//        tags = {"@CreateHassala"
//                + " or @Topup"
//                + " or @ManageHassala"
//                + " or @Withdraw"
//                + " or @AddKharda"
//                + " or @AddSaveAs"
//                + " or @AddAutomated"
//                + " or @AddSweep"
//                + " or @RemoveKharda"
//                + " or @RemoveSaveAs"
//                + " or @RemoveAutomated"
//                + " or @RemoveSweep"
//                + " or @ViewAll"
//                + " or @BreakZeroHassala"
