==========================
Precedencia dels operadors
==========================

Enunciat
========
Posa parèntesis i calcula el resultat final de les següents expressions de manera que quedi explícitada la precedència del operadors.

Pots fer servir la jshell per comprovar els teus resultats.

Exercici
--------
1. 5 + 4 * 3
	5 + (4 * 3) => 5 + 12 => 17
2. -5 * 4 + -3
	(-5 * 4)+ -3 => - 20 - 3 => - 23
3. true && false || ! true
	true && false || (! true) => true && false || false => false || false => false
4. false && (10 > 3) || ! (4 > 5)
	false && (10 > 3) || (! (4 > 5)) => false && (10 > 3) || true => false && true || true => false || true => true
5. (false == (5 > 4)) && (false == ! true) || (false != true)
	(false == (5 > 4)) && (false == (! true)) || (false != true) => (false == true) && (false == false) || (false != true) => false && true || true => false || true => true

Conclusio
=========
Jo com ja he fet taules de veritat en tecnologia no s'em dona tan malament al comparar diferents valors, pero potser que estigui malament i amb aquest text quedi una mica malament.
