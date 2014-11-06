package com.freedomotic.model.object.behavior;
/**
 *
 * Copyright (c) 2009-2014 Freedomotic team http://freedomotic.com
 *
 * This file is part of Freedomotic
 *
 * This Program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 *
 * This Program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Freedomotic; see the file COPYING. If not, see
 * <http://www.gnu.org/licenses/>.
 */


/**
 * @author Freedomotic Team
 */
public abstract class Behavior {

    private String name;
    private String description;
    private boolean active;
    private int priority;
    private boolean readOnly;

    /**
     *
     */
    public final static String VALUE_OPPOSITE = "opposite";

    /**
     *
     */
    public final static String VALUE_NEXT = "next";

    /**
     *
     */
    public final static String VALUE_PREVIOUS = "previous";

}
