package com.xinaml.cloud.user.ser;

import com.xinaml.cloud.common.jpa.service.ServiceImpl;
import com.xinaml.cloud.user.dto.UserDTO;
import com.xinaml.cloud.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserSerImpl extends ServiceImpl<User,UserDTO> implements UserSer {
}
