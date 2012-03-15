package org.grails.plugin.follow

import org.springframework.beans.factory.InitializingBean
import java.util.concurrent.ConcurrentHashMap

/**
 * Date: 3/14/12
 * Time: 11:23 PM
 * @author Guillaume Balaine (gepsens@gmail.com)
 * The purpose of this class is to load the default configurations set by the user and
 * serve them.
 *
 */
class FollowConfigProcessor implements InitializingBean {

    static transactional = false

    def configsByName = new ConcurrentHashMap()

    @Override
    void afterPropertiesSet() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private loadConfigs(Closure clozz) {

    }
}
