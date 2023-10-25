/*
Reduccio de prints en EndevinaNombre
*/
public class EndevinaNombre {

        public static void main(String[] args) {

            int numeroPensat;   
            int numero;         

            numeroPensat = Integer.parseInt(args[0]);
            System.out.println("El número pensat és " + numeroPensat);

            numero = numeroPensat * 3;
            System.out.println("Quan el multipliques per 3 obtens " + numero);

            numero = numero + 6;
            System.out.println("Quan li sumes 6 arriba a " + numero);

            numero = numero / 3;
            System.out.println("Un cop dividit per 3 queda " + numero);

            numero = numero - numeroPensat;
            System.out.println("Finalment, en restar-li el valor inicial, queda " + numero);

            System.out.println("A que el resultat és 2?");
        }
    }
