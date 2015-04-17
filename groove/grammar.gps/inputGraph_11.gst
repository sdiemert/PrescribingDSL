<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph_11">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>15 64 149 112</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>244 87 97 64</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>954 101 81 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>947 206 82 64</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>239 204 108 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>773 93 101 64</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>410 106 91 64</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>593 174 108 48</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>590 54 108 48</string>
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
                <string>let:duration = 2</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = &quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = 2</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:start = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frame = &quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 1</string>
            </attr>
        </edge>
        <edge from="n1" to="n5">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:value = 14</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:amount = 10</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:value = 1</string>
            </attr>
        </edge>
        <edge from="n5" to="n4">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:frame = &quot;HOUR&quot;</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:frequency = 1</string>
            </attr>
        </edge>
        <edge from="n6" to="n2">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:frame = &quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n4" to="n7">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n4" to="n8">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:value = 18</string>
            </attr>
        </edge>
        <edge from="n7" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:value = 10</string>
            </attr>
        </edge>
        <edge from="n8" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
    </graph>
</gxl>
