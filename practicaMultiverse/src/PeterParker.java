public class PeterParker extends Spiderman implements CallBacksPeterParker{

    public PeterParker(String nombreReal, String aliasActual, String otrosAlias, String genero, String universo){
        super(nombreReal,aliasActual,otrosAlias,genero,universo);
    }


    @Override
    public void fuerzaSobrehumana(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("peterParker.jpg");
        s.out("\nFuerza SobreHumana: La fuerza de Spider-Man es de Clase 10" +
                " (capaz de levantar 10 toneladas), esta fuerza le ha permitido" +
                " realizar grandes proezas de fuerza física");
        s.setBounds(300,200,400,800);
    }

    @Override
    public void curacion(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("peterParker.jpg");
        s.out("\nCuración: Su resistencia y fuerzas físicas Superhumanas también le dan un" +
                " factor de curación muy rápido, pudiendo curar heridas en horas o días " +
                "lo que a un humano normal le tomaría semanas");
        s.setBounds(300,200,400,800);

    }

    @Override
    public void reflejosSobrehumana(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("peterParker.jpg");
        s.out("\nReflejos sobrehumanos: Sus reflejos y movimientos le permiten esquivar " +
                "casi cualquier objeto que viaje a grandes velocidades:");
        s.setBounds(300,200,400,800);

    }

    @Override
    public void trepaMuros(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("peterParker.jpg");
        s.out("\nTrepa muros: A diferencia de la mayoría de sus contrapartes, este Spider-Man " +
                "puede adherirse en cualquier superficie por medio de micro-espinas/velocidades alojadas " +
                "en sus manos y pies.");
        s.setBounds(300,200,400,800);

    }
}
