public class Spiderman {
    public String nombreReal;
    public String aliasActual;
    public String otrosAlias;
    public String genero;
    public String universo;


    public Spiderman(String nombreReal, String aliasActual, String otrosAlias, String genero, String universo){
        this.nombreReal = nombreReal;
        this.aliasActual= aliasActual;
        this.otrosAlias =  otrosAlias;
        this.genero = genero;
        this.universo = universo;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getAliasActual() {
        return aliasActual;
    }

    public String getOtrosAlias() {
        return otrosAlias;
    }

    public String getGenero() {
        return genero;
    }

    public String getUniverso() {
        return universo;
    }

    public boolean setNombreReal(String nombreReal) {
        if (!nombreReal.isEmpty()){
            this.nombreReal = nombreReal;
            return true;
        } else
            return false;
    }

    public boolean setAliasActual(String aliasActual) {
        if (!aliasActual.isEmpty()){
            this.aliasActual = aliasActual;
            return true;
        } else
            return false;
    }

    public boolean setOtrosAlias(String otrosAlias) {
        if (!otrosAlias.isEmpty()){
            this.otrosAlias = otrosAlias;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero) {
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;

    }

    public boolean setUniverso(String universo) {
        if (!universo.isEmpty()){
            this.universo = universo;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "Nombre Real: "+nombreReal+
                        "\nAlias Actual: "+aliasActual+
                        "\nOtros alias: "+otrosAlias+
                        "\nGenero: "+genero+
                        "\nUniverso: "+universo+"\n";
    }


}
