package com.bit.sts03.dept.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.sts03.dept.model.entity.Dept03Vo;

public class Dept03DaoTest {
	static Dept03Vo target=new Dept03Vo(1,"test","test");
	Dept03Dao dept03Dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
//		String sql="CREATE TABLE  IF NOT EXISTS `dept03` (" + 
		String sql="CREATE TABLE `dept03` (" + 
				"	`deptno` INT NOT NULL AUTO_INCREMENT," + 
				"	`dname` VARCHAR(10) NULL DEFAULT NULL," + 
				"	`loc` VARCHAR(10) NULL DEFAULT NULL," + 
				"	PRIMARY KEY (`deptno`)" + 
				")";
		ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		DataSource dataSource=(DataSource) ac.getBean("dataSource");
		Connection conn=dataSource.getConnection();
		System.out.println(sql);
		/* create table */
		conn.prepareStatement(sql).execute();
		/* insert dummy data */
		
		conn.prepareStatement("insert into dept03 (dname,loc) values ('"
		+target.getDname()+"','"+target.getLoc()+"')").executeUpdate();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		File file=new File("c:\\data\\xeTest.mv.db");
		if(file.exists()) file.deleteOnExit();
	}

	@Before
	public void setUp() throws Exception {
		ApplicationContext ac=null;
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		dept03Dao=(Dept03Dao) ac.getBean("dept03Dao");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown...");
	}

	@Test
	public void testSelectAll() {
		System.out.println("testSelectAll...");
		assertSame(1, dept03Dao.selectAll().size());
	}
	
	@Test
	public void testSelectOne() {
		System.out.println("testSelectOne...");
		assertEquals(target, dept03Dao.selectOne(target.getDeptno()));
	}
	
}












