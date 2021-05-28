
function Template() 
{
	var oDocument = this.Document = this._Popup.document ;
	var url = window.document.location;
	var	sBase = '<base href="' + url + '">' ;
	oDocument.write( '<html><head>' + sBase + '<\/head><body style="margin:0px;padding:0px;"><\/body><\/html>' ) ;
}