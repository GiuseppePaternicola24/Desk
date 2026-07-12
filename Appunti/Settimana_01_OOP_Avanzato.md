# Dispensa di Studio: OOP Avanzato (Settimana 1)

Benvenuto nella prima settimana del tuo percorso. Questa dispensa copre i concetti fondamentali della programmazione ad oggetti avanzata in Java, spiegando il *perché* di determinate scelte architetturali che incontrerai costantemente nel mondo del lavoro.

---

## 🔗 1. Ereditarietà vs Composizione

In programmazione orientata agli oggetti, ci sono due modi principali per estendere le funzionalità di una classe.

### Ereditarietà (IS-A)
Consente a una classe (sottoclasse) di ereditare lo stato e il comportamento di un'altra classe (superclasse).
* **Vantaggio**: Riutilizzo immediato del codice.
* **Svantaggio (Il problema dell'accoppiamento)**: Le sottoclassi dipendono fortemente dall'implementazione della superclasse. Se modifichi la classe padre, rischi di rompere il funzionamento di tutte le classi figlie senza accorgertene.

### Composizione (HAS-A)
Consiste nel progettare le classi in modo che *contengano* riferimenti ad altri oggetti per delegare loro il lavoro, piuttosto che ereditarne il comportamento.

> [!IMPORTANT]
> **Regola d'oro del Clean Code**: *Favorire la composizione rispetto all'ereditarietà.*
> La composizione rende il codice altamente disaccoppiato, flessibile e pronto per i test di unità (mocking).

#### Confronto Pratico:
```java
// Esempio con Ereditarietà (Rigido)
class Engine {}
class Car extends Engine {} // "Una macchina è un motore" -> Concettualmente errato!

// Esempio con Composizione (Flessibile)
class Car {
    private final Engine engine; // "Una macchina ha un motore"
    
    public Car(Engine engine) {
        this.engine = engine; // Il motore viene iniettato dall'esterno
    }
}
```

---

## 🏛️ 2. Interfacce vs Classi Astratte

Entrambe servono a definire dei "contratti" per le classi concrete, ma hanno scopi e caratteristiche differenti.

| Caratteristica | Interfaccia (`interface`) | Classe Astratta (`abstract class`) |
| :--- | :--- | :--- |
| **Definizione** | Un contratto di puro comportamento. | Una classe parzialmente implementata. |
| **Stato (Campi)** | Solo costanti (`public static final`). | Può avere variabili d'istanza (stato). |
| **Metodi** | Solo firme (o metodi `default` / `static`). | Metodi sia astratti sia concreti. |
| **Ereditarietà** | Una classe può implementare **molte** interfacce. | Una classe può estendere **una sola** classe. |

> [!TIP]
> * Usa una **classe astratta** quando vuoi condividere codice comune e stato tra classi strettamente correlate (es. `Animal` -> `Dog`, `Cat`).
> * Usa un'**interfaccia** quando vuoi definire un comportamento comune per classi che possono essere anche completamente diverse tra loro (es. `Flyable` implementato sia da `Plane` che da `Bird`).

---

## 🎭 3. Polimorfismo

Il polimorfismo è la capacità di un oggetto di comportarsi in modo diverso in base al contesto, pur condividendo la stessa interfaccia comune. 
Permette di scrivere codice che interagisce con un'astrazione anziché con un'implementazione specifica.

```java
// Definizione del contratto
interface PaymentMethod {
    void pay(double amount);
}

// Implementazioni concrete
class CreditCard implements PaymentMethod {
    public void pay(double amount) { System.out.println("Pagato con Carta: " + amount); }
}
class Paypal implements PaymentMethod {
    public void pay(double amount) { System.out.println("Pagato con Paypal: " + amount); }
}

// Utilizzo polimorfico
public class Checkout {
    // Non ci interessa QUALE metodo di pagamento sia, ci basta che rispetti il contratto.
    public void process(PaymentMethod paymentMethod, double total) {
        paymentMethod.pay(total); 
    }
}
```

---

## 📦 4. Generics (`<T>`)

I Generics permettono di parametrizzare i tipi di dati all'interno di classi, interfacce o metodi. Garantiscono la **Type-Safety** (sicurezza dei tipi a tempo di compilazione), evitando errori a runtime e cast manuali.

### Esempio senza Generics (Non sicuro):
```java
List lista = new ArrayList();
lista.add("Testo");
lista.add(123); // Permesso, ma pericoloso!

String s = (String) lista.get(1); // Genera ClassCastException a runtime!
```

### Esempio con Generics (Sicuro):
```java
List<String> lista = new ArrayList<>();
lista.add("Testo");
// lista.add(123); // Errore di compilazione! Bloccato subito.
```

### Bounded Type Parameters (`<T extends Class>`)
È possibile limitare il tipo di generico accettato. Ad esempio, `<T extends Number>` accetta solo sottoclassi di `Number` (Integer, Double, ecc.).

---

## 🛠️ Esercizio Pratico: Il Sistema di Notifiche
Ora tocca a te scrivere il codice nella cartella [week-01](file:///c:/Users/Ryzen9/Desktop/PdS_Lavoro/Studio/01-Java-Enterprise-SOLID/week-01).

### Requisiti del Sistema:
1. Crea un'interfaccia `Notification` con i metodi `getRecipient()` e `getMessage()`.
2. Crea le classi concrete `EmailNotification`, `SMSNotification` e `PushNotification` che implementano l'interfaccia.
3. Crea un'interfaccia generica `NotificationSender<T extends Notification>` che dichiara il metodo `send(T notification)`.
4. Crea i sender concreti: `EmailSender`, `SMSSender` e `PushSender`, ciascuno associato al proprio tipo specifico di notifica.
5. Progetta una classe `NotificationService<T extends Notification>` che:
   * Contenga un riferimento a `NotificationSender<T>` (Composizione / Dependency Injection tramite costruttore).
   * Offri un metodo `processAndSend(T notification)` per elaborare e inviare il messaggio.
6. Scrivi una classe `Main` con il metodo `public static void main(String[] args)` per testare il funzionamento dei tre canali.

> [!WARNING]
> Ricorda di strutturare il codice in package sensati (es. `com.studio.notification`) e di compilare i file via terminale o tramite il tuo IDE preferito
