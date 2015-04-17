<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="expand_timing_example_1">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n5">
            <attr name="layout">
                <string>801 84 101 64</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>816 199 81 48</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>610 35 108 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>431 44 91 64</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>616 150 108 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>817 296 82 64</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>247 155 97 64</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>56 205 149 112</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>238 44 108 48</string>
            </attr>
        </node>
        <node id="n35">
            <attr name="layout">
                <string>83 782 29 32</string>
            </attr>
        </node>
        <node id="n40">
            <attr name="layout">
                <string>409 213 149 112</string>
            </attr>
        </node>
        <node id="n43">
            <attr name="layout">
                <string>93 273 149 112</string>
            </attr>
        </node>
        <node id="n46">
            <attr name="layout">
                <string>363 259 149 96</string>
            </attr>
        </node>
        <node id="n48">
            <attr name="layout">
                <string>289 305 149 96</string>
            </attr>
        </node>
        <node id="n49">
            <attr name="layout">
                <string>207 330 149 96</string>
            </attr>
        </node>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:frame = string:&quot;HOUR&quot;</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:frequency = int:1</string>
            </attr>
        </edge>
        <edge from="n5" to="n2">
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
                <string>let:value = int:14</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:value = int:10</string>
            </attr>
        </edge>
        <edge from="n8" to="n5">
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
                <string>let:frame = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:frequency = int:2</string>
            </attr>
        </edge>
        <edge from="n6" to="n8">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n6" to="n7">
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
                <string>let:value = int:18</string>
            </attr>
        </edge>
        <edge from="n7" to="n5">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:amount = int:10</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frame = string:&quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = int:1</string>
            </attr>
        </edge>
        <edge from="n1" to="n4">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:start = int:0</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:value = int:1</string>
            </attr>
        </edge>
        <edge from="n4" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>type:Plan</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:start = int:1209600</string>
            </attr>
        </edge>
        <edge from="n40" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:start = int:2419200</string>
            </attr>
        </edge>
        <edge from="n43" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n46" to="n46">
            <attr name="label">
                <string>let:start = int:604800</string>
            </attr>
        </edge>
        <edge from="n46" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n48" to="n48">
            <attr name="label">
                <string>let:start = int:1814400</string>
            </attr>
        </edge>
        <edge from="n48" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:duration = int:1</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:medication = string:&quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:start = int:3024000</string>
            </attr>
        </edge>
        <edge from="n49" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
    </graph>
</gxl>
