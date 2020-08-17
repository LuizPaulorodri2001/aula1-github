package curso_programacao;

public class Room {
	
	private String name;
	private String email;
	private int room;
	
	public Room(String name, String email, int room)
	{
		this.name=name;
		this.email=email;
		this.room=room;
	}
	
	public int getRoom()
	{
		return room;
	}
	
	public String toString()
	{
		return String.format("%d: %s, %s",room,name,email);
	}

}
