package com.mak.corejava.seven.inheritancee;

public class OverridingChangingRetrunTypeDemo {

}

class ParentClass{
	public ParentClass print(){
		System.out.println("ParentClass");
		ParentClass p = new ParentClass();
		return p;
	}
}
class ChildClass extends ParentClass{
	@Override
	public ChildClass print(){//covariant return type
		System.out.println("ChildClass");
		ChildClass p = new ChildClass();
		return p;
	}
}
class ChildsChildClass extends ChildClass{
	@Override
	public ChildsChildClass print(){
		System.out.println("ChildsChildClass");
		ChildsChildClass p = new ChildsChildClass();
		return p;
	}
	
}