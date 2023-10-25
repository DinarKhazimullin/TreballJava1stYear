/*
	A java program that uses the class CatRenat or "GatRenat" and test its functions. This time we use Exceptions
*/
public class UsaGatRenat {
      public static void main(String[] args){
          try {
              GatPosicio posicio = GatPosicio.fromString(args[0]);
              GatRenat renat = new GatRenat(posicio);
              System.out.println("El gat Renat està: " + renat.getPosicio());
         } catch (IllegalArgumentException e) {
             System.out.println(e);
         }
      }
 }
