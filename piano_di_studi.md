# Piano di Studi Dettagliato: Software & Cloud Engineer (8 Mesi)

Questo piano di studi dettagliato è diviso in **32 settimane**. Ognuna contiene argomenti teorici da studiare, microtask pratici e un **Progetto GitHub** mensile che potrai aggiungere al tuo portfolio per dimostrare le tue competenze ai recruiter.

---

## 📂 Struttura Generale del Portfolio su GitHub
Per fare colpo sui recruiter, organizza la tua pagina GitHub in questo modo:
1. **GitHub Profile README**: Crea una dashboard personale che descriva chi sei, le tue tecnologie e mostri i tuoi progetti migliori con diagrammi.
2. **README specifici per ogni progetto**: Ogni progetto mensile deve contenere un file `README.md` con:
   * Lo scopo del progetto.
   * Il diagramma architetturale (usa Mermaid o draw.io).
   * Istruzioni chiare per eseguire il codice localmente (incluso il comando Docker/Compose o Kubernetes).
   * Schermate delle risposte delle API o dell'interfaccia.

---

## 📅 Dettaglio Settimanale

### 🟩 MESE 1: Java Enterprise, Clean Code & OOP Avanzato
*Obiettivo: Scrivere codice Java robusto, testabile e strutturato secondo gli standard aziendali.*

* **Settimana 1: OOP Avanzato**
  * **Studio**: Ereditarietà vs Composizione, Polimorfismo, Interfacce, Classi Astratte, Generics.
  * **Microtask**: Scrivi una gerarchia di classi per gestire un sistema di notifiche (Email, SMS, Push) usando interfacce e generics per rendere il codice estensibile.
* **Settimana 2: Collections Framework & Stream API**
  * **Studio**: List, Set, Map e le loro implementazioni (ArrayList vs LinkedList, HashMap, HashSet). Programmazione funzionale in Java: Lambdas, Stream API (`filter`, `map`, `reduce`, `collect`).
  * **Microtask**: Prendi una lista di transazioni bancarie ed effettua filtri, raggruppamenti per categoria e calcoli di medie mensili usando esclusivamente gli Stream Java.
* **Settimana 3: Multithreading & Concorrenza**
  * **Studio**: Thread, Runnable, ciclo di vita di un Thread, problemi di concorrenza (race conditions), sincronizzazione, `ExecutorService` e Thread Pool.
  * **Microtask**: Scrivi un piccolo programma Java in cui più thread concorrenti simulano dei bot che acquistano biglietti da un inventario limitato, evitando vendite duplicate (ticket overselling).
* **Settimana 4: SOLID Principles & Unit Testing**
  * **Studio**: Principi SOLID (Single Responsibility, Open/Closed, ecc.), Clean Code, Testing unitario con JUnit 5 e Mockito.
  * **Microtask**: Scrivi test di unità con copertura del codice superiore all'85% per un servizio di elaborazione ordini, mockando il database e i servizi esterni.
* **📦 PROGETTO GITHUB #1: [Clean-Store-Simulator]**
  * *Cosa fare*: Un simulatore di e-commerce testuale guidato da console. Deve applicare rigidamente i pattern SOLID, usare Java Streams per elaborare il catalogo ed essere coperto da Unit Test.
  * *Cosa mostrare su GitHub*: Il codice sorgente Java e i report dei test JUnit. Nel README descrivi come hai applicato ogni singolo principio SOLID.

---

### 🟩 MESE 2: Introduzione a Spring Boot & Web API
*Obiettivo: Creare API REST enterprise, sicure e connesse a un database relazionale.*

* **Settimana 5: Spring Core & Dependency Injection**
  * **Studio**: Architettura di Spring Framework, Inversion of Control (IoC), Dependency Injection (DI), Spring Beans, Annotations (`@Component`, `@Service`, `@Repository`, `@Autowired`).
  * **Microtask**: Crea una console app Spring Boot in cui configuri diversi beans per iniettare dinamicamente diversi motori di calcolo tasse.
