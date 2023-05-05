package com.demo.java11;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author Dell
 *
 */
public class HttpClientDemo {

	/**
	 * @param args
	 */
	// define the URL with HttpClient object ! 
	

		
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.google.com";
		HttpClient httpClient=HttpClient.newHttpClient();
		
		
		 
		try {
			
			HttpRequest httpRequest=HttpRequest.newBuilder(new URI(url)).GET().build();
			
			HttpResponse httpResponse=httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("Request:-->" +httpRequest);
			System.out.println("Responce is-->\n" +httpResponse.body() );
		}catch(URISyntaxException ex) {
			
		   ex.printStackTrace();;
			
		}
	}
}