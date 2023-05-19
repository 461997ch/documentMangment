package com.abcBank.documentMangment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Entity
@Table(name = "_User")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class User {

    @Id
    @GeneratedValue()
    @Column(name = "Id")
    private Integer user_Id;

//    @NotNull
//    @Pattern(regexp = CommonResponseData.ONLY_ALPHABATES)
//    @Size(min = 2, message = CommonResponseData.REQUIRED_MIN_TWO_CHARACTERS)
//    @Column(name = "userName")
//    private String userName;
//
//    @OneToMany(mappedBy="user")
//    private Set<Document> documents;

}
