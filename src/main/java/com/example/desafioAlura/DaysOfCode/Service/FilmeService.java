package com.example.desafioAlura.DaysOfCode.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.example.desafioAlura.DaysOfCode.Entity.Filme;

public class FilmeService {

	private String api = "https://imdb-api.com/en/API/Top250Movies/k_i5x35d3q";
	private List<Filme> filmes;
	private Filme filme;

	public String requisicaoAPI(String api) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(api)).build();
		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		String json = response.body();

		return json;

	}

	public List<Filme> listFilme(String api) throws IOException, InterruptedException {

		JSONObject items = new JSONObject(requisicaoAPI(api));
		JSONArray array = items.getJSONArray("items");
		filmes = new ArrayList<>();

		for (int i = 0; i < array.length(); i++) {

			JSONObject dados = array.getJSONObject(i);
			Filme filme = new Filme();
			filme.setId(dados.getString("id"));
			filme.setRank(dados.getString("rank"));
			filme.setTitle(dados.getString("title"));
			filme.setFullTitle(dados.getString("fullTitle"));
			filme.setYear(dados.getString("year"));
			filme.setImage(dados.getString("image"));
			filme.setCrew(dados.getString("crew"));
			filme.setImDbRating(dados.getString("imDbRating"));
			filme.setImDbRatingCount(dados.getString("imDbRatingCount"));
			filmes.add(filme);
		}
		return filmes;
	}

	public List<Filme> id(String api) throws IOException, InterruptedException {
		JSONObject items = new JSONObject(requisicaoAPI(api));
		JSONArray array = items.getJSONArray("items");
		filmes = new ArrayList<>();

		for (int i = 0; i < array.length(); i++) {

			JSONObject dados = array.getJSONObject(i);
			filme = new Filme();
			filme.setId(dados.getString("id"));

		}
		return filmes;

	}

}
//private String id;3
//private String rank;7
//private String title;11
//private String fullTitle;15
//private String year;19
//private String image;23
//private String crew;27
//private String imDbRating;31
//private String imDbRatingCount;35