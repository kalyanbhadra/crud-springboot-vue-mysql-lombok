package com.kals.springboot.restful.product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	// This is lombok constructor injection. We don't specify Autowired. 
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product stock) {
        return productRepository.save(stock);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}