* **Settimana 6: Spring Web (REST API)**
  * **Studio**: Protocollo HTTP, Controller REST (`@RestController`, `@GetMapping`, `@PostMapping`, ecc.), Gestione dei codici di stato HTTP, Data Transfer Objects (DTO) e validazione dei dati (`@Valid`).
  * **Microtask**: Crea le API per una piattaforma di blogging che esponga le operazioni CRUD per Post e Commenti.
* **Settimana 7: Persistenza con Spring Data JPA & MySQL**
  * **Studio**: ORM (Object-Relational Mapping), Hibernate, Spring Data JPA (`JpaRepository`), relazioni tra entità (`@OneToMany`, `@ManyToOne`, `@ManyToMany`).
  * **Microtask**: Collega le API della settimana 6 a un database MySQL locale, definendo le relazioni tra Utente, Post e Commenti.
* **Settimana 8: Sicurezza ed Autenticazione (JWT)**
  * **Studio**: Autenticazione Stateless, JWT (JSON Web Tokens), Spring Security configuration.
  * **Microtask**: Proteggi le API del blog in modo che solo gli utenti autenticati possano creare o modificare post.
* **📦 PROGETTO GITHUB #2: [Secure-Blogging-Platform]**
  * *Cosa fare*: Un portale per blog completo sul backend. Gli utenti possono registrarsi, effettuare il login (JWT), e gestire post e commenti con relazioni SQL.
  * *Cosa mostrare su GitHub*: Il codice Spring Boot completo, un file SQL per inizializzare il DB ed un file JSON pronto per Postman per testare i vari endpoint.

---

### 🟩 MESE 3: Basi di Dati Avanzate, NoSQL & Caching
*Obiettivo: Gestire la persistenza dei dati a prestazioni elevate.*

* **Settimana 9: SQL Avanzato & PostgreSQL**
  * **Studio**: Transazioni ACID, livelli di isolamento, indici (B-Tree), piani di esecuzione delle query (`EXPLAIN`), migrazione database.
  * **Microtask**: Scrivi query complesse con JOIN e aggregazioni su PostgreSQL e ottimizzale creando indici mirati, analizzando le performance prima e dopo.
* **Settimana 10: database NoSQL (MongoDB)**
  * **Studio**: Modelli di dati non relazionali, Document-oriented databases, MongoDB vs SQL, Spring Data MongoDB.
  * **Microtask**: Integra MongoDB in un'applicazione Spring Boot per salvare i log delle attività degli utenti in formato JSON flessibile.
* **Settimana 11: Caching con Redis**
  * **Studio**: Concetto di cache (Cache-Aside Pattern), Redis come archivio in-memory chiave-valore, annotazioni `@Cacheable` in Spring.
  * **Microtask**: Configura Redis in un servizio Spring Boot in modo che le query pesanti sul catalogo prodotti vengano lette dalla cache per 5 minuti invece che dal database SQL.
* **Settimana 12: Gestione Transazioni e Migrazioni con Liquibase**
  * **Studio**: Database Version Control con Liquibase (o Flyway), gestione programmatica e dichiarativa delle transazioni Spring (`@Transactional`).
  * **Microtask**: Configura Liquibase nel tuo progetto per creare le tabelle in modo incrementale tramite script XML/YAML.
* **📦 PROGETTO GITHUB #3: [High-Performance-Storefront]**
  * *Cosa fare*: Un catalogo prodotti ad alte prestazioni con PostgreSQL come DB relazionale primario per ordini, Redis per la cache del catalogo e MongoDB per i log di navigazione utente.
  * *Cosa mostrare su GitHub*: Il codice Spring Boot, i changeset di Liquibase e un file README che illustra i tempi di risposta prima e dopo l'introduzione di Redis.

---

### 🟩 MESE 4: System Design & Microservizi (Parte 1)
*Obiettivo: Progettare sistemi distribuiti, scalabili e resilienti.*

