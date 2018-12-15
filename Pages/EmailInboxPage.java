package com.Pages;

import java.io.IOException;

import com.BaseClass.BaseClass;

public class EmailInboxPage extends BaseClass {

	public EmailInboxPage() throws IOException {
		super();
		
	}
	
	
	
	
	
	public void InboxGetName() {
		
		String s1 = driver.getTitle();
		System.out.println(s1);
		
	}

}
