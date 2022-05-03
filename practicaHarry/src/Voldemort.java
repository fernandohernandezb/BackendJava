public class Voldemort {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Caracteristicas test = new Caracteristicas();

        test.setNombre("Tom Riddle (Voldermort)");
        test.setCasa("Slytherin");
        test.setGenero("Hombre");
        test.setBoggart("Su propio cadaver");
        test.setPatronus("None");

        System.out.println(test.showMessage());

    }

}
