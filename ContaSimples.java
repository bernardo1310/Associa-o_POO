package Video;
public class ContaSimples extends ContaBancaria {
    private double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            saldoPoupanca += valor;
            return true;
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0 && saldoPoupanca >= valor) {
            saldoPoupanca -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaSimples [saldoPoupanca=" + saldoPoupanca + "]";
    }
}
