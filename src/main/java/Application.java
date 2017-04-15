/**
 * Created by Sanjiv on 4/15/2017.
 */
import com.imens.drfa.web.UploadingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {
        new File(UploadingController.uploadingdir).mkdirs();
        SpringApplication.run(Application.class, args);
    }
}