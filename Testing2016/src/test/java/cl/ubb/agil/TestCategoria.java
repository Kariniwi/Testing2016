package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;

import org.hamcrest.Matcher;

public class TestCategoria {
	Categoria cat= new Categoria ("Fruta","F01");
	boolean r;
	@Test
	public void elNombreNoEsFruta(){
		if(cat.getNombre().equalsIgnoreCase("Fruta")){
			r=true;
		}else{
			r=false;
		}
		assertFalse(r);
	}
	@Test 
	public void nombreEsVerdura(){
		cat.setNombre("Verdura");
		if(cat.getNombre().equalsIgnoreCase("Fruta")){
			r= true;
		}else{
			r=false;
		}
		assertFalse(r);
	}
	@Test
	public void codigoEsF01(){
		if(cat.getCodigo().equalsIgnoreCase("F01")){
			r=true;
		}else{
			r=false;
		}
		assertFalse(r);
	}
	@Test
	public void cambiarCdAV05(){
		cat.setCodigo("V05");
		if(cat.getCodigo().equalsIgnoreCase("F01")){
			r=true;
		}else{
			r=false;
		}
		assertFalse(r);
	}
}
