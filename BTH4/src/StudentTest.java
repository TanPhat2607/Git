import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
	@Test
	public void testBestScore(){
		Student stud1=new Student(90,85);
		int answer=stud1.bestScore();
		assertEquals(answer,90);
	}
}
