# Mon Projet JavaFX

Ce projet est une application JavaFX simple qui affiche "Hello World" et illustre la mise en place d'un environnement de développement moderne avec Maven, JavaFX, JUnit, JaCoCo et Checkstyle. Ce projet a été conçu pour répondre aux exigences d'un TP de configuration d'environnement de développement Java.

## Table des matières

- [Prérequis](#prérequis)
- [Installation](#installation)
- [Structure du projet](#structure-du-projet)
- [Compilation et Exécution](#compilation-et-exécution)
- [Tests et Couverture](#tests-et-couverture)
- [Qualité du code](#qualité-du-code)
- [Contributing](#contributing)
- [Licence](#licence)

## Prérequis

- **Java JDK 23** ou supérieur (OpenJDK 23 recommandé)
- **Maven** (version 3.6 ou ultérieure)
- **IntelliJ IDEA** (recommandé pour faciliter la configuration et le développement)
- (Optionnel) **WSL sous Windows** avec Ubuntu pour l'exécution sous Linux

## Installation

1. **Cloner le dépôt :**
   ```bash
   git clone https://votre-repo-url.git
   cd java-fx-dev-env
   ```

2. **Télécharger les dépendances Maven :**
   ```bash
   mvn clean install
   ```

3. **Configurer les variables sensibles :**  
   Créez un fichier `.env` à la racine du projet pour stocker vos informations sensibles
   (ce fichier est ignoré par Git grâce à `.gitignore`).

## Structure du projet

Le projet respecte la structure standard Maven :

```
java-fx-dev-env/
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── exemple
    │   │           └── monprojet
    │   │               └── MainApp.java
    │   └── resources
    │       └── (vos fichiers FXML, images, etc.)
    └── test
        └── java
            └── com
                └── exemple
                    └── (vos tests unitaires)
```

## Compilation et Exécution

### Utilisation de Maven

Pour compiler et exécuter l'application via le plugin JavaFX, utilisez la commande suivante :

```bash
mvn clean javafx:run
```

Le plugin se charge de configurer le module path pour JavaFX et d'ajouter les modules nécessaires.

### Exécution directe avec Java

Si vous souhaitez exécuter directement le jar généré, vous pouvez le créer avec :

```bash
mvn clean package
```

Puis lancez-le avec la commande (en spécifiant le module path si nécessaire) :

```bash
java --module-path /chemin/vers/javafx-sdk-23/lib --add-modules javafx.controls,javafx.fxml -jar target/java-fx-dev-env-1.0-SNAPSHOT.jar
```

## Tests et Couverture

Les tests unitaires sont écrits avec JUnit 5 et se trouvent dans le dossier `src/test/java`.

Pour exécuter les tests et générer un rapport de couverture (via JaCoCo) :

```bash
mvn test
```

Le rapport de couverture sera généré dans le dossier `target/site/jacoco`.

## Qualité du code

Le projet utilise Checkstyle pour garantir une bonne qualité de code, basé sur la configuration Google Java Style.
L'analyse Checkstyle est lancée automatiquement lors de la phase de validation (`mvn validate`).

## Contributing

Les contributions sont les bienvenues ! Pour proposer des modifications :

1. Créez une branche avec un nom explicite.
2. Respectez les conventions de commits (exemple : `feat: ajout de la fonctionnalité X`).
3. Assurez-vous que tous les tests passent avant de soumettre votre pull request.

## Licence

Ce projet est sous licence MIT.