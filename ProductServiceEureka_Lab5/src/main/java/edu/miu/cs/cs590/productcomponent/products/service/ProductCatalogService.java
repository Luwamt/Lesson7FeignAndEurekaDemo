package edu.miu.cs.cs590.productcomponent.products.service;

import edu.miu.cs.cs590.productcomponent.products.dto.ProductDto;
import edu.miu.cs.cs590.productcomponent.products.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCatalogService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;


    public ProductDto addProduct(ProductDto productDto){
       return  modelMapper.map( productRepository.save(productDto),ProductDto.class);
       // return productRepository.save(productDto);
    }

    public ProductDto getProduct(Integer productId){
        return   modelMapper.map(productRepository.findById(productId).orElse(null),ProductDto.class);
       // return productRepository.findById(productId).orElse(null);
    }
//    public List<ProductDto> getProduct(){
//        List<ProductDto> dtos = new ArrayList<>();
//        dtos = productRepository.findAll();
//        modelMapper.map(dtos,Product.class);
//        return  dtos ;
//    }




}
