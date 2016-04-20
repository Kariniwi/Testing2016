package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;

import org.hamcrest.Matcher;


public class TestProducto {
	
	private Producto producto= new Producto("Manzana", 10,20);

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
	
}
