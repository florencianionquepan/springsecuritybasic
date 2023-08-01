package com.udemycourse.springsecuritybasic.Repository;

import com.udemycourse.springsecuritybasic.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long> {
}
