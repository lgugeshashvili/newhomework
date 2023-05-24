import StepObject.FilterByPriceSteps;
import org.testng.annotations.Test;
import utils.ChromeRunner;

public class Test1 extends ChromeRunner {
    @Test
    public void myhome1(){
        FilterByPriceSteps filterByPriceSteps=new FilterByPriceSteps();
        filterByPriceSteps.Gotorentpage()
                .sortprice()
                .inputprice("1000")
                .checkfilter();
    }
}
