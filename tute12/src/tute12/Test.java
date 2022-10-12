package tute12;

public class Test {
	 int _quantity; 
	 int _itemPrice; 
	  
	 double quantityDiscount() {
		 return Math.max(0, _quantity - 500) * _itemPrice * 0.05;
	 }
	 
	 double shipping() {
		 return Math.min(basePrice() * 0.1, 100.0); 
	 }
	 
	 double basePrice() { 	  
		 return _quantity * _itemPrice; 
	 }  
	 
	 double price() {
		 return basePrice() - quantityDiscount() + shipping();
	 }
} 

/* price is base price - quantity discount + shipping 
return _quantity * _itemPrice - 
Math.max(0, _quantity - 500) * _itemPrice * 0.05 + 
Math.min(_quantity * _itemPrice * 0.1, 100.0); 
}
*/