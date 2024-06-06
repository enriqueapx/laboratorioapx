package com.bbva.peru.dto.lab;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The ExampleDTO class...
 */
public class HelloWorld implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String name;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("HelloWorld{");
		sb.append("name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
