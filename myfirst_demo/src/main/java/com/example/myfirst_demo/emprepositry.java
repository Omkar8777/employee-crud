package com.example.myfirst_demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface emprepositry extends JpaRepository<empentity,Long>{
    
}
