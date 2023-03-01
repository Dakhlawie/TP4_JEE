package dao;

import java.util.List;

import metier.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProduitDaoImpl pdao= new ProduitDaoImpl();
		Produit prod= pdao.save(new Produit("iphone 8 plus",2800));
		System.out.println(prod);
		List<Produit> prods =pdao.produitsParMC("7+");
		for (Produit p : prods)
		System.out.println(p);

	}

}
