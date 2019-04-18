package org.opengis.cite.wms13;

/**
 * Contains various constants defined in the WMS 1.3 specification, such as test
 * run parameters.
 * 
 * @see "OGC 06-042: OpenGIS Web Map Server Implementation Specification, Version 1.3.0"
 */
public class WMS13 {

    private WMS13() {
    }

    /** Supplies reference to WMS capabilities document (URI). */
    public static final String CAPABILITIES_URL = "capabilities-url";
    /** Test versioning of capabilities document ("auto"|"manual"). */
    public static final String UPDATESEQ = "updatesequence";
    /** A version that is higher than the latest version. */
    public static final String HIGH_UPDATESEQ = "high-updatesequence";
    /** A version that is lower than the latest version. */
    public static final String LOW_UPDATESEQ = "low-updatesequence";
    /** Run tests for <strong>Basic WMS</strong> conformance (Boolean) */
    public static final String BASIC = "basic";
    /** Run tests for <strong>Queryable WMS</strong> conformance (Boolean) */
    public static final String QUERYABLE = "queryable";
    /** Run tests for the elevation dimension using raster data (Boolean). */
    public static final String RASTER_ELEV = "raster_elevation";
    /** Run tests for the elevation dimension using vector data (Boolean). */
    public static final String VECTOR_ELEV = "vector_elevation";
    /** Run tests for the temporal dimension (Boolean). */
    public static final String TIME = "time";
    /** Run tests for recommended constraints (Boolean). */
    public static final String RECOMMENDED = "recommended";

}
