package com.xinaml.cloud.user.rep;

import com.xinaml.cloud.common.jpa.rep.JpaRep;
import com.xinaml.cloud.user.dto.UserDTO;
import com.xinaml.cloud.user.entity.User;

public interface UserRep extends JpaRep<User, UserDTO> {
}
