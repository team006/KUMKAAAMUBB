package com.kamaab.softwarepro.Repository;

import com.kamaab.softwarepro.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Long> {

}