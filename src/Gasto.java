public class Gasto {
    public String concepto;
    public float importe;

    public Gasto(String concepto, float importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public float getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "concepto='" + concepto + '\'' +
                ", importe=" + importe +
                '}';
    }
}
