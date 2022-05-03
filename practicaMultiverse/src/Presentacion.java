import java.io.IOException;

public class Presentacion {
    public static void main(String[] args) throws InterruptedException {
        testPeterParker();
        Thread.sleep(15000);
        testGwenStacy();
    }

    public static void testPeterParker() throws InterruptedException{
        Screen screen = new Screen("Spiderman");
        PeterParker peterParker = new PeterParker(
                "Peter Benjamin Parker",
                "Spider-Man",
                "Spidey, Araña-Humana, Trepa-Muros, Amenaza Arácnida, Peter-2",
                "Masculino",
                "Tierra-96283"
        );

        Runnable poderes = new Runnable() {
            @Override
            public void run() {
                try{
                    peterParker.fuerzaSobrehumana(screen);
                    Thread.sleep(5000);
                    peterParker.curacion(screen);
                    Thread.sleep(3000);
                    peterParker.reflejosSobrehumana(screen);
                    Thread.sleep(3000);
                    peterParker.trepaMuros(screen);
                    Thread.sleep(3000);
                    screen.cls();
                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread spider = new Thread(poderes);
        spider.start();

    }

    public static void testGwenStacy() throws InterruptedException{
        Screen screen = new Screen("Spiderman - Gwen Stacy");
        GwenStacy gwenStacy = new GwenStacy(
                "Gwendolyne Maxine Stacy",
                "Ghost-Spider",
                "NA",
                "FEMENINO",
                "Tierra-65, actualmente en Tierra-616"
        );

        Runnable poderes = new Runnable() {
            @Override
            public void run() {
                try{
                    gwenStacy.fuerzaSobrehumana(screen);
                    Thread.sleep(5000);
                    gwenStacy.velocidadSobrehumana(screen);
                    Thread.sleep(3000);
                    gwenStacy.reflejosSobrehumana(screen);
                    Thread.sleep(3000);
                    gwenStacy.sentidoAracnido(screen);
                    Thread.sleep(3000);
                    screen.cls();
                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread spiderG = new Thread(poderes);
        spiderG.start();

    }

}
