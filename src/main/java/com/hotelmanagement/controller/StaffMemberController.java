package com.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hotelmanagement.service.StaffMemberSevice;
import com.hotelmanagement.entity.StaffMember;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/staffMembers")
public class StaffMemberController {
	
	@Autowired
	private StaffMemberSevice staffMemberService;
	
	@GetMapping
	public List<StaffMember> getStaffMembers(){
		return this.staffMemberService.getStaffMembers();
	}
	
	//get one staffMember
	@GetMapping("/{StaffCode}")
	public StaffMember getStaffMember(@PathVariable Long StaffCode) {
		return this.staffMemberService.getStaffMember(StaffCode);
	}
	
	//add StaffMembers
	@PostMapping
	public StaffMember addStaffMember(@RequestBody StaffMember staffMember) {
		return this.staffMemberService.addStaffMember(staffMember);
	}
	
	//update staffMember
	@PutMapping
	public StaffMember updateStaffMember(@RequestBody StaffMember staffMember) {
		return this.staffMemberService.updateStaffMember(staffMember);
	}
	
	//delete staffMember
	@DeleteMapping("/{StaffCode}")
	public ResponseEntity<Void> deleteStaffMember(@PathVariable Long StaffCode){
		this.staffMemberService.deleteStaffMember(StaffCode);
		return ResponseEntity.noContent().build();
	}
}
