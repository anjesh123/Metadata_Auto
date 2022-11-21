package com.metadata;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.metadata.api.MetaApi;

@SpringBootApplication
//@ComponentScan({"com.delivery.request"})
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")
public class MetadataAutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetadataAutoApplication.class, args);
		
	}
	
//	@Bean
//	CommandLineRunner runner(MetaApi metaApi) {
//		return args -> {
//			// read json and write to db
//			ObjectMapper mapper = new ObjectMapper();
//			//TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
//			List<User> typeReference = new ArrayList<User>();
//			typeReference = mapper.readValue(new File("/json/users.json"), typeReference.getClass());
//			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
//			try {
//				List<User> users = mapper.readValue(inputStream,typeReference);
//				userService.save(users);
//				System.out.println("Users Saved!");
//			} catch (IOException e){
//				System.out.println("Unable to save users: " + e.getMessage());
//			}
//		};
//	}
}
