import java.time.LocalDateTime;

public class Transacao {
    private LocalDateTime dataHora;
    private String tipo;
    private double montante;

    public Transacao(String tipo, double montante) {
        this.dataHora = LocalDateTime.now();
        this.tipo = tipo;
        this.montante = montante;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    @Override
    public String toString() {
        return "\n---" +
                "\nTransacao realizada em " + dataHora +
                "\nTipo: " + tipo +
                "\nMontante: " + montante +
                "\n---";
    }
}
