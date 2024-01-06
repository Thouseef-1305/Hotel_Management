package hotebilldao;

public class HotelInstance {
public static HotelInterf create()
{
	return new HotelImple();
}
}
