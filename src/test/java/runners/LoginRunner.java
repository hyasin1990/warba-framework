package runners;


import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        stepNotifications = true,
        glue = "steps",
        dryRun = false,
        monochrome = true,
        snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
        tags = {"@AddSaveAs"
                + " or @RemoveSaveAs"
//                 + " or @ViewAll"
//                + " or @AddKharda"
//                + " or @AddSaveAs"
//                + " or @AddAutomated"
//                + " or @AddSweep"
                //  + " or @AddKharda"
//                + " or @RemoveSaveAs"
//                + " or @RemoveAutomated"
//                + " or @RemoveSweep"
                // + " or @Withdraw"s
                // + " or @ViewAll"
                // + " or @BreaZerokHassala"
                // + " or @Topup"
                //  + " or @ManageHassala"

//                + " or @BreakZeroHassala"
        })
//tags = {"@WithTable"}
//tags = {"~@Neg"} : In order to run all scenarios that do not have this tag

public class LoginRunner {
}
  /*  Done Stuff
         +" or @ViewAll"
                 +" or @BreaZerokHassala"
                 "@Withdraw"
                 +" or @Topup"
                 +" or @ManageHassala"
                 */


