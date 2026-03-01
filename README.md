# Compte Rendu : TP Spring IoC et Injection de Dépendances

## 1. Objectif du TP
L'objectif de ce TP était de comprendre et de mettre en œuvre l'inversion de contrôle (IoC) et l'injection de dépendances à travers différentes méthodes :
- Couplage fort (instanciation directe)
- Couplage faible par instanciation dynamique
- Injection via le Framework Spring (Configuration XML)
- Injection via le Framework Spring (Annotations)

## 2. Problèmes rencontrés et Solutions
Au cours de la séance, j'ai rencontré une erreur majeure : `package org.springframework.context does not exist`.

- **Cause** : Les bibliothèques Spring n'étaient pas correctement téléchargées ou reconnues par IntelliJ.
- **Solution** : 
    1. Utilisation de **Maven** pour la gestion des dépendances.
    2. Ajout des dépendances `spring-core`, `spring-context` et `spring-beans` dans le fichier `pom.xml`.
    3. Exécution d'un **Reload Maven Project** pour forcer le téléchargement des fichiers JAR.
    4. Résolution des problèmes de structure de dossiers (`src/main/java`).

## 3. Résultats obtenus
Les tests ont été validés avec succès pour les quatre méthodes d'exécution :

### Instanciation Statique et Dynamique
- Résultats conformes aux attentes (Version base de données).

### Injection Spring XML
- Utilisation de `ApplicationContext` avec le fichier `config.xml`.
- Résultat : `RES = -231.004...`

### Injection Spring Annotations
- Utilisation des annotations `@Component` sur les classes et `@Autowired` pour l'injection.
- Résultat : `RES = 190.875...` .
## 5. Preuves d'exécution (Captures d'écran)

### Résultat Instanciation Statique (Pres1)
![Capture Pres1](img/image1.JPEG)

### Résultat Instanciation Dynamique (Pres2)
![Capture Pres2](img/image2.JPEG)

### Résultat Spring XML
![Capture Spring XML](img/image3.JPEG)

### Résultat Spring Annotations
![Capture Spring Annotations](img/image4.JPEG)

## 4. Conclusion
Ce TP m'a permis de maîtriser la configuration d'un projet Spring avec Maven et de comprendre l'avantage du couplage faible pour rendre une application plus flexible et maintenable.