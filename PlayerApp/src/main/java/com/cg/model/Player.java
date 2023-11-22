package com.cg.model;

public class Player {
	
private int PlayerId ;
private String PlayerName;
private	String email;	
private	int mobile;
private	float runtime;
public Player() {
	super();
	// TODO Auto-generated constructor stub
}
public Player(int playerId, String playerName, String email, int mobile, float runtime) {
	super();
	this.PlayerId = playerId;
	PlayerName = playerName;
	this.email = email;
	this.mobile = mobile;
	this.runtime = runtime;
}
public int getPlayerId() {
	return PlayerId;
}
public void setPlayerId(int playerId) {
	this.PlayerId = playerId;
}
public String getPlayerName() {
	return PlayerName;
}
public void setPlayerName(String playerName) {
	PlayerName = playerName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public float getRuntime() {
	return runtime;
}
public void setRuntime(float runtime) {
	this.runtime = runtime;
}
@Override
public String toString() {
	return "Player [playerId=" + PlayerId + ", PlayerName=" + PlayerName + ", email=" + email + ", mobile=" + mobile
			+ ", runtime=" + runtime + "]";
}


}
