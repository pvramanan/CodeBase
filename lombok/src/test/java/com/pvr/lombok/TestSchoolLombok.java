package com.pvr.lombok;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestSchoolLombok {

	@Test
	public void testBuilderPattern() {
		School school = School.builder().name("DBTR NHSS").area("Mayiladuthurai").principalName("Rajendran")
				.StudentsCount(1200).teacherCount(75).build();
		assertNotNull("Name is not available", school.getName());
		assertNotNull("Area name is not available", school.getArea());
		assertNotNull("Principal is not available", school.getPrincipalName());
		System.out.println(school);
	}

}
