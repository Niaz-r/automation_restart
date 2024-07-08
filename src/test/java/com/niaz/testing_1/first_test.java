package com.niaz.testing_1;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class first_test extends BaseDriver {
	@Test
	public void first_test() throws InterruptedException {
		
		
		driver.get("https://classroom.google.com/c/NjAwNTg4MTcwODEw/m/NjEzNzQ2NDg4MjU2/details");
		Thread.sleep(5000);
		
		
	}

}
