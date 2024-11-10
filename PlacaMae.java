package Computador;

public class PlacaMae {
    private String marca;
    private String modelo;
    private Processador processador;
    private Hd hd;
    private Memoria memoria;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", processador=" + processador +
                ", hd=" + hd +
                ", memoria=" + memoria +
                '}';
    }
}
