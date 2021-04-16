package all.test;




import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import all.dao.DeportmentMapper;


/*
 * ����dao��Ĺ���
 * �Ƽ�ʹ��spring����Ŀ�Ϳ���ʹ��spring�ĵ�Ԫ����ģ��
 * 1������springTestģ��
 * 2��@ContextConfigurationָ��spring�����ļ���λ��
 * */

/*@ContextConfiguration(locations= {"classpath:applicationContext.xml"})*/
public class MapperTest {
 
	@Autowired
	  DeportmentMapper deportmentMapper1;
	/*
	 * ����DepartmentMapper
	 * */
	@Test
	public void testCRUD() {
		
		//1������springIOC����
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2���������л�ȡmapper
		DeportmentMapper deportmentMapper=ioc.getBean(DeportmentMapper.class);
		
		System.out.println(deportmentMapper);
	}
	
	
}
