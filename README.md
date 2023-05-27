# java-oop-shop

1 : 

Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.

Un prodotto è caratterizzato da:

codice (numero intero)
nome
descrizione
prezzo
iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di utilità per fare in modo che:

alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
il prodotto esponga sia un metodo per avere il prezzo base sia uno per avere il prezzo comprensivo di iva
il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto

BONUS
Create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 12344556 resta come è).


2 :

Nello stesso progetto, aggiungere un package jana60.bank, creare la classe Conto caratterizzata da:

numero di conto
nome del proprietario
saldo
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di utilità per fare in modo che:

alla creazione di un nuovo conto il saldo sia 0€
Il codice conto sia accessibile solo in lettura, il proprietario sia accessibile in lettura e in scrittura e il saldo sia accessibile solo in lettura
siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
altri metodi per ritornare le informazioni del conto e il saldo formattato
Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
Poi chiediamo all’utente cosa vuole fare dando 3 opzioni:

versare una somma
prelevare una somma di denaro
uscire.
Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto. Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione va a buon fine mostriamo il saldo attuale del conto.

Il menu continua ad apparire fino a che l’utente sceglie di uscire.
