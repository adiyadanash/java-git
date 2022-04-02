package kz.narxoz.demo1.repository;

import kz.narxoz.demo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmailEndsWith(String email);

    List<User> findTop2ByNameStartsWith(String name);

    List<User> findBySurnameContaining(String Surname);

    @Query(value = "select * from users order by id asc ", nativeQuery = true)
    List<User> getUsersSortedById();

    @Query(value = "select  * from users where id>1 order by id desc limit 2 ", nativeQuery = true)
    List<User> getTop2UsersLastInsertedFromDatabase();

    @Query(value = "select * from users order by name desc ", nativeQuery = true)
    List<User> getUsersSortedByNameDesc();

    List<User> findByEmailNotContaining(String email);

    @Query(value = "select * from users where surname=name ", nativeQuery = true)
    List<User> getUsersNameEqualSurname();

    @Query(value = "select * from users where email like '%narxoz.kz%' or email like '%mail.ru%' or email like '%gmail.com%' "
            , nativeQuery = true)
    List<User> getUsersWhichEmailContains();

    @Query(value = "select distinct on(name) * from users ", nativeQuery = true)
    List<User> getUsersNameDistinct();

    @Override
    List<User> findAll();
}

