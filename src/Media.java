import java.util.List;

public class Media implements CalculadoraDeNotaFinalIF{

    @Override
    public double calculaNotaFinal(List<Double> notas) {
        double notaGeral = 0;
        for(double nota : notas){
            notaGeral+=nota;
        }
        return notaGeral/notas.size();
    }
}
