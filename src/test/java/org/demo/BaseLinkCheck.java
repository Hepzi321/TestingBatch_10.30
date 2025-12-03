package org.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BaseLinkCheck {
	public static void brokenLinkCheck(String link) 
	{
		HttpURLConnection httpurl = null;
		
		URL url = new URL(link);
	     httpurl = (HttpURLConnection)url.openConnection();
		httpurl.connect();
		
		int responseCode = httpurl.getResponseCode();
		if(responseCode>=400)
		{
			System.out.println("broken link " + link);
		}
		else
		{
			System.out.println("Not a broken link "+link);
		}
		
	}

}
