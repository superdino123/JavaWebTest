package SpringBeanNoteTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoleController {
	
	@Autowired
	@Qualifier("roleService3")
	private RoleService roleService = null;
	
	public void printRole(Role role) {
		roleService.printRoleInfo(role);
	}
}
