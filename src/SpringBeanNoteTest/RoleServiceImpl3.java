package SpringBeanNoteTest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("roleService3")
@Primary
public class RoleServiceImpl3 implements RoleService {
	
	public void printRoleInfo(Role role) {
		System.out.print("{id =" + role.getId());
		System.out.print(", roleName =" + role.getRoleName());
		System.out.print(", note =" + role.getNote() + "}");
	}
}
