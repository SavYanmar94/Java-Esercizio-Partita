import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		String[] Bari = {"Caprile","Dorval","Di Cesare","Vicari","Ricci","Maita","Maiello","Benedetti","Morachioli","Esposito","Cheddira","Bari"};
		String[] Cagliari = {"Radunovic", "Zappa", "Dossena", "Obert", "Azzi", "Di Pardo", "Deiola", "Makoumbou", "Lella", "Luvumbo","Lapadula","Cagliari"};
		String[] Parma = {"Chichizola", "Delprato","Osorio","Circati","Coulibaly","Bernabé","Estevez","Man","Sohm","Benedyczak","Vazquez","Parma"};
		String[] Sudtirol = {"Poluzzi", "Celli", "Curto", "Vinetot", "Fiordilino", "Mazzocchi", "Belardinelli", "Zaro", "Tait", "De Col", "Odogwu", "Sudtirol"};
		ArrayList<String> marcatoriTorneo = new ArrayList<>();

		Partita semifinale1 = new Partita();
		semifinale1.partita(Bari, Cagliari);
		System.out.println("La squadra " + semifinale1.winner[11]  + " va in finale ! \n");
		System.out.println("Mentre la squadra " + semifinale1.loser[11]  + " si gioca la finale terzo-quarto posto");

		
		Partita semifinale2 = new Partita();
		semifinale2.partita(Sudtirol, Parma);
		System.out.println("La squadra " + semifinale2.winner[11]  + " va in finale ! \n");
		System.out.println("Mentre la squadra " + semifinale2.loser[11]  + " si gioca la finale terzo-quarto posto \n");
		
	    Partita finale = new Partita();
	    finale.partita(semifinale1.winner, semifinale2.winner);
	    System.out.println("La squadra " + finale.winner[11]  + " vince il torneo Generation! \n");
	    System.out.println("La squadra " + finale.loser[11]  + " si aggiudica il secondo posto \n");
	    
	    Partita finaleTeQua = new Partita();
	    finaleTeQua.partita(semifinale1.loser, semifinale2.loser);
	    System.out.println("La squadra " + finaleTeQua.winner[11]  + " si aggiudica il terzo posto \n");
	    System.out.println("La squadra " + finaleTeQua.loser[11]  + " si aggiudica il quarto posto \n");
	    
	    System.out.println("Classifica Squadre: \n");
	    System.out.println("Primo posto: " + finale.winner[11]);
	    System.out.println("Secondo Posto: " + finale.loser[11]);
	    System.out.println("Terzo Posto: " + finaleTeQua.winner[11]);
	    System.out.println("Quarto Posto: "+ finaleTeQua.loser[11]);
	    
	    System.out.println("\nClassifica Marcatori: \n");
	    
	    
	    // manca thread sleep e classifica marcatori 
	    
	    // ciclo for se un elemento dell'arraylist marcatori che 
	    //devo creare è uguale ad ogni altro elemento scansionato ,i++
	    
	    for (String marcatoresem1 : semifinale1.ClassificaMarcatori) {
	    	marcatoriTorneo.add(marcatoresem1);
	    }
	    
	    for (String marcatoresem2 : semifinale2.ClassificaMarcatori) {
	    	marcatoriTorneo.add(marcatoresem2);
	    }
	    
	    for (String marcatorefin : finale.ClassificaMarcatori) {
	    	marcatoriTorneo.add(marcatorefin);
	    }
	    
	    for (String marcatorefinTeQua : finaleTeQua.ClassificaMarcatori) {
	    	marcatoriTorneo.add(marcatorefinTeQua);
	    }
	    
	 // HashMap per memorizzare il numero di gol per ogni marcatore
        HashMap<String, Integer> golMarcatori = new HashMap<>();
        
        // Ciclo attraverso gli elementi nell'ArrayList marcatoriTorneo
        for (String marcatore : marcatoriTorneo) {
            // Se il marcatore è già presente nell'HashMap, incrementa il numero di gol di 1
            // Altrimenti, imposta il numero di gol a 1
            golMarcatori.put(marcatore, golMarcatori.getOrDefault(marcatore, 0) + 1);
        }

        // ArrayList per contenere la classifica dei marcatori
        ArrayList<String> classificaMarcatori = new ArrayList<>();
        
        // Creazione della classifica dei marcatori utilizzando le chiavi e i valori dell'HashMap
        for (String marcatore : golMarcatori.keySet()) {
            int gol = golMarcatori.get(marcatore);
            // Aggiunge la riga della classifica con il formato "gol - marcatore"
            classificaMarcatori.add(gol + " - " + marcatore);
        }

        // Ordina la classifica dei marcatori in ordine decrescente utilizzando Collections.reverseOrder()
        Collections.sort(classificaMarcatori, Collections.reverseOrder());

        // Stampa la classifica dei marcatori
        for (String riga : classificaMarcatori) {
            System.out.println(riga);
        }
    }
	}


