package com.kamaab.softwarepro.Repository.Product;

import com.kamaab.softwarepro.Model.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {

}
