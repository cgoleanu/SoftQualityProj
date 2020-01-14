
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestM {

	@Test
	@Category(Category1.class)
	public void testConstructor() {
		String model = "testModel";
		 double pret = 1200.56;
		 
		 Masina m = new Masina(model,pret);
		 assertEquals("testModel", m.getModel());
		 assertEquals(1200.56, m.getPret(),0.2);
	}
	
	@Test
	@Category(Category1.class)
	public void setModel () {
		String model = "testModel";
			 
		 Masina m = new Masina();
		 m.setModel(model);
		 assertEquals(model, m.getModel());
		 
	}
	
	@Test
	@Category(Category1.class)
	public void testExistence() {
		//de tip non-null
		String model = "testModel";
		 double pret = 1200.56;
	 
		 Masina m = new Masina(model,pret);
		assertNotNull("Verif creare obj prin constr",m);
	}
	
	@Test
	@Category(Category2.class)
	public void test_cross_check() {
		Masina m1 = new Masina();
		m1.setModel("model1");
		m1.setPret(100.2);
		Masina m2 = new Masina("model1", 100.2);
		assertEquals(m2.getModel(), m1.getModel());
		assertEquals(m2.getPret(), m1.getPret(),0.1);

	}
	
	@Test(timeout = 100)
	@Category(Category2.class)
	public void test_performanta() {
		String model = "testModel";
		 double pret = 1200.56;
	 
		 Masina m = new Masina(model,pret);
		assertEquals(model.toString(), m.getModel());
	}
	


}
