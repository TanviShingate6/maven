package maven.aspring_jdbc;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class SportsTemplate implements SportsDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	public String name;
	public String type;
	public Integer players;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void insert(String name, String type, Integer players) {
		String SQL = "insert into sports (name, type, players) values (?, ?, ?)";
		jdbcTemplateObject.update(SQL, name, type, players);
		System.out.println("Created Record Name = " + name + "   Type = " + type + "    Number of players = "+ players);
		return;
	}


	public void delete(Integer id) {
		String SQL = "delete from sports where id=?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Record Deleted With Id " + id);
		return;
	}
}