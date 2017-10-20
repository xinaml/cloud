package com.xinaml.cloud.user.config;

import com.xinaml.cloud.common.jpa.boot.EntityToScanImpl;
import com.xinaml.cloud.user.Application;
import org.springframework.stereotype.Component;

@Component
public class AppEntityToScan extends EntityToScanImpl<AppRoot> {
}
