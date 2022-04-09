package com.example.desafioAlura.DaysOfCode;

import java.io.IOException;
import java.util.List;

import com.example.desafioAlura.DaysOfCode.Entity.Filme;
import com.example.desafioAlura.DaysOfCode.Service.FilmeService;

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {

	FilmeService fs= new FilmeService();
	 String api = "https://imdb-api.com/en/API/Top250Movies/k_i5x35d3q";

	
//	fs.listFilme(api);
	List<Filme> filmes= fs.listFilme(api);
	
	for(Filme item: filmes) {
		System.out.println(item.getRank());
		System.out.println(item.getFullTitle());
		System.out.println(item.getImage());
	}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// o endereco que vou buscar
//				HttpRequest request = HttpRequest.newBuilder().GET()
//						.uri(URI.create("https://imdb-api.com/en/API/Top250Movies/k_i5x35d3q")).build();
//
//				// quem vai receber
//				HttpClient httpClient = HttpClient.newBuilder().build();
//
//				// quem vai fazer os paranaue
//				HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
//
//				String json = response.body();
//				
//				System.out.println( json.substring(0, 1000));
//				System.out.println();
//				
//				String jsonPuro = "{\"items\":[{\"id\":\"tt0111161\",\"rank\":\"1\",\"title\":\"The Shawshank Redemption\",\"fullTitle\":\"The Shawshank Redemption (1994)\",\"year\":\"1994\",\"image\":\"https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,3,128,176_AL_.jpg\",\"crew\":\"Frank Darabont (dir.), Tim Robbins, Morgan Freeman\",\"imDbRating\":\"9.2\",\"imDbRatingCount\":\"2569403\"},{\"id\":\"tt0068646\",\"rank\":\"2\",\"title\":\"The Godfather\",\"fullTitle\":\"The Godfather (1972)\",\"year\":\"1972\",\"image\":\"https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,1,128,176_AL_.jpg\",\"crew\":\"Francis Ford Coppola (dir.), Marlon Brando, Al Pacino\",\"imDbRating\":\"9.2\",\"imDbRatingCount\":\"1769058\"}]}";
//
//				
//				JSONObject items = new JSONObject(json);
//				JSONArray array = items.getJSONArray("items");
//				List<Filme> filmes= new ArrayList<>();
//				
//				for (int i = 0; i < array.length(); i++) {
//
//					JSONObject dados = array.getJSONObject(i);
//					Filme filme= new Filme();
//					filme.setId(dados.getString("id"));
//					filme.setRank(dados.getString("rank"));
//					filme.setTitle(dados.getString("title"));
//					filme.setFullTitle(dados.getString("fullTitle"));
//					filme.setYear(dados.getString("year"));
//					filme.setImage(dados.getString("image"));
//					filme.setCrew(dados.getString("crew"));
//					filme.setImDbRating(dados.getString("imDbRating"));
//					filme.setImDbRatingCount(dados.getString("imDbRatingCount"));
//					
//					filmes.add(filme);
//					
//					
////					System.out.println("Impressao: "+(i+1));
////					System.out.println("id: " + dados.getString("id"));
////					System.out.println("Titulo: " + dados.getString("title"));
////					System.out.println();
//					
//				}
//				for( Filme item: filmes) {
//					
//					System.out.println(item.getRank());
//					System.out.println(item.getFullTitle());
//				}
//				
//				System.out.println("foi??");

	}

}
