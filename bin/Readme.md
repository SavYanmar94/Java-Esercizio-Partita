Traccia Extra - Partita : esercizio svolto in solitaria 

L'associazione "Generation per lo sport" organizza un torneo di calcio di tipo quadrangolare,
convocando quattro squadre che si sfidano secondo un calendario a eliminazione diretta
partendo dalle semifinali, con le squadre vincenti che si contendono il 1° posto, mentre le
perdenti il 3°.
Al programmatore è richiesta un'applicazione che, inserite da codice le formazioni delle
quattro squadre, segua e memorizzi l'andamento delle quattro partite, da simulare con dei
random da ripetere in un ciclo che riproduca la durata di gioco, accreditando i goal segnati
alle squadre nonché ai relativi marcatori. Per esempio una prima estrazione decide quale
squadra tenterà il goal essendosi portata in prossimità della porta avversaria (squadra1
nell'intervallo [0, 0.5[, squadra due nell'intervallo [0.5, 1[) ogni 5 minuti; una seconda
estrazione simulerà la conclusione l'esito del tiro in porta (è goal se il valore estratto è
nell'intervallo [0.85, 1[. In caso di goal una ulteriore estrazione stabilità chi ha segnato
accreditandogli il goal.
L'esito di ogni azione va reso noto sul terminale, come una cronaca testuale:
L'arbitro fischia l'inizio della partita
Al 5' parata di xxx!
Al 10' goal di yyy! Il punteggio è 1-0 tra SquadraX e SquadraY
. . .
Al termine di ogni partita, il programma stamperà i risultati comprensivi di punteggio, minuto
di marcatura e nomi dei marcatori.
Al termine del torneo, il programma stamperà la classifica finale di piazzamento delle quattro
squadre e la classifica dei marcatori per goal segnati.
Immaginare che l'applicazione resti aperta per l'intera durata del torneo, non potendo
esportare i risultati in file esterni per riprendere l'applicazione in un secondo momento.
Aggiungendo ai metodi opportuni un throws InterruptedException, sarà possibile
introdurre delle pause in millisecondi tra le varie fasi di svolgimento del programma mediante
istruzioni Thread.sleep(5000); /* programma sospeso per 5 secondi */
dando modo di leggere progressivamente l'andamento della partita mentre si svolge, anche
se ovviamente in modo accelerato rispetto alla realtà.
Suggerimenti:
 Organizzare ogni Squadra con una struttura tipo array (o ArrayList) di String
giocatore, e istanziare un diverso oggetto Partita per ciascuna delle quattro sfide.
 Per tenere conto dei marcatori, abbinare agli array dei giocatori degli array di int
contatori da incrementare in corrispondenza dell'indice del calciatore che segna.
 Per semplicità, ipotizzare che le squadre non effettuino sostituzioni di giocatori
durante le partite, che conservino la stessa formazione per tutto il torneo, e che non
ci siano interventi arbitrali se non il fischio di inizio e fine tempo/partita.