package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.excecao.ErroConversaoDeAnoException;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duraçaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroConversaoDeAnoException( "Não consegui converter o ano porque tem mais de 4 caracteres"
            );
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duraçaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }


    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuraçaoEmMinutos() {
        return duraçaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuraçaoEmMinutos(int duraçaoEmMinutos) {
        this.duraçaoEmMinutos = duraçaoEmMinutos;
    }

    // palavra void significa vazio ele nos permite fazer funções que não retornam nada e funções que não têm parâmetros.
    public void exibeFichaTecnica() {
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Nome do filme:" + nome);
    }

    public void avalia(double nota) {
        // a linha de baixo é abreviação desse: somaDasAvaliacoes = somaDasAvaliacoes + nota;  as duas formas estão corretas
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;  // O uso do ++ significa que a cada avaliação vai encrementar a nota
    }


    public double retonaMediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

        @Override
        public String toString() {
            return "(nome = " + nome +
                    ", anoDeLancamento = " + anoDeLancamento + "," +
                    " duração = " + duraçaoEmMinutos + ")";

        }
    }



