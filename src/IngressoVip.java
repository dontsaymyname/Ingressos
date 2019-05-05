public class IngressoVip extends Ingresso {

    private float valorAdicional;
    private float valorVip;

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimirValor() {
        valorVip = valorAdicional + getValor();
        System.out.println(valorVip);
    }
}
