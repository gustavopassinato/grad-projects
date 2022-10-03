import java.util.List;


public class RegistradorDistancia {
    private List<Sintoma> listaPadrao;
    private List<Sintoma> listaMenorDiferenca;
    private double ultimaDiferenca = -1000000000;

    public RegistradorDistancia(List<Sintoma> lisaPadrao) {
        this.listaPadrao = lisaPadrao;
    }

    public void comparaDistanciad(List<Sintoma> novaLista){
        double diferencaParcial = calculaDiferenca(novaLista);

        if (diferencaParcial < this.ultimaDiferenca){
            this.ultimaDiferenca = diferencaParcial;
            this.listaMenorDiferenca = novaLista;
        }
    }

    private double calculaDiferenca(List<Sintoma> novaLista) {
        double comp =0;
        for(int i = 0; i< this.listaPadrao.size(); i++){
            comp += Math.pow((listaPadrao.get(i).getIntensidade()- novaLista.get(i).getIntensidade()), 2);
        }
        return Math.sqrt(comp);
    }

    public List<Sintoma> getListaMenorDiferenca(){
        return this.listaMenorDiferenca;
    }


}
