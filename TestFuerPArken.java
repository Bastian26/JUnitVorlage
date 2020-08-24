
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFuerPArken {

	@Test
	void test() {
//		assertEquals( "Parkschein kaufen und Parken", Parken.parken(true, false, false) );
//		assertEquals( "Parken", Parken.parken(true, true, false) );
		
		assertEquals( "Parken", Parken.parken(true, true, true) );
		assertEquals( "Parken", Parken.parken(true, true, false) );
		assertEquals( "Parken", Parken.parken(true, false, true) );
		assertEquals( "Parkschein kaufen und Parken", Parken.parken(true, false, false) );
		assertEquals( "Parken", Parken.parken(false, true, true) );
		assertEquals( "Parken", Parken.parken(false, true, false) );
		assertEquals( "Parken", Parken.parken(false, false, true) );
		assertEquals( "Parken", Parken.parken(false, false, false) );
	}

}
