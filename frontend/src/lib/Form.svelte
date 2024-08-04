<script>
	import { goto } from '$app/navigation';
    import { triggerToast } from './toastStore.js';

    export let data, action;
    const isEditing = data.id !== undefined;

    function cancel() {
        goto('/');
        triggerToast('Operation canceled', 'danger');
    }
</script>

 <div class="container-sm">
    <!-- Formulario para agregar/editar -->
    <form on:submit|preventDefault={action}>
        {#if isEditing}
            <div class="mb-3">
                <label for="id" class="form-label">Id</label>
                <input type="text" id="id" class="form-control" bind:value={data.id} readonly />
            </div>
        {/if}
        <div class="mb-3">
            <label for="title" class="form-label">Title</label>
            <input type="text" id="title" class="form-control" bind:value={data.titulo} required />
        </div>
        <div class="mb-3">
            <label for="author" class="form-label">Author</label>
            <input type="text" id="author" class="form-control" bind:value={data.autor} required />
        </div>
        <div class="mb-3">
            <label for="edition" class="form-label">Edition</label>
            <input type="text" id="edition" class="form-control" bind:value={data.edicion} required />
        </div>
        <div class="mb-3">
            <label for="pages" class="form-label">Pages</label>
            <input type="number" id="pages" class="form-control" bind:value={data.numPaginas} required />
        </div>
        <button type="submit" class="btn btn-{isEditing ? 'primary' : 'success'}">{isEditing ? 'Update' : 'Save'}</button>
        <button type="button" class="btn btn-secondary" on:click={cancel}>Cancel</button>
    </form>
</div>