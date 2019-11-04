/**
 * 
 */
package com.awssdt.entity;

import java.util.Map;

import lombok.Data;

/**
 * @author lembrent
 *
 */
@Data
public class ApiOutput {
	
	private Integer statusCode;
	private Map<String, String> headers;
	private String body;

}
