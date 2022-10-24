package br.puc.ua.intro_heranca.source;

public class VeiculoCarga extends Veiculo {

    private double capacidadeMaximaCarga;
    private double altura;
    private double largura;
    private double profundidade;

    public VeiculoCarga(String placa, String procedencia, String marca, String modelo, int anoModelo, int anoFabricacao,
            String numChassi, String renavam, String combustivel, String motor, double capacidadeMaximaCarga,
            double altura, double largura, double profundidade) {
        super(placa, procedencia, marca, modelo, anoModelo, anoFabricacao, numChassi, renavam, combustivel, motor);
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

}
