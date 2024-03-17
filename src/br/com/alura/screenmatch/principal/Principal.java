package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Titanic", 1997);
        filme1.setDuraçaoEmMinutos(210);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(6);
        filme1.avalia(5);
        System.out.println("total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.retonaMediaDasAvaliacoes());


        Serie Lost = new Serie("Lost", 2000 );
        Lost.exibeFichaTecnica();
        Lost.setTemporadas(6);
        Lost.setEpisodiosPorTemporada(18);
        Lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie Lost: " + Lost.getDuraçaoEmMinutos());

        Filme filme2 = new Filme("Duro de matar", 2004);
        filme2.setDuraçaoEmMinutos(190);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(Lost);
        System.out.println("Duração em minutos dos titulos: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        filtro.filtra(filme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filme3 = new Filme("Ilha do medo", 2010);
        filme3.setDuraçaoEmMinutos(218);
        filme3.avalia(10);
        filme3.exibeFichaTecnica();

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista:" + listaDeFilmes.size());
        System.out.println("Primeiro filme:" + listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}
