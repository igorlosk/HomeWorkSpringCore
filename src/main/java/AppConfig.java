import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserMessageService userMessageService() {
        return new UserMessageService();
    }

    @Bean
    public UserMessagePrinter userMessagePrinter() {
        return new UserMessagePrinter(userMessageService());
    }
}
