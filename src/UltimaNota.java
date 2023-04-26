import java.util.List;

public class UltimaNota implements CalculadoraDeNotaFinalIF{

    @Override
    public double calculaNotaFinal(List<Double> notas) {
        return notas.get(notas.size()-1);
    }
}
