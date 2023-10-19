import java.util.ArrayList;
import java.util.List;

class Esame {
    private String nome;
    private String preparazioni;
    private double valoreNormaleMinimo;
    private double valoreNormaleMassimo;
    private double sogliaErrore;
    private List<String> ulterioriInformazioni;
    private Malattia malattiaAssociata;

    public Esame(String nome, String preparazioni, double valoreNormaleMinimo, double valoreNormaleMassimo, double sogliaErrore,Malattia malattia) {
        this.nome = nome;
        this.preparazioni = preparazioni;
        this.valoreNormaleMinimo = valoreNormaleMinimo;
        this.valoreNormaleMassimo = valoreNormaleMassimo;
        this.sogliaErrore = sogliaErrore;
        this.ulterioriInformazioni = new ArrayList<>();
        this.malattiaAssociata = malattia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreparazioni() {
        return preparazioni;
    }

    public void setPreparazioni(String preparazioni) {
        this.preparazioni = preparazioni;
    }

    public double getValoreNormaleMinimo() {
        return valoreNormaleMinimo;
    }

    public void setValoreNormaleMinimo(double valoreNormaleMinimo) {
        this.valoreNormaleMinimo = valoreNormaleMinimo;
    }

    public double getValoreNormaleMassimo() {
        return valoreNormaleMassimo;
    }

    public void setValoreNormaleMassimo(double valoreNormaleMassimo) {
        this.valoreNormaleMassimo = valoreNormaleMassimo;
    }

    public double getSogliaErrore() {
        return sogliaErrore;
    }

    public void setSogliaErrore(double sogliaErrore) {
        this.sogliaErrore = sogliaErrore;
    }

    public List<String> getUlterioriInformazioni() {
        return ulterioriInformazioni;
    }

    public void aggiungiUlterioreInformazione(String informazione) {
        ulterioriInformazioni.add(informazione);
    }

    public void setUlterioriInformazioni(List<String> ulterioriInformazioni) {
        this.ulterioriInformazioni = ulterioriInformazioni;
    }

    public Malattia getMalattiaAssociata() {
        return malattiaAssociata;
    }

    public void setMalattiaAssociata(Malattia malattiaAssociata) {
        this.malattiaAssociata = malattiaAssociata;
    }
}