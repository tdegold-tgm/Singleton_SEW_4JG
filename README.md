# Singleton Design Pattern

## Problemstellung

Für manche Softwareprojekte ist es notwendig, von einer Klasse nur **ein** Objekt zu instanzieren. Ein gängiger Anwendugsfall sind Drucker. Sämtliche Druckaufträge müssen in einem Puffer gespeichert werden, damit der Drucker seine Arbeit ausführen kann. Gibt es mehrere Puffer, kommt es zu Konflikten.

## Definition



## Beispiel für Singleton

Im folgenden sehen wir uns an, wie Singleton konkret umgesetzt werden kann.

Sämtlicher Code für dieses Beispiel ist im [src-Ordner](src) zu finden.

```Shell
String from s1 is THIS TEST IS USED TO TEST THE SINGLETON DESIGN PATTERN
String from s2 is THIS TEST IS USED TO TEST THE SINGLETON DESIGN PATTERN
String from s3 is THIS TEST IS USED TO TEST THE SINGLETON DESIGN PATTERN


String from s1 is this test is used to test the singleton design pattern
String from s2 is this test is used to test the singleton design pattern
String from s3 is this test is used to test the singleton design pattern
```



**Vorteile:**



**Nachteile:**



## Designprinzipien

