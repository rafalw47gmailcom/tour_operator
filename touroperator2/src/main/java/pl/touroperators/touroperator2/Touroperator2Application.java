package pl.touroperators.touroperator2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Touroperator2Application {

    protected static final java.util.logging.Logger log = Logger.getLogger(String.valueOf(Touroperator2Application.class));

    public static void main(String[] args) {
        SpringApplication.run(Touroperator2Application.class, args);






        log.info("------------------------------------------------------------------------------------------------------------------------------");
        log.info("Application run: ");
        log.info("http://localhost:8081/user" + "  - strona dla użytkowników");
        log.info(" ");
        log.info("http://localhost:8081/admin" + "  - strona dla admina");
        log.info(" ");
        log.info("http://localhost:8081/api/tours/all" + "  - endpointy dla systemu pośrednictwa");
        log.info(" ");
        log.info("http://localhost:8081/console" + "  - konsola bazy dancyh");
        log.info(" ");
        log.info("Dodatkowe");
        log.info("http://localhost:8081/api/numbers");
        log.info("------------------------------------------------------------------------------------------------------------------------------");

    }

}
