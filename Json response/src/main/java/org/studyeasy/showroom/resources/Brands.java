package org.studyeasy.showroom.resources;

import java.util.List;

import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.services.BrandsService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	BrandsService service = new BrandsService();
	
	@GET
	@Path("/brands")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BrandEntity> getBrands() {
		List<BrandEntity> list  = service.getBrands();
		return list;
	}

	@POST
	@Path("/brands")
	@Consumes(MediaType.APPLICATION_JSON)
	public void postBrands(BrandEntity brand) {
		service.addBrand(brand);
	}
	
	@PUT
	@Path("/brands/{brandId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putBrands(@PathParam("brandId")  int brandId, BrandEntity updatedBrand) {
		updatedBrand.setBrandId(brandId);
		service.updateBrand(updatedBrand);
	}
	
	@DELETE
	@Path("/brands/{brandId}")
	public void deleteBrands(@PathParam("brandId") int brandId) {
		service.deleteBrand(brandId);
	}

}
