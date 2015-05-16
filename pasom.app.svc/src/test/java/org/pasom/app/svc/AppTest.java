package org.pasom.app.svc;

import java.rmi.RemoteException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath*:META-INF/pasom.data.svc.application.xml",
		"classpath:META-INF/pasom.app.svc.application.xml",
		"classpath:META-INF/pasom.camel.xml" })
public class AppTest {
	@Resource
	private App app;

	@Test
	public void testRemote() throws RemoteException {
		app.test();
	}
}
