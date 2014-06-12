Slice-AEM60
========

## Purpose

This is Slice Add-on which extends Slice functionality to support AEM version 6.0.

Slice is a framework that glues Sling and Google Guice together. It eases mapping between
resources to classed and to using dependency injection inside Sling and AEM applications.
Slice repository: https://github.com/Cognifide/Slice

## Prerequisites

* AEM / Apache Sling 2
* Maven 2.x, 3.x

## Installation

Slice is available from Maven Central Repo. However if you want to check out the newest development version, do the following:

Checkout the source code:

    cd [folder of your choice]
    git clone git://github.com/Cognifide/Slice-AEM60.git
    cd Slice-AEM60

Compile and install:

    mvn clean package install

## Usage

Add dependencies to your POM file:

   
    <dependency>
        <groupId>com.cognifide.slice-addon</groupId>
        <artifactId>slice-aem60</artifactId>
        <version>1.0.0</version>
    </dependency>
