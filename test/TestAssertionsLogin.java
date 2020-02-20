
import gui.Login;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Cristian Petru Badarau
 */
public class TestAssertionsLogin {

    private String usuario = "";
    private String usuarioCorrecto = "Admin";
    private String contrasena = "";
    private String contrasenaCorrecta = "1234";
    private Login login;
    private final static Logger LOGGER = Logger.getLogger(TestAssertionsLogin.class.getName());
    int contador = 1;
    private static FileHandler fh;

    @BeforeClass
    public static void setUpClass() {
        try {
            Login login = new Login();
            fh = new FileHandler("./TestsLogin.log");
            LOGGER.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            LOGGER.info("Log Generado");
            LOGGER.info("Instancia de Login generada correctamente\n");
            System.out.println("@BeforeClass: setUpClass tests complete\n");
        } catch (IOException ex) {
            Logger.getLogger(TestAssertionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(TestAssertionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Before
    public void setData() {
        this.usuario = "Admin";
        this.contrasena = "1234";
        login = new Login();
    }

    @Test
    public void testAssertNotNull() {
        Assert.assertNotNull(login);
        System.out.println("@BeforeClass: assertNotNull tests complete");
        LOGGER.info("AssertNotNull concluido correctamente\n");
    }

    @Test
    public void testAssertNotSame() {
        Assert.assertNotSame(login, new Login());
        System.out.println("@BeforeClass: asserNotSame tests complete");
        LOGGER.info("AssertNotSame concluido correctamente\n");
    }

    @Test
    public void testAssertTrue() {
        assertTrue((this.usuario.equals(this.usuarioCorrecto)));
        assertTrue((this.contrasena.equals(this.contrasenaCorrecta)));
        System.out.println("@BeforeClass: assertTrue tests complete");
        LOGGER.info("AsserTrue concluido correctamente\n");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(contrasena.equals("contraseña mal"));
        LOGGER.info("AssertFalse concluido correctamente\n");
    }

}
