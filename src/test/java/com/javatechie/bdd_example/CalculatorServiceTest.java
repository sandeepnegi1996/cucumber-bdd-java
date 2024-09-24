package com.javatechie.bdd_example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.TestCase;
import org.junit.Assert;

public class CalculatorServiceTest {


    CalculatorService calculatorService=null;
    int additionResult = 0;

    @Given("^Execute Calculator service add method$")
    public void executeCalculatorServiceAddMethod() {
        calculatorService =  new CalculatorService();
    }

    @When("^if i will enter (\\d+) and (\\d+)$")
    public void ifIWillEnterAnd(int arg0, int arg1) {
       additionResult = calculatorService.add(arg0,arg1);
    }

    @Then("^we should get (\\d+)$")
    public void weShouldGet(int arg0) {

        Assert.assertEquals(additionResult,arg0);
    }

}