
package bar;

public class Inventario {

    public String inventario[][]=new String[20][4];
    public int shotMl = 45;
    public int posNombre = 0;
    public int posPrecio = 1;
    public int posEx = 2;
    public int posCat = 3;
    
 public void agregar(String nombre,String precio,String existenciaMl, String categoria, int pos){
    inventario[pos][posNombre]=nombre;
    inventario[pos][posPrecio]=precio;
    inventario[pos][posEx]=existenciaMl;
    inventario[pos][posCat]=categoria;
}    
 public void crearInventario(){
     int pos = 0;
     agregar("Gray Goose","750","5250","Vodka",pos);
        pos++;
     agregar("Tequila Patron","1050","9000","Tequila",pos);
 }
 public void movimiento(String producto, int cantidad){
 int pos = 0;
    //Buscar posicion del producto 
   while(!producto.equals(inventario[pos][posNombre])){
      pos++;
   } 
   //Obetener cantidad en existencia
   int ex = Integer.parseInt(inventario[pos][posEx]);
   //Restar cantidad de existencia
   inventario[pos][posEx] = String.valueOf(ex - cantidad);
 }
 public int ml(int ml){
     ml = ml/shotMl;
     return ml;
 }
 public int shot(int shot){
     shot = shot * shotMl;
     return shot;
 }
 
 public void imprimirTest(){
      
     crearInventario();
     movimiento("Tequila Patron", 1);
     System.out.println(inventario[1][posNombre] +" " +inventario[1][posEx]);
 }
 public static void main(String args[]){
     Inventario inv = new Inventario();
     inv.crearInventario();
     inv.movimiento("Tequila Patron", 1);
     System.out.println(inv.inventario[1][2]);
     
 }
 
}
