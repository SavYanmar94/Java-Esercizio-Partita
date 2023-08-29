import java.util.ArrayList;

public class Partita {

	//int[] playerindex1 = {1,2,3,4,5,6,7,8,9,10,11};
	//int[] playerindex2 = {1,2,3,4,5,6,7,8,9,10,11};
	
	String winner[] = new String[11];
	String loser[] = new String[11];
	ArrayList<String> Tabellinomarcatori = new ArrayList<>();
	ArrayList<String> ClassificaMarcatori = new ArrayList<>();
	
    public void partita(String[] squadra1,String[] squadra2) throws InterruptedException {
    	System.out.println("Oggi si gioca la partita tra " + squadra1[11] + " e " + squadra2[11] + "\n");
    	System.out.println("L'arbitro fischia l'inizio della partita"  + "\n");
    	
    	
    	/*for (int i = 0; i < 11; i++) {
    		playerindex1[i] = indexOf.squadra1[i];
    	}*/
    	
    	
    	int scoreHome = 0;
    	int scoreAway = 0;
    	int tiriInPortaHome = 0;
    	int tiriFuoriHome = 0;
    	int tiriInPortaAway = 0;
    	int tiriFuoriAway = 0;
    	
    	for (int min = 5; min < 91; min+=5) {
    		
    		double esitosquadra = Math.random()* 1;
    		double esitotiro = Math.random()* 1;
    		
    		if (esitosquadra > 0 && esitosquadra < 0.6) {
    			System.out.println("La squadra " + squadra1[11] + " sta attaccando..."  + "\n");
    			String marcatoreHome = squadra1[(int)(Math.random()*11)];
    			
    				if(esitotiro > 0.85 && esitotiro <= 1) {
    					
    					System.out.println("Al minuto " + min + " c'è il goal!" + " Ha segnato " + marcatoreHome  + "\n");
    					scoreHome++;
    					Tabellinomarcatori.add("min: " + min + " - " + marcatoreHome);
    					ClassificaMarcatori.add(marcatoreHome);
    					System.out.println("Risultato della partita: " + scoreHome + " a " + scoreAway  + "\n");
    				} else if (esitotiro > 0 && esitotiro <= 0.35){
    					System.out.println("Al minuto " + min + " parata di " + squadra2[0] + " !"  + "\n");
    					tiriInPortaHome++;
    				} else if (esitotiro > 0.35 && esitotiro <= 0.55){
    					System.out.println("Al minuto " + min + " tiro intercettato da un difensore della squadra " + squadra2[11]  + "\n");
    				} else {
    					System.out.println("Al minuto " + min + " " + marcatoreHome + " la spara fuori."  + "\n");
    					tiriFuoriHome++;
    				}
    				
    		 }
    		
    		else if (esitosquadra > 0.6 && esitosquadra <= 1) {
    			
    			System.out.println("La squadra " + squadra2[11] + " sta attaccando..."  + "\n");
    			String marcatoreAway = squadra2[(int)(Math.random()*11)];
				if(esitotiro > 0.85 && esitotiro <= 1) {
					
					System.out.println("Al minuto " + min + " c'è il goal!" + " Ha segnato " + marcatoreAway  + "\n");
					scoreAway++;
					Tabellinomarcatori.add("min: " + min + " - " + marcatoreAway);
					ClassificaMarcatori.add(marcatoreAway);
					System.out.println("Risultato della partita: " + scoreHome + " a " + scoreAway  + "\n");
					
				} else if (esitotiro > 0 && esitotiro <= 0.35){
					
					System.out.println("Al minuto " + min + " parata di " + squadra1[0] + " !"  + "\n");
					tiriInPortaAway++;
					
				} else if (esitotiro > 0.35 && esitotiro <= 0.55){
					System.out.println("Al minuto " + min + " tiro intercettato da un difensore della squadra " + squadra1[11]  + "\n");
					
				} else {
					System.out.println("Al minuto " + min + " " + marcatoreAway + " la spara fuori."  + "\n");
					tiriFuoriAway++;
				}
			
				
    		}
    		
    	 Thread.sleep(5000);	
    	}
    
    	System.out.println("Partita finita con il punteggio di: " + scoreHome + " a " + scoreAway  + "\n");
    	
    	System.out.println("Tabellino marcatori: \n");
    	
    	for ( String marcatore : Tabellinomarcatori) {
    		System.out.println(marcatore);
    	}
    	
    	System.out.println("\n" + "Tiri in porta squadra casa: " + tiriInPortaHome);
    	System.out.println("Tiri fuori squadra casa: " + tiriFuoriHome);
    	System.out.println("Tiri in porta squadra ospite: " + tiriInPortaAway);
    	System.out.println("Tiri fuori squadra ospite: " + tiriFuoriAway + "\n");
    	
    			
    	if (scoreHome > scoreAway) {
    		System.out.println("La squadra vincitrice è: " + squadra1[11]  + "\n");
    		
    		winner = squadra1;
    		loser = squadra2;
    		
    	} else if (scoreAway > scoreHome){
    		System.out.println("La squadra vincitrice è: " + squadra2[11]  + "\n");
    		//System.out.println("La squadra " + squadra2[11]  + " va in finale ! \n");
    		//System.out.println("Mentre la squadra " + squadra1[11]  + " si gioca la finale terzo-quarto posto.");
    		winner = squadra2;
    		loser = squadra1;
    		
    	} else if ( scoreHome == scoreAway) {
    		System.out.println("La partita si rigioca");
    		partita(squadra1,squadra2);
    	}

    	
    } 
    
    
}
