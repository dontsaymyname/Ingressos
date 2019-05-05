public class CamaroteInferior extends IngressoVip{

    private String localizacao;
    private float inferiorPreco = getValor() + getValorAdicional();


    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao(){
        System.out.println(localizacao);
    }
}
