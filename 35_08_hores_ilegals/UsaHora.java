/*
	An application that uses the class "Hora" and makes an instance of it. Plus, it is made for testing java exceptions
*/
public class UsaHora {
    public static void main(String[] args) throws Exception{
        System.out.println("Intentarem crear una hora amb valors no vàlids");
        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}
