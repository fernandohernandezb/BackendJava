public class Harry {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Caracteristicas test = new Caracteristicas();

        test.setNombre("Harry Potter");
        test.setCasa("Gryffindor");
        test.setGenero("Hombre");
        test.setBoggart("Dementor");
        test.setPatronus("Ciervo");

        System.out.println(test.showMessage());

    }
}
