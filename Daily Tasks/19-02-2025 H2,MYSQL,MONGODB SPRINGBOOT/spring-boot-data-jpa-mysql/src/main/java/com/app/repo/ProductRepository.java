package com.app.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.model.Product;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	interface myView {
		//copy from getter methods
		String getVendorCode();
		String getProdName();
		Double getProdCost();
	}
	//select code,cost from prodtabwhere ven_code=?
	List<myView>findByVendorCode(String vc);

}
