package com.example.neo4j.dto.relationship;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FollowDto {
	private Long followingId;
	private Long followedId;
}
//testd