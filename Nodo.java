
public class Nodo {
    String info;
    Nodo sig;
    
    public Nodo(String dato){
        this.info=dato;
        this.sig=null;
    }

    public String getInfo() {
        return info;
    }
}
