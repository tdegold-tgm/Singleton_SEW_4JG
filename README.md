# Singleton Design Pattern

## Problemstellung

Für manche Softwareprojekte ist es notwendig, von einer Klasse nur **ein** Objekt zu instanzieren. Ein gängiger Anwendugsfall sind Drucker. Sämtliche Druckaufträge müssen in einem Puffer gespeichert werden, damit der Drucker seine Arbeit ausführen kann. Gibt es mehrere Puffer, kommt es zu Konflikten.

## Definition

Der Aufbau von Singleton ist sehr einfach, da man nur das Verhalten von einer Klasse regulieren muss. Folgendes UML-Diagramm zeigt seinen Aufbau.

![](img/uml.png)

Zwei Dinge sind zu beachten:

1. `private` Konstruktor: Damit verhindert wird, mehrere Objekte zu erzeugen müssen wir den Konstruktor von der "Außenwelt" verborgen halten. Er ist bei Singleton nicht direkt für die Objekterzeugung zuständig.
2. `Singleton` Attribut: Um jedes mal dasselbe Objekt zurückzugeben, wenn die `getInstance()`-Methode  aufgerufen wird, muss dieses als Attribut gespeichert werden.

## Beispiel für Singleton

Im folgenden sehen wir uns an, wie Singleton konkret umgesetzt werden kann. Dass der Konstruktor `private` ist und es ein `Singletton`-Attribut geben muss darf nicht vergessen werden. 

Die `getInstance()`-Methode sollte Prüfen ob bereits ein Objekt instanziert wurde, bevor sie es zurückgiebt. Dies kann ebenfalls leicht über das Attribut gemacht werden.

```Java
public static Singleton getInstance(){          
	if(Singleton.instance == null){
		Singleton.instance = new Singleton();
    }
    return Singleton.instance;
}
```

Sämtlicher Code für dieses Beispiel ist im [src-Ordner](src) zu finden.

In der Testklasse rufen wir die `getInstance()`-Methode dreimal auf und speichern sie in die Objekte `s1`, `s2` und `s3`. Dann ändern wir den Zustand eines `public`-String-Attributs über eines dieser Objekte und geben das String-Attribut jedes Objektes aus. Wie wir sehen, änderte sich der Zustand bei allen, Objekten, sie referenzieren offensichtlich auf dasselbe `Singleton`-Objekt (siehe [main](src/TestKlasse.java)).

```Shell
String from s1 is THIS TEST IS USED TO TEST THE SINGLETON DESIGN PATTERN
String from s2 is THIS TEST IS USED TO TEST THE SINGLETON DESIGN PATTERN
String from s3 is THIS TEST IS USED TO TEST THE SINGLETON DESIGN PATTERN


String from s1 is this test is used to test the singleton design pattern
String from s2 is this test is used to test the singleton design pattern
String from s3 is this test is used to test the singleton design pattern
```



**Vorteile:**

* Zugriffskontrolle 
* Singleton kann als Interface realisiert werden und dann durch `implement` spezialisiert werden.
* Einzelinstanz wird nur erzeugt, wenn benötigt.
* Singelton wird häufig in Kombination mit anderen **creational** Patterns verwendet. Oft wird es mit *Abstract-Factory* gekoppelt, um eine einzelne Factory-Instanz zu garantieren.



**Nachteile:**

* Wenn mehrere Threads parallel laufen und auf die Singleton-Klasse zugreifen muss gewährleistet werden, dass nur eine Instanz für alle Threads erzeugt wird. Das oben angeführte Beispiel würde pro Thread eine Instanz erzeugt werden. Dies kann durch das Schlüsselwort `synchronized` im Methodenkopf umgesetzt werden.
* Sollte Singleton generisch umgesetzt werden, wird vom Compiler für jeden generic-Type eine Instanz erzeugt. Dies kann beabsichtigtes Verhalten sein, aber auch nicht. In diesem Fall muss auch diese Einschränkung implementiert werden.

---

[1] https://de.m.wikibooks.org/wiki/Muster:_Java:_Singleton

[2] https://www-geeksforgeeks-org.cdn.ampproject.org/v/s/www.geeksforgeeks.org/singleton-class-java/amp/?usqp=mq331AQCKAE%3D&amp_js_v=0.1#aoh=15796804724693&referrer=https%3A%2F%2Fwww.google.com&amp_tf=Von%20%251%24s&ampshare=https%3A%2F%2Fwww.geeksforgeeks.org%2Fsingleton-class-java%2F