* **Settimana 13: Introduzione ai Microservizi**
  * **Studio**: Limiti del monolito, decomposizione dei servizi per dominio, pattern "Database-per-Service", Service Discovery.
  * **Microtask**: Disegna su carta l'architettura a microservizi per un sistema di consegne a domicilio (Ristorante, Fattorino, Cliente, Pagamenti).
* **Settimana 14: Service Discovery & API Gateway**
  * **Studio**: Netflix Eureka (Service Registry) e Spring Cloud Gateway.
  * **Microtask**: Crea tre microservizi base in Spring Boot e falli registrare automaticamente su un server Eureka locale, instradando il traffico esterno tramite Spring Cloud Gateway.
* **Settimana 15: Comunicazione tra Servizi & Config Server**
  * **Studio**: Comunicazione sincrona via Spring Cloud OpenFeign, configurazione centralizzata con Spring Cloud Config Server gestito via Git.
  * **Microtask**: Fai in modo che il Microservizio A interroghi il Microservizio B per reperire i dettagli di un utente usando OpenFeign, gestendo le proprietà di configurazione da una repository centralizzata.
* **Settimana 16: Resilienza & Circuit Breaker**
  * **Studio**: Tolleranza ai guasti in sistemi distribuiti, Fallback pattern, implementazione di Resilience4j (Circuit Breaker e Rate Limiter).
  * **Microtask**: Configura un Circuit Breaker in modo che se il Servizio B è offline, il Servizio A risponda con dati di fallback predefiniti invece di andare in crash.
* **📦 PROGETTO GITHUB #4: [Microservices-Base-Infrastructure]**
  * *Cosa fare*: Un'infrastruttura completa a microservizi formata da: 1 Config Server, 1 Eureka Registry, 1 API Gateway e 2 Servizi di business (es. Servizio Ordini e Servizio Clienti) che dialogano tra loro in modo resiliente.
  * *Cosa mostrare su GitHub*: La repository contenente i 5 progetti Spring Boot organizzati in un multi-module Gradle/Maven, con un diagramma architetturale dettagliato nel README.

---

### 🟩 MESE 5: Architetture Event-Driven e Dockerizzazione
*Obiettivo: Rendere i microservizi asincroni e containerizzarli per l'ambiente locale.*

* **Settimana 17: Message Broker & RabbitMQ**
  * **Studio**: Comunicazione asincrona, code di messaggi (Message Queue), Pub/Sub (Publish/Subscribe), RabbitMQ basics (Exchanges, Queues, Routing Keys).
  * **Microtask**: Configura RabbitMQ localmente e scrivi un publisher Java che invia messaggi JSON ad una coda e un consumer che li elabora.
* **Settimana 18: Spring Boot con Apache Kafka o RabbitMQ**
  * **Studio**: Integrazione avanzata di eventi, messaggistica affidabile (delivery guarantees), gestione degli errori (Dead Letter Queues - DLQ).
  * **Microtask**: Quando un utente effettua un ordine nel Servizio Ordini, pubblica un evento che viene catturato dal Servizio Notifiche per inviare un'email fittizia.
* **Settimana 19: Dockerizzare l'Applicazione**
  * **Studio**: Immagini Docker, Layer, Dockerfile, ottimizzazione con Multi-Stage Build per Java (JDK vs JRE), comandi CLI di Docker.
  * **Microtask**: Scrivi un Dockerfile multi-stage super ottimizzato per la tua app Spring Boot, riducendo le dimensioni dell'immagine finale a meno di 150MB.
* **Settimana 20: Docker Compose**
  * **Studio**: Gestione di ambienti multi-container, orchestrazione locale, variabili d'ambiente, dipendenze tra container (`depends_on`).
  * **Microtask**: Crea un file `docker-compose.yml` che avvii in un colpo solo PostgreSQL, RabbitMQ, Redis e il tuo microservizio Java, connettendoli su una rete Docker dedicata.
