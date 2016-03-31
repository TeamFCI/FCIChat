package de.teamfci.fcichat.chatmanager;

public enum ChatChannel {
 CHANNEL_GREEN("Team Grün","§6[-GRTeam-]"),
 CHANNEL_BLUE("Team Blau","§6[-BLTeam-]"),
 CHANNEL_RED("Team Rot","§6[-RTeam-]"),
 CHANNEL_GLOBAL("Globaler Chat","[Global]");
	

	private String Kanalname;
	private String Prefix;
	
	ChatChannel (String Kanalname, String Prefix){
	this.Kanalname = Kanalname;
	this.Prefix = Prefix;
	}
	
	public String getName(){
		return Kanalname;
	}
	
	public String getPrefix(){
		return Prefix;
	}
}

