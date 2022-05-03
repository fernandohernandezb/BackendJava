public class Octocat {

    public int id;
    public String nombre;
    public String tamanio;
    public String color;
    public String poderes;

/*
    public Octocat(int id,String nombre,String tamanio,String color, String poderes){
        this.id=id;
        this.nombre=nombre;
        this.tamanio=tamanio;
        this.color=color;
        this.poderes=poderes;
    }
*/

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getColor() {
        return color;
    }

    public String getPoderes() {
        return poderes;
    }

    public boolean setId(int id) {
        if(id > 0){
            this.id=id;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setTamanio(String tamanio) {
        if (!tamanio.isEmpty()){
            this.tamanio = tamanio;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }

    public boolean setPoderes(String poderes) {
        if (!poderes.isEmpty()){
            this.poderes=poderes;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "Id: "+id+
                        "\nNombre: "+nombre+
                        "\nTamaño: "+tamanio+
                        "\nColor: "+color+
                        "\nPoderes: "+poderes+"\n";
    }

}
