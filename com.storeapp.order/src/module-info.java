module com.storeapp.order {
	exports com.storeapp.order;
	requires com.storeapp.service;
	requires transitive com.storeapp.product;
	requires com.storeapp.invoice;
}