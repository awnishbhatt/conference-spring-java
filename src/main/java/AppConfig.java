import com.abb.repository.HibernateSpeakerRepositoryImpl;
import com.abb.repository.SpeakerRepository;
import com.abb.service.SpeakerService;
import com.abb.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.abb")
public class AppConfig {
}
