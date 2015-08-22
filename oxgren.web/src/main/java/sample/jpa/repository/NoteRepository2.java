/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.jpa.repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sample.jpa.domain.Note;
import sample.jpa.domain.Note2;

import java.util.List;

public interface NoteRepository2 extends CrudRepository<Note, Long>, JpaSpecificationExecutor<Note> {

	Iterable<Note> findByTitleLike(String title);

	@Query("select new sample.jpa.domain.Note2(c.id,c.title,c.body,d.id) from Note c,Tag d where c.id=d.id")
	List<Note2> findTagid();

}
