package StepObject;

import PageObject.FilterByPriceElements;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

import java.time.Duration;

public class FilterByPriceSteps extends FilterByPriceElements {
    public FilterByPriceSteps Gotorentpage(){
        messageclose.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        selectrealestate.click();
        forrent.click();
        appartments.click();
        nextclick.click();
        tbilisicity.click();
        samgoridistrict.click();
        varketiliBtn.click();
        findBtn.click();
        return this;
    }

    public FilterByPriceSteps sortprice(){
        pricefilter.click();
        return this;
    }
    public FilterByPriceSteps inputprice(String saboloofasi){
        priceInput.setValue(saboloofasi).pressEnter();
        currencyBtn.click();
        return this;
    }

    public FilterByPriceSteps checkfilter(){
        int count=appartmentfields.size();
        String price= appartmentPrice.getText();
        float priceint=Float.parseFloat(price);
        for(int i=0; i<count; i++){
            Assert.assertTrue(priceint<=1000);
        }
        return this;
    }

}
