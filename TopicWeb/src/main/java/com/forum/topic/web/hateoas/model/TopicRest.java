/*
 * Copyright (c) 2024/2025 Binildas A Christudas & Apress
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.forum.topic.web.hateoas.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.hateoas.RepresentationModel;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author <a href="mailto:biniljava<[@.]>yahoo.co.in">Binildas C. A.</a>
 */
@Data
//@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TopicRest extends RepresentationModel<TopicRest> {
    @Id
    private Long postId;
    private String topicLabel;
    private Long directoryId;
    //    private Long topicId;
    private String postContent;
    private Timestamp creationDate;
    private Timestamp changeDate;
    //    private Long userCreatorId;
    private Long userOwnerId;
    /*@Id
    private Long directoryId; //String directoryId
    private Long order;

    private Long subDirId;

    private Timestamp creationDate;

    private String topicId;

    private String name;*/
}
/*
public class PostRest extends RepresentationModel<PostRest> {

	@Id
	private String directoryId;
	private String name;
	private String code;;
	private String title;
	private Double price;

	public PostRest() {}
	
	public String getDirectoryId() {
		return directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [directoryId=").append(directoryId).append(", name=").append(name).append(", code=").append(code)
				.append(", title=").append(title).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostRest other = (PostRest) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
*/