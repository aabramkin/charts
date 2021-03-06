package com.vaadin.addon.charts;

/*
 * #%L
 * Vaadin Charts Addon
 * %%
 * Copyright (C) 2012 - 2015 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.addon.charts.model.Series;
import com.vaadin.ui.Component;

/**
 * CheckboxClickEvent triggered when a checkbox in a legend is clicked
 */
public class CheckboxClickEvent extends AbstractSeriesEvent {

    private final boolean checked;

    public CheckboxClickEvent(Component source, boolean isChecked,
        Series series, int seriesItemIndex) {
        super(source, series, seriesItemIndex);
        checked = isChecked;
    }

    public boolean isChecked() {
        return checked;
    }

}
