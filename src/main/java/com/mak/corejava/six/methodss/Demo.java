package com.mak.corejava.six.methodss;

public class Demo {

	public static void main(String[] args) throws Exception {
		Atm a = new Atm("jijin");
		a.setPin("1234");
		System.out.println(a.getPin());

		Atm a2 = new Atm("arun");
		a2.setPin("5678");
		System.out.println(a2.getPin());
	}
}

class Atm {
	private String pwd;

	Atm(String pwd) {
		this.pwd = pwd;
	}

	private String pin;

	public String getPin() throws Exception {
		if (this.pwd == "jijin") {
			return this.pin;
		} else {
			return null;
		}
	}
	
	public void setPin(String pin) throws Exception {
		if (this.pwd == "jijin") {
			this.pin = pin;
		} else {
			return;
		}
	}

}
