package com.hibernate.jtc;
import java.util.*;

import org.hibernate.Criteria;
public class HibernateCustomerDAO implements CustomerDAO {

	@Override   //1.add 
	public int addCustomer(Customer cust) {
		Customer cust11=new Customer(cust.getCid(),cust.getCname(),cust.getEmail(),cust.getCity(),cust.getCardBal(),cust.getCardType(),cust.getCardNo(),cust.getStatus());
		Integer it=(Integer)HibernateTemplate.save(cust11);
		return it.intValue();
	}

	@Override  //2.update
	public void updateCustomer(Customer cust) {
		HibernateTemplate.update(cust);
		
		
	}

	@Override   //3.delete
	public void deleteCustomer(int cid) {
		HibernateTemplate.delete(Customer.class, cid);
		
	}
	@Override   //4.cid
	public Customer getCustomerByCid(int cid) {
Customer c=(Customer)HibernateTemplate.load(Customer.class, cid);
		
		return null;
	}
	
	@Override   // 5.email
	public List<Customer> getCustomerByEmail(String email) {
		Criteria ct=null;	
		List<Customer> list=(List<Customer>)HibernateTemplate.findObject(ct,email);  
		return  list;
	}

	

//	@Override  //6.card no
//	public Customer getCustomerByCardNo(int cardNo) {
////		Criteria ct=null;
////		List<Customer>list =(List<Customer>)HibernateTemplate.findObject1(ct,cardNo);
////			
////			return list;
//			System.out.println("+++++++++++++++++++++++++++++++");
//		}
	}
	
	



