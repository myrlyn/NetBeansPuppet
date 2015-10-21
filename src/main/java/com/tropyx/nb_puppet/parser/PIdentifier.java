/*
 * Copyright (C) 2014 mkleint
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.tropyx.nb_puppet.parser;

/**
 * function call
 */
public class PIdentifier extends PElement {
    private final String name;
    
    public PIdentifier(PElement parent, int offset, String name) {
        super(IDENTIFIER, parent, offset);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getEndOffset() {
        return getOffset() + name.length();
    }
    @Override
    public String toString() {
        return super.toString() + "[" + name + "]";
    }


}
