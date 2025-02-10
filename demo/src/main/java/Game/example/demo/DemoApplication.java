package Game.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) { // Correct method signature
        try {
            if (mongoTemplate.getDb() != null) {
                System.out.println("✅ MongoDB Connection Successful!");
            }
        } catch (Exception e) {
            System.out.println("❌ Error connecting to MongoDB: " + e.getMessage());
        }
    }

}
