<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="inputGraph_1-4-1">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>18 164 141 80</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>364 200 88 80</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>561 214 121 48</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>324 47 140 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>576 324 88 64</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>353 348 121 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>147 593 82 64</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>362 477 90 64</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>361 600 94 48</string>
            </attr>
        </node>
        <node id="n9">
            <attr name="layout">
                <string>198 436 94 48</string>
            </attr>
        </node>
        <node id="n10">
            <attr name="layout">
                <string>42 442 82 64</string>
            </attr>
        </node>
        <node id="n11">
            <attr name="layout">
                <string>577 484 121 48</string>
            </attr>
        </node>
        <node id="n12">
            <attr name="layout">
                <string>654 725 94 48</string>
            </attr>
        </node>
        <node id="n13">
            <attr name="layout">
                <string>595 596 90 64</string>
            </attr>
        </node>
        <node id="n14">
            <attr name="layout">
                <string>448 730 94 48</string>
            </attr>
        </node>
        <node id="n15">
            <attr name="layout">
                <string>255 751 82 64</string>
            </attr>
        </node>
        <node id="n16">
            <attr name="layout">
                <string>738 824 82 64</string>
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
                <string>let:frequency = 1</string>
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
        <edge from="n3" to="n11">
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
                <string>let:frequency = 2</string>
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
        <edge from="n7" to="n9">
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
        <edge from="n9" to="n9">
            <attr name="label">
                <string>type:AtomicInstant</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:value = 20</string>
            </attr>
        </edge>
        <edge from="n9" to="n10">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>let:amount = 81</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>type:CompoundInstant</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>let:value = 12</string>
            </attr>
        </edge>
        <edge from="n11" to="n13">
            <attr name="label">
                <string>specify</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>type:AtomicInstant</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:value = 15</string>
            </attr>
        </edge>
        <edge from="n12" to="n16">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>let:unit = &quot;HOUR&quot;</string>
            </attr>
        </edge>
        <edge from="n13" to="n12">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n13" to="n14">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n14" to="n14">
            <attr name="label">
                <string>type:AtomicInstant</string>
            </attr>
        </edge>
        <edge from="n14" to="n14">
            <attr name="label">
                <string>let:value = 24</string>
            </attr>
        </edge>
        <edge from="n14" to="n15">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n15" to="n15">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n15" to="n15">
            <attr name="label">
                <string>let:amount = 81</string>
            </attr>
        </edge>
        <edge from="n15" to="n15">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n16" to="n16">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n16" to="n16">
            <attr name="label">
                <string>let:amount = 81</string>
            </attr>
        </edge>
        <edge from="n16" to="n16">
            <attr name="label">
                <string>let:unit = &quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
