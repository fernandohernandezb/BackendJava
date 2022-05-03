public class Ronald {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Caracteristicas test = new Caracteristicas();

        test.setNombre("Ronald Weasley");
        test.setCasa("Gryffindor");
        test.setGenero("Hombre");
        test.setBoggart("Arañas");
        test.setPatronus("Terrier");

        System.out.println(test.showMessage());

    }

}
