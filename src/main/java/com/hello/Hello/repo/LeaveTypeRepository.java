package com.hello.Hello.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.Hello.dto.LeaveType;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long>{

}
