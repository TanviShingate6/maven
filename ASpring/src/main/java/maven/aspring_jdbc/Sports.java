package maven.aspring_jdbc;


public class Sports {
	private Integer players;
	private String name;
	private String type;
	private Integer id;

	public Sports() {
	}

	public Sports(String name, Integer id) {
		this.id = id;
		this.name = name;
	}

	public void setPlayers(Integer age) {
		this.players = players;
	}

	public Integer getPlayers() {
		return players;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}