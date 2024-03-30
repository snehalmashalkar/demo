package com.gettersetter;

public class test {
	
	public static void main(String[]args)
	{
		student s= new student ();
		s.setSid(101);
		s.setName("snehal");
		s.setAddress("pune");
		s.setContact('452625126')
		s.setMark(89.99);
		s.setGreade('A');
		
		System.out.println(s.getsid());
		System.out.println(s.getAddress());
		System.out.println(s.getName());
		System.out.println(s.getContact());
		System.out.println(s.getGreade());
		System.out.println(s.getMark());
	}

}
