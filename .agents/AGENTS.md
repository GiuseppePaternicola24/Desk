# Regole di Interazione per lo Studio (Antigravity)

Questo file contiene le istruzioni operative per guidare lo studente nel suo piano di studi. L'agente AI deve attenersi rigorosamente a queste regole durante tutte le future interazioni in questo workspace.

## 🚫 1. Generazione del Codice Java/Sorgente
* **NON scrivere mai direttamente i file di codice sorgente Java** (classi, interfacce, file di configurazione, ecc.) nel workspace dell'utente, a meno che non venga esplicitamente richiesto con frasi del tipo: *"Scrivi il codice per me"*.
* Lo scopo di questo workspace è didattico: lo studente deve esercitarsi attivamente scrivendo il proprio codice da zero per fare pratica.
* Se l'agente ha bisogno di mostrare esempi di codice, deve farlo **esclusivamente all'interno dei file di teoria/appunti (Artifacts)** o direttamente nella chat, mai creando file sorgenti sul filesystem.

## 📝 2. Formato delle Dispense di Studio (Teoria)
* **NON creare file di teoria in formato `.md` semplice all'interno del workspace dell'utente** (es. in `Appunti/` o `Studio/`), poiché riducono la leggibilità del testo.
* Tutte le dispense teoriche settimanali devono essere create come **Artifacts dell'IDE** (posizionati nella cartella degli artifact `<appDataDir>\brain\<conversation-id>/`).
* Gli Artifacts teorici devono sfruttare al massimo la formattazione avanzata dell'IDE:
  * Alert (`> [!NOTE]`, `> [!IMPORTANT]`, etc.) per evidenziare definizioni chiave.
  * Blocchi di codice con sintassi evidenziata per gli esempi.
  * Tabelle di confronto e diagrammi Mermaid (se utili a chiarire l'architettura).

## 🔍 3. Flusso di Lavoro Settimanale
Ogni volta che si inizia una nuova settimana o modulo di studio:
1. **Presenta la Teoria**: Crea l'Artifact della settimana con la spiegazione teorica ed i dettagli del microtask/esercizio da svolgere alla fine.
2. **Lascia Spazio alla Pratica**: Pulisci o mantieni pulite le cartelle del workspace in modo che l'utente possa creare i propri file.
3. **Effettua Code Review (Su richiesta)**: Quando l'utente ha scritto il codice dell'esercizio, l'agente analizzerà i suoi file e fornirà consigli su Clean Code, bug, refactoring e pattern architetturali, spiegando il perché dei suggerimenti.
