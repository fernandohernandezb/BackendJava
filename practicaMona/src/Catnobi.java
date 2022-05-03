public class Catnobi extends Octocat{

    private String masDatos;

    public Catnobi(){
        setId(3);
        setNombre("Catnobi");
        setTamanio("Mediano");
        setColor("Cafe");
        setPoderes("Artes Jedi");
        this.masDatos="Tiene capa cafe";
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
