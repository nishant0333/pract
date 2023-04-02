package com.jtc.hibernat;

public class Jtc25 {
public static void main(String[] arg) {
	CustomerDAO cdao=DAOFactory.getCustomerDAO();
	
	//1.add Customer
	CustomerTo cto=new CustomerTo(1,"Ram","som@jtc.com",99903,"Noida","Enable");
	cdao.addCustomer(cto);
	
	//2.get Customer
	CustomerTo c1=cdao.getCustomerByCid(2);
	System.out.println(c1.getCid()+"\t"+c1.getEmail()+"\t"+c1.getPhone()+"\t"+c1.getCity()+"\t"+c1.getStatus());
	
	//3.Delete Customer
	cdao.deleteCustomer(6);
	
	//4.Update Customer
	CustomerTo c2=cdao.getCustomerByCid(2);
	c2.setCname("Nishant");
	c2.setEmail("ram@jtc.com");
	c2.setPhone(777777);
    cdao.updateCustomer(c2);
}
}
