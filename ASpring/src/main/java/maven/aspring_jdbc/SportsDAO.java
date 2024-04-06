package maven.aspring_jdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public interface SportsDAO {
	public void setDataSource(DataSource ds);

	public void insert(String name, String type, Integer players);

	public void delete(Integer id);
}