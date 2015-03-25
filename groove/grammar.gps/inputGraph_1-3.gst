<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph_1-3">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>528 253 141 80</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>755 255 88 80</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>952 269 121 48</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>715 102 140 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>971 387 80 48</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>958 525 121 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>538 648 82 64</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>753 540 90 48</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>752 655 94 48</string>
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
                <string>let:duration = 4</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 1</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = &quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n4">
            <attr name="label">
                <string>reference</string>
            </attr>
        </edge>
        <edge from="n1" to="n2">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:CompoundInstant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:value = 1</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>specify</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:ReferencePoint</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:value = &quot;Jan 1st 2015&quot;</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:unit = &quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n3" to="n5">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:CompoundInstant</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:value = 8</string>
            </attr>
        </edge>
        <edge from="n5" to="n7">
            <attr name="label">
                <string>specify</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Dosing</string>
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
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:unit = &quot;HOUR&quot;</string>
            </attr>
        </edge>
        <edge from="n7" to="n8">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:AtomicInstant</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:value = 12</string>
            </attr>
        </edge>
        <edge from="n8" to="n6">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
    </graph>
</gxl>
