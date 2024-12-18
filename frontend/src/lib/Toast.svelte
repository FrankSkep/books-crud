<script>
    import { toast } from './toastStore.js';
    import { onMount, afterUpdate } from 'svelte';

    let message = '';
    let color = '';
    let show = false;

    let toastElement;
    let bootstrapToast;

    const subscribeToToastStore = () => {
        toast.subscribe((value) => {
            message = value.message;
            color = value.color;
            show = value.show;

            if (bootstrapToast) {
                show ? bootstrapToast.show() : bootstrapToast.hide();
            }
        });
    };

    onMount(() => {
        if (toastElement) {
            bootstrapToast = new bootstrap.Toast(toastElement);
        }
        subscribeToToastStore();
    });

    afterUpdate(() => {
        if (toastElement && !bootstrapToast) {
            bootstrapToast = new bootstrap.Toast(toastElement);
        }
        if (bootstrapToast) {
            show ? bootstrapToast.show() : bootstrapToast.hide();
        }
    });
</script>

<div class="toast-container position-fixed top-0 end-0 p-5">
    <div
        bind:this={toastElement}
        class="toast align-items-center text-white bg-{color} border-0"
        role="alert"
        aria-live="assertive"
        aria-atomic="true"
    >
        <div class="d-flex">
            <div class="toast-body">
                {message}
            </div>
            <button
                type="button"
                class="btn-close btn-close-white me-2 m-auto"
                data-bs-dismiss="toast"
                aria-label="Close"
            ></button>
        </div>
    </div>
</div>

<style>
    .toast-container {
        z-index: 11;
    }
</style>
