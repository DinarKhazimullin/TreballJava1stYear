================================
Expressions amb operadors logics
================================

Enunciat
--------
En aquest exercici construiràs expressions de les següents afirmacions.

Pots fer servir tots els operadors aritmètics, relacionals i els lògics &&, || i !.

Exercici
========
1. la Clara és més jove que tu

| edatClara < edatMeva

2. la Clara i el Marc són més joves que tu

| edatClara < edatMeva && edatMarc < edatMeva

3. la Clara és més jove que tu i tu ets més jove que el Marc

| edatClara < edatMeva || edatMarc > edatMeva

4. la Clara no és més jove que el Marc

| !(edatClara < edatMarc)

5. no és cert que el Marc sigui més jove que la Clara

| !(edatMarc < edatClara)

6. Ni el Marc es mes jove que la Clara ni tu ets mes jove que el Marc

| !(edatMarc < Clara) && !(edatMeva < edatMarc)

7. Tu ets mes gran que la Clara i el Marc junts o be al Clara i el Marc tenen la mateixa edat

| edatMeva > edatClaraIMarc || edatClara = edatMarc

8. El teu germa es mes gran que jo

| edatGerma > edatMeva

9. Els teus amics tenen la teva edat

| edatAmics == edatMeva

