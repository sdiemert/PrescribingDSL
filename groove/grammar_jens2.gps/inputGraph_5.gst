<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph_5">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>550 279 149 112</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>587 466 91 48</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>589 579 81 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>590 686 82 64</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>776 662 85 96</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>333 572 81 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>319 695 82 64</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:duration = 6</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = "warfarin"</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:start = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = "take"</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n1" to="n2">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frame = string:"DAY"</string>
            </attr>
        </edge>
        <edge from="n1" to="n5">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:value = 8</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:unit = "MG"</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:amount = 10</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n3" to="n4">
            <attr name="label">
                <string>titrate</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:dunit = "MG"</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Titrate</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:dstep = -1</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:tunit = "DAY"</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:tstep = 2</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:value = 20</string>
            </attr>
        </edge>
        <edge from="n5" to="n6">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:amount = 20</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:unit = "MG"</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
    </graph>
</gxl>
