package Compozitie;

public class cardSIM {

    private String operator;
    private String numeFrecventa;

    public cardSIM(int frecventa, String operator) {
        this.operator = operator;
        this.numeFrecventa = frecventa + "G";
    }

    public void setNumeFrecventa (int frecventa) {
        this.numeFrecventa = frecventa + "G";
    }

    public void setOperator (String operator) {
        this.operator = operator;
    }

    public String getOperator () {
        return this.operator;
    }

    public String getNumeFrecventa () {
        return this.numeFrecventa;
    }
}