package com.bms.dto;

import java.util.List;
import java.util.Set;

public class MovieDTO {
	
	private String name;
	private Long multiplexId;
	private Set<String> actors;
	private Set<Long> actorIds;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMultiplexId() {
		return multiplexId;
	}

	public void setMultiplexId(Long multiplexId) {
		this.multiplexId = multiplexId;
	}

	public Set<String> getActors() {
		return actors;
	}

	public void setActors(Set<String> actors) {
		this.actors = actors;
	}

	public Set<Long> getActorIds() {
		return actorIds;
	}

	public void setActorIds(Set<Long> actorIds) {
		this.actorIds = actorIds;
	}
	
}
