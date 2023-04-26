import java.util.List;

public class MediaPonderada implements CalculadoraDeNotaFinalIF{

    @Override
    public double calculaNotaFinal(List<Double> notas) {

        int pesosTotais = 0;
        double notasTotais = 0;
        for(Double nota : notas){
            int peso = notas.indexOf(nota)+1;
            notasTotais += nota*peso;
            pesosTotais += peso;
        }
        return notasTotais/pesosTotais;

    }
}
