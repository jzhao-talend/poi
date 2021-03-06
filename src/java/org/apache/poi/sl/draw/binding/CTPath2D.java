/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.sl.draw.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_Path2D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Path2D">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="close" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Path2DClose"/>
 *         &lt;element name="moveTo" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Path2DMoveTo"/>
 *         &lt;element name="lnTo" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Path2DLineTo"/>
 *         &lt;element name="arcTo" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Path2DArcTo"/>
 *         &lt;element name="quadBezTo" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Path2DQuadBezierTo"/>
 *         &lt;element name="cubicBezTo" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_Path2DCubicBezierTo"/>
 *       &lt;/choice>
 *       &lt;attribute name="w" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PositiveCoordinate" default="0" />
 *       &lt;attribute name="h" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PositiveCoordinate" default="0" />
 *       &lt;attribute name="fill" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PathFillMode" default="norm" />
 *       &lt;attribute name="stroke" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="extrusionOk" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Path2D", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", propOrder = {
    "closeOrMoveToOrLnTo"
})
public class CTPath2D {

    @XmlElements({
        @XmlElement(name = "lnTo", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = CTPath2DLineTo.class),
        @XmlElement(name = "close", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = CTPath2DClose.class),
        @XmlElement(name = "cubicBezTo", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = CTPath2DCubicBezierTo.class),
        @XmlElement(name = "quadBezTo", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = CTPath2DQuadBezierTo.class),
        @XmlElement(name = "arcTo", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = CTPath2DArcTo.class),
        @XmlElement(name = "moveTo", namespace = "http://schemas.openxmlformats.org/drawingml/2006/main", type = CTPath2DMoveTo.class)
    })
    protected List<Object> closeOrMoveToOrLnTo;
    @XmlAttribute
    protected Long w;
    @XmlAttribute
    protected Long h;
    @XmlAttribute
    protected STPathFillMode fill;
    @XmlAttribute
    protected Boolean stroke;
    @XmlAttribute
    protected Boolean extrusionOk;

    /**
     * Gets the value of the closeOrMoveToOrLnTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closeOrMoveToOrLnTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCloseOrMoveToOrLnTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPath2DLineTo }
     * {@link CTPath2DClose }
     * {@link CTPath2DCubicBezierTo }
     * {@link CTPath2DQuadBezierTo }
     * {@link CTPath2DArcTo }
     * {@link CTPath2DMoveTo }
     * 
     * 
     */
    public List<Object> getCloseOrMoveToOrLnTo() {
        if (closeOrMoveToOrLnTo == null) {
            closeOrMoveToOrLnTo = new ArrayList<Object>();
        }
        return this.closeOrMoveToOrLnTo;
    }

    public boolean isSetCloseOrMoveToOrLnTo() {
        return ((this.closeOrMoveToOrLnTo!= null)&&(!this.closeOrMoveToOrLnTo.isEmpty()));
    }

    public void unsetCloseOrMoveToOrLnTo() {
        this.closeOrMoveToOrLnTo = null;
    }

    /**
     * Gets the value of the w property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getW() {
        if (w == null) {
            return  0L;
        } else {
            return w;
        }
    }

    /**
     * Sets the value of the w property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setW(long value) {
        this.w = value;
    }

    public boolean isSetW() {
        return (this.w!= null);
    }

    public void unsetW() {
        this.w = null;
    }

    /**
     * Gets the value of the h property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getH() {
        if (h == null) {
            return  0L;
        } else {
            return h;
        }
    }

    /**
     * Sets the value of the h property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setH(long value) {
        this.h = value;
    }

    public boolean isSetH() {
        return (this.h!= null);
    }

    public void unsetH() {
        this.h = null;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link STPathFillMode }
     *     
     */
    public STPathFillMode getFill() {
        if (fill == null) {
            return STPathFillMode.NORM;
        } else {
            return fill;
        }
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link STPathFillMode }
     *     
     */
    public void setFill(STPathFillMode value) {
        this.fill = value;
    }

    public boolean isSetFill() {
        return (this.fill!= null);
    }

    /**
     * Gets the value of the stroke property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStroke() {
        if (stroke == null) {
            return true;
        } else {
            return stroke;
        }
    }

    /**
     * Sets the value of the stroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStroke(boolean value) {
        this.stroke = value;
    }

    public boolean isSetStroke() {
        return (this.stroke!= null);
    }

    public void unsetStroke() {
        this.stroke = null;
    }

    /**
     * Gets the value of the extrusionOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExtrusionOk() {
        if (extrusionOk == null) {
            return true;
        } else {
            return extrusionOk;
        }
    }

    /**
     * Sets the value of the extrusionOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrusionOk(boolean value) {
        this.extrusionOk = value;
    }

    public boolean isSetExtrusionOk() {
        return (this.extrusionOk!= null);
    }

    public void unsetExtrusionOk() {
        this.extrusionOk = null;
    }

}
