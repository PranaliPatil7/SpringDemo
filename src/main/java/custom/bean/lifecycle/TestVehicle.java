package custom.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicle {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("CustomLifeCycleBean.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("CustomLifeCycleBean.xml");
		Vehicle v=(Vehicle) ctx.getBean("veh");
		System.out.println(v);
		ctx.close();
	}
}
