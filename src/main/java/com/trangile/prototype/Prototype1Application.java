package com.trangile.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
		exclude = { DataSourceAutoConfiguration.class, 
					HibernateJpaAutoConfiguration.class,
					DataSourceTransactionManagerAutoConfiguration.class })
@EnableTransactionManagement
public class Prototype1Application {
	
//	@Autowired
//	private RoleRepository roleRepository; 
//	
//	@Autowired
//	private UserRepository userRepository; 
//	
//	@Autowired
//	private BCryptPasswordEncoder encoder;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Prototype1Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Role role = new Role();
//		role.setRoleName("USER");
//		roleRepository.save(role);
//		User user = new User();
//		user.setUsername("Royal_User");
//		user.setPassword(encoder.encode("Royal_User@123"));
//		Set<Role> roles = new HashSet<>();
//		roles.add(role);
//		user.setRoles(roles);
//		userRepository.save(user);
//	}
}
