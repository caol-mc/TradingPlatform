package com.fdmgroup.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.fdmgroup.tradingplatform.tests.BuyStock;
import com.fdmgroup.tradingplatform.tests.CheckBalance;
import com.fdmgroup.tradingplatform.tests.Login;
import com.fdmgroup.tradingplatform.tests.Register;
import com.fdmgroup.tradingplatform.tests.ResetPassword;

@RunWith(Suite.class)
@SuiteClasses({
	Register.class,
	ResetPassword.class,
	Login.class,
	CheckBalance.class,
	BuyStock.class,
	
})

public class TestSuite{
	/* empty class */
}

