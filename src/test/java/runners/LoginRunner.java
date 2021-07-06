package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        plugin = {"pretty", "html:target/Cucumber-html-report"},
        stepNotifications = true,
        glue = "steps",
        dryRun = false,
        monochrome = true,
        snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
        tags = {
                "@LinkHassala"
                + " or @UnLinkHassala"
//                 + " or @AcceptJameya1"
//                + " or @AcceptJameya2"
//                + " or @StartJameya"
//                + " or @DeleteJameya"
//                 + " or @CreateHassala"
//                 + " or @LinkHassala"
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
//                 + " or @UnLinkHassala"






        })

//        tags = {
//              "@CreateJameya"
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


