package scaffoldcli.scaffold;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ScaffoldApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testRunMethod() {
		ScaffoldApplication app = new ScaffoldApplication();
		app.run();
	}

	@Test
	public void testMainMethod() {
		ScaffoldApplication.main(new String[0]);
	}

}
