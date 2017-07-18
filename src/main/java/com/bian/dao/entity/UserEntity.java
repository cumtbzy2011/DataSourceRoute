package com.bian.dao.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author bianzy
 * @create 2017-07-18 17:35
 **/
@Data
@EqualsAndHashCode(of = "username", callSuper = false)
@ToString(of = "username", callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class UserEntity extends AbstractPersistable<Long> {
    @Size(min = 1, max = 50)
    @Column(name = "username", unique = true, length = 50)
    private String username;

    @NotNull
    @Column(name = "password", nullable = false)
    private String password;
}
