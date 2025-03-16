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
package com.forum.topic.repo.repository;

import java.util.List;

import com.forum.topic.repo.model.TopicEntity;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository // i added it because could not find this repository bean
@RepositoryRestResource(collectionResourceRel = "productdata", path = "productdata")
public interface TopicRepository extends CrudRepository<TopicEntity, Long> { // было Long

	public List<TopicEntity> findByPostId(@Param("postId") Long postId);
	TopicEntity findByPostIdAndUserOwnerId(@Param("postId") Long postId, @Param("userOwnerId") Long userOwnerId);
}
