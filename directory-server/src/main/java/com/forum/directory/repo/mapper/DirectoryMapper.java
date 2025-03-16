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
package com.forum.directory.repo.mapper;

import com.forum.directory.repo.model.DirectoryThemeEntity;
import com.forum.directory.kafka.event.Directory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author <a href="mailto:biniljava<[@.]>yahoo.co.in">Binildas C. A.</a>
 */
 //// Because could not find DirectoryMapper Bean
@Mapper(componentModel = "spring")
public interface DirectoryMapper {
    DirectoryMapper INSTANCE= Mappers.getMapper(DirectoryMapper.class);
    Directory entityToApi(DirectoryThemeEntity entity);

    DirectoryThemeEntity apiToEntity(Directory api);
}
