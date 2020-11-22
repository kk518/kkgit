package SpringConfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类，替代xml文件
@ComponentScan(basePackages = {"java"}) //开启配置扫描
public class config {
}
