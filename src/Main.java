import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione di un utente fittizio
        Utente utente = new Utente("Mario", "Rossi", "Via Roma 123", "555-1234567", "mario@email.com", new Date(), "Milano", "Maschio", "RSSMRA80A01F205X", "0+",null,null);

        // Creazione di una lista di esami fake
        Esame pressione = new Esame("Pressione", "Nessuna preparazione", 70, 130, 0,null);
        Esame glicemia = new Esame("Glicemia", "Digiuno da 12 ore", 70, 99, 1000,null);

        // Creazione di una lista di malattie fake
        Malattia malattia1 = new Malattia("Influenza", new Date(), "Febbre, tosse", "Diagnosi medica", "Riposo e farmaci",null);
        Esame radiografia1 = new Esame("Radiografia Torace", "Nessuna preparazione", 0, 0, 0,null);
        malattia1.setEsamiAssociati(radiografia1);

        Malattia malattia2 = new Malattia("Frattura del braccio", new Date(), "Dolore e gonfiore", "Diagnosi medica", "Gesso e fisioterapia",null);

        List<Esame> esameList = new ArrayList<>();
        esameList.add(pressione);
        esameList.add(glicemia);
        esameList.add(radiografia1);
        utente.setEsameList(esameList);
        List<Malattia> malattiaList = new ArrayList<>();
        malattiaList.add(malattia1);
        malattiaList.add(malattia2);
        utente.setMalattiaList(malattiaList);
        // Output per verificare i dati dell'utente
        System.out.println("Utente: " + utente.getNome() + " " + utente.getCognome());
        System.out.println("Esami associati:");
        for (Esame esame : utente.getEsameList()) {
            System.out.println("- " + esame.getNome());
        }
        System.out.println("Malattie:");
        for (Malattia malattia : utente.getMalattiaList()) {
            System.out.println("- " + malattia.getNomeMalattia());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Aggiungi malattia");

        System.out.print("Nome della malattia: ");
        String nomeMalattia = scanner.nextLine();

        System.out.print("Data di inizio (formato: dd/MM/yyyy): ");
        String dataInizioStr = scanner.nextLine();

        Date dataInizio = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataInizio = dateFormat.parse(dataInizioStr);
        } catch (ParseException e) {
            System.out.println("Formato data non valido. La data verrà impostata a oggi.");
            dataInizio = new Date();
        }

        System.out.print("Sintomi: ");
        String sintomi = scanner.nextLine();

        System.out.print("Diagnosi: ");
        String diagnosi = scanner.nextLine();

        System.out.print("Terapia: ");
        String terapia = scanner.nextLine();

        // Creazione di una malattia con i dati inseriti
        Malattia malattia = new Malattia(nomeMalattia, dataInizio, sintomi, diagnosi, terapia,null);

        System.out.println("Vuoi associare alla malattia un esame tra questi esistenti? se no digita 99");
        for(int i = 0 ; i < utente.getEsameList().size(); i++){
            System.out.println(i + " : " + utente.getEsameList().get(i).getNome());
        }

        int scelta = scanner.nextInt();
        scanner.nextLine(); // Consuma il carattere di nuova riga rimanente

        if(scelta == 99){
            System.out.println("Periodico o diagnostico? (P/D)");
            String tipoEsame = scanner.nextLine();
            if(tipoEsame.equals("P")){

                System.out.println("Aggiungi esame periodico");

                System.out.print("Nome dell'esame: ");
                String nomeEsame = scanner.nextLine();

                System.out.print("Preparazioni: ");
                String preparazioni = scanner.nextLine();

                System.out.print("Valore normale minimo: ");
                double valoreNormaleMinimo = scanner.nextDouble();

                System.out.print("Valore normale massimo: ");
                double valoreNormaleMassimo = scanner.nextDouble();

                System.out.print("Soglia di errore: ");
                double sogliaErrore = scanner.nextDouble();

                // Creazione di un esame periodico con i dati inseriti
                Esame esame = new Esame(nomeEsame, preparazioni, valoreNormaleMinimo, valoreNormaleMassimo, sogliaErrore,malattia);

                malattia.setEsamiAssociati(esame);
                if(utente.getEsameList()!= null){
                    utente.getEsameList().add(esame);
                }
                else{
                    utente.setEsameList(List.of(esame));
                }
                utente.getMalattiaList().add(malattia);

                // Output dei dati dell'esame periodico
                System.out.println("Esame periodico aggiunto:");
                System.out.println("Nome: " + esame.getNome());
                System.out.println("Preparazioni: " + esame.getPreparazioni());
                System.out.println("Valore normale minimo: " + esame.getValoreNormaleMinimo());
                System.out.println("Valore normale massimo: " + esame.getValoreNormaleMassimo());
                System.out.println("Soglia di errore: " + esame.getSogliaErrore());
            }
        }


        // Output dei dati della malattia
        System.out.println("Malattia aggiunta:");
        System.out.println("Nome: " + malattia.getNomeMalattia());
        System.out.println("Data di inizio: " + dateFormat.format(malattia.getDataInizio()));
        System.out.println("Sintomi: " + malattia.getSintomi());
        System.out.println("Diagnosi: " + malattia.getDiagnosi());
        System.out.println("Terapia: " + malattia.getTerapia());


        System.out.println("Esami associati:");
        for (Esame esameNuovi : utente.getEsameList()) {
            System.out.println("- " + esameNuovi.getNome());
            if(esameNuovi.getMalattiaAssociata() != null){
                System.out.println("--------------- Malattia associata all esame " + esameNuovi.getNome() + ": " + esameNuovi.getMalattiaAssociata().getNomeMalattia());
            }
        }
        System.out.println("------------------Malattie:");
        for (Malattia malattiaUtente : utente.getMalattiaList()) {
            System.out.println("------ Malattia: " + malattiaUtente.getNomeMalattia());
            if(malattiaUtente.getEsamiAssociati() != null && !malattiaUtente.getEsamiAssociati().isEmpty()){
                System.out.print("---------------------------- ESAMI ASSSOCIATI ALLA MALATTIA"+ malattiaUtente.getNomeMalattia() +": ");
                for (Esame esameNuovi : malattiaUtente.getEsamiAssociati()) {
                    System.out.println("- " + esameNuovi.getNome());
                }
            }

        }

    }
}
