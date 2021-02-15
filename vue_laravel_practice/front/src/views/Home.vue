<template>
  <div class="h-full pt-10">
    <div
      class="border-green-500 rounded mb-5 p-5 border max-w-xl container m-auto"
    >
      <p class="mb-5">
        content content content content content content content content content
        content content content content content content content content content
      </p>
      <p class="text-right">by user name</p>
      <ul class="border-t pt-5 mb-5">
        <li>
          <p>comment</p>
          <p class="text-right">by user name</p>
        </li>
        <li>
          <p>comment</p>
          <p class="text-right">by user name</p>
        </li>
      </ul>
      <form class="flex">
        <textarea
          class="mr-4 px-2 w-full rounded border border-blue-100 border-transparent focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
          type="text"
          placeholder="say something..."
        />
        <button
          class="w-1/5 px-2 text-white bg-blue-500 rounded hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-opacity-50"
        >
          comment
        </button>
      </form>
    </div>
    <div
      class="border-green-500 rounded mb-5 p-5 border max-w-xl container m-auto"
    >
      <p class="mb-5">
        content content content content content content content content content
        content content content content content content content content content
      </p>
      <p class="text-right">by user name</p>
      <ul class="border-t pt-5 mb-5">
        <li>
          <p>comment</p>
          <p class="text-right">by user name</p>
        </li>
        <li>
          <p>comment</p>
          <p class="text-right">by user name</p>
        </li>
      </ul>
      <form class="flex">
        <textarea
          class="mr-4 px-2 w-full rounded border border-blue-100 border-transparent focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
          type="text"
          placeholder="say something..."
        />
        <button
          class="w-1/5 px-2 text-white bg-blue-500 rounded hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-opacity-50"
        >
          comment
        </button>
      </form>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'Home',
})
</script>
