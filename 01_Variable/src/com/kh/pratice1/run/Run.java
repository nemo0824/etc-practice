package com.kh.pratice1.run;

import com.kh.pratice1.func.VariablePractice1;
import com.kh.pratice1.func.VariablePractice2;
import com.kh.pratice1.func.VariablePractice3;
import com.kh.pratice1.func.VariablePractice4;
import com.kh.variable.C_Cast;
import com.kh.variable.D_printf;
public class Run {

	public static void main(String[] args) {
		
		VariablePractice1 vp = new VariablePractice1();
		//vp.Test1();
		
		VariablePractice2 bp = new VariablePractice2();
		//bp.Test2();
		
		
		VariablePractice3 dp = new VariablePractice3();
		//dp.Test3();
		
		
		VariablePractice4 ep = new VariablePractice4();
		//ep.Test4();
				
		
		C_Cast cc = new C_Cast();
		//cc.autoCasting();
		//cc.forceCasting();
			
		D_printf fp = new D_printf();
		fp.printFtest();
		
	}

	
		
}
