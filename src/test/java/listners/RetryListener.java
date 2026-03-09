package listners;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Method;

public class RetryListener implements  IAnnotationTransformer {


    @Override
    public void transform(ITestAnnotation annotation,
                          Class testClass,
                          java.lang.reflect.Constructor testConstructor,
                          Method testMethod) {

        Class<? extends IRetryAnalyzer> retryAnalyzer =
                annotation.getRetryAnalyzerClass();

        if (retryAnalyzer == null) {
            annotation.setRetryAnalyzer(RetryAnalyzer.class);
        }
    }
}
