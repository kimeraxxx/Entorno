package Asserts;

public class Producto{
float precio;
float iva;
public Producto(float precio) {
	super();
	this.precio = precio;
	this.iva =  0.21f;
	contract();
}
public void priceFinal() {
	this.iva=this.iva*this.precio;
	this.iva= this.precio+this.iva;
	
	
}
public void contract() {
	assert(this.precio>0 && this.precio!=0):"Con eso no vas a ningun lado";
}
public static void main(String[] args) {
Producto producto= new Producto(-2);
 producto.priceFinal();
 System.out.println(producto.iva);
}
}
