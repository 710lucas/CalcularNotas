import java.util.List;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private List<Double> notas;
    private CalculadoraDeNotaFinalIF calculoDeNota;



    public String getNome(){
        return nome;
    }

    public void setNotas(List<Double> notas){
        this.notas = notas;
    }

    public void adicionaNota(Double nota){
        notas.add(nota);
    }

    public void setCalculoDeNota(CalculadoraDeNotaFinalIF calculoDeNota) {
        this.calculoDeNota = calculoDeNota;
    }

    public double calculaNota(){
        return calculoDeNota.calculaNotaFinal(notas);
    }

    public void setMelhorCalculo(){
        CalculadoraDeNotaFinalIF media = new Media();
        CalculadoraDeNotaFinalIF mediaPonderada = new MediaPonderada();
        CalculadoraDeNotaFinalIF ultima = new UltimaNota();

        double notaMedia = media.calculaNotaFinal(notas);
        double notaPonderada = mediaPonderada.calculaNotaFinal(notas);
        double notaUltima = ultima.calculaNotaFinal(notas);

        if(notaMedia > notaPonderada && notaMedia > notaUltima){
            setCalculoDeNota(media);
        }
        else if(notaUltima > notaPonderada && notaUltima > notaMedia){
            setCalculoDeNota(ultima);
        }
        else{
            setCalculoDeNota(mediaPonderada);
        }
    }

    @Override
    public String toString(){
        String retorno = nome;
        for(Double nota : notas){
            retorno += " "+nota;
        }
        return retorno;
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return Double.compare(calculaNota(), outroAluno.calculaNota());
    }

}
