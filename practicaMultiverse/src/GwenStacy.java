public class GwenStacy extends Spiderman implements CallBacksGwenStacy{

    public GwenStacy(String nombreReal, String aliasActual, String otrosAlias, String genero, String universo){
        super(nombreReal,aliasActual,otrosAlias,genero,universo);
    }


    @Override
    public void fuerzaSobrehumana(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("gwenStacy.jpg");
        s.out("\nFuerza SobreHumana: La fuerza de Spider-Woman le permite levantar " +
                "10 toneladas de fuerza, lo suficiente para alzar autos de mediano tamaño");
        s.setBounds(300,200,400,800);

    }

    @Override
    public void velocidadSobrehumana(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("gwenStacy.jpg");
        s.out("\nVelocidad SobreHumana: Su factor de velocidad y reflejos son varias decenas " +
                "de veces más rápidos que cualquier ser humano en perfectas condiciones físicas.");
        s.setBounds(300,200,400,800);

    }

    @Override
    public void reflejosSobrehumana(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("gwenStacy.jpg");
        s.out("\nReflejos SobreHumanos: Spider-Woman posee reflejos y movimientos que le permiten " +
                "esquivar casi cualquier objeto que viaje a grandes velocidades");
        s.setBounds(300,200,400,800);

    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",16,Colors.BlueHorizon);
        s.showImage("gwenStacy.jpg");
        s.out("\nSentido aracnido:  Spider-Woman posee un sentido extrasensorial o sentido " +
                "arácnido que le avisa de los potenciales peligros inmediatos con una sensación de " +
                "hormigueo en la parte posterior de la cabeza");
        s.setBounds(300,200,400,800);

    }
}
