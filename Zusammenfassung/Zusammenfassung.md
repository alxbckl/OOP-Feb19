# Tag 1
## Klassen und Objekte
Klassen stellen uns als Vorlagen für unsere Objekte vor. <br>
Objekte sind konkrete Instanzen von Klassen. <br>
Alles was in einer Klasse definiert wurde, ist für ALLE Objekte verfügbar. <br>
Die Datensätze von Objekte sind dabei immer eigene.

### Erstellen von Objekten
Wir erinnern uns an das Deklariern und Initialisieren von Variablen. <br>
Datentyp Variablennamen = Wert; <br>
int meineZahl = 5; <br>
Analog dazu das Erstellen von Objekten. <br>
Klassenname Objektname = new Klassenname(); <br>
Durchschnitt derDurschnitt = new Durchschnitt(); 

### Definition von Methoden und Attributen
#### Methoden - Was macht die Klasse / das Objekt?
Funktioniert genau wie bisher, ein Unterschied ist zu beachten! <br>
Das bisher voren angesetzte static fällt weg. <br>
Methoden sind wie bisher mit und ohne Parametern sowie mit und ohne Rückgabetyp definierbar.
 
#### Attribute - Was weiß die Klasse / das Objekt?
Funktioniert genau wie bisher, ein Unterschied ist zu beachten! <br>
Das bisher voren angesetzte static fällt weg. <br>
Alle Datentypen sind wie bisher verfügbar. Regeln über die Zugreifbarkeit gelten unverändert!

### Zugriff auf Methoden
Um auf Methoden aus einen Objekt zuzugreifen, schreiben wir Objektname.Methodenname(); <br>
derDurchschnitt.berechneDurchschnitt(); <br>
Die runden Klammern sind weiterhin beim Aufruf von Methoden nötig!

#### Übergabe von Parametern
Parameter sind die Informationen, die wir von außen in die Methode übergeben. Sie sind NUR während der Bearbeitung des entsprechend Aufrufs sichtbar! <br>
Hier gelten auch alle bisher bekannten Regeln! <br>
Die Übergabe ist auch über Klassen hinweg möglich!

#### Annahme von Rückgabewerten
Auch hier gelten alle bisher bekannten Regeln unverändert. <br>
Anstelle von void schreiben wir unseren Rückgabetypen. <br>
String gebeText() { <br>
        return "Rückgabe 2"; <br>
} <br>
Bei Aufruf der Methode haben wir die Möglichkeit den Rückgabewert aufzugreifen.
System.out.println(derDurchschnitt.gebeText());


