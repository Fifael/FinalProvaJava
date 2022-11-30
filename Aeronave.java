import java.util.ArrayList;

public abstract class Aeronave implements GetId  {

    private int id;
    private String marca;
    private String modelo;
    private Arraylist<Voo> voos;

    protected Aeronave(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.voos = new ArrayList<Voo>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Voo> getVoos() {
        return voos;

    

}

    public void setVoo(Voo voo) {
    }
