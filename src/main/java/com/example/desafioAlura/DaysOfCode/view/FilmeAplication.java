package com.example.desafioAlura.DaysOfCode.view;

import java.io.IOException;

import com.example.desafioAlura.DaysOfCode.Service.FilmeService;

public class FilmeAplication {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FilmeService filme= new FilmeService();
		String json= filme.RequisicaoAPI();
		
		 filme.title(json).forEach(System.out::println);
		
		
	}

}
