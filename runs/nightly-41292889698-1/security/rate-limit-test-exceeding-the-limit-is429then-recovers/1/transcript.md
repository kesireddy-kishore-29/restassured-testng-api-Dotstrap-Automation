# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 84 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 249 | `qa-727bee16-8e4d-4cf6-b512-7b4901e9f1b3` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-f193df44-195e-4af7-a744-f2b8a9eab6a9` |
| 3 | `GET /v1/accounts/me` | 200 | 34 | `qa-73f1cb55-1b0b-42f2-a63a-a243131c8775` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-61a49a16-e580-4fdc-b3d8-e2a884c8f181` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-317d39c1-b8c6-4f19-9ee3-9f94787d1e20` |
| 6 | `GET /v1/accounts/me` | 200 | 7 | `qa-124df97c-d175-46fb-adcc-1e82aa29a229` |
| 7 | `GET /v1/accounts/me` | 200 | 8 | `qa-225269d0-7365-462b-865a-0e0acdff244f` |
| 8 | `GET /v1/accounts/me` | 200 | 5 | `qa-0a259c14-b4f8-4fa8-9f6f-77b1ed6eb345` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-d549a83b-d52d-452c-b0e3-1d5472fa2519` |
| 10 | `GET /v1/accounts/me` | 200 | 11 | `qa-495a635e-18cc-49d4-ab5a-8e1fb08c0019` |
| 11 | `GET /v1/accounts/me` | 200 | 14 | `qa-6872b7a3-9014-49f8-b540-922c1e38e1c6` |
| 12 | `GET /v1/accounts/me` | 200 | 7 | `qa-3109d962-8c2c-4e83-8754-82ae1039436d` |
| 13 | `GET /v1/accounts/me` | 200 | 8 | `qa-25ec6add-998e-4a8b-86a0-0c1889b62686` |
| 14 | `GET /v1/accounts/me` | 200 | 9 | `qa-4e305c45-3fda-47b9-a553-e30bd3229a5d` |
| 15 | `GET /v1/accounts/me` | 200 | 5 | `qa-5ecc6137-3d13-409b-962e-ea58d0196886` |
| 16 | `GET /v1/accounts/me` | 200 | 7 | `qa-ebe52338-65de-435f-a266-2adfadd2111d` |
| 17 | `GET /v1/accounts/me` | 200 | 7 | `qa-c39f3909-9144-4ec5-9bb9-3587cee64348` |
| 18 | `GET /v1/accounts/me` | 200 | 7 | `qa-41b713bd-88fe-4aa0-b471-1aa69cd995bb` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-ef91bc03-8789-4fff-8995-9794e6e6e497` |
| 20 | `GET /v1/accounts/me` | 200 | 6 | `qa-b1218be2-4c91-4462-8f67-256d212fed9d` |
| 21 | `GET /v1/accounts/me` | 200 | 4 | `qa-50f75338-789e-4cc0-a9a0-3b6beba9e308` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-d1dd9522-e25f-4d01-a27d-caefba2784d7` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-4c8f2206-bb0a-417e-8022-36b79ae8f56d` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-1b004e6a-02e9-412e-a110-d3ea0dfb7c0d` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-624a08fb-fb07-4bf1-a9a1-2e26b190677a` |
| 26 | `GET /v1/accounts/me` | 200 | 7 | `qa-2e88ffe3-48bf-4ab0-8a32-850c73bbc9e8` |
| 27 | `GET /v1/accounts/me` | 200 | 4 | `qa-b2dc30fd-5ad7-4818-82e7-b711efb1cc93` |
| 28 | `GET /v1/accounts/me` | 200 | 5 | `qa-ef99f141-12d5-4c5e-a309-3283272ea8b9` |
| 29 | `GET /v1/accounts/me` | 200 | 5 | `qa-4367329d-adc2-414d-bce2-3f99586138f8` |
| 30 | `GET /v1/accounts/me` | 200 | 3 | `qa-f8cc37ae-1e29-46cf-bab1-71f2d14cf50b` |
| 31 | `GET /v1/accounts/me` | 200 | 4 | `qa-1b576d74-b076-45b2-93b1-58b5eee896e0` |
| 32 | `GET /v1/accounts/me` | 200 | 5 | `qa-fd5e92f3-cad8-43be-8150-f46592c24166` |
| 33 | `GET /v1/accounts/me` | 200 | 5 | `qa-d329a821-7ced-482d-a0d0-bd53e806ac37` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-d306cf37-af48-4e19-b914-e062ef87368a` |
| 35 | `GET /v1/accounts/me` | 200 | 3 | `qa-ac5a47cc-57ef-4e81-81e5-6508213a8df7` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-e21bb6a5-4362-4223-bee4-0b72965ed1be` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-c9d73b8b-2e93-404f-9b51-b17d9fd54454` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-0e899083-bf52-4b48-8517-ffa5df3d26b8` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-4bf88b60-f32b-4273-8dec-da5ea15f5b43` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-554edce6-6716-4a20-a8b2-e7654e5aed96` |
| 41 | `GET /v1/accounts/me` | 200 | 8 | `qa-7855a422-0bc5-4b5c-9dbd-777b108b6468` |
| 42 | `GET /v1/accounts/me` | 200 | 4 | `qa-1e7d368e-8df8-40ba-b991-d1c260459822` |
| 43 | `GET /v1/accounts/me` | 200 | 3 | `qa-0ca8aa03-8d74-4b45-a0c3-a259d6113044` |
| 44 | `GET /v1/accounts/me` | 200 | 3 | `qa-3c06bda2-9274-463c-a0ed-1f1e1bd1ba0b` |
| 45 | `GET /v1/accounts/me` | 200 | 4 | `qa-4c0552db-d3a2-46fc-9225-640a49796ce1` |
| 46 | `GET /v1/accounts/me` | 200 | 3 | `qa-b0c65b45-3d13-410e-99cf-e6619cf35ba9` |
| 47 | `GET /v1/accounts/me` | 200 | 3 | `qa-bc1a663b-6c07-4510-8eab-87a7fd4beb42` |
| 48 | `GET /v1/accounts/me` | 200 | 3 | `qa-f0f33020-ee41-4356-9ee2-1ef5d1575d9f` |
| 49 | `GET /v1/accounts/me` | 200 | 3 | `qa-e7347723-9882-455e-a067-c9af395085fa` |
| 50 | `GET /v1/accounts/me` | 200 | 4 | `qa-3c605f3b-f45d-4da2-b1de-fc3d55469a0d` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-540cfc16-8131-49f9-a59c-bfaa89999f28` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-637724fc-c9e2-453c-b2a5-f45ad814faee` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-9378f9d1-adb8-4270-a4b6-2e739cbe2c7d` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-3f628c1f-6ca5-4ee5-855b-ff4274879f3e` |
| 55 | `GET /v1/accounts/me` | 200 | 3 | `qa-a663e401-d03b-47a9-a153-fa291559bdc4` |
| 56 | `GET /v1/accounts/me` | 200 | 4 | `qa-19b5a96e-33e1-4513-a80b-05ba20a3a7df` |
| 57 | `GET /v1/accounts/me` | 200 | 3 | `qa-f8e3d48c-a979-4f74-9d5d-075335f94555` |
| 58 | `GET /v1/accounts/me` | 200 | 3 | `qa-883b219f-faa0-423c-a1a7-0c7031caa926` |
| 59 | `GET /v1/accounts/me` | 200 | 3 | `qa-493d033c-dc4b-4853-937c-ecdd1af64caf` |
| 60 | `GET /v1/accounts/me` | 200 | 2 | `qa-d1efc742-ba38-4df8-b4d4-bdc492da759b` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-1ceefad9-1e16-40c4-b26c-b0651458f8a8` |
| 62 | `GET /v1/accounts/me` | 200 | 3 | `qa-5d4d61ec-53f7-4191-9b7f-266e1737640a` |
| 63 | `GET /v1/accounts/me` | 429 | 5 | `qa-d6fc11d9-d9e6-4599-97cf-67d3a2798016` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-a59419ef-18c4-4317-b902-b9f1981594d4` |
| 65 | `GET /v1/accounts/me` | 429 | 3 | `qa-add852b4-d2ec-4e3a-87da-6afba5296a89` |
| 66 | `GET /v1/accounts/me` | 429 | 2 | `qa-e275b041-7985-452d-8462-3ed89f4e482d` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-c936a2f3-422c-47bd-86fe-4cb092252ba9` |
| 68 | `GET /v1/accounts/me` | 429 | 2 | `qa-45d1a4d0-48e1-4791-aab0-f01c2a37cd1e` |
| 69 | `GET /v1/accounts/me` | 429 | 2 | `qa-62924bbe-d6b9-4998-ad41-abfb0d14eb8a` |
| 70 | `GET /v1/accounts/me` | 429 | 3 | `qa-90fb1df6-4ff5-4f4c-b117-6e521ffe5c14` |
| 71 | `GET /v1/accounts/me` | 429 | 2 | `qa-a70b4dfa-abde-4c3e-a343-8e8a89a49586` |
| 72 | `GET /v1/accounts/me` | 429 | 2 | `qa-abe9521c-63b2-42b5-b664-5adb2f55b938` |
| 73 | `GET /v1/accounts/me` | 429 | 3 | `qa-ea000a45-5a04-442a-8c4d-b614a669eaea` |
| 74 | `GET /v1/accounts/me` | 429 | 2 | `qa-a14f88b9-df4e-4a4d-8ba1-e0a3b0cd61d4` |
| 75 | `GET /v1/accounts/me` | 429 | 2 | `qa-3380c540-37c9-4fb8-97d3-5ae6ef2e167f` |
| 76 | `GET /v1/accounts/me` | 429 | 2 | `qa-92442415-47e6-431c-92b7-072f59cb3576` |
| 77 | `GET /v1/accounts/me` | 429 | 3 | `qa-ac06764e-f124-4e96-b903-650659aaedca` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-219365e5-da6c-4012-940f-b73172721e57` |
| 79 | `GET /v1/accounts/me` | 429 | 9 | `qa-eb4cc520-7fe5-4c36-baa1-e41367c504b9` |
| 80 | `GET /v1/accounts/me` | 429 | 2 | `qa-31bc5666-913d-4787-becb-fcda4e6b65d4` |
| 81 | `GET /v1/accounts/me` | 429 | 2 | `qa-711d2ed7-b423-4079-a5dc-0377fefc9928` |
| 82 | `GET /v1/accounts/me` | 200 | 3 | `qa-13b890e6-445c-4454-9aca-ee0b30cf3492` |
| 83 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-9dfdbc5b-0045-4b69-8918-b9be4bf95bc0` |
| 84 | `POST /v1/auth/token` | 401 | 2 | `qa-4f510ae7-086f-4992-a3da-36c89bad56af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-727bee16-8e4d-4cf6-b512-7b4901e9f1b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-727bee16-8e4d-4cf6-b512-7b4901e9f1b3
Content-Type: application/json

