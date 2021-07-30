package nl.paulzijlmans.structural.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https", "app.pluralsight.com", 443, "/profile/author/bryan-hansen");

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;

		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
		System.out.println("end");
	}
}
