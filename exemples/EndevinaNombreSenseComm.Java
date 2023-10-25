 public class EndevinaNombre {

        public static void main(String[] args) {

            int numeroPensat;   
            int numero;         

            numeroPensat = Integer.parseInt(args[0]);
            System.out.print("El número pensat és ");
            System.out.println(numeroPensat);

            numero = numeroPensat * 3;
            System.out.print("Quan el multipliques per 3 obtens ");
            System.out.println(numero);

            numero = numero + 6;
            System.out.print("Quan li sumes 6 arriba a ");
            System.out.println(numero);

            numero = numero / 3;
            System.out.print("Un cop dividit per 3 queda ");
            System.out.println(numero);

            numero = numero - numeroPensat;
            System.out.print("Finalment, en restar-li el valor inicial, queda ");
            System.out.println(numero);

            System.out.println("A que el resultat és 2?");
        }
    }
