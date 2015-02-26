package core;

import static org.junit.Assert.*;
import static core.HelloWorld.*;

import org.junit.Test;

public class TestHelloWorld {

	@Test
	public void test() {
		assertTrue("Strings are equal", "hello World!".equals(sayHello()));
	}

}
