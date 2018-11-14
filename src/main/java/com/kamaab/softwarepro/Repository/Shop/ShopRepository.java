package com.kamaab.softwarepro.Repository.Shop;

import com.kamaab.softwarepro.Model.Shop.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository <Shop,Long> {

}
