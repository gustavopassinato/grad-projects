package br.puc.ua.intro_heranca.source;

public class Veiculo {
    private String placa;
    private String procedencia;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private String numChassi;
    private String renavam;
    private String combustivel;
    private String motor;
    private long quilometragem;
    private double consumoMedio;

    public Veiculo(String placa, String procedencia, String marca, String modelo, int anoModelo, int anoFabricacao,
            String numChassi, String renavam, String combustivel, String motor) {
        this.placa = placa;
        this.procedencia = procedencia;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.numChassi = numChassi;
        this.renavam = renavam;
        this.combustivel = combustivel;
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getMotor() {
        return motor;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

}
