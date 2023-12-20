package edu.poly.dao.reponsitory;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tothanhhai.entity.Person;
public interface personnote extends JpaRepository<Person, Long> {
}
