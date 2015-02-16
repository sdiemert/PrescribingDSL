<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>241 8 141 64</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>116 128 88 112</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>50 296 70 48</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>200 296 70 48</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>428 128 47 32</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>330 216 82 80</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>492 216 82 80</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
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
        <edge from="n0" to="n5">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
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
                <string>let:duration = 3</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 2</string>
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
        <edge from="n1" to="n2">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n1" to="n4">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:instant = 2</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:instant = 4</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n6">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n5" to="n7">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:amount = 37</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:n = 0</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:amount = 86</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
