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
| 1 | `POST /v1/accounts` | 201 | 383 | `qa-54185443-20a0-4f17-88f0-5f946bd2313a` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-e15b767f-74c1-4f13-87a2-0fe924ba7063` |
| 3 | `GET /v1/accounts/me` | 200 | 41 | `qa-8c8ec514-f66b-401e-8dd5-79c7997ce56a` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-307d961c-21d2-4c64-b0fd-c102572ceac2` |
| 5 | `GET /v1/accounts/me` | 200 | 9 | `qa-b7e91376-efea-461b-a16e-11fc89373999` |
| 6 | `GET /v1/accounts/me` | 200 | 12 | `qa-06b6f5cc-de75-4b76-a2f7-56dfcd8472a2` |
| 7 | `GET /v1/accounts/me` | 200 | 10 | `qa-bbdb4f0e-470b-42cd-8390-bbb1b5a1968c` |
| 8 | `GET /v1/accounts/me` | 200 | 8 | `qa-d0b53ab4-46af-46c8-a462-df612e7ea045` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-bae1360c-e7cb-449e-a78d-c9cfb7b2baa7` |
| 10 | `GET /v1/accounts/me` | 200 | 38 | `qa-ff5cb1b1-7936-4629-9df4-d48b52fe37f2` |
| 11 | `GET /v1/accounts/me` | 200 | 19 | `qa-f297bcf8-a124-4934-8fc9-90016040ece9` |
| 12 | `GET /v1/accounts/me` | 200 | 9 | `qa-f5207833-ba31-4779-91b0-5bc8bed05760` |
| 13 | `GET /v1/accounts/me` | 200 | 10 | `qa-a8a0b000-f9ca-4afa-9e1d-c56125fc2c4c` |
| 14 | `GET /v1/accounts/me` | 200 | 16 | `qa-b9a894b5-02d1-4390-a926-e023abe199e2` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-aba7aa8c-5163-4059-811e-bade23b836a2` |
| 16 | `GET /v1/accounts/me` | 200 | 10 | `qa-d23d32fc-b418-419b-83fd-acada943d49d` |
| 17 | `GET /v1/accounts/me` | 200 | 16 | `qa-4bb423f9-9a25-4de3-afbe-680d405998bd` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-9dcdad59-fad5-4610-8971-adb9d18c1bb4` |
| 19 | `GET /v1/accounts/me` | 200 | 11 | `qa-5b7e2623-d476-4ca1-9ed7-90b8f75b3e21` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-94fc6f41-e373-4c59-b546-575e0cb2becd` |
| 21 | `GET /v1/accounts/me` | 200 | 10 | `qa-4c3eb661-5312-4e56-a341-97432437c9d9` |
| 22 | `GET /v1/accounts/me` | 200 | 9 | `qa-20a33d90-8982-4eb1-b59a-3c8b717af34b` |
| 23 | `GET /v1/accounts/me` | 200 | 17 | `qa-63732810-ca5e-4108-89d5-f9d5c2e30974` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-da4373c1-e7a8-4e7d-bc7a-0972723d0a94` |
| 25 | `GET /v1/accounts/me` | 200 | 5 | `qa-a03b52f6-3b7d-4a28-bc95-67f0b066002f` |
| 26 | `GET /v1/accounts/me` | 200 | 7 | `qa-a58145a6-7803-483f-a177-2e394e6854e2` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-fff3da8d-808c-4d20-9dda-f0153f5dc41f` |
| 28 | `GET /v1/accounts/me` | 200 | 8 | `qa-ca66d687-1f37-4b93-a074-e9c628881311` |
| 29 | `GET /v1/accounts/me` | 200 | 6 | `qa-d21afb32-905f-4f81-9632-273c83b9243a` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-7af549ea-9584-4397-bb48-e640c6487d7f` |
| 31 | `GET /v1/accounts/me` | 200 | 8 | `qa-d9eb5e76-73be-4629-baac-9ee1ddb197fb` |
| 32 | `GET /v1/accounts/me` | 200 | 7 | `qa-4409741e-da95-48a8-b4e5-d5e92c781a0d` |
| 33 | `GET /v1/accounts/me` | 200 | 7 | `qa-abff4869-55c5-4699-817a-aef5e1f19e2c` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-9fba35ae-7977-4610-a6b6-ec33acb84225` |
| 35 | `GET /v1/accounts/me` | 200 | 6 | `qa-0fe19d82-29b4-4abd-871d-51f82daf603a` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-3857a2de-1d55-417c-95cf-96619585bfa6` |
| 37 | `GET /v1/accounts/me` | 200 | 6 | `qa-b3711bfc-5b21-4166-8142-093e1aabaf4c` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-e1aca8ad-73d5-4e7a-b8be-7cfdf70ebe27` |
| 39 | `GET /v1/accounts/me` | 200 | 16 | `qa-f34414c3-a851-447c-8486-7e9dc77d6fed` |
| 40 | `GET /v1/accounts/me` | 200 | 25 | `qa-71f8b2f6-c205-4db1-822b-6b2c7693d58a` |
| 41 | `GET /v1/accounts/me` | 200 | 8 | `qa-4e4a27a8-59d0-4d33-9e90-6f858898cb95` |
| 42 | `GET /v1/accounts/me` | 200 | 9 | `qa-a0fd9005-91f2-4e5a-acbd-56f8976882df` |
| 43 | `GET /v1/accounts/me` | 200 | 7 | `qa-6e4d839e-d5a9-4433-a69c-51192c682a4b` |
| 44 | `GET /v1/accounts/me` | 200 | 13 | `qa-6a5a693a-fb18-4a0f-9021-6c13ce163c77` |
| 45 | `GET /v1/accounts/me` | 200 | 8 | `qa-096c66b9-186d-4ac6-9dc1-8c733b652bfc` |
| 46 | `GET /v1/accounts/me` | 200 | 8 | `qa-4472f812-eb83-4119-b2c2-8d2c9e2d0748` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-60611b27-b4cd-4d79-b83d-d876ac905807` |
| 48 | `GET /v1/accounts/me` | 200 | 8 | `qa-69f595e8-a081-4ecd-a1b4-2b6e70335f85` |
| 49 | `GET /v1/accounts/me` | 200 | 9 | `qa-1bd9bb87-99ac-4ce1-8759-8198aefa1cfe` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-f4282c63-e6cf-4656-b3fc-c7147627bdeb` |
| 51 | `GET /v1/accounts/me` | 200 | 12 | `qa-0d1759c3-9ff0-4976-87b6-0dc56ac1e4b1` |
| 52 | `GET /v1/accounts/me` | 200 | 6 | `qa-f1ef4a9b-13b7-4e28-bb85-d7933f9d7fba` |
| 53 | `GET /v1/accounts/me` | 200 | 11 | `qa-f4fdb209-5626-48a0-9639-892ce8c3fd77` |
| 54 | `GET /v1/accounts/me` | 200 | 15 | `qa-1bddc634-d57a-47c7-abd6-3fc77fa3ac93` |
| 55 | `GET /v1/accounts/me` | 200 | 10 | `qa-d6a60b9c-5edb-4614-9422-f8c4711c2470` |
| 56 | `GET /v1/accounts/me` | 200 | 11 | `qa-73066ae1-34bc-4371-9b16-c682ddd7be44` |
| 57 | `GET /v1/accounts/me` | 200 | 28 | `qa-2172bb63-f594-4813-99c5-8f3a696b9ea6` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-b0c36c73-e339-40b6-9514-562b0937b1a6` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-247118a0-40bf-4a0b-8628-889f55d0a62b` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-10ef9e14-f666-4212-93bf-ab45ca76c58b` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-e365880d-af80-4115-9bc3-2cd042a169b0` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-749161b5-4b2f-4171-82f5-4c960b722102` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-b16ebb02-fbbf-4f23-bc32-45276c68314a` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-99229b11-4cab-4a76-8875-2ef7a5e33dc4` |
| 65 | `GET /v1/accounts/me` | 429 | 8 | `qa-6f1fb4d6-2733-470f-9d36-85f5b10d317c` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-50a09522-a0c1-48c2-842c-217d4a10fdc6` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-0c289f11-c8ff-40e9-85ba-7347eb18523a` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-cc21d8bf-29c6-4c89-ab73-6a0c0decc8b2` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-9ea06be9-e281-40ed-a7d8-128dcfea62e6` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-d23fbe3b-968b-423c-8df3-0d66c6743860` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-354e856c-2336-4ba0-869b-691f1bdc9399` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-4a898e3a-66ac-48ef-9aa1-390f0a55e645` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-7bbed544-27ed-4a99-8e4f-47a47dd471ff` |
| 74 | `GET /v1/accounts/me` | 429 | 5 | `qa-ae194564-7e51-4e9d-a0ba-50cac22bb339` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-5f9f6fde-cbfe-4fc0-9f93-212d392e461b` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-d5934901-53a1-41e3-8222-c3cef3a8fa16` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-8c30e261-5a35-4df0-8966-21e451fe5a8a` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-646e3ba3-7e8c-4201-9152-f88fd5c31fd6` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-c123416d-4496-4daf-9b3c-82171c4e8d69` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-a7a498b8-ffff-4d89-ae8e-2cf98269eaf0` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-e91b32f8-7862-478b-bddd-c5a2b0e33cf3` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-bb71b2fa-c0a1-4a80-88ad-81bc262aca76` |
| 83 | `POST /v1/auth/token` | 401 | 4 | `qa-c4c00544-49a6-473f-b867-fa07743a34f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54185443-20a0-4f17-88f0-5f946bd2313a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54185443-20a0-4f17-88f0-5f946bd2313a
Content-Type: application/json

