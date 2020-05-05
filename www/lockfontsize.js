/*global cordova */

var LockFontSize = function() {};

LockFontSize.prototype.init = function () {
  return new Promise(function (resolve) {
    cordova.exec(
      function () { resolve(true); },
      function () { resolve(false); },
      "LockFontSize",
      "init",
      []
    );
  });
};

module.exports = new LockFontSize();
