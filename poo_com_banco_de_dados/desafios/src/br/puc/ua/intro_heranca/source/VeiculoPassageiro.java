package br.puc.ua.intro_heranca.source;

public class VeiculoPassageiro extends Veiculo {
    private String corInterna;
    private String corExterna;
    private int numPortas;
    private int numPassageiros;
    private String opcionais;

    public VeiculoPassageiro(String placa, String procedencia, String marca, String modelo, int anoModelo,
            int anoFabricacao, String numChassi, String renavam, String combustivel, String motor, String corInterna,
            String corExterna, int numPortas, int numPassageiros, String opcionais) {
        super(placa, procedencia, marca, modelo, anoModelo, anoFabricacao, numChassi, renavam, combustivel, motor);
        this.corInterna = corInterna;
        this.corExterna = corExterna;
        this.numPortas = numPortas;
        this.numPassageiros = numPassageiros;
        this.opcionais = opcionais;
    }

    public String getCorInterna() {
        return corInterna;
    }

    public String getCorExterna() {
        return corExterna;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public String getOpcionais() {
        return opcionais;
    }

}
