package com.attraya.httpclientdemo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities"))
				.GET().build();
		request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities"))
				.POST(BodyPublishers.ofString("{\r\n" + "  \"id\": 0,\r\n" + "  \"title\": \"string\",\r\n"
						+ "  \"dueDate\": \"2023-06-21T17:52:45.271Z\",\r\n" + "  \"completed\": true\r\n" + "}"))
				.header("Content-Type", "application/json").build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Status :: " + response.statusCode());
		System.out.println(response.body());
		HttpHeaders headers = response.headers();
		System.out.println(headers.map());
	}

}

//Output:
//	Status :: 200
//	{"id":0,"title":"string","dueDate":"2023-06-21T17:52:45.271Z","completed":true}
//	{api-supported-versions=[1.0], content-type=[application/json; charset=utf-8; v=1.0], date=[Wed, 21 Jun 2023 18:01:46 GMT], server=[Kestrel], transfer-encoding=[chunked]}
