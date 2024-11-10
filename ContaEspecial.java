package Video;
public class ContaEspecial extends ContaBancaria {
    private int diasSemJuros;
    private double limite;
    private CartaoDeCredito cartao;

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite + ", cartao=" + cartao + "]";
    }
}
