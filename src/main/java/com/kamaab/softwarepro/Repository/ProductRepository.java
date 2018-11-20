package com.kamaab.softwarepro.Repository;


import com.kamaab.softwarepro.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
   Product findProductByProductId(int productId);
}