--- request body ---
{"handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","password":"****","region":"eu"}

--- response: 201 in 249 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-727bee16-8e4d-4cf6-b512-7b4901e9f1b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-3bfbb2aea9c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f193df44-195e-4af7-a744-f2b8a9eab6a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f193df44-195e-4af7-a744-f2b8a9eab6a9
Content-Type: application/json

--- request body ---
{"handle":"qa-3bfbb2aea9c6","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f193df44-195e-4af7-a744-f2b8a9eab6a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-73f1cb55-1b0b-42f2-a63a-a243131c8775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73f1cb55-1b0b-42f2-a63a-a243131c8775
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-73f1cb55-1b0b-42f2-a63a-a243131c8775
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-61a49a16-e580-4fdc-b3d8-e2a884c8f181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61a49a16-e580-4fdc-b3d8-e2a884c8f181
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-61a49a16-e580-4fdc-b3d8-e2a884c8f181
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-317d39c1-b8c6-4f19-9ee3-9f94787d1e20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317d39c1-b8c6-4f19-9ee3-9f94787d1e20
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-317d39c1-b8c6-4f19-9ee3-9f94787d1e20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-124df97c-d175-46fb-adcc-1e82aa29a229

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-124df97c-d175-46fb-adcc-1e82aa29a229
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-124df97c-d175-46fb-adcc-1e82aa29a229
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-225269d0-7365-462b-865a-0e0acdff244f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-225269d0-7365-462b-865a-0e0acdff244f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-225269d0-7365-462b-865a-0e0acdff244f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a259c14-b4f8-4fa8-9f6f-77b1ed6eb345

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a259c14-b4f8-4fa8-9f6f-77b1ed6eb345
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a259c14-b4f8-4fa8-9f6f-77b1ed6eb345
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-d549a83b-d52d-452c-b0e3-1d5472fa2519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d549a83b-d52d-452c-b0e3-1d5472fa2519
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d549a83b-d52d-452c-b0e3-1d5472fa2519
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-495a635e-18cc-49d4-ab5a-8e1fb08c0019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495a635e-18cc-49d4-ab5a-8e1fb08c0019
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-495a635e-18cc-49d4-ab5a-8e1fb08c0019
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-6872b7a3-9014-49f8-b540-922c1e38e1c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6872b7a3-9014-49f8-b540-922c1e38e1c6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6872b7a3-9014-49f8-b540-922c1e38e1c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-3109d962-8c2c-4e83-8754-82ae1039436d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3109d962-8c2c-4e83-8754-82ae1039436d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3109d962-8c2c-4e83-8754-82ae1039436d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-25ec6add-998e-4a8b-86a0-0c1889b62686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ec6add-998e-4a8b-86a0-0c1889b62686
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-25ec6add-998e-4a8b-86a0-0c1889b62686
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e305c45-3fda-47b9-a553-e30bd3229a5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e305c45-3fda-47b9-a553-e30bd3229a5d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e305c45-3fda-47b9-a553-e30bd3229a5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ecc6137-3d13-409b-962e-ea58d0196886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ecc6137-3d13-409b-962e-ea58d0196886
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ecc6137-3d13-409b-962e-ea58d0196886
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebe52338-65de-435f-a266-2adfadd2111d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe52338-65de-435f-a266-2adfadd2111d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe52338-65de-435f-a266-2adfadd2111d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-c39f3909-9144-4ec5-9bb9-3587cee64348

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39f3909-9144-4ec5-9bb9-3587cee64348
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c39f3909-9144-4ec5-9bb9-3587cee64348
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-41b713bd-88fe-4aa0-b471-1aa69cd995bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41b713bd-88fe-4aa0-b471-1aa69cd995bb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-41b713bd-88fe-4aa0-b471-1aa69cd995bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef91bc03-8789-4fff-8995-9794e6e6e497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef91bc03-8789-4fff-8995-9794e6e6e497
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef91bc03-8789-4fff-8995-9794e6e6e497
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1218be2-4c91-4462-8f67-256d212fed9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1218be2-4c91-4462-8f67-256d212fed9d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1218be2-4c91-4462-8f67-256d212fed9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-50f75338-789e-4cc0-a9a0-3b6beba9e308

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50f75338-789e-4cc0-a9a0-3b6beba9e308
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-50f75338-789e-4cc0-a9a0-3b6beba9e308
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1dd9522-e25f-4d01-a27d-caefba2784d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1dd9522-e25f-4d01-a27d-caefba2784d7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1dd9522-e25f-4d01-a27d-caefba2784d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c8f2206-bb0a-417e-8022-36b79ae8f56d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c8f2206-bb0a-417e-8022-36b79ae8f56d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c8f2206-bb0a-417e-8022-36b79ae8f56d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b004e6a-02e9-412e-a110-d3ea0dfb7c0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b004e6a-02e9-412e-a110-d3ea0dfb7c0d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b004e6a-02e9-412e-a110-d3ea0dfb7c0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-624a08fb-fb07-4bf1-a9a1-2e26b190677a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-624a08fb-fb07-4bf1-a9a1-2e26b190677a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-624a08fb-fb07-4bf1-a9a1-2e26b190677a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e88ffe3-48bf-4ab0-8a32-850c73bbc9e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e88ffe3-48bf-4ab0-8a32-850c73bbc9e8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e88ffe3-48bf-4ab0-8a32-850c73bbc9e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2dc30fd-5ad7-4818-82e7-b711efb1cc93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2dc30fd-5ad7-4818-82e7-b711efb1cc93
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2dc30fd-5ad7-4818-82e7-b711efb1cc93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef99f141-12d5-4c5e-a309-3283272ea8b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef99f141-12d5-4c5e-a309-3283272ea8b9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef99f141-12d5-4c5e-a309-3283272ea8b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-4367329d-adc2-414d-bce2-3f99586138f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4367329d-adc2-414d-bce2-3f99586138f8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4367329d-adc2-414d-bce2-3f99586138f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8cc37ae-1e29-46cf-bab1-71f2d14cf50b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8cc37ae-1e29-46cf-bab1-71f2d14cf50b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8cc37ae-1e29-46cf-bab1-71f2d14cf50b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b576d74-b076-45b2-93b1-58b5eee896e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b576d74-b076-45b2-93b1-58b5eee896e0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b576d74-b076-45b2-93b1-58b5eee896e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd5e92f3-cad8-43be-8150-f46592c24166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd5e92f3-cad8-43be-8150-f46592c24166
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd5e92f3-cad8-43be-8150-f46592c24166
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-d329a821-7ced-482d-a0d0-bd53e806ac37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d329a821-7ced-482d-a0d0-bd53e806ac37
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d329a821-7ced-482d-a0d0-bd53e806ac37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-d306cf37-af48-4e19-b914-e062ef87368a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d306cf37-af48-4e19-b914-e062ef87368a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d306cf37-af48-4e19-b914-e062ef87368a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac5a47cc-57ef-4e81-81e5-6508213a8df7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac5a47cc-57ef-4e81-81e5-6508213a8df7
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac5a47cc-57ef-4e81-81e5-6508213a8df7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-e21bb6a5-4362-4223-bee4-0b72965ed1be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e21bb6a5-4362-4223-bee4-0b72965ed1be
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e21bb6a5-4362-4223-bee4-0b72965ed1be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9d73b8b-2e93-404f-9b51-b17d9fd54454

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9d73b8b-2e93-404f-9b51-b17d9fd54454
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9d73b8b-2e93-404f-9b51-b17d9fd54454
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e899083-bf52-4b48-8517-ffa5df3d26b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e899083-bf52-4b48-8517-ffa5df3d26b8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e899083-bf52-4b48-8517-ffa5df3d26b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-4bf88b60-f32b-4273-8dec-da5ea15f5b43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bf88b60-f32b-4273-8dec-da5ea15f5b43
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bf88b60-f32b-4273-8dec-da5ea15f5b43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-554edce6-6716-4a20-a8b2-e7654e5aed96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-554edce6-6716-4a20-a8b2-e7654e5aed96
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-554edce6-6716-4a20-a8b2-e7654e5aed96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-7855a422-0bc5-4b5c-9dbd-777b108b6468

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7855a422-0bc5-4b5c-9dbd-777b108b6468
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7855a422-0bc5-4b5c-9dbd-777b108b6468
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e7d368e-8df8-40ba-b991-d1c260459822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e7d368e-8df8-40ba-b991-d1c260459822
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e7d368e-8df8-40ba-b991-d1c260459822
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ca8aa03-8d74-4b45-a0c3-a259d6113044

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ca8aa03-8d74-4b45-a0c3-a259d6113044
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ca8aa03-8d74-4b45-a0c3-a259d6113044
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c06bda2-9274-463c-a0ed-1f1e1bd1ba0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c06bda2-9274-463c-a0ed-1f1e1bd1ba0b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c06bda2-9274-463c-a0ed-1f1e1bd1ba0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c0552db-d3a2-46fc-9225-640a49796ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c0552db-d3a2-46fc-9225-640a49796ce1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c0552db-d3a2-46fc-9225-640a49796ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0c65b45-3d13-410e-99cf-e6619cf35ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0c65b45-3d13-410e-99cf-e6619cf35ba9
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0c65b45-3d13-410e-99cf-e6619cf35ba9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc1a663b-6c07-4510-8eab-87a7fd4beb42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc1a663b-6c07-4510-8eab-87a7fd4beb42
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc1a663b-6c07-4510-8eab-87a7fd4beb42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0f33020-ee41-4356-9ee2-1ef5d1575d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f33020-ee41-4356-9ee2-1ef5d1575d9f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0f33020-ee41-4356-9ee2-1ef5d1575d9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7347723-9882-455e-a067-c9af395085fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7347723-9882-455e-a067-c9af395085fa
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7347723-9882-455e-a067-c9af395085fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c605f3b-f45d-4da2-b1de-fc3d55469a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c605f3b-f45d-4da2-b1de-fc3d55469a0d
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c605f3b-f45d-4da2-b1de-fc3d55469a0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-540cfc16-8131-49f9-a59c-bfaa89999f28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-540cfc16-8131-49f9-a59c-bfaa89999f28
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-540cfc16-8131-49f9-a59c-bfaa89999f28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-637724fc-c9e2-453c-b2a5-f45ad814faee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-637724fc-c9e2-453c-b2a5-f45ad814faee
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-637724fc-c9e2-453c-b2a5-f45ad814faee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-9378f9d1-adb8-4270-a4b6-2e739cbe2c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9378f9d1-adb8-4270-a4b6-2e739cbe2c7d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9378f9d1-adb8-4270-a4b6-2e739cbe2c7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f628c1f-6ca5-4ee5-855b-ff4274879f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f628c1f-6ca5-4ee5-855b-ff4274879f3e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f628c1f-6ca5-4ee5-855b-ff4274879f3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-a663e401-d03b-47a9-a153-fa291559bdc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a663e401-d03b-47a9-a153-fa291559bdc4
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a663e401-d03b-47a9-a153-fa291559bdc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-19b5a96e-33e1-4513-a80b-05ba20a3a7df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19b5a96e-33e1-4513-a80b-05ba20a3a7df
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-19b5a96e-33e1-4513-a80b-05ba20a3a7df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8e3d48c-a979-4f74-9d5d-075335f94555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8e3d48c-a979-4f74-9d5d-075335f94555
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8e3d48c-a979-4f74-9d5d-075335f94555
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-883b219f-faa0-423c-a1a7-0c7031caa926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-883b219f-faa0-423c-a1a7-0c7031caa926
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-883b219f-faa0-423c-a1a7-0c7031caa926
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-493d033c-dc4b-4853-937c-ecdd1af64caf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-493d033c-dc4b-4853-937c-ecdd1af64caf
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-493d033c-dc4b-4853-937c-ecdd1af64caf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1efc742-ba38-4df8-b4d4-bdc492da759b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1efc742-ba38-4df8-b4d4-bdc492da759b
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1efc742-ba38-4df8-b4d4-bdc492da759b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ceefad9-1e16-40c4-b26c-b0651458f8a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ceefad9-1e16-40c4-b26c-b0651458f8a8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ceefad9-1e16-40c4-b26c-b0651458f8a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d4d61ec-53f7-4191-9b7f-266e1737640a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d4d61ec-53f7-4191-9b7f-266e1737640a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d4d61ec-53f7-4191-9b7f-266e1737640a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6fc11d9-d9e6-4599-97cf-67d3a2798016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6fc11d9-d9e6-4599-97cf-67d3a2798016
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6fc11d9-d9e6-4599-97cf-67d3a2798016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d6fc11d9-d9e6-4599-97cf-67d3a2798016"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-a59419ef-18c4-4317-b902-b9f1981594d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a59419ef-18c4-4317-b902-b9f1981594d4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a59419ef-18c4-4317-b902-b9f1981594d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a59419ef-18c4-4317-b902-b9f1981594d4"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-add852b4-d2ec-4e3a-87da-6afba5296a89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-add852b4-d2ec-4e3a-87da-6afba5296a89
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-add852b4-d2ec-4e3a-87da-6afba5296a89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-add852b4-d2ec-4e3a-87da-6afba5296a89"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-e275b041-7985-452d-8462-3ed89f4e482d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e275b041-7985-452d-8462-3ed89f4e482d
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e275b041-7985-452d-8462-3ed89f4e482d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e275b041-7985-452d-8462-3ed89f4e482d"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-c936a2f3-422c-47bd-86fe-4cb092252ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c936a2f3-422c-47bd-86fe-4cb092252ba9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c936a2f3-422c-47bd-86fe-4cb092252ba9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c936a2f3-422c-47bd-86fe-4cb092252ba9"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-45d1a4d0-48e1-4791-aab0-f01c2a37cd1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45d1a4d0-48e1-4791-aab0-f01c2a37cd1e
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45d1a4d0-48e1-4791-aab0-f01c2a37cd1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-45d1a4d0-48e1-4791-aab0-f01c2a37cd1e"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-62924bbe-d6b9-4998-ad41-abfb0d14eb8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62924bbe-d6b9-4998-ad41-abfb0d14eb8a
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62924bbe-d6b9-4998-ad41-abfb0d14eb8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-62924bbe-d6b9-4998-ad41-abfb0d14eb8a"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-90fb1df6-4ff5-4f4c-b117-6e521ffe5c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90fb1df6-4ff5-4f4c-b117-6e521ffe5c14
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90fb1df6-4ff5-4f4c-b117-6e521ffe5c14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-90fb1df6-4ff5-4f4c-b117-6e521ffe5c14"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-a70b4dfa-abde-4c3e-a343-8e8a89a49586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a70b4dfa-abde-4c3e-a343-8e8a89a49586
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a70b4dfa-abde-4c3e-a343-8e8a89a49586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a70b4dfa-abde-4c3e-a343-8e8a89a49586"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-abe9521c-63b2-42b5-b664-5adb2f55b938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe9521c-63b2-42b5-b664-5adb2f55b938
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abe9521c-63b2-42b5-b664-5adb2f55b938
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-abe9521c-63b2-42b5-b664-5adb2f55b938"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea000a45-5a04-442a-8c4d-b614a669eaea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea000a45-5a04-442a-8c4d-b614a669eaea
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea000a45-5a04-442a-8c4d-b614a669eaea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ea000a45-5a04-442a-8c4d-b614a669eaea"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-a14f88b9-df4e-4a4d-8ba1-e0a3b0cd61d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a14f88b9-df4e-4a4d-8ba1-e0a3b0cd61d4
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a14f88b9-df4e-4a4d-8ba1-e0a3b0cd61d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a14f88b9-df4e-4a4d-8ba1-e0a3b0cd61d4"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-3380c540-37c9-4fb8-97d3-5ae6ef2e167f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3380c540-37c9-4fb8-97d3-5ae6ef2e167f
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3380c540-37c9-4fb8-97d3-5ae6ef2e167f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3380c540-37c9-4fb8-97d3-5ae6ef2e167f"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-92442415-47e6-431c-92b7-072f59cb3576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92442415-47e6-431c-92b7-072f59cb3576
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92442415-47e6-431c-92b7-072f59cb3576
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-92442415-47e6-431c-92b7-072f59cb3576"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac06764e-f124-4e96-b903-650659aaedca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac06764e-f124-4e96-b903-650659aaedca
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac06764e-f124-4e96-b903-650659aaedca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ac06764e-f124-4e96-b903-650659aaedca"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-219365e5-da6c-4012-940f-b73172721e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219365e5-da6c-4012-940f-b73172721e57
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-219365e5-da6c-4012-940f-b73172721e57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-219365e5-da6c-4012-940f-b73172721e57"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb4cc520-7fe5-4c36-baa1-e41367c504b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb4cc520-7fe5-4c36-baa1-e41367c504b9
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb4cc520-7fe5-4c36-baa1-e41367c504b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb4cc520-7fe5-4c36-baa1-e41367c504b9"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-31bc5666-913d-4787-becb-fcda4e6b65d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31bc5666-913d-4787-becb-fcda4e6b65d4
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31bc5666-913d-4787-becb-fcda4e6b65d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-31bc5666-913d-4787-becb-fcda4e6b65d4"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-711d2ed7-b423-4079-a5dc-0377fefc9928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-711d2ed7-b423-4079-a5dc-0377fefc9928
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-711d2ed7-b423-4079-a5dc-0377fefc9928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-711d2ed7-b423-4079-a5dc-0377fefc9928"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-13b890e6-445c-4454-9aca-ee0b30cf3492

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b890e6-445c-4454-9aca-ee0b30cf3492
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-13b890e6-445c-4454-9aca-ee0b30cf3492
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5de7fa76-31fd-49e7-9c64-aaeb5a5a6946","handle":"qa-3bfbb2aea9c6","displayName":"QA 3bfbb2aea9c6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.314707886Z"}
```

## 83. DELETE /v1/accounts/me

```text
#83 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9dfdbc5b-0045-4b69-8918-b9be4bf95bc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dfdbc5b-0045-4b69-8918-b9be4bf95bc0
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9dfdbc5b-0045-4b69-8918-b9be4bf95bc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 84. POST /v1/auth/token

```text
#84 POST http://localhost:7070/v1/auth/token
correlation: qa-4f510ae7-086f-4992-a3da-36c89bad56af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f510ae7-086f-4992-a3da-36c89bad56af
Content-Type: application/json

--- request body ---
{"handle":"qa-3bfbb2aea9c6","password":"****"}

--- response: 401 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f510ae7-086f-4992-a3da-36c89bad56af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f510ae7-086f-4992-a3da-36c89bad56af"}
```
