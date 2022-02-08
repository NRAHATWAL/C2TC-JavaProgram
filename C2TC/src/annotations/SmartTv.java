package annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface SmartTv {
	String os()default "Oneplus";
	int widht()default 20;
	int height()default 10;

}
