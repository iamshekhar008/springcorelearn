package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class emp {
 private int id;
 private List<String> adress;
 private Set<Integer> phones;
 private Map<Integer,String> work;
public int getId() {
	return id;
}
@Override
public String toString() {
	return "emp [id=" + id + ", adress=" + adress + ", phones=" + phones + ", work=" + work + "]";
}
public void setId(int id) {
	this.id = id;
}
public List<String> getAdress() {
	return adress;
}
public void setAdress(List<String> adress) {
	this.adress = adress;
}
public Set<Integer> getPhones() {
	return phones;
}
public void setPhones(Set<Integer> phones) {
	this.phones = phones;
}
public Map<Integer, String> getWork() {
	return work;
}
public void setWork(Map<Integer, String> work) {
	this.work = work;
}
public emp(int id, List<String> adress, Set<Integer> phones, Map<Integer, String> work) {
	super();
	this.id = id;
	this.adress = adress;
	this.phones = phones;
	this.work = work;
}
public emp() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
