# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 304 | `qa-3be9e52f-751d-4326-ac94-70bc3aa04a53` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-411c24df-171a-451f-bbd1-4c05534d53a0` |
| 3 | `GET /v1/accounts/me` | 200 | 33 | `qa-13905f98-ff6c-4cad-8aab-dfef98522334` |
| 4 | `GET /v1/accounts/me` | 200 | 30 | `qa-81bc1180-aafd-4f52-a79a-42e988a84008` |
| 5 | `GET /v1/accounts/me` | 200 | 20 | `qa-b829b265-1597-4d8b-a800-8728f33851c6` |
| 6 | `GET /v1/accounts/me` | 200 | 14 | `qa-008c4fa0-d68d-40d2-8fd9-5ad14bbd1cee` |
| 7 | `GET /v1/accounts/me` | 200 | 8 | `qa-d6ba2daf-2f09-4199-8f0a-2c0c4ba058ab` |
| 8 | `GET /v1/accounts/me` | 200 | 12 | `qa-308bb5ef-8b8b-48ea-afed-b3939db39f0b` |
| 9 | `GET /v1/accounts/me` | 200 | 14 | `qa-aad6e3ca-c3a8-4462-8d93-e2a0a8eaf469` |
| 10 | `GET /v1/accounts/me` | 200 | 11 | `qa-2ba222ad-8b99-42ae-bdda-60e147d117c2` |
| 11 | `GET /v1/accounts/me` | 200 | 5 | `qa-c3b4e5c3-4018-4834-8144-ad43184117a8` |
| 12 | `GET /v1/accounts/me` | 200 | 6 | `qa-107fab61-b804-41e0-a4c8-45333f149772` |
| 13 | `GET /v1/accounts/me` | 200 | 5 | `qa-db7600c7-5675-4fad-bd13-560d6b41ece3` |
| 14 | `GET /v1/accounts/me` | 200 | 7 | `qa-590c8839-376a-4269-a840-aeaafc257bb0` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-29c850f3-75a5-4d06-bda2-961d21723677` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-e1b50d0b-a0b2-4922-a1a0-6a198a22ca6e` |
| 17 | `GET /v1/accounts/me` | 200 | 5 | `qa-2c3b7f5f-21aa-4913-9461-c04466584258` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-41015903-8452-4b20-9172-72a06d017124` |
| 19 | `GET /v1/accounts/me` | 200 | 7 | `qa-b1250d16-0710-4dce-b142-4d2f5372c717` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-e97637f9-79b2-4690-a233-20db7c9a658c` |
| 21 | `GET /v1/accounts/me` | 200 | 7 | `qa-f307779d-1ff6-45de-abc2-cec15f6afe80` |
| 22 | `GET /v1/accounts/me` | 200 | 12 | `qa-c5029719-a88b-4b36-8f9c-cb041953de96` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-e42d77fb-3446-48d0-9f63-381851686b2f` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-3b9d0d28-57fd-4f99-9e10-38b3ffcb42a1` |
| 25 | `GET /v1/accounts/me` | 200 | 13 | `qa-c163de4e-c6eb-4ede-8a9d-a74a02c25b0f` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-277010e1-aa0a-4d7e-a015-4c573799b964` |
| 27 | `GET /v1/accounts/me` | 200 | 7 | `qa-f25b9fe3-f624-4bbb-90fe-1f04f8b7461a` |
| 28 | `GET /v1/accounts/me` | 200 | 11 | `qa-12fc2c96-23e8-435c-b718-dc1ccf032d82` |
| 29 | `GET /v1/accounts/me` | 200 | 16 | `qa-5255040e-7621-43a5-8e42-6e8204796db8` |
| 30 | `GET /v1/accounts/me` | 200 | 5 | `qa-3f15c90c-7eee-471e-9284-5c074cbfb51f` |
| 31 | `GET /v1/accounts/me` | 200 | 6 | `qa-9d48d9dd-2acc-40e2-a105-85496c360b01` |
| 32 | `GET /v1/accounts/me` | 200 | 4 | `qa-33249bdf-1c58-4ee8-8429-56a36e66dfa1` |
| 33 | `GET /v1/accounts/me` | 200 | 7 | `qa-7d37018c-66b1-4b15-a584-07d5e617bb76` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-41cbb03d-9dd2-4201-ac9c-a1bdf890abfc` |
| 35 | `GET /v1/accounts/me` | 200 | 19 | `qa-7f36d6ca-fd0b-4e78-9993-eae25b772e70` |
| 36 | `GET /v1/accounts/me` | 200 | 13 | `qa-da6c014f-9999-4bf9-81bb-bbb965dafc52` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-59c6c2b3-d3ec-4276-a835-ff04e31227e0` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-f47a4d15-7365-4f66-812d-959bd465c2a7` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-9bb87108-c940-4ace-93bd-fa98cf7359f5` |
| 40 | `GET /v1/accounts/me` | 200 | 4 | `qa-78448f5f-eb90-41a0-a9d8-fc88f8af1ac0` |
| 41 | `GET /v1/accounts/me` | 200 | 4 | `qa-4be15c79-01d5-47f2-bdde-df5095034e57` |
| 42 | `GET /v1/accounts/me` | 200 | 4 | `qa-b9955c03-5213-4688-9b13-ac7230a962c4` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-1146767a-96fd-4797-b592-5cf8a8793de0` |
| 44 | `GET /v1/accounts/me` | 200 | 8 | `qa-6545d0d1-acbd-4a81-9cf5-86eaf288dd02` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-6550cdec-356e-48f5-8abb-b36881e3bf40` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-966dee97-8b01-4e6f-b0fa-a718b3134ded` |
| 47 | `GET /v1/accounts/me` | 200 | 8 | `qa-0e5db3dc-b55e-4be2-8048-b467666891dd` |
| 48 | `GET /v1/accounts/me` | 200 | 11 | `qa-c66928a5-81ca-444e-a688-519a4d1767ab` |
| 49 | `GET /v1/accounts/me` | 200 | 4 | `qa-c8758164-22e1-4d51-8fbd-422b31d3f622` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-3d08cc86-4203-45ba-8675-e4b90a044179` |
| 51 | `GET /v1/accounts/me` | 200 | 3 | `qa-0a030dd5-0bc5-4b7f-ae8b-515ee1dc8feb` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-d7e8e7d7-bf5e-4242-8c9d-a5b4e6df7c81` |
| 53 | `GET /v1/accounts/me` | 200 | 3 | `qa-13799b96-54e0-4c99-81f0-c3f67474364e` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-fb969207-af54-4e4f-bc44-d7cfce0da073` |
| 55 | `GET /v1/accounts/me` | 200 | 4 | `qa-5315f1a9-6633-4898-ba24-85d7a78c16eb` |
| 56 | `GET /v1/accounts/me` | 200 | 4 | `qa-fc72f7b2-d88e-458d-996b-328d5258a471` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-68c0ec1d-dd9e-4aec-ba86-3ad5cd9e89f6` |
| 58 | `GET /v1/accounts/me` | 200 | 3 | `qa-9d2e6839-5423-4857-ab23-d2398da11012` |
| 59 | `GET /v1/accounts/me` | 200 | 3 | `qa-963c2c94-b188-4f12-82fd-235192422fd6` |
| 60 | `GET /v1/accounts/me` | 200 | 3 | `qa-97a362e8-a8b5-45e1-9a33-d61406bd3465` |
| 61 | `GET /v1/accounts/me` | 200 | 3 | `qa-2170537a-7bc5-4b6a-8687-9bb2958b6467` |
| 62 | `GET /v1/accounts/me` | 200 | 3 | `qa-9cc00210-45c3-4c74-8d21-087b005b883d` |
| 63 | `GET /v1/accounts/me` | 429 | 3 | `qa-fb31d16d-77b5-4665-93c7-485a1b551370` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-b0985154-4ae9-49d0-a496-d254b128febd` |
| 65 | `GET /v1/accounts/me` | 429 | 4 | `qa-46472438-fe03-4a9c-9b66-148f46c5215d` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-8e309af9-c2a0-4989-9d62-01c61d7112ee` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-b44d6e23-0cb6-42ce-8f09-1b275cef3c26` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-39bc9b41-c204-49eb-a093-487b950c9003` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-04c734bf-d48c-4a4a-985f-4625dcdc63a8` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-44fe4af0-b9e3-4702-98ef-884136bbb057` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-2e19e1dd-c41c-431b-a1e5-f393fffdfca6` |
| 72 | `GET /v1/accounts/me` | 429 | 3 | `qa-da89c68f-d140-4562-9e05-65f9e2e98dc0` |
| 73 | `GET /v1/accounts/me` | 429 | 3 | `qa-a7ecab84-82af-4fc7-b415-6a8dfced2496` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-5904b6af-c5f7-49e9-aa36-a5a37d7024c8` |
| 75 | `GET /v1/accounts/me` | 429 | 7 | `qa-2e35ca75-6b0c-43d9-9fb5-51f3f7de5991` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-f4de9b7c-a8d8-46dd-8e2c-8c03c0c06766` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-01291529-969e-4708-91a2-9995aa3014e9` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-39725727-72e0-4df8-997f-f3d1b8dd220e` |
| 79 | `GET /v1/accounts/me` | 429 | 3 | `qa-377ad8c6-150d-45c1-aa6c-6316a2212428` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-af985d33-c65c-48af-8ff3-d2bed57830f7` |
| 81 | `GET /v1/accounts/me` | 200 | 3 | `qa-e52a3bdd-e70b-4d90-96e8-305bdb8f903f` |
| 82 | `DELETE /v1/accounts/me` | 204 | 1 | `qa-31245a14-c06d-432d-ac6f-d25a17baa2ff` |
| 83 | `POST /v1/auth/token` | 401 | 2 | `qa-fc92fbe8-5408-4c09-ae5c-d8b7a12511b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3be9e52f-751d-4326-ac94-70bc3aa04a53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3be9e52f-751d-4326-ac94-70bc3aa04a53
Content-Type: application/json

--- request body ---
{"handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","password":"****","region":"eu"}

--- response: 201 in 304 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3be9e52f-751d-4326-ac94-70bc3aa04a53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-c6c9f2a37c1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-411c24df-171a-451f-bbd1-4c05534d53a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-411c24df-171a-451f-bbd1-4c05534d53a0
Content-Type: application/json

--- request body ---
{"handle":"qa-c6c9f2a37c1a","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-411c24df-171a-451f-bbd1-4c05534d53a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-13905f98-ff6c-4cad-8aab-dfef98522334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13905f98-ff6c-4cad-8aab-dfef98522334
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-13905f98-ff6c-4cad-8aab-dfef98522334
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-81bc1180-aafd-4f52-a79a-42e988a84008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81bc1180-aafd-4f52-a79a-42e988a84008
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-81bc1180-aafd-4f52-a79a-42e988a84008
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b829b265-1597-4d8b-a800-8728f33851c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b829b265-1597-4d8b-a800-8728f33851c6
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b829b265-1597-4d8b-a800-8728f33851c6
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-008c4fa0-d68d-40d2-8fd9-5ad14bbd1cee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-008c4fa0-d68d-40d2-8fd9-5ad14bbd1cee
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-008c4fa0-d68d-40d2-8fd9-5ad14bbd1cee
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6ba2daf-2f09-4199-8f0a-2c0c4ba058ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6ba2daf-2f09-4199-8f0a-2c0c4ba058ab
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6ba2daf-2f09-4199-8f0a-2c0c4ba058ab
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-308bb5ef-8b8b-48ea-afed-b3939db39f0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-308bb5ef-8b8b-48ea-afed-b3939db39f0b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-308bb5ef-8b8b-48ea-afed-b3939db39f0b
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-aad6e3ca-c3a8-4462-8d93-e2a0a8eaf469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aad6e3ca-c3a8-4462-8d93-e2a0a8eaf469
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-aad6e3ca-c3a8-4462-8d93-e2a0a8eaf469
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ba222ad-8b99-42ae-bdda-60e147d117c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ba222ad-8b99-42ae-bdda-60e147d117c2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ba222ad-8b99-42ae-bdda-60e147d117c2
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3b4e5c3-4018-4834-8144-ad43184117a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3b4e5c3-4018-4834-8144-ad43184117a8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3b4e5c3-4018-4834-8144-ad43184117a8
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-107fab61-b804-41e0-a4c8-45333f149772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-107fab61-b804-41e0-a4c8-45333f149772
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-107fab61-b804-41e0-a4c8-45333f149772
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-db7600c7-5675-4fad-bd13-560d6b41ece3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db7600c7-5675-4fad-bd13-560d6b41ece3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-db7600c7-5675-4fad-bd13-560d6b41ece3
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-590c8839-376a-4269-a840-aeaafc257bb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-590c8839-376a-4269-a840-aeaafc257bb0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-590c8839-376a-4269-a840-aeaafc257bb0
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-29c850f3-75a5-4d06-bda2-961d21723677

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c850f3-75a5-4d06-bda2-961d21723677
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-29c850f3-75a5-4d06-bda2-961d21723677
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1b50d0b-a0b2-4922-a1a0-6a198a22ca6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1b50d0b-a0b2-4922-a1a0-6a198a22ca6e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1b50d0b-a0b2-4922-a1a0-6a198a22ca6e
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c3b7f5f-21aa-4913-9461-c04466584258

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c3b7f5f-21aa-4913-9461-c04466584258
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c3b7f5f-21aa-4913-9461-c04466584258
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-41015903-8452-4b20-9172-72a06d017124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41015903-8452-4b20-9172-72a06d017124
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-41015903-8452-4b20-9172-72a06d017124
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1250d16-0710-4dce-b142-4d2f5372c717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1250d16-0710-4dce-b142-4d2f5372c717
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1250d16-0710-4dce-b142-4d2f5372c717
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-e97637f9-79b2-4690-a233-20db7c9a658c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e97637f9-79b2-4690-a233-20db7c9a658c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e97637f9-79b2-4690-a233-20db7c9a658c
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-f307779d-1ff6-45de-abc2-cec15f6afe80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f307779d-1ff6-45de-abc2-cec15f6afe80
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f307779d-1ff6-45de-abc2-cec15f6afe80
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5029719-a88b-4b36-8f9c-cb041953de96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5029719-a88b-4b36-8f9c-cb041953de96
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5029719-a88b-4b36-8f9c-cb041953de96
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-e42d77fb-3446-48d0-9f63-381851686b2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42d77fb-3446-48d0-9f63-381851686b2f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e42d77fb-3446-48d0-9f63-381851686b2f
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b9d0d28-57fd-4f99-9e10-38b3ffcb42a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b9d0d28-57fd-4f99-9e10-38b3ffcb42a1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b9d0d28-57fd-4f99-9e10-38b3ffcb42a1
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-c163de4e-c6eb-4ede-8a9d-a74a02c25b0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c163de4e-c6eb-4ede-8a9d-a74a02c25b0f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c163de4e-c6eb-4ede-8a9d-a74a02c25b0f
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-277010e1-aa0a-4d7e-a015-4c573799b964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277010e1-aa0a-4d7e-a015-4c573799b964
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-277010e1-aa0a-4d7e-a015-4c573799b964
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-f25b9fe3-f624-4bbb-90fe-1f04f8b7461a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f25b9fe3-f624-4bbb-90fe-1f04f8b7461a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f25b9fe3-f624-4bbb-90fe-1f04f8b7461a
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-12fc2c96-23e8-435c-b718-dc1ccf032d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12fc2c96-23e8-435c-b718-dc1ccf032d82
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-12fc2c96-23e8-435c-b718-dc1ccf032d82
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-5255040e-7621-43a5-8e42-6e8204796db8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5255040e-7621-43a5-8e42-6e8204796db8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5255040e-7621-43a5-8e42-6e8204796db8
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f15c90c-7eee-471e-9284-5c074cbfb51f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f15c90c-7eee-471e-9284-5c074cbfb51f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f15c90c-7eee-471e-9284-5c074cbfb51f
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d48d9dd-2acc-40e2-a105-85496c360b01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d48d9dd-2acc-40e2-a105-85496c360b01
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d48d9dd-2acc-40e2-a105-85496c360b01
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-33249bdf-1c58-4ee8-8429-56a36e66dfa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33249bdf-1c58-4ee8-8429-56a36e66dfa1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-33249bdf-1c58-4ee8-8429-56a36e66dfa1
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d37018c-66b1-4b15-a584-07d5e617bb76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d37018c-66b1-4b15-a584-07d5e617bb76
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d37018c-66b1-4b15-a584-07d5e617bb76
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-41cbb03d-9dd2-4201-ac9c-a1bdf890abfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41cbb03d-9dd2-4201-ac9c-a1bdf890abfc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-41cbb03d-9dd2-4201-ac9c-a1bdf890abfc
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f36d6ca-fd0b-4e78-9993-eae25b772e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f36d6ca-fd0b-4e78-9993-eae25b772e70
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f36d6ca-fd0b-4e78-9993-eae25b772e70
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-da6c014f-9999-4bf9-81bb-bbb965dafc52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da6c014f-9999-4bf9-81bb-bbb965dafc52
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-da6c014f-9999-4bf9-81bb-bbb965dafc52
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-59c6c2b3-d3ec-4276-a835-ff04e31227e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59c6c2b3-d3ec-4276-a835-ff04e31227e0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-59c6c2b3-d3ec-4276-a835-ff04e31227e0
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-f47a4d15-7365-4f66-812d-959bd465c2a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f47a4d15-7365-4f66-812d-959bd465c2a7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f47a4d15-7365-4f66-812d-959bd465c2a7
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-9bb87108-c940-4ace-93bd-fa98cf7359f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bb87108-c940-4ace-93bd-fa98cf7359f5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bb87108-c940-4ace-93bd-fa98cf7359f5
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-78448f5f-eb90-41a0-a9d8-fc88f8af1ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78448f5f-eb90-41a0-a9d8-fc88f8af1ac0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-78448f5f-eb90-41a0-a9d8-fc88f8af1ac0
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-4be15c79-01d5-47f2-bdde-df5095034e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4be15c79-01d5-47f2-bdde-df5095034e57
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4be15c79-01d5-47f2-bdde-df5095034e57
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9955c03-5213-4688-9b13-ac7230a962c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9955c03-5213-4688-9b13-ac7230a962c4
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9955c03-5213-4688-9b13-ac7230a962c4
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-1146767a-96fd-4797-b592-5cf8a8793de0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1146767a-96fd-4797-b592-5cf8a8793de0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1146767a-96fd-4797-b592-5cf8a8793de0
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-6545d0d1-acbd-4a81-9cf5-86eaf288dd02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6545d0d1-acbd-4a81-9cf5-86eaf288dd02
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6545d0d1-acbd-4a81-9cf5-86eaf288dd02
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-6550cdec-356e-48f5-8abb-b36881e3bf40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6550cdec-356e-48f5-8abb-b36881e3bf40
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6550cdec-356e-48f5-8abb-b36881e3bf40
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-966dee97-8b01-4e6f-b0fa-a718b3134ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-966dee97-8b01-4e6f-b0fa-a718b3134ded
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-966dee97-8b01-4e6f-b0fa-a718b3134ded
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e5db3dc-b55e-4be2-8048-b467666891dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e5db3dc-b55e-4be2-8048-b467666891dd
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e5db3dc-b55e-4be2-8048-b467666891dd
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-c66928a5-81ca-444e-a688-519a4d1767ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c66928a5-81ca-444e-a688-519a4d1767ab
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c66928a5-81ca-444e-a688-519a4d1767ab
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8758164-22e1-4d51-8fbd-422b31d3f622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8758164-22e1-4d51-8fbd-422b31d3f622
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8758164-22e1-4d51-8fbd-422b31d3f622
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d08cc86-4203-45ba-8675-e4b90a044179

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d08cc86-4203-45ba-8675-e4b90a044179
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d08cc86-4203-45ba-8675-e4b90a044179
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a030dd5-0bc5-4b7f-ae8b-515ee1dc8feb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a030dd5-0bc5-4b7f-ae8b-515ee1dc8feb
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a030dd5-0bc5-4b7f-ae8b-515ee1dc8feb
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7e8e7d7-bf5e-4242-8c9d-a5b4e6df7c81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e8e7d7-bf5e-4242-8c9d-a5b4e6df7c81
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7e8e7d7-bf5e-4242-8c9d-a5b4e6df7c81
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-13799b96-54e0-4c99-81f0-c3f67474364e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13799b96-54e0-4c99-81f0-c3f67474364e
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-13799b96-54e0-4c99-81f0-c3f67474364e
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb969207-af54-4e4f-bc44-d7cfce0da073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb969207-af54-4e4f-bc44-d7cfce0da073
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb969207-af54-4e4f-bc44-d7cfce0da073
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-5315f1a9-6633-4898-ba24-85d7a78c16eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5315f1a9-6633-4898-ba24-85d7a78c16eb
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5315f1a9-6633-4898-ba24-85d7a78c16eb
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc72f7b2-d88e-458d-996b-328d5258a471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc72f7b2-d88e-458d-996b-328d5258a471
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc72f7b2-d88e-458d-996b-328d5258a471
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-68c0ec1d-dd9e-4aec-ba86-3ad5cd9e89f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68c0ec1d-dd9e-4aec-ba86-3ad5cd9e89f6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-68c0ec1d-dd9e-4aec-ba86-3ad5cd9e89f6
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d2e6839-5423-4857-ab23-d2398da11012

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d2e6839-5423-4857-ab23-d2398da11012
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d2e6839-5423-4857-ab23-d2398da11012
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-963c2c94-b188-4f12-82fd-235192422fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-963c2c94-b188-4f12-82fd-235192422fd6
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-963c2c94-b188-4f12-82fd-235192422fd6
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-97a362e8-a8b5-45e1-9a33-d61406bd3465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a362e8-a8b5-45e1-9a33-d61406bd3465
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-97a362e8-a8b5-45e1-9a33-d61406bd3465
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-2170537a-7bc5-4b6a-8687-9bb2958b6467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2170537a-7bc5-4b6a-8687-9bb2958b6467
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2170537a-7bc5-4b6a-8687-9bb2958b6467
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cc00210-45c3-4c74-8d21-087b005b883d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cc00210-45c3-4c74-8d21-087b005b883d
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cc00210-45c3-4c74-8d21-087b005b883d
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb31d16d-77b5-4665-93c7-485a1b551370

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb31d16d-77b5-4665-93c7-485a1b551370
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb31d16d-77b5-4665-93c7-485a1b551370
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fb31d16d-77b5-4665-93c7-485a1b551370"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0985154-4ae9-49d0-a496-d254b128febd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0985154-4ae9-49d0-a496-d254b128febd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0985154-4ae9-49d0-a496-d254b128febd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0985154-4ae9-49d0-a496-d254b128febd"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-46472438-fe03-4a9c-9b66-148f46c5215d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46472438-fe03-4a9c-9b66-148f46c5215d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46472438-fe03-4a9c-9b66-148f46c5215d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-46472438-fe03-4a9c-9b66-148f46c5215d"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e309af9-c2a0-4989-9d62-01c61d7112ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e309af9-c2a0-4989-9d62-01c61d7112ee
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e309af9-c2a0-4989-9d62-01c61d7112ee
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8e309af9-c2a0-4989-9d62-01c61d7112ee"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-b44d6e23-0cb6-42ce-8f09-1b275cef3c26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b44d6e23-0cb6-42ce-8f09-1b275cef3c26
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b44d6e23-0cb6-42ce-8f09-1b275cef3c26
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b44d6e23-0cb6-42ce-8f09-1b275cef3c26"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-39bc9b41-c204-49eb-a093-487b950c9003

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39bc9b41-c204-49eb-a093-487b950c9003
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39bc9b41-c204-49eb-a093-487b950c9003
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-39bc9b41-c204-49eb-a093-487b950c9003"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-04c734bf-d48c-4a4a-985f-4625dcdc63a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04c734bf-d48c-4a4a-985f-4625dcdc63a8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04c734bf-d48c-4a4a-985f-4625dcdc63a8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-04c734bf-d48c-4a4a-985f-4625dcdc63a8"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-44fe4af0-b9e3-4702-98ef-884136bbb057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44fe4af0-b9e3-4702-98ef-884136bbb057
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44fe4af0-b9e3-4702-98ef-884136bbb057
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-44fe4af0-b9e3-4702-98ef-884136bbb057"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e19e1dd-c41c-431b-a1e5-f393fffdfca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e19e1dd-c41c-431b-a1e5-f393fffdfca6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e19e1dd-c41c-431b-a1e5-f393fffdfca6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2e19e1dd-c41c-431b-a1e5-f393fffdfca6"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-da89c68f-d140-4562-9e05-65f9e2e98dc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da89c68f-d140-4562-9e05-65f9e2e98dc0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da89c68f-d140-4562-9e05-65f9e2e98dc0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-da89c68f-d140-4562-9e05-65f9e2e98dc0"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7ecab84-82af-4fc7-b415-6a8dfced2496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7ecab84-82af-4fc7-b415-6a8dfced2496
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7ecab84-82af-4fc7-b415-6a8dfced2496
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a7ecab84-82af-4fc7-b415-6a8dfced2496"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-5904b6af-c5f7-49e9-aa36-a5a37d7024c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5904b6af-c5f7-49e9-aa36-a5a37d7024c8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5904b6af-c5f7-49e9-aa36-a5a37d7024c8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5904b6af-c5f7-49e9-aa36-a5a37d7024c8"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e35ca75-6b0c-43d9-9fb5-51f3f7de5991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e35ca75-6b0c-43d9-9fb5-51f3f7de5991
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e35ca75-6b0c-43d9-9fb5-51f3f7de5991
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2e35ca75-6b0c-43d9-9fb5-51f3f7de5991"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4de9b7c-a8d8-46dd-8e2c-8c03c0c06766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4de9b7c-a8d8-46dd-8e2c-8c03c0c06766
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4de9b7c-a8d8-46dd-8e2c-8c03c0c06766
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f4de9b7c-a8d8-46dd-8e2c-8c03c0c06766"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-01291529-969e-4708-91a2-9995aa3014e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01291529-969e-4708-91a2-9995aa3014e9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01291529-969e-4708-91a2-9995aa3014e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-01291529-969e-4708-91a2-9995aa3014e9"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-39725727-72e0-4df8-997f-f3d1b8dd220e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39725727-72e0-4df8-997f-f3d1b8dd220e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39725727-72e0-4df8-997f-f3d1b8dd220e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-39725727-72e0-4df8-997f-f3d1b8dd220e"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-377ad8c6-150d-45c1-aa6c-6316a2212428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-377ad8c6-150d-45c1-aa6c-6316a2212428
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-377ad8c6-150d-45c1-aa6c-6316a2212428
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-377ad8c6-150d-45c1-aa6c-6316a2212428"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-af985d33-c65c-48af-8ff3-d2bed57830f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af985d33-c65c-48af-8ff3-d2bed57830f7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af985d33-c65c-48af-8ff3-d2bed57830f7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-af985d33-c65c-48af-8ff3-d2bed57830f7"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-e52a3bdd-e70b-4d90-96e8-305bdb8f903f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e52a3bdd-e70b-4d90-96e8-305bdb8f903f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e52a3bdd-e70b-4d90-96e8-305bdb8f903f
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

{"id":"acc_a13e1ade-ffa3-4d35-8780-22bf8ceb4ce5","handle":"qa-c6c9f2a37c1a","displayName":"QA c6c9f2a37c1a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.093027074Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31245a14-c06d-432d-ac6f-d25a17baa2ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31245a14-c06d-432d-ac6f-d25a17baa2ff
Content-Type: application/json

--- response: 204 in 1 ms ---
Date: Sat, 07 Nov 2026 08:55:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31245a14-c06d-432d-ac6f-d25a17baa2ff
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-fc92fbe8-5408-4c09-ae5c-d8b7a12511b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc92fbe8-5408-4c09-ae5c-d8b7a12511b4
Content-Type: application/json

--- request body ---
{"handle":"qa-c6c9f2a37c1a","password":"****"}

--- response: 401 in 2 ms ---
Date: Sat, 07 Nov 2026 08:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc92fbe8-5408-4c09-ae5c-d8b7a12511b4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc92fbe8-5408-4c09-ae5c-d8b7a12511b4"}
```
