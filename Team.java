package com.pranav.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
    @Id
    @Column(name="teamid")
	int teamId;
    
	String teamName;
	

public Team()
{
	
}public Team(int v1, String v2)
{
	teamId=v1;
	teamName=v2;
}
public int getTeamId() 
{
	return teamId;
}
public void setTeamId(int teamId) {
	this.teamId = teamId;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
}
