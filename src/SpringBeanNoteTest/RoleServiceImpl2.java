package SpringBeanNoteTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("RoleService2")
public class RoleServiceImpl2 implements RoleService2 {
	
	@Autowired
	private Role role = null;
	
	@Override
	public void printRoleInfo() {
		// TODO 自动生成的方法存根
		System.out.println("id =" + getRole().getId());
		System.out.println("roleName =" + getRole().getRoleName());
		System.out.println("note =" + getRole().getNote());
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
