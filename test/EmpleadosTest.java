
import gui.Empleados;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import junit.framework.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author David Castanera Daniel Bolivar Cristian Petru Badarau
 */
public class EmpleadosTest {

    private static FileHandler fh;
    private final static Logger LOGGER = Logger.getLogger(TestAssertionsLogin.class.getName());

    @BeforeClass
    public static void setUpClass() {
        try {
            Empleados empleados = new Empleados();
            fh = new FileHandler("./TestsEmpleados.log");
            LOGGER.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            LOGGER.info("Log Generado");
            LOGGER.info("Instancia de Empleados generada correctamente\n");
            System.out.println("@BeforeClass: setUpClass tests complete\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (SecurityException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void DatabaseConnectionTest() {
        assertEquals(true, testConection());
        LOGGER.info("DatabaseConnectionTest concluido correctamente\n");
    }

    @Test
    public void DatabaseNotNull() {
        Assert.assertNotNull(testResultNull());
        LOGGER.info("DatabaseNotNull concluido correctamente\n");
    }

    public boolean testConection() {
        Connection con = null;
        boolean good = false;

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dam", "root", "1234");
            good = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return good;
    }

    public ResultSet testResultNull() {
        Connection con = null;
        ResultSet rs = null;

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dam", "root", "1234");
            Statement sentencia = con.createStatement();
            String sql = "select * from empleados";
            rs = sentencia.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

}
