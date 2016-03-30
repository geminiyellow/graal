/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.truffle.api.instrument.impl;

/**
 * A listener for Truffle execution events that provides a no-op implementation of every event.
 */
@SuppressWarnings("deprecation")
@Deprecated
public class DefaultSimpleInstrumentListener implements com.oracle.truffle.api.instrument.SimpleInstrumentListener {

    public void onEnter(com.oracle.truffle.api.instrument.Probe probe) {
    }

    public void onReturnVoid(com.oracle.truffle.api.instrument.Probe probe) {
    }

    public void onReturnValue(com.oracle.truffle.api.instrument.Probe probe, Object result) {
    }

    public void onReturnExceptional(com.oracle.truffle.api.instrument.Probe probe, Throwable exception) {
    }
}
