package edu.miu.cs.cs590.productcomponent.products.repository;
import edu.miu.cs.cs590.productcomponent.products.dto.ProductDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductDto,Integer> {




}
