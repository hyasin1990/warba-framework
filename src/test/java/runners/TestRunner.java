package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.extern.log4j.Log4j2;

//To run multiple tags :
// tags = {"@CreateHassala"
//   +" or @RemoveSaveAs"

@CucumberOptions(
        features = "src/test/java/features",
        tags = {
                "@WUSendMoney"
 //                + " or @Login"
//                 + " or @AcceptJameya1"
//                + " or @AcceptJameya2"
//                + " or @StartJameya"
//                + " or @DeleteJameya"
//                 + " or @CreateHassala"
//                 + " or @Topup"
//                 + " or @AddKharda"
//                 + " or @RemoveKharda"
//                 + " or @AddSaveAs"
//                 + " or @RemoveSaveAs"
//                 + " or @AddAutomated"
//                + " or @RemoveAutomated"
//                 + " or @AddSweep"
//                 + " or @RemoveSweep"
//                 + " or @ManageHassala"
//                 + " or @ViewAll"
//                 + " or @Pullup"
//                 + " or @Withdraw"
//                 + " or @BreakHassala"
//                 + " or @BreakZeroHassala"
//                 + " or @CreateSelfStanding"
//                 + " or @AddWuBeneficiary"
//                 + " or @WUSendMoney"
                //                 + " or @TransferFromKnet"

        },
        glue = {"steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/html-reports",
                "html:target/site/cucumber-pretty",
        },
        dryRun = false,
        monochrome = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@Log4j2
public class TestRunner extends AbstractTestNGCucumberTests {

}
//        tags = {
//                "@CreateJameya"
//                 + " or @AcceptJameya1"
//                 + " or @AcceptJameya1"
//                + " or @AcceptJameya2"
//                + " or @StartJameya"
//                + " or @DeleteJameya"
//                 + " or @CreateHassala"
//                 + " or @Topup"
//                 + " or @AddKharda"
//                 + " or @RemoveKharda"
//                 + " or @AddSaveAs"
//                 + " or @RemoveSaveAs"
//                 + " or @AddAutomated"
//                 + " or @RemoveAutomated"
//                 + " or @AddSweep"
//                 + " or @RemoveSweep"
//                 + " or @ManageHassala"
//                 + " or @ViewAll"
//                 + " or @Pullup"
//                 + " or @Withdraw"
//                 + " or @BreakHassala"
//                 + " or @BreakZeroHassala"





//                })