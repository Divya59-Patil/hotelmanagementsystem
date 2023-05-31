package com.hotelmanagement.service;
import java.util.List;

import com.hotelmanagement.entity.StaffMember;

public interface StaffMemberSevice {
	public List<StaffMember> getStaffMembers();
//	public StaffMember getStaffMember(long staffCode);
	public StaffMember addStaffMember(StaffMember staffMember);
	public StaffMember updateStaffMember(StaffMember staffMember);
	public void deleteStaffMember(Long parseLong);
	StaffMember getStaffMember(Long staffCode);
}
