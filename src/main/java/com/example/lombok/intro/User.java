package com.example.lombok.intro;

/*
    created by Atiye Mousavi
    Date: 2/28/2022
    Time: 5:33 PM
*/

import lombok.*;
import lombok.experimental.Delegate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString(exclude = {"events"})
public class User implements Serializable ,HasContactInformation{
    private @Id @Setter(AccessLevel.PROTECTED) Long id;

    private String nickname;

    @Delegate(types = {HasContactInformation.class})
    private final ContactInformationSupport contactInformationt=new ContactInformationSupport();

    @OneToMany(mappedBy = "user")
    private List<UserEvent> events;

    public User(String nickname,String firstName,String lastName,String phoneNr){
        this.nickname=nickname;
        contactInformationt.setFirstName(firstName);
        contactInformationt.setLastName(lastName);
        contactInformationt.setPhoneNr(phoneNr);
    }
}
