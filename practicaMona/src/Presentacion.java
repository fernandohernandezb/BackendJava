public class Presentacion {
    public static void main(String[] args) {
        testOctocat();
        testCatnobi();
        testInspectocat();
        testIroncat();
        testOctoclark();
        testWaldocat();
    }

    public static void testOctocat(){
        Octocat octocat = new Octocat();
        octocat.setId(1);
        octocat.setNombre("Octocat");
        octocat.setTamanio("Mediano");
        octocat.setColor("Negro");
        octocat.setPoderes("Ninguno");

        System.out.println(octocat.showMessage());
    }

    public static void testCatnobi(){
        Catnobi catnobi = new Catnobi();
        System.out.println(catnobi.showMessage());
    }

    public static void testInspectocat(){
        Inspectocat inspectocat = new Inspectocat();
        System.out.println(inspectocat.showMessage());
    }

    public static void testIroncat(){
        Ironcat ironcat = new Ironcat();
        System.out.println(ironcat.showMessage());
    }

    public static void testOctoclark(){
        Octoclark octoclark = new Octoclark();
        System.out.println(octoclark.showMessage());
    }

    public static void testWaldocat(){
        Waldocat waldocat = new Waldocat();
        System.out.println(waldocat.showMessage());
    }

}
