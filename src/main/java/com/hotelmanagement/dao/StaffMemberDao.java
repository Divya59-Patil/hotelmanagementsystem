package com.hotelmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelmanagement.entity.StaffMember;

public interface StaffMemberDao extends JpaRepository<StaffMember, Long>{

}
