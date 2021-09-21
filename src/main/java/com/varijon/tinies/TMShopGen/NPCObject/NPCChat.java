package com.varijon.tinies.TMShopGen.NPCObject;

public class NPCChat 
{
	String hello;
	String goodbye;
	
	public NPCChat(String hello, String goodbye) {
		super();
		this.hello = hello;
		this.goodbye = goodbye;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public String getGoodbye() {
		return goodbye;
	}

	public void setGoodbye(String goodbye) {
		this.goodbye = goodbye;
	}
	
	
}
