CanaryMod
=========

[Last Build](http://build.canarymod.net/job/CanaryRecode/lastBuild/net.canarymod$CanaryMod/) ![Build Status](http://build.canarymod.net/job/CanaryRecode/badge/icon)  
[Last Successful Build](http://build.canarymod.net/job/CanaryRecode/lastSuccessfulBuild/net.canarymod$CanaryMod/)  
[ChangeLog](http://build.canarymod.net/job/CanaryRecode/changes)  

CanaryMod is a Minecraft Server wrapper and library with built-in data
management features as well as player permissions and groups management.
CanaryMod provides a stable and feature-rich framework that makes sure that
Plugins written today, will still work in months without the need of updating
on each Minecraft update. As server owner, this allows you to spend more time
on managing your server, making it awesome, instead of waiting for all your
plugins to update each time.

As a Plugin Developer, our Mod allows you to concentrate on the things that make
your Plugin great and unique - you won’t ever need to bother about implementing
data storage or resolving dependencies with other plugins. We do the dirty work
for you, you go and make amazing plugins. It’s as easy as that!

This repository contains the wrapper/mod implementation.

Pull Requests
=============

It helps us when others take the time to submit fixes rather than just pointing out bugs/inconsistancies.  
However, We have standards for the sources we have. Things like formatting  
and generally following the [Sun/Oracle coding standards](http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html)  

Source Formatting and requirements
-------------

* No tabs; use 4 spaces instead.
* No trailing whitespaces.
* No CRLF line endings, LF only.
  * Git can handle this by auto-converting CRLF line endings into LF when you commit, and vice versa when it checks out code onto your filesystem.  
    You can turn on this functionality with the core.autocrlf setting.  
    If you’re on a Windows machine, set it to true — this converts LF endings into CRLF when you check out code. (git config --global core.autocrlf true)  
  * Eclipse: http://stackoverflow.com/a/11596227/532590
  * NetBeans: http://stackoverflow.com/a/1866385/532590
* JavaDocs well written (as necessary)
* Matching how we format statements