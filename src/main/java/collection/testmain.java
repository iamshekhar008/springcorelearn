package collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	emp em1=(emp)context.getBean("e1");
	System.out.println(em1);
	}

}
