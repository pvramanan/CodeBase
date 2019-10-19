package com.pvr.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class School {

	private final int StudentsCount;

	private final int teacherCount;

	private final String principalName;

	private final String name;

	private final String area;

}
