/**
 * Date: 3/15/12
 * Time: 4:37 AM
 * @author Guillaume Balaine(gepsens@gmail.com)
 * The default bundles for the follow plugin
 */
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')
def twitterbootstrapPlugin = applicationContext.pluginManager.getGrailsPlugin('twitter-bootstrap')

modules = {
    'flw_external' {
        if(twitterbootstrapPlugin) {
            dependsOn 'bootstrap'
        }
        if(jqueryPlugin) {
            dependsOn 'jqueryPlugin'
        }
    }
    'github' {
        resource url:[plugin: 'follow', dir: 'js', file: 'github-btn.js'], disposition: 'head'
        resource url:[plugin: 'follow', dir: 'css', file: 'github-btn.css'], disposition: 'head'
        dependsOn 'flw_external'
    }
}