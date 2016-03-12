package me.filipzocktan.fortresscombat1.chatmanager;

public enum ChatChannel {
 CHANNEL_GREEN("Team Grün","[-GRTeam-]"),
 CHANNEL_BLUE("Team Blau","[-BLTeam-]"),
 CHANNEL_RED("Team Rot","[-RTeam-]"),
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

