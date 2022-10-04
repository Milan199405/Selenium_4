package com.selenium.practice;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("chrome");
		br.launchUrl("http://amazon.in");
		String title = br.getPageTitle();
		System.out.println(title);
		String url = br.getPageUrl();
		System.out.println(url);
		br.quitBrowser();
	}

}
