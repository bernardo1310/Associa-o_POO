package Computador;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "EquipamentoEletronico{" +
                "tensao=" + tensao +
                ", consumo=" + consumo +
                '}';
    }
}
