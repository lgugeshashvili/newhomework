package PageObject;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterByPriceElements {
    public SelenideElement
    messageclose= $(byAttribute("onclick", "rentVoteClose()")),
    selectrealestate=$(".p-absolute"),
    forrent=$(byAttribute("data-adtypes", "3")),
    appartments=$(byAttribute("for", "cat1")),
    nextclick=$(byId("NextInput")),
    tbilisicity= $(byAttribute("for","city_1996871")),
    samgoridistrict=$(byAttribute("onclick", "search.locs.load.districts(688330506, false, true)")),
    varketiliBtn=$(byAttribute("for", "loc411355289")),
    findBtn=$(byText("მოძებნე")),
    pricefilter=$(byText("ფასი")),
    priceInput=$(byId("price-to")),
    currencyBtn=$(".switcher-circle"),
    appartmentPrice=$(".item-price-gel", 0);

    public ElementsCollection appartmentfields=$$(byClassName("card-body"));




}
