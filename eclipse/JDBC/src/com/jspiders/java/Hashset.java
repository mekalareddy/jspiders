package com.jspiders.java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{
	static HashSet hs1;

	public static void addst(int id,String name,double marks)
	{
		Iterator it=hs1.iterator();

		if(hs1.size()==0)
		{
			hs1.add(new Students(id,name,marks));
			System.out.println("1st student added");
			return;
		}


		while(it.hasNext())
		{
			Students st1 = (Students)it.next();

			if(st1.sid==id)
			{
				System.out.println("duplicate student");
				return;
			}

			else
			{
				hs1.add(new Students(id,name,marks));
				System.out.println("student added");
				return;
			}
		}
	}
	public static void main(String[] args)
	{
		hs1 = new HashSet();

		addst(101,"rakshit",100);
		addst(102,"sagar",150);
		addst(101,"rakshit",100);
		addst(103,"Govardhan",55);
		addst(104,"surendra",200);
		addst(105,"kaushik",220);

		/*for(Object obj:hs1)
	{
		System.out.println(obj);
	}*/

		Iterator it = hs1.iterator();

		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
