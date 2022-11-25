package Modelos;

public class Producto {
	private int id;
	private String nombre;
	private String descripcion;
	private double preciocompra;
	private double precioventa;
	private int cantidad;
	private int cantidadMinStock;
	private int idProveedor;
	public Producto() {
	}
	public Producto(int id, String nombre, String descripcion, double preciocompra, double precioventa, int cantidad,
			int cantidadMinStock, int idProveedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.cantidad = cantidad;
		this.cantidadMinStock = cantidadMinStock;
		this.idProveedor = idProveedor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPreciocompra() {
		return preciocompra;
	}
	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}
	public double getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCantidadMinStock() {
		return cantidadMinStock;
	}
	public void setCantidadMinStock(int cantidadMinStock) {
		this.cantidadMinStock = cantidadMinStock;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
}
