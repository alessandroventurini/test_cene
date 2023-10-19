import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utente {
    private String nome;
    private String cognome;
    private String indirizzo;
    private String telefono;
    private String email;
    private Date dataNascita;
    private String luogoNascita;
    private String genere;
    private String codiceFiscale;
    private String codiceSanitario;
    private String gruppoSanguigno;
    private List<Esame> esameList;

    private List<Malattia> malattiaList;

    public Utente(String nome, String cognome, String indirizzo, String telefono, String email,
                      Date dataNascita, String luogoNascita, String genere, String codiceFiscale, String gruppoSanguigno,List<Esame> esameList,List<Malattia> malattiaList) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.email = email;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.genere = genere;
        if (verificaCodiceFiscale(codiceFiscale)) {
            this.codiceFiscale = codiceFiscale;
        }
        this.codiceSanitario = generaCodiceSanitario();
        this.gruppoSanguigno = gruppoSanguigno;
        if(esameList != null){
            this.esameList = esameList;
        }
        else{
            this.esameList = new ArrayList<>();
        }

        if(malattiaList != null){
            this.malattiaList = malattiaList;
        }else{
            this.malattiaList = new ArrayList<>();
        }
    }

    // Getter e Setter per gli attributi

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        if (verificaCodiceFiscale(codiceFiscale)) {
            this.codiceFiscale = codiceFiscale;
        }
    }

    public String getCodiceSanitario() {
        return codiceSanitario;
    }

    public void setCodiceSanitario(String codiceSanitario) {
        this.codiceSanitario = codiceSanitario;
    }

    public String getGruppoSanguigno() {
        return gruppoSanguigno;
    }

    public void setGruppoSanguigno(String gruppoSanguigno) {
        this.gruppoSanguigno = gruppoSanguigno;
    }

    public List<Esame> getEsameList() {
        return esameList;
    }

    public void setEsameList(List<Esame> esameList) {
        this.esameList = esameList;
    }

    public List<Malattia> getMalattiaList() {
        return malattiaList;
    }

    public void setMalattiaList(List<Malattia> malattiaList) {
        this.malattiaList = malattiaList;
    }

    // Metodo per verificare il formato del Codice Fiscale
    private boolean verificaCodiceFiscale(String codice) {
        // Implementa la tua logica di verifica del codice fiscale qui
        // Deve seguire il formato specificato nel tuo caso
        return true; // Modifica questa parte con la tua implementazione
    }

    // Metodo per generare il Codice Sanitario (esempio)
    private String generaCodiceSanitario() {
        // Implementa la generazione del codice sanitario qui
        // Questo è solo un esempio
        return "SAN12345";
    }
}
