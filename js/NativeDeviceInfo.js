import type {TurboModule} from 'react-native/Libraries/TurboModule/RCTExport';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  getIpAddress: () => string;

  getMacAddress: () => string;

  isEmulator: () => boolean;

  getWifiInfo: () => {
    name: string,
    ipAddress: string,
  };
}

export default (TurboModuleRegistry.get<Spec>('NativeDeviceInfo'): ?Spec);
