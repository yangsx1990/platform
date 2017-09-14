package com.erp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Table(name = "student_info")
public class User
{
	/**主键id*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**内网学号*/
    @Column(name ="SYSTEM_NO")
	private String systemNo;
	/**学生姓名*/
    @Column(name ="NAME")
	private String name;

    /**姓名拼音**/
    @Column(name="pinyin")
    private String pinyin;
	/**性别*/
    @Column(name ="GENDER")
	private Integer gender;
	/**出生日期*/
    @Column(name ="BIRTHDAY")
	private Date birthday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSystemNo() {
		return systemNo;
	}

	public void setSystemNo(String systemNo) {
		this.systemNo = systemNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
