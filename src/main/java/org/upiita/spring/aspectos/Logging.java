package org.upiita.spring.aspectos;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {

	public void antesDeInvocar(JoinPoint joinPoint) {

		System.out.println("ANTES DE INVOCAR!!");
		System.out.println("argumentos:" + Arrays.asList(joinPoint.getArgs()));
	}

	public void despuesDeInvocar() {
		System.out.println("DESPUES DE INVOCAR");
	}

	public Object alrededor(ProceedingJoinPoint joinPoint) throws Throwable {
		Object resultado;
		
		System.out.println("ALREDEDOR (ANTES)");
		resultado = joinPoint.proceed();
		System.out.println("ALREDEDOR (DESPUES)");
		
		return resultado;
	}

}
