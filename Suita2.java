
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@ExcludeCategory(Category1.class)
@SuiteClasses({ TestM.class})
public class Suita2 {

}
