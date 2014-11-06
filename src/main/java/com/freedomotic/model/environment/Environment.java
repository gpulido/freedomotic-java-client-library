package com.freedomotic.model.environment;
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

import com.freedomotic.model.geometry.FDColor;
import java.util.ArrayList;

/**
 * @author Freedomotic Team
 */
public class Environment  {

    private String name;
    private int width;
    private int height;
    private String renderer;
    private FDColor backgroundColor;
    private String backgroundImage;
    private ArrayList<Zone> zones = new ArrayList<Zone>();
    private String uuid;
}
