package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Titanic", 1997);
        filme1.avalia(8);
        Filme filme2 = new Filme("Duro de matar", 2004);
        filme2.avalia(7);
        Filme filme3 = new Filme("Ilha do medo", 2010);
        filme3.avalia(10);
        Serie Lost = new Serie("Lost", 2000 );


        ArrayList<Titulo> ListaDeTitulos = new ArrayList<>();
        ListaDeTitulos.add(filme1);
        ListaDeTitulos.add(filme2);
        ListaDeTitulos.add(filme3);
        ListaDeTitulos.add(Lost);
        for (Titulo item: ListaDeTitulos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2){
                System.out.println("Classficação " + filme.getClassificacao());

                ArrayList<String> buscaPorArtista = new ArrayList<>();
                buscaPorArtista.add("Tony Ramos");
                buscaPorArtista.add("Caio Castro");
                buscaPorArtista.add("Claudia Raia");
                buscaPorArtista.add("Fernanda Montenegro ");
                System.out.println(buscaPorArtista);

                Collections.sort(buscaPorArtista);
                System.out.println("Depois da ordenação");
                System.out.println(buscaPorArtista);
                System.out.println("Lista de titulos ordenada");
                Collections.sort(ListaDeTitulos);
                System.out.println(ListaDeTitulos);
                ListaDeTitulos.sort(Comparator.comparing(Titulo:: getAnoDeLancamento));
                System.out.println("Ordenando por ano");
                System.out.println(ListaDeTitulos);
            }
        }
    }
}
