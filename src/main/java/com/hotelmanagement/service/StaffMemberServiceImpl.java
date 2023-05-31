package com.hotelmanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.dao.StaffMemberDao;
import com.hotelmanagement.entity.StaffMember;
import com.hotelmanagement.service.StaffMemberSevice;

@Service
public class StaffMemberServiceImpl implements StaffMemberSevice{
	
	@Autowired
	private StaffMemberDao staffMemberDao;

	public StaffMemberServiceImpl() {
		
	}

	@Override
	public List<StaffMember> getStaffMembers() {
		// TODO Auto-generated method stub
		return staffMemberDao.findAll();
	}
	
	@Override
	public StaffMember getStaffMember(Long staffCode) {
		// TODO Auto-generated method stub
		return staffMemberDao.findById(staffCode)
				.orElseThrow();
	}


	@Override
	public StaffMember addStaffMember(StaffMember staffMember) {
		// TODO Auto-generated method stub
		staffMemberDao.save(staffMember);
		return staffMember;
	}

	@Override
	public StaffMember updateStaffMember(StaffMember staffMember) {
		// TODO Auto-generated method stub
		staffMemberDao.save(staffMember);
		return staffMember;
	}

	@Override
	public void deleteStaffMember(Long id) {
		// TODO Auto-generated method stub
		staffMemberDao.deleteById(id);

	}

	
}
