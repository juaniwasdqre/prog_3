import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int[] arrenteros = new int[10];

        Pet p1 = new Pet(11,"Killa","tranqui", LocalDate.of(2011,11,9));
        Pet p2 = new Pet(5,"Cleo","tranqui",LocalDate.of(2017,8,17));
        Pet p3 = new Pet(8,"Lisa","muy tranqui",LocalDate.of(2014,7,2));
        Pet p4 = new Pet(1,"Lucy","inquieta",LocalDate.of(2022,1,24));

        System.out.println("Mascota 1 \n Nombre = " +p1.getName()+ "\n Mamifero = " +p1.getType()+ "\n edad = " +p1.getAge()+ "\n Fecha de Nacimiento = " +p1.getBdate());
        System.out.println("Mascota 2 \n Nombre = " +p2.getName()+ "\n Mamifero = " +p2.getType()+ "\n edad = " +p2.getAge()+ "\n Fecha de Nacimiento = " +p2.getBdate());
        System.out.println("Mascota 3 \n Nombre = " +p3.getName()+ "\n Mamifero = " +p3.getType()+ "\n edad = " +p3.getAge()+ "\n Fecha de Nacimiento = " +p3.getBdate());
        System.out.println("Mascota 4 \n Nombre = " +p4.getName()+ "\n Mamifero = " +p4.getType()+ "\n edad = " +p4.getAge()+ "\n Fecha de Nacimiento = " +p4.getBdate());


    }
}