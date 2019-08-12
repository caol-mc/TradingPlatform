package com.fdmgroup.selenium.datafile;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testData {

	public static void main(String[] args) {

		SimpleDateFormat todayDate = new SimpleDateFormat("dd-MMM-YYYY");
		String s = todayDate.format(new Date());
		
		System.out.println(s);
		
	}

}
