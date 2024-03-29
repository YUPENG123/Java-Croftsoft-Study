     package com.croftsoft.apps.insight;

     public class Croft_Math {
     //////////////////////////////////////////////////////////////////////
     // Croft_Math.java v0.0 (C) Copyright 1996 David Wallace Croft.
     // 1996-08-24
     //////////////////////////////////////////////////////////////////////

     static public double  sigmoid ( double  a ) {
     //////////////////////////////////////////////////////////////////////
     // Also known as the "logistic function".
     //////////////////////////////////////////////////////////////////////
       return 1.0 / ( 1.0 + java.lang.Math.exp ( -a ) );
     }

     static public double  sigmoid_derivative ( double  a ) {
     //////////////////////////////////////////////////////////////////////
     // The derivative with respect to the argument.
     //////////////////////////////////////////////////////////////////////
       double  y = sigmoid ( a );
       return y * ( 1.0 - y );
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
