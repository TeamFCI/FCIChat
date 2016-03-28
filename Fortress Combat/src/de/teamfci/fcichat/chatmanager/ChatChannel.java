package de.teamfci.fcichat.chatmanager;

public enum ChatChannel {
 CHANNEL_GREEN("Team Grün","§b[-GRTeam-]"),
 CHANNEL_BLUE("Team Blau","§b[-BLTeam-]"),
 CHANNEL_RED("Team Rot","§b[-RTeam-]"),
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

