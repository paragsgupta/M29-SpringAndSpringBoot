package org.tnsif.springioc;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CardExecutor {

	public static void main(String[] args) {
		//this is a Hard Coding
//		SBICard s=new SBICard();
//		HDFCCard h=new HDFCCard();
//		s.deposite();
//		s.withdraw();
//		h.deposite();
//		h.withdraw();		
		
		@SuppressWarnings("resource")
		ApplicationContext b=new ClassPathXmlApplicationContext("beans.xml");
		
//		SBICard s=(SBICard) b.getBean("sbi");
//		s.deposite();
//		s.withdraw();
//		
//		HDFCCard h=(HDFCCard) b.getBean("hdfc");
//		h.deposite();
//		h.withdraw();
		
		DebitCard s1=(DebitCard) b.getBean("sbi");
		s1.deposite();
		s1.withdraw();
		
	}

}
