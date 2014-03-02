var profile = (function(){
	return {
		selectorEngine		  : "acme",
		action				  : "release",
		optimize		      : "closure",
		layerOptimize		  : "closure",
		stripConsole		  : "normal",
		copyTests			  : false,
		
		cssImportIgnore		  : "../../../dijit.css",
		cssOptimize			  : "comments.keepLines",
		mini				  : true,
		webkitMobile		  : true,
		
		// Specifies a list of locale to generate flattened nls bundle, or set it to null to rely on new 1.7 behavior
		localeList			  : "ROOT",
		
		// Specifies the flattened bundles to copy in the layers (it avoids a separate file and separate request)
		//		includeLocales		  : ["en-us"],
		
		packages:[
		  		{ name:"dojo", location:"../../../dojo"},
		  		{ name:"dojox", location:"../../../dojox"},
		  		{ name:"dijit", location:"../../../dijit"},
		  		{
		  			name:"gridx",
		  			location:"../../../gridx",
		  			resourceTags: {
		  				ignore: function(filename, mid){
		  					return /gridx\/gallery\//.test(mid) || /gridx\/mobile\/util\//.test(mid);
		  				},
		  				test: function(filename, mid){
		  					return /\/tests\//.test(mid);
		  				},
		  				amd: function(filename, mid){
		  					return !/\/tests\//.test(mid) &&
		  						/\.js$/.test(filename) &&
		  						!/\w+_\w+/.test(filename);
		  				}
		  			}
		  		}
		  ],
		
		staticHasFeatures: {
			// The trace & log APIs are used for debugging the loader, so we don�t need them in the build
			'dojo-trace-api':0,
			// Disables the logging code of the loader
			'dojo-log-api':0,
			// This causes normally private loader data to be exposed for debugging, so we don�t need that either
			'dojo-publish-privates':0,
			// no sync loader. Enable if legacy api support like dojo.require() is needed. 
			'dojo-sync-loader':0,
			// needed to support legacy i18n api
			'dojo-v1x-i18n-Api':1,
			// Disables some of the error handling when loading modules.
			'config-dojo-loader-catches': 0,
			// Disables code dealing with modules that don't load
			'dojo-timeout-api': 0,
			// Disable support for legacy IE event behavior API (attachEvent versus attachEventListener).
			'ie-event-behavior': 0,
			// We are not loading tests in production
			'dojo-test-sniff':0,
			// Don't add replacement console
			'dojo-guarantee-console': 0
		},

		layers: {
			"dojo/mobile-ui-layer":{
				include: ["dojox/mobile",
				"dojox/mobile/_base",
				"dojox/mobile/_ComboBoxMenu",
				"dojox/mobile/_ContentPaneMixin",
				"dojox/mobile/_css3",
				"dojox/mobile/_DataListMixin",
				"dojox/mobile/_DataMixin",
				"dojox/mobile/_DatePickerMixin",
				"dojox/mobile/_EditableIconMixin",
				"dojox/mobile/_EditableListMixin",
				"dojox/mobile/_ExecScriptMixin",
				"dojox/mobile/_IconItemPane",
				"dojox/mobile/_ItemBase",
				"dojox/mobile/_ListTouchMixin",
				"dojox/mobile/_maskUtils",
				"dojox/mobile/_PickerBase",
				"dojox/mobile/_PickerChooser",
				"dojox/mobile/_ScrollableMixin",
				"dojox/mobile/_StoreListMixin",
				"dojox/mobile/_StoreMixin",
				"dojox/mobile/_TimePickerMixin",
				"dojox/mobile/Accordion",
				"dojox/mobile/Audio",
				"dojox/mobile/Badge",
				"dojox/mobile/bookmarkable",
				"dojox/mobile/Button",
				"dojox/mobile/Carousel",
				"dojox/mobile/CarouselItem",
				"dojox/mobile/CheckBox",
				"dojox/mobile/ComboBox", // experimental	
				"dojox/mobile/common",
				"dojox/mobile/compat",
				"dojox/mobile/Container",
				"dojox/mobile/ContentPane",
				"dojox/mobile/DataCarousel",
				"dojox/mobile/DatePicker",
				"dojox/mobile/EdgeToEdgeCategory",
				"dojox/mobile/EdgeToEdgeDataList",
				"dojox/mobile/EdgeToEdgeList",
				"dojox/mobile/EdgeToEdgeStoreList",
				"dojox/mobile/ExpandingTextArea",
				"dojox/mobile/FilteredListMixin",
				"dojox/mobile/FixedSplitter",
				"dojox/mobile/FixedSplitterPane",
				"dojox/mobile/FormLayout",
				"dojox/mobile/GridLayout",
				"dojox/mobile/Heading",
				"dojox/mobile/i18n",
				"dojox/mobile/Icon",
				"dojox/mobile/IconContainer",
				"dojox/mobile/IconItem",
				"dojox/mobile/IconMenu",
				"dojox/mobile/IconMenuItem",
				"dojox/mobile/iconUtils",
				"dojox/mobile/lazyLoadUtils",
				"dojox/mobile/ListItem",
				"dojox/mobile/LongListMixin",
				"dojox/mobile/Opener",
				"dojox/mobile/Overlay",
				"dojox/mobile/PageIndicator",
				"dojox/mobile/pageTurningUtils",
				"dojox/mobile/Pane",
				//"dojox/mobile/parser",
				"dojox/mobile/ProgressBar",
				"dojox/mobile/ProgressIndicator",
				"dojox/mobile/RadioButton",
				"dojox/mobile/Rating",
				"dojox/mobile/RoundRect",
				"dojox/mobile/RoundRectCategory",
				"dojox/mobile/RoundRectDataList",
				"dojox/mobile/RoundRectList",
				"dojox/mobile/RoundRectStoreList",
				"dojox/mobile/ScreenSizeAware", // experimental
				"dojox/mobile/scrollable",
				"dojox/mobile/ScrollablePane",
				"dojox/mobile/ScrollableView",
				"dojox/mobile/SearchBox",
				"dojox/mobile/SimpleDialog",
				"dojox/mobile/Slider",
				"dojox/mobile/sniff",
				"dojox/mobile/SpinWheel",
				"dojox/mobile/SpinWheelDatePicker",
				"dojox/mobile/SpinWheelSlot",
				"dojox/mobile/SpinWheelTimePicker",
				"dojox/mobile/StoreCarousel",
				"dojox/mobile/SwapView",
				"dojox/mobile/Switch",
				"dojox/mobile/TabBar",
				"dojox/mobile/TabBarButton",
				"dojox/mobile/TextArea",
				"dojox/mobile/TextBox",
				"dojox/mobile/TimePicker",
				"dojox/mobile/ToggleButton",
				"dojox/mobile/ToolBarButton",
				"dojox/mobile/Tooltip",
				"dojox/mobile/transition",
				"dojox/mobile/TransitionEvent",
				"dojox/mobile/TreeView", // experimental
				"dojox/mobile/uacss",
				"dojox/mobile/ValuePicker",
				"dojox/mobile/ValuePickerDatePicker",
				"dojox/mobile/ValuePickerSlot",
				"dojox/mobile/ValuePickerTimePicker",
				"dojox/mobile/Video",
				"dojox/mobile/View",
				"dojox/mobile/ViewController",
				"dojox/mobile/viewRegistry",
				"dojox/mobile/dh/ContentTypeMap",
				"dojox/mobile/dh/DataHandler",
				"dojox/mobile/dh/HtmlContentHandler",
				"dojox/mobile/dh/HtmlScriptContentHandler",
				"dojox/mobile/dh/JsonContentHandler",
				"dojox/mobile/dh/PatternFileTypeMap",
				"dojox/mobile/dh/StringDataSource",
				"dojox/mobile/dh/SuffixFileTypeMap",
				"dojox/mobile/dh/UrlDataSource"],
				exclude: [
					"dojo/core-web-layer",
					"dojox/mobile/bidi/_ComboBoxMenu",
					"dojox/mobile/bidi/_ItemBase",
					"dojox/mobile/bidi/_StoreListMixin",
					"dojox/mobile/bidi/Accordion",
					"dojox/mobile/bidi/Badge",
					"dojox/mobile/bidi/Button",
					"dojox/mobile/bidi/Carousel",
					"dojox/mobile/bidi/CarouselItem",
					"dojox/mobile/bidi/common",
					"dojox/mobile/bidi/Heading",
					"dojox/mobile/bidi/IconItem",
					"dojox/mobile/bidi/IconMenu",
					"dojox/mobile/bidi/ListItem",
					"dojox/mobile/bidi/RoundRectCategory",
					"dojox/mobile/bidi/SpinWheelSlot",
					"dojox/mobile/bidi/Switch",
					"dojox/mobile/bidi/TabBar",
					"dojox/mobile/bidi/TabBarButton",
					"dojox/mobile/bidi/TextBox",
					"dojox/mobile/bidi/ToolBarButton",
					"dojox/mobile/bidi/Tooltip",
					"dojox/mobile/bidi/TreeView",
					"dojox/mobile/bidi/ValuePickerSlot"
				]
			}
		,


			"dojo/core-web-layer": {
				include:[	"dojo/_base/array",
				        	"dojo/_base/Color",
				        	"dojo/_base/config",
				        	"dojo/_base/connect",
				        	"dojo/_base/declare",
				        	"dojo/_base/Deferred",
				        	"dojo/_base/event",
				        	"dojo/_base/fx",
				        	"dojo/_base/html",
				        	"dojo/_base/json",
				        	"dojo/_base/kernel",
				        	"dojo/_base/lang",
				        	"dojo/_base/sniff",
				        	"dojo/_base/unload",
				        	"dojo/_base/window",
				        	"dojo/_base/xhr",
				        	"dojo/aspect",
				        	"dojo/cldr/monetary",
				        	"dojo/cldr/supplemental",
				        	"dojo/cldr/nls/gregorian",
				        	"dojo/cldr/nls/currency",
				        	"dojo/colors",
				        	"dojo/date",
				        	"dojo/cookie",
				        	"dojo/currency",
				        	"dojo/date/locale",
				        	"dojo/DeferredList",
				        	"dojo/dom",
				        	"dojo/dom-attr",
				        	"dojo/dom-class",
				        	"dojo/dom-construct",
				        	"dojo/dom-form",
				        	"dojo/dom-geometry",
				        	"dojo/dom-prop",
				        	"dojo/domReady",
				        	"dojo/dom-style",
				        	"dojo/Evented",
				        	"dojo/fx",
				        	"dojo/fx/easing",
				        	"dojo/has",
				        	"dojo/hash",
				        	"dojo/html",
				        	//"dojo/i18n", //: see http://bugs.dojotoolkit.org/ticket/14947
				        	"dojo/io-query",
				        	"dojo/json",
				        	"dojo/keys",
				        	"dojo/main",
				        	"dojo/mouse",
				        	"dojo/on",
				        	"dojo/parser",
				        	"dojo/query",
				        	"dojo/ready",
				        	"dojo/regexp",
				        	"dojo/selector/_loader",
				        	"dojo/selector/acme",
				        	"dojo/Stateful",
				        	"dojo/string",
				        	"dojo/fx/Toggler",
				        	"dojo/topic",
				        	"dojo/touch",
				        	"dojo/uacss",
				        	"dojo/window",
				        	"dojo/store/util/QueryResults",
				        	"dojo/store/util/SimpleQueryEngine",
				        	"dojo/store/Memory",
				        	"dijit/_base/manager", //mobile, treemap
				        	"dijit/_BidiSupport", //charting
				        	"dijit/_Contained", //mobile
				        	"dijit/_Container", //mobile
				        	"dijit/_CssStateMixin", //charting
				        	"dijit/_FocusMixin", //charting, treemap
				        	"dijit/_KeyNavContainer", // calendar
				        	"dijit/_OnDijitClickMixin", //charting
				        	"dijit/_TemplatedMixin",//charting
				        	"dijit/_Widget", //charting
				        	"dijit/_WidgetBase", //mobile
				        	"dijit/_WidgetsInTemplateMixin", // calendar
				        	"dijit/a11y", //mobile
				        	"dijit/BackgroundIframe", //charting
				        	"dijit/focus", //charting
				        	"dijit/form/_ButtonMixin", //mobile
				        	"dijit/form/_CheckBoxMixin", //mobile
				        	"dijit/form/_ExpandingTextAreaMixin", //mobile
				        	"dijit/form/_FormValueMixin", //mobile
				        	"dijit/form/_FormWidget", //charting
				        	"dijit/form/_FormWidgetMixin", //mobile
				        	"dijit/form/_ListBase", // mobile
				        	"dijit/form/_RadioButtonMixin", //mobile
				        	"dijit/form/_TextBoxMixin", //mobile
				        	"dijit/form/_ToggleButtonMixin", //mobile
				        	"dijit/form/Button",//charting
				        	"dijit/form/CheckBox", //charting
				        	"dijit/form/ToggleButton", //charting
				        	"dijit/hccss", //charting
				        	"dijit/main", // mobile, treemap
				        	"dijit/place", // mobile
				        	"dijit/registry", // mobile, treemap
				        	"dijit/ToolbarSeparator", // calendar
				        	"dijit/Tooltip", // charting,
				        	"dijit/Toolbar",	// calendar,
				        	"dojox/widget/Selection",
				        	"dojox/widget/_Invalidating"]
			}
		}
	};	
})();