package org.grails.plugin.follow

/**
 * Date: 3/14/12
 * Time: 11:23 PM
 * @author Guillaume Balaine (gepsens@gmail.com)
 * This builder takes a closure and adds it to the configurations
 */
class FollowConfigBuilder implements GroovyInterceptable {

    private _configs

    FollowConfigBuilder(List configs) {
        this._configs = configs
    }

    invoke

}
