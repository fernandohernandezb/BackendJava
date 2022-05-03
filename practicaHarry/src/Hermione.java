public class Hermione {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Caracteristicas test = new Caracteristicas();

        test.setNombre("Hermione Granger");
        test.setCasa("Gryffindor");
        test.setGenero("Mujer");
        test.setBoggart("Fallar");
        test.setPatronus("Nutria");

        System.out.println(test.showMessage());

    }

}
