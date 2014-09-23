/**
 * 
 */
package headfirst.decorator.io;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author rreynolds3
 *
 */
public class LowerCaseInputStreamTest {
	LowerCaseInputStream lowerStream;
	BufferedInputStream fileStream;

	byte[] byte1 = new byte[10000000];
	int a;
	byte[] byte2 = new byte[10000000];
	int b;
	StringBuilder builder1 = new StringBuilder();
	StringBuilder builder2 = new StringBuilder();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		lowerStream = new LowerCaseInputStream(new BufferedInputStream(
				new FileInputStream("CapsFile.txt")));
		fileStream = new BufferedInputStream(new FileInputStream("NoCaps.txt"));
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		lowerStream = null;
		a = 0;
		builder1 = null;
		fileStream = null;
		b = 0;
		builder2 = null;

	}

	/**
	 * Test method for
	 * {@link headfirst.decorator.io.LowerCaseInputStream#read()}.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testRead() throws IOException {


		while ((a = lowerStream.read()) >= 0) {
			builder1.append((char) a);
		}
		while ((b = fileStream.read()) >= 0) {
			builder2.append((char) b);
		}
		assertEquals(builder2.toString(), builder1.toString());
	}

	/**
	 * Test method for
	 * {@link headfirst.decorator.io.LowerCaseInputStream#read(byte[], int, int)}
	 * .
	 * 
	 * @throws IOException
	 */
	@Test
	public void testReadByteArrayIntInt() throws IOException {
		while ((lowerStream.read(byte1, 10, 30)) >= 0) {
		}
		while ((fileStream.read(byte2, 10, 30)) >= 0) {
		}
		assertTrue(Arrays.equals(byte1, byte2));
	}
}
