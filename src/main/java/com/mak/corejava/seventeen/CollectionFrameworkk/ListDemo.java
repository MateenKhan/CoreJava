package com.mak.corejava.seventeen.CollectionFrameworkk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		for(int i=1;i<=3;i++){
			Student stObj = new Student();
			stObj.id=i;
			stObj.name="st"+i;
			l.add(stObj);
		}
//		l.add(1);l.add(2);l.add(399);l.add(4);l.add(5);
//		l.add(6);
//		l.remove(5);
//		
//		l.remove(0);
//		l.add(3, 44);
//		System.out.println("total list elements:"+l);
//		System.out.println("l.contains(1):"+l.contains(1));
//		System.out.println("l.size():"+l.size());
		Iterator itr = l.iterator();
		while(itr.hasNext()){
			Student st =(Student)itr.next();
			System.out.println("itr.next(): id:"+st.id+" name:"+st.name);
//			System.out.println("itr.next():"+itr.next());
//			System.out.print(itr.next()+",");
		}
//		ListIterator lItr = l.listIterator();
//		int i=0;
//		while(lItr.hasNext()){
//			i++;
//			if(i==3){
//				System.out.println(lItr.previous());
//				break;
//			}
//			System.out.println(lItr.next());
//		}
	}

}
class Student{
	public int id;
	public String name;
}