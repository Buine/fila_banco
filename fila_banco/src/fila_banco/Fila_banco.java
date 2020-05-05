package fila_banco;
import java.util.Scanner;

public class Fila_banco {
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        
        System.out.print("Numero de cajas disponibles: ");
        int nCajas = L.nextInt(); 
        Cola caja[] = new Cola[nCajas];
        
        for(int i = 0; i < nCajas; i++){
            caja[i] = new Cola();
        }
        
        int op = -1; 
        while(op != 4){
            System.out.println("--------------------------");
            System.out.println("           Menu           ");
            System.out.println("  1. Agregar a una cola   ");
            System.out.println("  2. Atender en una cola  ");
            System.out.println("  3. Imprimir una cola    ");
            System.out.println("  4. Salir                ");
            System.out.println("--------------------------");
            System.out.print("Opcion: ");
            op = L.nextInt();
            if(op == 4) { System.out.println("Cerrando el programa"); break; }
            System.out.print("\nIngresa el numero de la caja ("+nCajas+" disponibles): ");
            int c = L.nextInt();
            if(c > 0 && c <= nCajas){
                switch(op){
                    case 1:
                        System.out.println("\nTipos de Transacción");
                        System.out.println("1. Consignación");
                        System.out.println("2. Retiro");
                        System.out.print("Seleccione el tipo de transacción: ");
                        int t = L.nextInt();
                        if(t > 0 && t < 3){
                            char tipo = t == 1 ? 'c' : 'r';
                            System.out.print("Ingresa el monto de la transacción: ");
                            int monto = L.nextInt();
                            caja[c-1].agregar(tipo, monto);
                            System.out.println("Se agrego a la cola "+c+", en el puesto "+caja[c-1].getCant());
                        } else {
                            System.out.println("No seleccionaste una opción valida.");
                        }
                        break;
                     
                    case 2:
                        caja[c-1].atender();
                        break;
                       
                    case 3:
                        System.out.println("[Caja #"+c+"]");
                        caja[c-1].impirmir_cola();
                        break;
                }
            } else {
                System.out.println("Ingresaste un número de caja invalido.");
            }
        }
    }
    
}
