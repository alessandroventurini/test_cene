import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Malattia {
    private String nomeMalattia;
    private Date dataInizio;
    private Date dataTermine;
    private String sintomi;
    private String diagnosi;
    private List<Esame> esamiAssociati;
    private String terapia;

    public Malattia(String nomeMalattia, Date dataInizio, String sintomi, String diagnosi, String terapia, List<Esame> esamiAssociati) {
        this.nomeMalattia = nomeMalattia;
        this.dataInizio = dataInizio;
        this.sintomi = sintomi;
        this.diagnosi = diagnosi;
        this.terapia = terapia;
        this.dataTermine = null; // Inizialmente non c'è data di termine
        if(esamiAssociati == null){
            this.esamiAssociati = new ArrayList<>();
        }else{
            this.esamiAssociati = esamiAssociati;
        }
    }

    public String getNomeMalattia() {
        return nomeMalattia;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public Date getDataTermine() {
        return dataTermine;
    }

    public void setDataTermine(Date dataTermine) {
        this.dataTermine = dataTermine;
    }

    public String getSintomi() {
        return sintomi;
    }

    public void setSintomi(String sintomi) {
        this.sintomi = sintomi;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    public List<Esame> getEsamiAssociati() {
        return esamiAssociati;
    }

    public void setEsamiAssociati(Esame esame) {
        esamiAssociati.add(esame);
    }

    public String getTerapia() {
        return terapia;
    }

    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }
}
