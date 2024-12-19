<script>
    import { goto } from '$app/navigation';

    export let data, action;
    const isEditing = data.id !== undefined;

    function cancel() {
        goto('/books');
    }
</script>

<div class="container-sm mt-5">
    <div class="card shadow-sm">
        <div class="card-body">
            <h5 class="card-title text-center mb-4">{isEditing ? 'Edit Book' : 'Add Book'}</h5>
            <form on:submit|preventDefault={action}>
                {#if isEditing}
                    <div class="mb-3">
                        <label for="id" class="form-label">Id</label>
                        <input type="text" id="id" class="form-control" bind:value={data.id} readonly />
                    </div>
                {/if}
                <div class="mb-3">
                    <label for="title" class="form-label">Title</label>
                    <input type="text" id="title" class="form-control" bind:value={data.title} required />
                </div>
                <div class="mb-3">
                    <label for="author" class="form-label">Author</label>
                    <input type="text" id="author" class="form-control" bind:value={data.author} required />
                </div>
                <div class="mb-3">
                    <label for="edition" class="form-label">Edition</label>
                    <input type="text" id="edition" class="form-control" bind:value={data.edition} required />
                </div>
                <div class="mb-3">
                    <label for="pages" class="form-label">Pages</label>
                    <input type="number" id="pages" class="form-control" bind:value={data.numberOfPages} required />
                </div>
                <div class="d-flex justify-content-between">
                    <button type="submit" class="btn btn-{isEditing ? 'primary' : 'success'}">{isEditing ? 'Update' : 'Save'}</button>
                    <button type="button" class="btn btn-secondary" on:click={cancel}>Cancel</button>
                </div>
            </form>
        </div>
    </div>
</div>