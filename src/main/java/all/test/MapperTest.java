package all.test;




import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import all.dao.DeportmentMapper;


/*
 * 测试dao层的工作
 * 推荐使用spring的项目就可以使用spring的单元测试模块
 * 1、导入springTest模块
 * 2、@ContextConfiguration指定spring配置文件的位置
 * */

/*@ContextConfiguration(locations= {"classpath:applicationContext.xml"})*/
public class MapperTest {
 
	@Autowired
	  DeportmentMapper deportmentMapper1;
	/*
	 * 测试DepartmentMapper
	 * */
	@Test
	public void testCRUD() {
		
		//1、创建springIOC容器
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从容器中获取mapper
		DeportmentMapper deportmentMapper=ioc.getBean(DeportmentMapper.class);
		
		System.out.println(deportmentMapper);
	}
	
	
}
