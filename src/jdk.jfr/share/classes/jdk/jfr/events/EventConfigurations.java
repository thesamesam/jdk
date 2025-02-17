/*
 * Copyright (c) 2020, 2023, Oracle and/or its affiliates. All rights reserved.
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

package jdk.jfr.events;
import jdk.jfr.internal.JVMSupport;
import jdk.jfr.internal.event.EventConfiguration;

public final class EventConfigurations {
    public static final EventConfiguration FILE_READ = JVMSupport.getConfiguration(FileReadEvent.class);
    public static final EventConfiguration FILE_WRITE = JVMSupport.getConfiguration(FileWriteEvent.class);
    public static final EventConfiguration FILE_FORCE = JVMSupport.getConfiguration(FileForceEvent.class);
    public static final EventConfiguration ERROR_THROWN = JVMSupport.getConfiguration(ErrorThrownEvent.class);
    public static final EventConfiguration EXCEPTION_THROWN = JVMSupport.getConfiguration(ExceptionThrownEvent.class);
}
