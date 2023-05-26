package com.poly.sof3021.B9_JPA.repository;

import com.poly.sof3021.B9_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CateRepository extends JpaRepository<Category, Long> {

    // Muon custom :
    // C1: Query creation
    // C2: JPQL - @Query

    // C1:
    Category findCategoryByCategoryCode1AndId(String categoryCode, Long id);

    // C2:
    // native query : true
    @Query(value = "SELECT Category FROM CATEGORY WHERE category_name = ?1", nativeQuery = true)
    List<Category> searchName(String name);

    // default native query : false
    @Query("SELECT c FROM Category c WHERE c.categoryName LIKE ?1")
    List<Category> searchName1(String name);
}
