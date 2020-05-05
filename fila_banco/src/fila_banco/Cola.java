package fila_banco;

public class Cola {
    private Nodo cab;
    private int cant;
    
    public Cola(){
        this.cab = null;
        this.cant = 0;
    }
    
    public void atender(){
        if(!estaVacia()){
            Nodo sig = this.cab.getSig();
            System.out.println("Se realizo la transacción:");
            System.out.println("Tipo: "+this.cab.getTipo()+", Monto: $"+this.cab.getDato());
            this.cab = sig;
            this.cant--;
        } else {
            System.out.println("La cola está vacia.");
        }
    }
    
    public void agregar(char tipo, int monto){
        Nodo nuevo = new Nodo(tipo, monto);
        Nodo aux = this.cab;
        for(int i = 0; i < this.cant-1; i++){
            aux = aux.getSig();
        }
        aux.setSig(nuevo);
        this.cant++;
        System.out.println("Se ha agregado correctamente.");
    }
    
    public void impirmir_cola(){
        if(!estaVacia()){
            Nodo aux = this.cab;
            System.out.println("Cola:");
            for(int i = 0; i < this.cant; i++){
                System.out.println("[Puesto "+(i+1)+"] Tipo: "+this.cab.getTipo()+", Monto: $"+this.cab.getDato());
                aux = aux.getSig();
            }
        }
    }
    
    public boolean estaVacia() {
        return this.cant == 0;
    }

    public Nodo getCab() {
        return cab;
    }

    public void setCab(Nodo cab) {
        this.cab = cab;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}
