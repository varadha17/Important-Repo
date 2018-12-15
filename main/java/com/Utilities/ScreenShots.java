package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BaseClass;

public class ScreenShots extends BaseClass{

	public ScreenShots() throws IOException {
		super();
		
	}
	
	public void ScreenShotTest(String MethodNameVerify) throws IOException {
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\name\\eclipse-workspace\\GoogleTest\\Failed Screenshots\\"+MethodNameVerify+".jpg"));

		
	}

}