* **📦 PROGETTO GITHUB #5: [Event-Driven-Dockerized-App]**
  * *Cosa fare*: Dockerizzare l'intero ecosistema a microservizi creato nei mesi precedenti. Aggiungere la comunicazione asincrona via RabbitMQ/Kafka e permettere a chiunque di avviare tutto il sistema localmente con un singolo comando: `docker-compose up`.
  * *Cosa mostrare su GitHub*: Il codice con tutti i Dockerfile e il file `docker-compose.yml` funzionante alla radice del progetto. Aggiungi istruzioni passo-passo nel README.

---

### 🟩 MESE 6: Orchestrazione con Kubernetes (K8s)
*Obiettivo: Gestire la scalabilità, l'auto-healing e la configurazione dei container.*

* **Settimana 21: Introduzione a Kubernetes & Minikube**
  * **Studio**: Architettura di K8s (API Server, Kubelet, etcd), installazione di Minikube e configurazione del tool CLI `kubectl`.
  * **Microtask**: Avvia Minikube sul tuo computer e lancia un container Nginx di test utilizzando la riga di comando `kubectl run`.
* **Settimana 22: Kubernetes Manifests (Pods & Deployments)**
  * **Studio**: File YAML di configurazione, Pods, Deployments per definire la replica e l'auto-healing, aggiornamenti e rollback (Rolling Updates).
  * **Microtask**: Scrivi il file `deployment.yaml` per il tuo microservizio Java e impostalo per avere 3 repliche attive. Simula il crash di un Pod e osserva come K8s lo ricrea istantaneamente.
* **Settimana 23: Networking in K8s (Services & Ingress)**
  * **Studio**: K8s Services (ClusterIP, NodePort, LoadBalancer), comunicazione interna al cluster, DNS interno, e routing del traffico con Ingress.
  * **Microtask**: Crea un Service di tipo ClusterIP per connettere la tua app al database PostgreSQL interno al cluster, ed un Ingress per mappare il traffico HTTP esterno su un dominio fittizio (es. `miapp.local`).
* **Settimana 24: ConfigMaps, Secrets & Liveness/Readiness Probes**
  * **Studio**: Separazione della configurazione dall'immagine container, gestione sicura delle password, monitoraggio dello stato di salute dei container.
  * **Microtask**: Estrai le credenziali del database della tua app in un Secret di K8s e aggiungi i probe di Liveness e Readiness basati sugli endpoint di Spring Boot Actuator.
* **📦 PROGETTO GITHUB #6: [K8s-CloudNative-Manifests]**
  * *Cosa fare*: Una cartella contenente tutti i manifesti Kubernetes (`yaml`) necessari per installare la tua app a microservizi (con database e cache) su un cluster locale Minikube.
  * *Cosa mostrare su GitHub*: Una repository dedicata ai manifesti K8s, organizzata per cartelle (database, microservizi, gateway), con una guida nel README su come avviare il cluster e accedere all'applicazione tramite Ingress.

---

### 🟩 MESE 7: Cloud Computing (AWS) e infrastruttura di Produzione
*Obiettivo: Configurare e rilasciare l'architettura su infrastruttura Cloud AWS.*

* **Settimana 25: Introduzione ad AWS (Core Services)**
  * **Studio**: AWS console e CLI, Identity and Access Management (IAM), VPC (Virtual Private Cloud - subnets, route tables, security groups).
  * **Microtask**: Crea una VPC sicura su AWS con subnets pubbliche e private, e avvia una macchina virtuale EC2 accessibile solo tramite chiave SSH.
* **Settimana 26: AWS Databases & Registri Container**
  * **Studio**: AWS RDS (PostgreSQL/MySQL gestito), AWS ECR (Elastic Container Registry) per hostare le immagini Docker.
  * **Microtask**: Configura un database RDS PostgreSQL e inserisci le sue credenziali nella tua app Java. Successivamente effettua il push dell'immagine Docker della tua app nel registro privato AWS ECR.
