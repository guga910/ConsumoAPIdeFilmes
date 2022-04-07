package com.example.desafioAlura.DaysOfCode;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Solicitacao {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// o endereco que vou buscar
				HttpRequest request = HttpRequest.newBuilder().GET()
						.uri(URI.create("https://imdb-api.com/en/API/Top250Movies/k_i5x35d3q")).build();

				// quem vai receber
				HttpClient httpClient = HttpClient.newBuilder().build();

				// quem vai fazer os paranaue
				HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

				String json = response.body();
				
				System.out.println( json.substring(0, 250));
				
				String jsonPuro= json.replace("{", " ");
				String textoInicial= jsonPuro.substring(11);
				String[] filme= textoInicial.split("}");
				
				for(int i=0; i<250; i++) {
					String[] atributo= filme[i].split("\"");
					
				System.out.println("\nImpressão: "+(i+1));
				System.out.println("title: "+ atributo[11]);
				System.out.println("image: "+ atributo[23]);
				}
		
	}

}
