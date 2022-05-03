public class Inspectocat extends Octocat{

    private String masDatos;

    public Inspectocat(){
        setId(23);
        setNombre("Inspectocat");
        setTamanio("Chico");
        setColor("Cafe");
        setPoderes("Inspeccion y busqueda");
        this.masDatos="Tiene capa, gorra y carga una lupa";
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
