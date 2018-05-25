package com.hiynn.shiro.test;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;

import com.hiynn.shiro.controller.IndexController;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class IndexControllerTest {
	
	@Autowired
	private IndexController index;
	
	@Test
	public void test(){
		Model model = new Model() {
			
			@Override
			public Model mergeAttributes(Map<String, ?> paramMap) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public boolean containsAttribute(String paramString) {
				// TODO Auto-generated method stub
				return false;
			}
			@Override
			public Map<String, Object> asMap() {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public Model addAttribute(String paramString, Object paramObject) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public Model addAttribute(Object paramObject) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public Model addAllAttributes(Map<String, ?> paramMap) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public Model addAllAttributes(Collection<?> paramCollection) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		index.login("zhangsan", "1234", false,model);
	}
}
