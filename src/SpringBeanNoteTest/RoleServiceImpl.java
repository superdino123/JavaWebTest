package SpringBeanNoteTest;

import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
	
	public void printRoleInfo(Role role) {
		System.out.println("id =" + role.getId());
		System.out.println("roleName =" + role.getRoleName());
		System.out.println("note =" + role.getNote());
	}
}
