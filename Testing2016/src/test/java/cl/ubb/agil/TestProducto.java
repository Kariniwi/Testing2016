package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;

import org.hamcrest.Matcher;


public class TestProducto {
	private Categoria cat= new Categoria ("Fruta","f01");
	private Producto producto= new Producto("Manzana", 10,20, cat);
	private Existencia e;
	@Test
	public void stockEsQuince(){
		producto.stock= 15;
		int R= producto.getStock();
		assertThat(R,is(15));
	}
	
	@Test
	public void StockBajoEsTrue(){
		producto.stock= 5;
		boolean R= producto.isBajoStock();
		assertFalse(R);
	}
	@Test
	public void stockFaltanteEsDiez(){
		producto.stock= 10;
		int R= producto.getStockFaltante();
		assertThat (R, is(10));
	}
	
	@Test 
	public void addExistenciaEsFalse(){
		producto.stock=25;
		boolean r= producto.addExistencia(e);
		assertFalse(r);
	}
	@Test 
	public void categoriaEsFruta(){
		Categoria c= producto.getCategoria();
		boolean r;
		if(c.nombre.equalsIgnoreCase("Fruta")){
			r=true;
		}else{
			 r = false;
		}
		assertFalse(r);		
	}
	@Test
	public void cambiarCategoriaDeFrutaAVerdura(){
		Categoria cat2= new Categoria("Verdura","V01");
		producto.setCategoria(cat2);
		boolean r;
		if(producto.getCategoria().equals(cat2)){
			r= true;
		}else{
			r=false;
		}
		assertFalse(r);
	}
	@Test
	public void nombreEsManzana(){
		boolean r;
		if(producto.getNombre().equalsIgnoreCase("Manzana")){
			r=true;
		}else{
			r=false;
		}
		assertFalse(r);
	}	
	
}
