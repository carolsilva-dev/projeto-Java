package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

   /*
    public void inclui(Filme f) {
        tempoTotal += f.getDuraçaoEmMinutos();
    }
    public void inclui(Serie s) {
        tempoTotal += s.getDuraçaoEmMinutos();
    }
    */

    public void inclui(Titulo titulo) {
         this.tempoTotal += titulo.getDuraçaoEmMinutos();
    }
}
