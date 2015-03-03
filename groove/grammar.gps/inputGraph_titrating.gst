<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph_titrating">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>445 796 141 64</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>95 639 88 112</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>20 136 70 64</string>
            </attr>
        </node>
        <node id="n9">
            <attr name="layout">
                <string>917 441 159 80</string>
            </attr>
        </node>
        <node id="n10">
            <attr name="layout">
                <string>754 290 90 80</string>
            </attr>
        </node>
        <edge from="n0" to="n9">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = &quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = &quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = 0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = &quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n8">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:count = 0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:duration = 8</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 1</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:instant = 8</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:change = -25</string>
            </attr>
        </edge>
        <edge from="n9" to="n10">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>type:TitratingDosing</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:interval = 2</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:intervalTimeUnit = &quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>let:amount = 100</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
