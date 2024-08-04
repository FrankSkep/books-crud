import { writable } from 'svelte/store';

export const toast = writable({
  message: '',
  color: '',
  show: false
});

let hideTimeout;

export function triggerToast(message, color = 'success', duration = 3000) {
  if (hideTimeout) {
    clearTimeout(hideTimeout);
  }
  
  toast.set({ message, color, show: true });

  hideTimeout = setTimeout(() => {
    toast.set({ message: '', color: '', show: false });
  }, duration);
}
