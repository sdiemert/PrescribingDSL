<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph_2">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>116 55 149 112</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>744 505 91 64</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>647 624 81 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>648 731 82 64</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>872 625 81 48</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>873 736 74 64</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>712 319 97 64</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>882 430 108 48</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>574 437 108 48</string>
            </attr>
        </node>
        <node id="n9">
            <attr name="layout">
                <string>557 69 113 64</string>
            </attr>
        </node>
        <node id="n10">
            <attr name="layout">
                <string>729 211 108 48</string>
            </attr>
        </node>
        <node id="n11">
            <attr name="layout">
                <string>273 230 108 48</string>
            </attr>
        </node>
        <node id="n12">
            <attr name="layout">
                <string>276 343 97 64</string>
            </attr>
        </node>
        <node id="n13">
            <attr name="layout">
                <string>292 509 81 48</string>
            </attr>
        </node>
        <node id="n14">
            <attr name="layout">
                <string>305 638 82 64</string>
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
                <string>let:duration = 3</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = &quot;warfarin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:start = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n9">
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
                <string>let:frame = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n1" to="n2">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n1" to="n4">
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
                <string>let:value = 8</string>
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
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:value = 12</string>
            </attr>
        </edge>
        <edge from="n4" to="n5">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:amount = 5</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:frame = &quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:frequency = 2</string>
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
                <string>let:value = 1</string>
            </attr>
        </edge>
        <edge from="n7" to="n1">
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
                <string>let:value = 3</string>
            </attr>
        </edge>
        <edge from="n8" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:frame = &quot;MONTH&quot;</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n9" to="n11">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n9" to="n10">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>let:value = 1</string>
            </attr>
        </edge>
        <edge from="n10" to="n6">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>let:value = 2</string>
            </attr>
        </edge>
        <edge from="n11" to="n12">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:frame = &quot;WEEK&quot;</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:frequency = 1</string>
            </attr>
        </edge>
        <edge from="n12" to="n13">
            <attr name="label">
                <string>point</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>let:value = 6</string>
            </attr>
        </edge>
        <edge from="n13" to="n14">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n14" to="n14">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n14" to="n14">
            <attr name="label">
                <string>let:amount = 50</string>
            </attr>
        </edge>
        <edge from="n14" to="n14">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
