package com.jspiders.java;

public class Students 
{
	int sid;
	String name;
	double marks;
	public Students(int sid, String Name, double Marks)
	{
		this.sid = sid;
		this.name = Name;
		this.marks = Marks;
	}
	public String toString() 
	{
		return " ID Is : " +sid+ " NAME Is : " +name+ " MARKS Is : " + marks;
	}

	//sorting based on id
	/*public int compareTo(Object obj)
	{
		Students st=(Students)obj;
		int val=this.sid-st.id;
		return val;
	}*/
	//sorting based on marks
	/*public int compareTo(Object obj)
 	{
		int val=(int)this.sid-st.id;
		return val;
	}*/
	//sorting based on names
	public int compareTo(Object obj)
	{
		Students st=(Students)obj;
		String currName=name;
		String gvnName=st.name;
		int val=currName-compareTo(gvnName);
		return val;
	}
}
