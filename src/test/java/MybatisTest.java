import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




import com.example.dao.CategoryDao;
import com.example.pojo.Category;
import com.example.service.CategoryService;
import com.example.util.Page;


public class MybatisTest {
	
	private CategoryService service ;
	@Before
	public void before(){                                                                    
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		service = (CategoryService) context.getBean("categoryServiceImpl");
	}
	@Test
	public void testAdd() {
		Page page=new Page();
		List <Category> list=service.list(page);
		System.out.println(list.toString());

	}
}
