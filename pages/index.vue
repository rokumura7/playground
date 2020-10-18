<template>
  <div class="h-full w-full flex items-stretch justify-center bg-gray-300">
    <div class="m-4 p-4 w-full rounded bg-white">
      <h1 class="text-lg">TODO</h1>
      <div class="flex">
        <input type="text" class="my-4 mr-4 p-2 w-full border rounded" />
        <button
          class="m-4 p-2 border-blue-500 hover:bg-blue-500 text-blue-500 hover:text-white font-bold border rounded"
        >
          Add
        </button>
      </div>
      <div class="flex justify-center">
        <button
          class="m-4 p-2 border-blue-500 hover:bg-blue-500 text-blue-500 hover:text-white font-bold border rounded"
        >
          ALL
        </button>
        <button
          class="m-4 p-2 border-teal-500 hover:bg-teal-500 text-teal-500 hover:text-white font-bold border rounded"
        >
          STOCK
        </button>
        <button
          class="m-4 p-2 border-green-500 hover:bg-green-500 text-green-500 hover:text-white font-bold border rounded"
        >
          DOING
        </button>
        <button
          class="m-4 p-2 border-gray-500 hover:bg-gray-500 text-gray-500 hover:text-white font-bold border rounded"
        >
          DONE
        </button>
      </div>
      <div>
        <div
          class="flex mb-2 p-2 border border-opacity-0 hover:border-opacity-50 border-blue-500 item-center"
        >
          <p class="mr-4 p-2 w-full">hogehoge</p>
          <select class="mr-4 p-2">
            <option>STOCK</option>
            <option selected>DOING</option>
            <option>DONE</option>
          </select>
          <button
            class="p-2 border-red-500 hover:bg-red-500 text-red-500 hover:text-white font-bold border rounded"
          >
            REMOVE
          </button>
        </div>
        <div
          class="flex mb-2 p-2 border border-opacity-0 hover:border-opacity-50 border-blue-500 item-center"
        >
          <p class="mr-4 p-2 w-full">fugafuga</p>
          <select class="mr-4 p-2">
            <option>STOCK</option>
            <option>DOING</option>
            <option selected>DONE</option>
          </select>
          <button
            class="p-2 border-red-500 hover:bg-red-500 text-red-500 hover:text-white font-bold border rounded"
          >
            REMOVE
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue'

export default Vue.extend({})
</script>

<style>
.container {
  background-color: aqua;
}
</style>
