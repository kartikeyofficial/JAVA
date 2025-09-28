import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop= new Properties(); // Because It is Not Generic Type
        prop.load(new FileReader("User.properties"));
        prop.list(System.out);

        prop.setProperty("UserName","Admin");
        prop.setProperty("Password","admin@123");

        prop.list(System.out);
        prop.store(new FileWriter("User.properties"),"User Details");

    }

    
}
