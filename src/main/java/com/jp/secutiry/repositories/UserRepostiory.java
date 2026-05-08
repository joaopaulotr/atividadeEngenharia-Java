// java
package com.jp.secutiry.repositories;

import com.jp.secutiry.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostiory extends JpaRepository<User, Long> {
    User findByLogin(String login);
}