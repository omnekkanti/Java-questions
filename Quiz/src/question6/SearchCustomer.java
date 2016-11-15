/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.List;

/**
 *
 * @author Om
 */


public interface SearchCustomer {
    List<Customer> searchCustomers(Customer c, Address a);
    List<Customer> searchCustomers(Customer c);
}
