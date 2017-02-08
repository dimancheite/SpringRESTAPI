/***/
package com.rupp.spring.domain;

import java.util.Date;

/**
 * map to table test_table (id, message)
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
public class DCustomer {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String address;
    private String phone;
    private Date createdDate;
    
    public DCustomer() {
        
    }
    public DCustomer(Long id, String firstName, String lastName, String gender, String email, String address, String phone) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setEmail(email);
        setAddress(address);
        setPhone(phone);
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
	/**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender to gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email to email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address to address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone to phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }
    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
