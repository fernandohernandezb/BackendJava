public class Ironcat extends Octocat {

    private String masDatos,extra;

    public Ironcat(){
        setId(24);
        setNombre("Ironcat");
        setTamanio("Grande");
        setColor("Rojo y amarillo metalicos");
        setPoderes("Puede volar y disparar laser");
        this.masDatos="Tiene una armadura metalica";
        this.extra="Tiene electricidad infinita";
    }

    @Override
    public String showMessage() {
        return
                "Id: "+id+
                        "\nNombre: "+nombre+
                        "\nTamaño: "+tamanio+
                        "\nColor: "+color+
                        "\nPoderes: "+poderes+
                        "\nMas datos: "+masDatos+
                        "\nExtra: "+extra+"\n";
        //return super.showMessage();
    }

}
