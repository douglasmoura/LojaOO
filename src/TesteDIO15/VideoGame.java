package TesteDIO15;

public class VideoGame extends Produto implements Imposto{
    
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame(String nome, Double preco, Integer quantidade, String marca, String modelo, boolean isUsado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isUsado() {
        return isUsado;
    }
    public void setUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }
    
    @Override
    public Double calculaImposto() {
        if ( isUsado() == true) {
            return getPreco() * 0.25;
        }else
            return getPreco() * 0.45;
    }
}
