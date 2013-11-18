# Introduction to Inheritance
## The task
Our job is to model a freighter and the goods it transports. A freigther consists of a quadratic field (N x N) of storage space and every place can hold one good. Goods have different weights (measured in tons). The total weight of a freigther should not exeed N x N / 2 tons.
## The Freighter
To model the freigther, create an abstract class Freigther that stores all goods in an N x N array. The size N should be a parameter to the constructor. Add a getter and a setter to get and set a field at position (x,y). We need another method to sum up the total weight, called getTotalWeight. Add a way to create a string representing your goods (i. e. a toString() method).
## Goods
Goods should inherit from the abstract "Good" class. Goods should have a way to get its weight and return a string representation of that good. Implement getWeight() and toString() for that.
***
#Einführung in die Vererbung
## Unsere Aufgabe
Unsere Aufgabe ist es, einen Frachter und die Güter, die dieser transportiert, zu modellieren. Ein Frachter besteht aus einem quadratischen Feld (N x N) von Ladefläche und jeder Platz kann ein Gut enthalten. Güter haben verschiedene Gewichte (gemessen in Tonnen). Das Gesamtgewicht eines Frachters soll maximal (N x N)/2betragen.
## Der Frachter
Um den Frachter zu modellieren, erzeugen wir einen abstrakte Klasse "Freighter", die alle Güter in einem NxN-Feld speichert. Die Größe N soll ein Parameter des Konstruktors von "Freigther" sein. Wir führen außerdem einen Getter und Setter für die Güter an Position (x,y) ein. Wir brauchen außerdem eine Methode, die uns das Gesamtgewicht berechnet, die wir getTotalWeight nennen. Um die Ladung zu visualisieren, führen wir eine toString-Method für "Freighters" ein.
## Güter
Güter sollen von der Klasse "Good" erben. Güter haben zwei Methoden, um ihr Gewicht und eine Textrepräsentation zu erhalten. Dazu implementieren wir getWeight() und toString().
