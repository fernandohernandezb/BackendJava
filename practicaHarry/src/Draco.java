public class Draco {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Caracteristicas test = new Caracteristicas();

        test.setNombre("Draco Malfoy");
        test.setCasa("Slytherin");
        test.setGenero("Hombre");
        test.setBoggart("Lord Voldemort");
        test.setPatronus("None");

        System.out.println(test.showMessage());

    }
}
