<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="newInputGraph_Titrating">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>504 343 141 80</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>759 352 90 80</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>515 167 88 112</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>314 55 78 64</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>519 27 78 64</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>768 496 90 80</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>962 353 154 80</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>971 509 154 80</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = &quot;take&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = &quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n0" to="n2">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n5">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:amount = 100</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = &quot;mg&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n6">
            <attr name="label">
                <string>titrating</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:count = 0</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:duration = 4</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:order = 0</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:unit = &quot;day&quot;</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n4">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:instant = 10</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:n = 1</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:instant = 20</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:n = 2</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:amount = 100</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:n = 2</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:unit = &quot;mg&quot;</string>
            </attr>
        </edge>
        <edge from="n5" to="n7">
            <attr name="label">
                <string>titrating</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:TitratingDosing</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:change = -5</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:interval = 1</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:intervalTimeUnit = &quot;day&quot;</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:TitratingDosing</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:change = -5</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:interval = 1</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:intervalTimeUnit = &quot;day&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
