/**
 * Copyright 2007 Gerard Toonstra
 * 
 * Licensed under the terms of the Apache Software License v2
 *
 * This file is part of the XSS Protect library
 */

package com.blogspot.radialmind.xss.html;

import com.blogspot.radialmind.BaseTestCase;

// Verified vulnerability in :
// 		Firefox 2.0		not vulnerable
//
// Needs checking in IE6.0 

public class MochaTest extends BaseTestCase {
	String mochaHTML = "<html><head><title>test</title></head><body><img src=\"mocha:[code]\"></body></html>";
	
	public void testMocha() {		
		testExecute(mochaHTML, "<html><head><title>test</title></head><body><img/></body></html>" );
	}
}
