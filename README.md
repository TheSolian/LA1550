# Portfolio LA1550

## Einleitung und Ziele
In diesem Modul haben wir Roboter programmiert mit der API von Robocode. Robocode ist ein Programm, welches eine Arena bereitstellt in der man verschiedene Einstellungen wie Grösse und Menge der Roboter treffen kann. Man kann auch wir eigene Roboter mit der Programmiersprache Java schreiben.

### Ziel:
Mein Ziel in diesem Eintrag ist es, meine Strategie zu präsentieren die ich mit meinem Roboter hatte.

## Meine Strategie
Meine Strategie ist es feindliche Roboter mit meinem Radar aufzuspüren und dann zu verfolgen. Wenn ein Roboter aufgespürt wurde wird je nach Distanz zum Roboter unterschiedlich stark zu schiessen.

## Code
```java
public void onScannedRobot() {
        turnGunTo(scannedAngle);
        if (scannedDistance < 50) {
            fire(3);
        } else if (scannedDistance < 100) {
            fire(2);
        } else {
            fire(1);
        }
    }
```

## Roboter Demonstration
https://user-images.githubusercontent.com/89124854/151142828-4f9b4318-dafb-41b3-9884-608f48e59c24.mp4

## Reflexion und Verifikation
### Verifikation:
Ich hae meine Taktik erklärt.

### Reflexion:
Ich hatte am Anfang gewisse Schwierigkeiten zu verstehen wie sich der Roboter verhaltet, oder was eine gute Taktik ist. Schlussendlich habe ich mich an den Gewinnerrobotern orientiert, was aber auch nicht die beste Entscheidung ist. 

### Verbesserungvorschlag:
Ich sollte in Zukunft zuerst versuchen selber nachzudenken und zu überlegen und nicht sofort aufzugeben.

