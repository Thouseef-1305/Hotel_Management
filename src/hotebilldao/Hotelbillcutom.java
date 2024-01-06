package hotebilldao;

public class Hotelbillcutom {
String  name;
//String contactnum;
int[][] price=new int[5][2];
public Hotelbillcutom(String name, String contactnum) {
	this.name = name;
	//this.contactnum = contactnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Customer   name=" + name  ;
}




}