--- request body ---
{"handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","password":"****","region":"eu"}

--- response: 201 in 383 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-54185443-20a0-4f17-88f0-5f946bd2313a
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
Location: /v1/accounts/qa-c3ea3690c5de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e15b767f-74c1-4f13-87a2-0fe924ba7063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e15b767f-74c1-4f13-87a2-0fe924ba7063
Content-Type: application/json

--- request body ---
{"handle":"qa-c3ea3690c5de","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e15b767f-74c1-4f13-87a2-0fe924ba7063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c8ec514-f66b-401e-8dd5-79c7997ce56a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c8ec514-f66b-401e-8dd5-79c7997ce56a
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c8ec514-f66b-401e-8dd5-79c7997ce56a
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-307d961c-21d2-4c64-b0fd-c102572ceac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-307d961c-21d2-4c64-b0fd-c102572ceac2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-307d961c-21d2-4c64-b0fd-c102572ceac2
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7e91376-efea-461b-a16e-11fc89373999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7e91376-efea-461b-a16e-11fc89373999
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7e91376-efea-461b-a16e-11fc89373999
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-06b6f5cc-de75-4b76-a2f7-56dfcd8472a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b6f5cc-de75-4b76-a2f7-56dfcd8472a2
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-06b6f5cc-de75-4b76-a2f7-56dfcd8472a2
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbdb4f0e-470b-42cd-8390-bbb1b5a1968c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbdb4f0e-470b-42cd-8390-bbb1b5a1968c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbdb4f0e-470b-42cd-8390-bbb1b5a1968c
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0b53ab4-46af-46c8-a462-df612e7ea045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0b53ab4-46af-46c8-a462-df612e7ea045
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0b53ab4-46af-46c8-a462-df612e7ea045
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-bae1360c-e7cb-449e-a78d-c9cfb7b2baa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bae1360c-e7cb-449e-a78d-c9cfb7b2baa7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bae1360c-e7cb-449e-a78d-c9cfb7b2baa7
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff5cb1b1-7936-4629-9df4-d48b52fe37f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff5cb1b1-7936-4629-9df4-d48b52fe37f2
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff5cb1b1-7936-4629-9df4-d48b52fe37f2
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-f297bcf8-a124-4934-8fc9-90016040ece9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f297bcf8-a124-4934-8fc9-90016040ece9
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f297bcf8-a124-4934-8fc9-90016040ece9
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5207833-ba31-4779-91b0-5bc8bed05760

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5207833-ba31-4779-91b0-5bc8bed05760
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5207833-ba31-4779-91b0-5bc8bed05760
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8a0b000-f9ca-4afa-9e1d-c56125fc2c4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8a0b000-f9ca-4afa-9e1d-c56125fc2c4c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8a0b000-f9ca-4afa-9e1d-c56125fc2c4c
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9a894b5-02d1-4390-a926-e023abe199e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9a894b5-02d1-4390-a926-e023abe199e2
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9a894b5-02d1-4390-a926-e023abe199e2
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-aba7aa8c-5163-4059-811e-bade23b836a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aba7aa8c-5163-4059-811e-bade23b836a2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-aba7aa8c-5163-4059-811e-bade23b836a2
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-d23d32fc-b418-419b-83fd-acada943d49d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d23d32fc-b418-419b-83fd-acada943d49d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d23d32fc-b418-419b-83fd-acada943d49d
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-4bb423f9-9a25-4de3-afbe-680d405998bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bb423f9-9a25-4de3-afbe-680d405998bd
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bb423f9-9a25-4de3-afbe-680d405998bd
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-9dcdad59-fad5-4610-8971-adb9d18c1bb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dcdad59-fad5-4610-8971-adb9d18c1bb4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dcdad59-fad5-4610-8971-adb9d18c1bb4
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b7e2623-d476-4ca1-9ed7-90b8f75b3e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b7e2623-d476-4ca1-9ed7-90b8f75b3e21
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b7e2623-d476-4ca1-9ed7-90b8f75b3e21
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-94fc6f41-e373-4c59-b546-575e0cb2becd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94fc6f41-e373-4c59-b546-575e0cb2becd
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-94fc6f41-e373-4c59-b546-575e0cb2becd
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c3eb661-5312-4e56-a341-97432437c9d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c3eb661-5312-4e56-a341-97432437c9d9
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c3eb661-5312-4e56-a341-97432437c9d9
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-20a33d90-8982-4eb1-b59a-3c8b717af34b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20a33d90-8982-4eb1-b59a-3c8b717af34b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-20a33d90-8982-4eb1-b59a-3c8b717af34b
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-63732810-ca5e-4108-89d5-f9d5c2e30974

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63732810-ca5e-4108-89d5-f9d5c2e30974
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-63732810-ca5e-4108-89d5-f9d5c2e30974
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-da4373c1-e7a8-4e7d-bc7a-0972723d0a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da4373c1-e7a8-4e7d-bc7a-0972723d0a94
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-da4373c1-e7a8-4e7d-bc7a-0972723d0a94
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-a03b52f6-3b7d-4a28-bc95-67f0b066002f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a03b52f6-3b7d-4a28-bc95-67f0b066002f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a03b52f6-3b7d-4a28-bc95-67f0b066002f
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-a58145a6-7803-483f-a177-2e394e6854e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a58145a6-7803-483f-a177-2e394e6854e2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a58145a6-7803-483f-a177-2e394e6854e2
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-fff3da8d-808c-4d20-9dda-f0153f5dc41f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fff3da8d-808c-4d20-9dda-f0153f5dc41f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-fff3da8d-808c-4d20-9dda-f0153f5dc41f
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca66d687-1f37-4b93-a074-e9c628881311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca66d687-1f37-4b93-a074-e9c628881311
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca66d687-1f37-4b93-a074-e9c628881311
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-d21afb32-905f-4f81-9632-273c83b9243a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d21afb32-905f-4f81-9632-273c83b9243a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d21afb32-905f-4f81-9632-273c83b9243a
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-7af549ea-9584-4397-bb48-e640c6487d7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7af549ea-9584-4397-bb48-e640c6487d7f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-7af549ea-9584-4397-bb48-e640c6487d7f
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9eb5e76-73be-4629-baac-9ee1ddb197fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9eb5e76-73be-4629-baac-9ee1ddb197fb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9eb5e76-73be-4629-baac-9ee1ddb197fb
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-4409741e-da95-48a8-b4e5-d5e92c781a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4409741e-da95-48a8-b4e5-d5e92c781a0d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4409741e-da95-48a8-b4e5-d5e92c781a0d
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-abff4869-55c5-4699-817a-aef5e1f19e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abff4869-55c5-4699-817a-aef5e1f19e2c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-abff4869-55c5-4699-817a-aef5e1f19e2c
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fba35ae-7977-4610-a6b6-ec33acb84225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fba35ae-7977-4610-a6b6-ec33acb84225
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fba35ae-7977-4610-a6b6-ec33acb84225
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fe19d82-29b4-4abd-871d-51f82daf603a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fe19d82-29b4-4abd-871d-51f82daf603a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fe19d82-29b4-4abd-871d-51f82daf603a
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-3857a2de-1d55-417c-95cf-96619585bfa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3857a2de-1d55-417c-95cf-96619585bfa6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3857a2de-1d55-417c-95cf-96619585bfa6
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3711bfc-5b21-4166-8142-093e1aabaf4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3711bfc-5b21-4166-8142-093e1aabaf4c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3711bfc-5b21-4166-8142-093e1aabaf4c
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1aca8ad-73d5-4e7a-b8be-7cfdf70ebe27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1aca8ad-73d5-4e7a-b8be-7cfdf70ebe27
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1aca8ad-73d5-4e7a-b8be-7cfdf70ebe27
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-f34414c3-a851-447c-8486-7e9dc77d6fed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f34414c3-a851-447c-8486-7e9dc77d6fed
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f34414c3-a851-447c-8486-7e9dc77d6fed
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-71f8b2f6-c205-4db1-822b-6b2c7693d58a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f8b2f6-c205-4db1-822b-6b2c7693d58a
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-71f8b2f6-c205-4db1-822b-6b2c7693d58a
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e4a27a8-59d0-4d33-9e90-6f858898cb95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e4a27a8-59d0-4d33-9e90-6f858898cb95
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e4a27a8-59d0-4d33-9e90-6f858898cb95
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0fd9005-91f2-4e5a-acbd-56f8976882df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0fd9005-91f2-4e5a-acbd-56f8976882df
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0fd9005-91f2-4e5a-acbd-56f8976882df
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e4d839e-d5a9-4433-a69c-51192c682a4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4d839e-d5a9-4433-a69c-51192c682a4b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e4d839e-d5a9-4433-a69c-51192c682a4b
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a5a693a-fb18-4a0f-9021-6c13ce163c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a5a693a-fb18-4a0f-9021-6c13ce163c77
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a5a693a-fb18-4a0f-9021-6c13ce163c77
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-096c66b9-186d-4ac6-9dc1-8c733b652bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-096c66b9-186d-4ac6-9dc1-8c733b652bfc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-096c66b9-186d-4ac6-9dc1-8c733b652bfc
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-4472f812-eb83-4119-b2c2-8d2c9e2d0748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4472f812-eb83-4119-b2c2-8d2c9e2d0748
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4472f812-eb83-4119-b2c2-8d2c9e2d0748
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-60611b27-b4cd-4d79-b83d-d876ac905807

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60611b27-b4cd-4d79-b83d-d876ac905807
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-60611b27-b4cd-4d79-b83d-d876ac905807
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-69f595e8-a081-4ecd-a1b4-2b6e70335f85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69f595e8-a081-4ecd-a1b4-2b6e70335f85
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-69f595e8-a081-4ecd-a1b4-2b6e70335f85
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bd9bb87-99ac-4ce1-8759-8198aefa1cfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bd9bb87-99ac-4ce1-8759-8198aefa1cfe
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bd9bb87-99ac-4ce1-8759-8198aefa1cfe
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4282c63-e6cf-4656-b3fc-c7147627bdeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4282c63-e6cf-4656-b3fc-c7147627bdeb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4282c63-e6cf-4656-b3fc-c7147627bdeb
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d1759c3-9ff0-4976-87b6-0dc56ac1e4b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d1759c3-9ff0-4976-87b6-0dc56ac1e4b1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d1759c3-9ff0-4976-87b6-0dc56ac1e4b1
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1ef4a9b-13b7-4e28-bb85-d7933f9d7fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1ef4a9b-13b7-4e28-bb85-d7933f9d7fba
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1ef4a9b-13b7-4e28-bb85-d7933f9d7fba
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4fdb209-5626-48a0-9639-892ce8c3fd77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4fdb209-5626-48a0-9639-892ce8c3fd77
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4fdb209-5626-48a0-9639-892ce8c3fd77
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bddc634-d57a-47c7-abd6-3fc77fa3ac93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bddc634-d57a-47c7-abd6-3fc77fa3ac93
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bddc634-d57a-47c7-abd6-3fc77fa3ac93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6a60b9c-5edb-4614-9422-f8c4711c2470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6a60b9c-5edb-4614-9422-f8c4711c2470
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6a60b9c-5edb-4614-9422-f8c4711c2470
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-73066ae1-34bc-4371-9b16-c682ddd7be44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73066ae1-34bc-4371-9b16-c682ddd7be44
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-73066ae1-34bc-4371-9b16-c682ddd7be44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-2172bb63-f594-4813-99c5-8f3a696b9ea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2172bb63-f594-4813-99c5-8f3a696b9ea6
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-2172bb63-f594-4813-99c5-8f3a696b9ea6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0c36c73-e339-40b6-9514-562b0937b1a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0c36c73-e339-40b6-9514-562b0937b1a6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0c36c73-e339-40b6-9514-562b0937b1a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-247118a0-40bf-4a0b-8628-889f55d0a62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-247118a0-40bf-4a0b-8628-889f55d0a62b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-247118a0-40bf-4a0b-8628-889f55d0a62b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-10ef9e14-f666-4212-93bf-ab45ca76c58b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ef9e14-f666-4212-93bf-ab45ca76c58b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ef9e14-f666-4212-93bf-ab45ca76c58b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-e365880d-af80-4115-9bc3-2cd042a169b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e365880d-af80-4115-9bc3-2cd042a169b0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e365880d-af80-4115-9bc3-2cd042a169b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-749161b5-4b2f-4171-82f5-4c960b722102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-749161b5-4b2f-4171-82f5-4c960b722102
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-749161b5-4b2f-4171-82f5-4c960b722102
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-b16ebb02-fbbf-4f23-bc32-45276c68314a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16ebb02-fbbf-4f23-bc32-45276c68314a
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b16ebb02-fbbf-4f23-bc32-45276c68314a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b16ebb02-fbbf-4f23-bc32-45276c68314a"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-99229b11-4cab-4a76-8875-2ef7a5e33dc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99229b11-4cab-4a76-8875-2ef7a5e33dc4
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99229b11-4cab-4a76-8875-2ef7a5e33dc4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-99229b11-4cab-4a76-8875-2ef7a5e33dc4"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f1fb4d6-2733-470f-9d36-85f5b10d317c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f1fb4d6-2733-470f-9d36-85f5b10d317c
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f1fb4d6-2733-470f-9d36-85f5b10d317c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6f1fb4d6-2733-470f-9d36-85f5b10d317c"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-50a09522-a0c1-48c2-842c-217d4a10fdc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50a09522-a0c1-48c2-842c-217d4a10fdc6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50a09522-a0c1-48c2-842c-217d4a10fdc6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-50a09522-a0c1-48c2-842c-217d4a10fdc6"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c289f11-c8ff-40e9-85ba-7347eb18523a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c289f11-c8ff-40e9-85ba-7347eb18523a
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c289f11-c8ff-40e9-85ba-7347eb18523a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0c289f11-c8ff-40e9-85ba-7347eb18523a"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc21d8bf-29c6-4c89-ab73-6a0c0decc8b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc21d8bf-29c6-4c89-ab73-6a0c0decc8b2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc21d8bf-29c6-4c89-ab73-6a0c0decc8b2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cc21d8bf-29c6-4c89-ab73-6a0c0decc8b2"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ea06be9-e281-40ed-a7d8-128dcfea62e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ea06be9-e281-40ed-a7d8-128dcfea62e6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ea06be9-e281-40ed-a7d8-128dcfea62e6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9ea06be9-e281-40ed-a7d8-128dcfea62e6"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-d23fbe3b-968b-423c-8df3-0d66c6743860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d23fbe3b-968b-423c-8df3-0d66c6743860
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d23fbe3b-968b-423c-8df3-0d66c6743860
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d23fbe3b-968b-423c-8df3-0d66c6743860"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-354e856c-2336-4ba0-869b-691f1bdc9399

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-354e856c-2336-4ba0-869b-691f1bdc9399
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-354e856c-2336-4ba0-869b-691f1bdc9399
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-354e856c-2336-4ba0-869b-691f1bdc9399"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a898e3a-66ac-48ef-9aa1-390f0a55e645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a898e3a-66ac-48ef-9aa1-390f0a55e645
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a898e3a-66ac-48ef-9aa1-390f0a55e645
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4a898e3a-66ac-48ef-9aa1-390f0a55e645"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bbed544-27ed-4a99-8e4f-47a47dd471ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bbed544-27ed-4a99-8e4f-47a47dd471ff
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bbed544-27ed-4a99-8e4f-47a47dd471ff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7bbed544-27ed-4a99-8e4f-47a47dd471ff"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae194564-7e51-4e9d-a0ba-50cac22bb339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae194564-7e51-4e9d-a0ba-50cac22bb339
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae194564-7e51-4e9d-a0ba-50cac22bb339
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ae194564-7e51-4e9d-a0ba-50cac22bb339"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f9f6fde-cbfe-4fc0-9f93-212d392e461b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f9f6fde-cbfe-4fc0-9f93-212d392e461b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f9f6fde-cbfe-4fc0-9f93-212d392e461b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5f9f6fde-cbfe-4fc0-9f93-212d392e461b"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5934901-53a1-41e3-8222-c3cef3a8fa16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5934901-53a1-41e3-8222-c3cef3a8fa16
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5934901-53a1-41e3-8222-c3cef3a8fa16
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d5934901-53a1-41e3-8222-c3cef3a8fa16"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c30e261-5a35-4df0-8966-21e451fe5a8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c30e261-5a35-4df0-8966-21e451fe5a8a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c30e261-5a35-4df0-8966-21e451fe5a8a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8c30e261-5a35-4df0-8966-21e451fe5a8a"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-646e3ba3-7e8c-4201-9152-f88fd5c31fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-646e3ba3-7e8c-4201-9152-f88fd5c31fd6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-646e3ba3-7e8c-4201-9152-f88fd5c31fd6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-646e3ba3-7e8c-4201-9152-f88fd5c31fd6"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-c123416d-4496-4daf-9b3c-82171c4e8d69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c123416d-4496-4daf-9b3c-82171c4e8d69
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c123416d-4496-4daf-9b3c-82171c4e8d69
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c123416d-4496-4daf-9b3c-82171c4e8d69"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7a498b8-ffff-4d89-ae8e-2cf98269eaf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7a498b8-ffff-4d89-ae8e-2cf98269eaf0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7a498b8-ffff-4d89-ae8e-2cf98269eaf0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a7a498b8-ffff-4d89-ae8e-2cf98269eaf0"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-e91b32f8-7862-478b-bddd-c5a2b0e33cf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e91b32f8-7862-478b-bddd-c5a2b0e33cf3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e91b32f8-7862-478b-bddd-c5a2b0e33cf3
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

{"id":"acc_92083265-44a3-4499-ad5e-6a5acb8d7c4a","handle":"qa-c3ea3690c5de","displayName":"QA c3ea3690c5de","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.351401609Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bb71b2fa-c0a1-4a80-88ad-81bc262aca76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb71b2fa-c0a1-4a80-88ad-81bc262aca76
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bb71b2fa-c0a1-4a80-88ad-81bc262aca76
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
correlation: qa-c4c00544-49a6-473f-b867-fa07743a34f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4c00544-49a6-473f-b867-fa07743a34f9
Content-Type: application/json

--- request body ---
{"handle":"qa-c3ea3690c5de","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4c00544-49a6-473f-b867-fa07743a34f9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4c00544-49a6-473f-b867-fa07743a34f9"}
```
