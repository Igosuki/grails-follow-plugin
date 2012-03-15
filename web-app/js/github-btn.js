/**
 * @author Guillaume Balaine (gepsens@gmail.com)
 * Inspired by Mark Otto's work : https://github.com/markdotto/github-buttons
 * Licensed under the Apache License, Version 2.0
 */

// Add commas to numbers
function addCommas(n) {
    return n.toString().replace(/(\d)(?=(\d{3})+$)/g, '$1,')
}

function jsonp(path) {
    var el = document.createElement('script');
    el.src = path + '?callback=callback';
    head.insertBefore(el, head.firstChild);
}

function callback(obj) {
    if (type == 'watch') {
        counter.innerHTML = addCommas(obj.data.watchers);
    } else if (type == 'fork') {
        counter.innerHTML = addCommas(obj.data.forks);
    } else if (type == 'follow') {
        counter.innerHTML = addCommas(obj.data.followers);
    }

    // Show the count if asked
    if (count == 'true') {
        counter.style.display = 'block'
    }
}

// Set href to be URL for repo
button.href = 'https://github.com/' + user + '/' + repo + '/';

// Add the class, change the text label, set count link href
if (type == 'watch') {
    mainButton.className += ' github-watchers';
    text.innerHTML = 'Watch';
    counter.href = 'https://github.com/' + user + '/' + repo + '/watchers';
} else if (type == 'fork') {
    mainButton.className += ' github-forks';
    text.innerHTML = 'Fork';
    counter.href = 'https://github.com/' + user + '/' + repo + '/network';
} else if (type == 'follow') {
    mainButton.className += ' github-me';
    text.innerHTML = 'Follow @' + user;
    button.href = 'https://github.com/' + user;
    counter.href = 'https://github.com/' + user + '/followers';
}

// Change the size
if (size == 'large') {
    mainButton.className += ' github-btn-large';
}

if (type == 'follow') {
    jsonp('https://api.github.com/users/' + user);
} else {
    jsonp('https://api.github.com/repos/' + user + '/' + repo);
}