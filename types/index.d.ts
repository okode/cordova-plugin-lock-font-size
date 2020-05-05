export interface LockFontSizePlugin {

  /**
   * @description       On Android, Locks App font size to NORMAL Size
   */
  init(): Promise<boolean> ;

}
