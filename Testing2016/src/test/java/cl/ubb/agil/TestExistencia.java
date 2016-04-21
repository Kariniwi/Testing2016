package cl.ubb.agil;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;

import org.hamcrest.Matcher;


public class TestExistencia {
	Existencia e= new Existencia ("siete");
	boolean r;
	@Test
	public void elNumeroEsSiete(){
		if(e.getNumero().equalsIgnoreCase("siete")){
			r=true;
		}else{
			r=false;
		}
		assertFalse(r);
	}

}