* **Settimana 27: Cloud Kubernetes con AWS EKS (Basi)**
  * **Studio**: Elastic Kubernetes Service (EKS) su AWS, configurazione dei nodi di calcolo, integrazione con VPC.
  * **Microtask**: Crea un cluster EKS base (anche utilizzando la console AWS o `eksctl`) ed effettua l'autenticazione dal tuo terminale locale.
* **Settimana 28: Deploy su AWS EKS**
  * **Studio**: Adattare i manifesti locali di K8s per il Cloud, AWS Load Balancer Controller.
  * **Microtask**: Esegui le deploy del tuo database e della tua app su AWS EKS. Verifica che l'app sia accessibile pubblicamente tramite un Load Balancer creato da AWS.
* **📦 PROGETTO GITHUB #7: [AWS-Spring-EKS-Deployment]**
  * *Cosa fare*: Deployare l'applicazione Spring Boot su AWS EKS collegata a un database AWS RDS, esponendo l'app all'esterno in modo sicuro.
  * *Cosa mostrare su GitHub*: Script di configurazione e una wiki/README dettagliata con screenshot e spiegazione passo-passo del flusso di configurazione delle risorse AWS.

---

### 🟩 MESE 8: CI/CD (DevOps) e Consolidamento Portfolio
*Obiettivo: Automatizzare l'intero ciclo di vita del software e prepararsi ad entrare nel mercato.*

* **Settimana 29: Continuous Integration (CI) con GitHub Actions**
  * **Studio**: Pipeline DevOps, runner di GitHub Actions, sintassi dei workflow YAML, build automatiche Gradle/Maven e testing ad ogni push.
  * **Microtask**: Crea una pipeline CI su GitHub Actions per il tuo progetto Java che si attiva a ogni commit, effettua la compilazione, esegue i test e fallisce se i test non passano.
* **Settimana 30: Continuous Deployment (CD) su ECR ed EKS**
  * **Studio**: Rilascio continuo, integrazione sicura tra GitHub Actions e AWS (tramite IAM OIDC), build di immagini Docker ed esecuzione del deploy automatico su Kubernetes.
  * **Microtask**: Estendi la pipeline: se i test passano, compila l'immagine Docker, fai il push su AWS ECR ed esegui un comando `kubectl set image` su AWS EKS per aggiornare l'app in produzione.
* **Settimana 31: Infrastructure as Code (IaC) con Terraform (Opzionale ma Premium)**
  * **Studio**: Declarazione dell'infrastruttura come codice, Terraform providers, risorse, stato di Terraform (`tfstate`).
  * **Microtask**: Scrivi un file Terraform per creare automaticamente la VPC e il cluster EKS usati nel mese precedente, distruggendo tutto con `terraform destroy`.
* **Settimana 32: CV, Portfolio Review e Simulazioni**
  * **Attività**:
    * Pulisci tutte le repository GitHub (assicurati che non ci siano password o segreti hardcoded!).
    * Scrivi un'ottima bio per il tuo profilo GitHub.
    * Aggiorna LinkedIn evidenziando le competenze: *Java/Spring Boot, Microservices, Docker, Kubernetes, AWS, CI/CD*.
    * Preparati sulle domande frequenti di System Design e programmazione ad oggetti (es. LeetCode).
* **📦 PROGETTO GITHUB #8 (FINALE): [Production-Ready-CloudNative-App]**
  * *Cosa fare*: L'unione di tutto il lavoro svolto: la repository contiene il codice dei microservizi Java Spring Boot, le configurazioni Docker/K8s, gli script Terraform per il Cloud AWS e le pipeline GitHub Actions che automatizzano build, test e deploy.
  * *Cosa mostrare su GitHub*: Il progetto completo (monorepo). Questo sarà il tuo fiore all'occhiello da mettere in cima al tuo CV e mostrare ai futuri datori di lavoro durante i colloqui.
