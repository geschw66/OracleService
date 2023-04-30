package george.geschwend.OracleService;

import DTO.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * This is the main starting class...
 *
 * This program demonstrates the use of the JdbcTemplate connecting with a simple
 *  "scott/tiger" local database. JdbcTemplate simplifies database programming, reduces boilerplate code, improves
 *  performance, and enhances security. Also, a good way to test your connection to a database when starting a project.
 *  The next step would be to take this and use the Spring Data JPA, now that we know that the connection works and is
 *  pulling back data.
 */
@SpringBootApplication
public class OracleServiceApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public static void main(String[] args) {
		SpringApplication.run(OracleServiceApplication.class, args);
	}

	@Override
	 public void run(String... args) throws Exception{

		String sql = "SELECT * FROM C##SCOTT.EMPLOYEE";

		List<Employee> employees = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(Employee.class));

		/* Uses the toString() in the Employee class to print the contents. */
		employees.forEach( System.out :: println);
	 }
}
