import Coso.Funciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testeo {
    
    public Testeo() {
    }
    Funciones coso = new Funciones();
    @Test
    public void testIngreso1(){
       assertEquals("Alonso Uicab", coso.ingreso(0));
    }
    @Test
    public void testIngreso2(){
       assertEquals("Luis Salomon", coso.ingreso(1));
    }
    @Test
    public void testIngreso3(){
       assertEquals("Joshua Rivera", coso.ingreso(2));
    }
    @Test
    public void testIngreso4(){
       assertEquals("Christopher Segovia", coso.ingreso(3));
    }
     @Test
    public void testCatalogo1(){
       assertEquals("Laptops", coso.catalogo(0));
    }
    @Test
    public void testCatalogo2(){
       assertEquals("Procesadores", coso.catalogo(2));
    }
    @Test
    public void testCatalogo3(){
       assertEquals("Tarjetas Madre", coso.catalogo(4));
    }
    @Test
    public void testCatalogo4(){
       assertEquals("Memorias Ram", coso.catalogo(5));
    }
    @Test
    public void testCatalogo5(){
       assertEquals("Gabinetes", coso.catalogo(8));
    }
    
}
