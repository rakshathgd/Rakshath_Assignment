package corejava.assignments.java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Http {
	public static void main(String[] args) throws URISyntaxException {
		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://httpbin.org/get")).GET().build();
		HttpClient client = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> ressponse = client.send(request, BodyHandlers.ofString());
			System.out.println(ressponse.headers() + " " + ressponse.statusCode() + " " + ressponse.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}