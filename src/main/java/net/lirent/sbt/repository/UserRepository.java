package net.lirent.sbt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.lirent.sbt.entity.User;

interface UserRepository  extends JpaRepository<User, Integer>{

}
