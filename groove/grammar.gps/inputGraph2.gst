<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph2">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>389 276 141 64</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>204 427 88 112</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>311 664 70 48</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>200 162 82 64</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>174 674 78 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>778 266 141 64</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>782 442 88 112</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>1032 429 82 64</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>701 678 70 48</string>
            </attr>
        </node>
        <node id="n9">
            <attr name="layout">
                <string>840 680 70 48</string>
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
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n7">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n0" to="n3">
            <attr name="label">
                <string>then</string>
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
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:amount = 81</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:instant = 12</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:action = &quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:medication = &quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n3" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n3" to="n6">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:count = 0</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:duration = 3</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:order = 0</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:unit = &quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n5" to="n8">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n5" to="n9">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:amount = 81</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:instant = 4</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:instant = 8</string>
            </attr>
        </edge>
    </graph>
</gxl>
