package com.springcore.standalone.collections;

import java.util.List;

public class person {
 private List<String> friends;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "person [friends=" + friends + "]";
}

}
