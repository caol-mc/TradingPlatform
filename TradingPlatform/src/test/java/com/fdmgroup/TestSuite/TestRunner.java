package com.fdmgroup.TestSuite;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "C://Users//caol.mcnamara//JavaEclipseWorkspace//TradingPlatform//src//main//java//featureFiles"
		,tags={" @AddNewAccountAndAddCurrency"}
		,glue={"stepDefinitionFiles"}
		)
	 
	public class TestRunner{
	 
	}

