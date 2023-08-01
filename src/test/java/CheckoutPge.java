import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckoutPge extends BasePage {
    public CheckoutPge(WebDriver driver){
        super(driver);
    }

    @FindBy(className = "inventory_item_name")
    private List<WebElement> itemNames;

    public boolean isOnCheckoutPage(){
        return driver.getCurrentUrl().contains("checkout-step-one.html");
    }

    public List<String> getItemNames(){
        return itemNames.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    /*public List<String> itemNames(){
        List<String> names = new ArrayList<>();
        for(WebElement item : itemNames){
            names.add(item.getText());
        }
        return names;
    }*/
}
