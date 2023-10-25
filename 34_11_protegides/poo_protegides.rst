##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Dinar Khazimullin

* Data: 2/20/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que no funcionara.

Penso que passa perquè renat.vides es private, o sigui que esta protegit i unicament pot ser utilitzat dins de la clase GatRenat

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és un "getter".

El resultat ara és El gat Renat te 7 vides

Penso que passa això perquè no ens retorna la variable directament, sino el contingut de dins.
Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer XXX.

El codi de ``UsaGatRenat`` seria:

::
	public class UsaGatRenat {
		public static void main(String[] args) {
			GatRenat renat = new GatRenat();
			renat.setVides(5);
			System.out.println("El gat Renat te " + renat.getVides() + " vides");
		}
	}
    

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat te 5 vides


La meva explicació de perquè això és així és perque es modifica la variable desde dins de la clase de GatRenat amb el modul de setVides.


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que no pasa res per el condicional dins de set vides.

El codi seria:

::
	public class UsaGatRenat {
		public static void main(String[] args) {
			GatRenat renat = new GatRenat();
			renat.setVides(-12);
			System.out.println("El gat Renat te " + renat.getVides() + " vides");
		}
	}
    


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat te 7 vides.


La meva explicació de perquè això és així és per el condicional dins de setVides;


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què el resultat es incoherent amb -12 vides.

Comparant-lo amb el que passava a la pregunta 1, veiem que si es pot modificar la variable vides.

La meva explicació és perque al ser de la mateixa clase, els canvis fets dins si son efectuats.

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és si perquè si es el cas del exercici anterior, vides sera un valor absurd si volem, pero si es desde extern, no es pot posar valors absurds per el condicional que es troba dins de setVides.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és si es pot modificar fora i dins o unicament dins de la clase. Public permet la modificacio desde fora de la clase mentre que private unicament dins.

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls getVides i setVides.

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria no poder veure les vides, pero si cambiarles.

En canvi, si només en tingués *setter* el que passaria és que unicament podriem veure les vides pero no modificarles.

Finalment, si no en tingués cap dels dos, ens trobaríem que no podriem fer res amb les dades del GatRenat.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret la falta de static.
