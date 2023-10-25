###########################
Anotacions sobre propietats
###########################

* Autor/a: Dinar Khazimullin

* Data: 08/02/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01   public class GatRenat {
    02       public int vides = 7;         // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }

Pregunta 1. El nom del fitxer
=============================

Per que funcioni, el nom del fitxer que contingui el programa anterior ha
de ser ``GatRenat.java``.

Si reanomeno el fitxer anterior a ``UnNomQualsevol.java``, em trobo el
següent resultat a l'hora de compilar:

::

    $ javac UnNomQualsevol.java
    error: file not found: UnNomQualsevol.java
    Usage: javac <options> <source files>
    use --help for a list of possible options
    O sigui, tenim un error de falta de trobada de l'arxiu


Pregunta 2. Sortida
===================

En executar el programa ``GatRenat`` m'ha generat la següent sortida:

::

    $ java GatRenat
    Al gat Renat li queden 7 vides

Pregunta 3. Declaració de ``renat``.
====================================

La línia en que està declarada la variable ``renat`` que apareix a la
línia 6 és la 5, "renat = new GatRenat();".

Pregunta 4. Inicialització
==========================

El valor que es mostra per pantalla, és assignat a la línia 2, "public int vides = 7;".

Pregunta 5. No inicialització
=============================

Si a la línia especificada per la pregunta anterior no li assignem cap
valor, el que es mostrarà per pantalla és:

::

    Al gat Renat li queden 0 vides

Pregunta 6. Eliminem la línia 5
===============================

En cas que la línia 5 no hi sigui (per exemple, si la comento), es
produeix el següent resultat:

GatRenat.java:6: error: variable renat might not have been initialized

Penso que passa això perquè no fem la inicialitzacio de la variable "renat", per lo qual, al fer el print de renat.vides, la variable renat no te cap valor asignat.

Pregunta 7. Referència
======================

Penso que el el comentari de la línia 4 parla de *referència* perquè no dona la informacio de forma directa, no es una data primitiva, sino que "referencia", o apunta, a unaltre posicio. O sigi, la referencia apunta a la posicio @2000, pero el contingut d'aquesta no es GatRenat, sino es @5000 on es troba la informacio.

Crec que la  relació entre *referència* i *variable* és: les dos apunten a la informacio, pero mentre que variable es prmitiva i guarda directament la informacio en la seva posicio, la referencia apunta a una posicio en la memoria.


Pregunta 8. Instància
=====================

Respecte la línia 5:

* la instància és: la informacio de new GatRenat

* la variable és: renat

* la referència és: new GatRenat

* la classe és: GatRenat

Pregunta 9. ``vides`` i variables globals
=========================================

Les diferències presenta la variable ``vides`` respecte les 
*variables globals* són:

1. La falta de static.

2. El canvi de private a public.
