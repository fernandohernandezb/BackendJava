public class Octoclark extends  Octocat{
    private String masDatos;

    public Octoclark(){
        setId(26);
        setNombre("Octoclark");
        setTamanio("Grande");
        setColor("Azul con escudo");
        setPoderes("Super fuerza, vuela y super visión");
        this.masDatos="Se tiene que cambiar para cuidar su identidad";
    }

    @Override
    public String showMessage() {
        return
                "Id: "+id+
                        "\nNombre: "+nombre+
                        "\nTamaño: "+tamanio+
                        "\nColor: "+color+
                        "\nPoderes: "+poderes+
                        "\nMas datos: "+masDatos+"\n";
        //return super.showMessage();
    }


}
