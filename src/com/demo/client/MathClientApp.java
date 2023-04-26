/**
 * 
 */
package com.demo.client;

import javax.swing.plaf.basic.BasicArrowButton;

import com.demo.service.BasicClass;
import com.demo.service.SicCalService;
import com.kpmg.inheritence.A;
import com.kpmg.inheritence.B;
import com.kpmg.inheritence.C;

/**
 * @author Administrator
 *
 */
public class MathClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicClass bs = new BasicClass();
		System.out.println("additon"+bs.addition(10, 10));
		System.out.println("sub"+bs.sub(10, 10));
		System.out.println("multi"+bs.multiply(10, 10));
		System.out.println("divide"+bs.divide(10, 10));	
		
		SicCalService sc = new SicCalService();
		//System.out.println("sqrt" +bs.sqrt(0));
	//	System.out.println("sin" +bs.sinx(10));
		
		A a = new A();
		B b = new B();
		C c = new C();
		System.out.println("additon test inheritence "+b.addition(10, 10));
		System.out.println("sub test inheritence "+b.sub(10, 10));
		System.out.println("multiply test inheritence "+c.multiply(10, 10));//multilevel
		System.out.println("divide test inheritence "+c.divide(10, 10));
		System.out.println("TEST ABSTRACT"+sc.cosx(100));
		
	}

}
