package Computador;

public class Processador {
    private String marca;
    private String modelo;
    private float clock;
    private float cache;

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

    public float getClock() {
        return clock;
    }

    public void setClock(float clock) {
        this.clock = clock;
    }

    public float getCache() {
        return cache;
    }

    public void setCache(float cache) {
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", clock=" + clock +
                ", cache=" + cache +
                '}';
    }
}
