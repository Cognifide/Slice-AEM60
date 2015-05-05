![Cognifide logo](http://cognifide.github.io/Carty/assets/media/cognifide_logo.png)

Slice-AEM60
========

## Purpose

This is add-on which extends [Slice](https://github.com/Cognifide/Slice) functionality to support AEM version 6.0. It defines additional Guice modules which provides AEM-specific objects like Page, PageManager, etc.

Slice - a framework which simplifies Sling/AEM development by using dependency injection pattern and mapping Sling resources into Java objects. Slice repository: https://github.com/Cognifide/Slice

## Prerequisites

* Slice 4.2
* AEM 6.0
* Apache Sling 2
* Maven 2.x, 3.x

## Installation

Slice and all add-ons are available from Maven Central Repo. However if you want to check out the newest development version, do the following:

Checkout the source code:

    cd [folder of your choice]
    git clone git://github.com/Cognifide/Slice-AEM60.git
    cd Slice-AEM60

Compile and install:

    mvn clean install

## Usage

Add dependency to your POM file:

   
    <dependency>
        <groupId>com.cognifide.slice-addon</groupId>
        <artifactId>slice-aem60</artifactId>
        <version>1.1.0</version>
    </dependency>
    

## Documentation

* [Slice wiki](https://cognifide.atlassian.net/wiki/display/SLICE)
* [Slice users mailing group](http://slice-users.2340343.n4.nabble.com/) if you have any question on how to use it
* [Slice issue tracking](https://cognifide.atlassian.net/browse/SLICE)

## Commercial Support

Technical support can be made available if needed. Please [contact us](mailto:slice-support@cognifide.com) for more details.

We can:

* prioritize your feature request,
* tailor the product to your needs,
* provide a training for your engineers,
* support your development teams.
