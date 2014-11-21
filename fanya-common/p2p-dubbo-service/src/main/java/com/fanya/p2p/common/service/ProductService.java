package com.fanya.p2p.common.service;

import com.fanya.p2p.common.entity.Loan;
import com.fanya.p2p.common.entity.Product;
import com.fanya.p2p.common.entity.ProductExample;
import com.fanya.p2p.common.utils.Pagination;
import com.fanya.p2p.common.utils.ServiceResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 下午12:39
 * To change this template use File | Settings | File Templates.
 */
public interface ProductService {

    ServiceResult<Product> createProduct(Product product, String appKey, String sign);

    ServiceResult<Product> createProdFromLoan(Loan loan, String appKey, String sign);

    ServiceResult<Product> updateProduct(Product product, String appKey, String sign);

    ServiceResult<Pagination<Product>> findProduct(ProductExample productExample, int pageIndex, int pageSize, String appKey, String sign);

    ServiceResult<Product> findOne(Long id, String appKey, String sign);

    ServiceResult<Product> deleteProduct(Long id, String appKey, String sign);

}
