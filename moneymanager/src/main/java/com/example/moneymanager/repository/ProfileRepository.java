package com.example.moneymanager.repository;

import com.example.moneymanager.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ProfileRepository extends JpaRepository {

    Optional<ProfileEntity> findByEmail(String email);
}
