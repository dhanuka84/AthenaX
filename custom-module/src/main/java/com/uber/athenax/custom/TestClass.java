package com.uber.athenax.custom;

import java.util.List;
import java.util.Map;

import com.uber.athenax.vm.api.AthenaXTableCatalog;

public class TestClass implements com.uber.athenax.vm.api.AthenaXTableCatalogProvider{
	
	public static  void main(String ...arg){
		
	}

	@Override
	public Map<String, AthenaXTableCatalog> getInputCatalog(String cluster) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AthenaXTableCatalog getOutputCatalog(String cluster, List<String> outputs) {
		// TODO Auto-generated method stub
		return null;
	}

}
