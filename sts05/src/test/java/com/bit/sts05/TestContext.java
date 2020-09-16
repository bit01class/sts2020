package com.bit.sts05;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class TestContext {
	org.slf4j.Logger log=org.slf4j.LoggerFactory.getLogger(this.getClass());
//	org.apache.log4j.Logger log=org.apache.log4j.Logger.getLogger(this.getClass());

	@Autowired
	DataSource dataSource;
	@Autowired
	SqlSessionFactory sqlSessionFactory;

	@Test
	public void testDataSource() throws SQLException {
		Connection conn = dataSource.getConnection();
		log.debug(conn.toString());
		assertNotNull(conn);
	}
	@Test
	public void testSqlSessionFactory() {
		assertNotNull(sqlSessionFactory);
	}
}






















