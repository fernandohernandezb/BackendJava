public class Waldocat extends Octocat{
    private String masDatos;

    public Waldocat(){
        setId(52);
        setNombre("Waldocat");
        setTamanio("Mediano");
        setColor("Blanco con rojo y azul");
        setPoderes("Esconderese");
        this.masDatos="Tienes que buscarlo bien";
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
