package SpringBeanNoteTest;

import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl.class})
@ComponentScan(basePackages = {"SpringBeanNoteTest", "SpringTest"})
//@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl.class}, basePackages = {"SprintBeanNoteTest", "SpringTest"})
public class ApplicationConfig {

}
