package org.adaschool.proyectoReservas.domain.repository;

import org.adaschool.proyectoReservas.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Integer> {

}
